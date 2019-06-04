/*     */ package com.ykkoo.pet.service.impl;
/*     */ 
/*     */ import com.alibaba.fastjson.JSON;
/*     */ import com.ykkoo.pet.pojo.PetAnimal;
/*     */ import com.ykkoo.pet.pojo.PetHospitalAccount;
/*     */ import com.ykkoo.pet.pojo.PetHospitalInfo;
/*     */ import com.ykkoo.pet.pojo.PetInsurancePolicy;
/*     */ import com.ykkoo.pet.repository.PetAnimalRepository;
/*     */ import com.ykkoo.pet.repository.PetHospitalAccountRepository;
/*     */ import com.ykkoo.pet.repository.PetHospitalInfoRepository;
/*     */ import com.ykkoo.pet.repository.PetInsurancePolicyRepository;
/*     */ import com.ykkoo.pet.service.PayService;
/*     */ import com.ykkoo.pet.utils.DoubleUtil;
/*     */ import com.ykkoo.pet.utils.wechat.pay.utls.PayCommonUtil;
/*     */ import com.ykkoo.pet.utils.wechat.pay.utls.XmlUtil;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.URLDecoder;
/*     */ import java.util.Date;
/*     */ import java.util.Map;
/*     */ import javax.servlet.ServletOutputStream;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.stereotype.Service;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ public class PayServiceImpl
/*     */   implements PayService
/*     */ {
/*     */   public PayServiceImpl(PetInsurancePolicyRepository insurancePolicyRepository, PetAnimalRepository animalRepository, PetHospitalInfoRepository hospitalInfoRepository, PetHospitalAccountRepository hospitalAccountRepository)
/*     */   {
/*  42 */     this.insurancePolicyRepository = insurancePolicyRepository;this.animalRepository = animalRepository;this.hospitalInfoRepository = hospitalInfoRepository;this.hospitalAccountRepository = hospitalAccountRepository; }
/*  43 */   private static final Logger log = LoggerFactory.getLogger(PayServiceImpl.class);
/*     */   
/*     */   private PetInsurancePolicyRepository insurancePolicyRepository;
/*     */   
/*     */   private PetAnimalRepository animalRepository;
/*     */   private PetHospitalInfoRepository hospitalInfoRepository;
/*     */   private PetHospitalAccountRepository hospitalAccountRepository;
/*     */   
/*     */   public String tenPayCallback(HttpServletRequest request, HttpServletResponse response)
/*     */     throws IOException
/*     */   {
/*  54 */     InputStream inStream = request.getInputStream();
/*  55 */     ByteArrayOutputStream outStream = new ByteArrayOutputStream();
/*  56 */     byte[] buffer = new byte['Ѐ'];
/*     */     int len;
/*  58 */     while ((len = inStream.read(buffer)) != -1) {
/*  59 */       outStream.write(buffer, 0, len);
/*     */     }
/*  61 */     outStream.close();
/*  62 */     inStream.close();
/*     */     
/*  64 */     String result = new String(outStream.toByteArray(), "utf-8");
/*  65 */     Map<String, String> params = XmlUtil.readStringXmlOut(result);
/*  66 */     if ("SUCCESS".equalsIgnoreCase((String)params.get("result_code")))
/*     */     {
/*  68 */       log.error("                 微信回调信息");
/*     */       
/*     */ 
/*     */ 
/*  72 */       for (Object aSet : params.keySet()) {
/*  73 */         String key = (String)aSet;
/*  74 */         String value = (String)params.get(key);
/*  75 */         log.error("    " + key + "    " + value + "    ");
/*     */       }
/*     */       
/*     */ 
/*  79 */       String payNumber = (String)params.get("transaction_id");
/*  80 */       String orderNumber = (String)params.get("out_trade_no");
/*  81 */       String realAmount = String.valueOf(Double.valueOf((String)params.get("total_fee")).doubleValue() / 100.0D);
/*  82 */       Double doubleFee = Double.valueOf(Double.valueOf((String)params.get("total_fee")).doubleValue() / 100.0D);
/*  83 */       String refundFee = String.valueOf(doubleFee);
/*  84 */       String jsonMap = (String)params.get("attach");
/*  85 */       log.error("金额{}", refundFee);
/*     */       
/*     */ 
/*  88 */       String str = null;
/*  89 */       Map map = null;
/*     */       try {
/*  91 */         str = URLDecoder.decode(jsonMap, "utf-8");
/*     */         try {
/*  93 */           map = (Map)JSON.parse(str);
/*     */         } catch (Exception e) {
/*  95 */           str = URLDecoder.decode(str, "utf-8");
/*  96 */           map = (Map)JSON.parse(str);
/*     */         }
/*     */       } catch (UnsupportedEncodingException e) {
/*  99 */         e.printStackTrace();
/*     */       }
/*     */       
/*     */ 
/* 103 */       Integer insurancePolicyId = (Integer)map.get("ip");
/* 104 */       Integer animalId = (Integer)map.get("an");
/* 105 */       Integer hospitalId = (Integer)map.get("hi");
/*     */       
/*     */ 
/* 108 */       map.put("payNumber", payNumber);
/* 109 */       map.put("orderNumber", orderNumber);
/* 110 */       map.put("realAmount", realAmount);
/* 111 */       map.put("insurancePolicyId", insurancePolicyId);
/* 112 */       map.put("animalId", animalId);
/* 113 */       map.put("hospitalId", hospitalId);
/*     */       
/* 115 */       callbackUpdate(map);
/*     */       
/*     */ 
/* 118 */       response.setContentType("text/xml");
/* 119 */       ServletOutputStream out = response.getOutputStream();
/* 120 */       out.write(PayCommonUtil.setXML("SUCCESS", "OK").getBytes("UTF-8"));
/* 121 */       out.close();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 127 */     return "success";
/*     */   }
/*     */   
/*     */ 
/*     */   private void callbackUpdate(Map map)
/*     */   {
/* 133 */     PetHospitalInfo hospitalInfo = this.hospitalInfoRepository.findByHospitalId((Integer)map.get("hospitalId"));
/* 134 */     if (hospitalInfo != null) {
/* 135 */       PetHospitalAccount hospitalAccount = new PetHospitalAccount();
/*     */       
/* 137 */       Integer ratio = hospitalInfo.getRebateRatio();
/*     */       
/* 139 */       if (ratio == null) {
/* 140 */         ratio = Integer.valueOf(10);
/*     */       }
/*     */       
/* 143 */       Double realAmount = Double.valueOf((String)map.get("realAmount"));
/* 144 */       Double div = DoubleUtil.div(realAmount, Double.valueOf(100.0D));
/* 145 */       Double money = DoubleUtil.mul(div, Double.valueOf(ratio.intValue()));
/*     */       
/* 147 */       hospitalAccount.setHospitalId(hospitalInfo.getHospitalId());
/* 148 */       hospitalAccount.setMoney(money);
/* 149 */       hospitalAccount.setType(Integer.valueOf(1));
/* 150 */       hospitalAccount.setDate(new Date());
/* 151 */       hospitalAccount.setSource("邀请码");
/* 152 */       hospitalAccount.setRatio(ratio);
/* 153 */       hospitalAccount.setState(Integer.valueOf(1));
/* 154 */       this.hospitalAccountRepository.save(hospitalAccount);
/*     */     }
/*     */     
/*     */ 
/* 158 */     PetInsurancePolicy insurancePolicy = this.insurancePolicyRepository.findByInsurancePolicyId((Integer)map.get("insurancePolicyId"));
/* 159 */     insurancePolicy.setInsuranceStatus(Integer.valueOf(2));
/* 160 */     this.insurancePolicyRepository.save(insurancePolicy);
/* 161 */     PetAnimal animal = this.animalRepository.findByAnimalId((Integer)map.get("animalId"));
/* 162 */     animal.setInsuranceStatus(Integer.valueOf(2));
/* 163 */     this.animalRepository.save(animal);
/*     */   }
/*     */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/impl/PayServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */