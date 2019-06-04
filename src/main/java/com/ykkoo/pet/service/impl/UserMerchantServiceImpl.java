/*    */ package com.ykkoo.pet.service.impl;
/*    */ 
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.token.TokenManage;
/*    */ import com.ykkoo.pet.common.token.TokenModel;
/*    */ import com.ykkoo.pet.pojo.PetHospital;
/*    */ import com.ykkoo.pet.pojo.PetHospitalInfo;
/*    */ import com.ykkoo.pet.repository.PetHospitalInfoRepository;
/*    */ import com.ykkoo.pet.repository.PetHospitalRepository;
/*    */ import com.ykkoo.pet.service.UserMerchantService;
/*    */ import com.ykkoo.pet.vo.UserVO;
/*    */ import java.util.Date;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.stereotype.Service;
/*    */ import org.springframework.util.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserMerchantServiceImpl
/*    */   implements UserMerchantService
/*    */ {
/* 26 */   private static final Logger log = LoggerFactory.getLogger(UserMerchantServiceImpl.class);
/*    */   
/* 28 */   public UserMerchantServiceImpl(PetHospitalInfoRepository hospitalInfoRepository, PetHospitalRepository hospitalRepository, TokenManage tokenManage) { this.hospitalInfoRepository = hospitalInfoRepository;this.hospitalRepository = hospitalRepository;this.tokenManage = tokenManage;
/*    */   }
/*    */   
/*    */ 
/*    */   private PetHospitalInfoRepository hospitalInfoRepository;
/*    */   
/*    */   private PetHospitalRepository hospitalRepository;
/*    */   private TokenManage tokenManage;
/*    */   public KVResult signIn(String name, String password)
/*    */   {
/* 38 */     if ((StringUtils.isEmpty(name)) || (StringUtils.isEmpty(password))) {
/* 39 */       return KVResult.put(Integer.valueOf(411), "账号密码错误");
/*    */     }
/* 41 */     PetHospitalInfo hospitalInfo = this.hospitalInfoRepository.findByHospitalAccountAndHospitalPassword(name, password);
/* 42 */     if (hospitalInfo == null) {
/* 43 */       return KVResult.put(Integer.valueOf(411), "账号密码错误");
/*    */     }
/* 45 */     PetHospital hospital = this.hospitalRepository.findByHospitalId(hospitalInfo.getHospitalId());
/*    */     
/* 47 */     TokenModel userToken = this.tokenManage.createHospitalToken(hospitalInfo);
/* 48 */     UserVO userVO = new UserVO();
/* 49 */     userVO.setNickName(hospital.getHospitalName());
/* 50 */     userVO.setHeadPortrait(hospital.getHospitalHeadPortrait());
/* 51 */     userVO.setToken(hospitalInfo.getToken());
/*    */     
/* 53 */     userVO.setCreateDate(hospitalInfo.getCreateDate());
/* 54 */     userVO.setLoginDate(new Date());
/* 55 */     userVO.setUpdateDate(new Date());
/*    */     
/*    */ 
/* 58 */     return KVResult.put(userVO);
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/impl/UserMerchantServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */