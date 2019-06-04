/*     */ package com.ykkoo.pet.service.impl;
/*     */ 
/*     */ import com.google.common.collect.Lists;
/*     */ import com.ykkoo.pet.common.http.KVResult;
/*     */ import com.ykkoo.pet.common.type.VariableType;
/*     */ import com.ykkoo.pet.pojo.PetInsurancePolicy;
/*     */ import com.ykkoo.pet.pojo.PetVariable;
/*     */ import com.ykkoo.pet.repository.PetAnimalRepository;
/*     */ import com.ykkoo.pet.repository.PetInsurancePolicyRepository;
/*     */ import com.ykkoo.pet.service.TimerService;
/*     */ import com.ykkoo.pet.service.VariableService;
/*     */ import com.ykkoo.pet.utils.DateUtil;
/*     */ import com.ykkoo.pet.utils.RandomUtil;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.http.HttpStatus;
/*     */ import org.springframework.stereotype.Service;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ public class TimerServiceImpl
/*     */   implements TimerService
/*     */ {
/*  31 */   private static final Logger log = LoggerFactory.getLogger(TimerServiceImpl.class);
/*     */   
/*  33 */   public TimerServiceImpl(VariableService variableService, PetInsurancePolicyRepository insurancePolicyRepository, PetAnimalRepository animalRepository) { this.variableService = variableService;this.insurancePolicyRepository = insurancePolicyRepository;this.animalRepository = animalRepository;
/*     */   }
/*     */   
/*     */ 
/*     */   private VariableService variableService;
/*     */   
/*     */   private PetInsurancePolicyRepository insurancePolicyRepository;
/*     */   
/*     */   private PetAnimalRepository animalRepository;
/*     */   public KVResult update1h()
/*     */   {
/*  44 */     updateHomePageVar();
/*     */     
/*  46 */     return KVResult.put(HttpStatus.OK);
/*     */   }
/*     */   
/*     */ 
/*     */   public KVResult update1d()
/*     */   {
/*  52 */     updateInsurancePolicy();
/*     */     
/*  54 */     return null;
/*     */   }
/*     */   
/*     */   private void updateInsurancePolicy() {
/*  58 */     List<PetInsurancePolicy> insurancePolicyList = this.insurancePolicyRepository.findByInsuranceStatus(2);
/*  59 */     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
/*  60 */     Date now = new Date();
/*  61 */     String today = format.format(now);
/*  62 */     String startDate = "";
/*     */     
/*  64 */     List<PetInsurancePolicy> policyList = Lists.newArrayList();
/*     */     
/*  66 */     for (PetInsurancePolicy insurancePolicy : insurancePolicyList) {
/*  67 */       startDate = format.format(insurancePolicy.getInsuranceStartDate());
/*  68 */       if (today.equals(startDate)) {
/*  69 */         insurancePolicy.setInsuranceStatus(Integer.valueOf(3));
/*  70 */         policyList.add(insurancePolicy);
/*     */       }
/*     */     }
/*     */     
/*  74 */     if (policyList.size() > 0) {
/*  75 */       this.insurancePolicyRepository.saveAll(policyList);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private void updateHomePageVar()
/*     */   {
/*  83 */     updateMembers();
/*     */     
/*     */ 
/*  86 */     updateCost();
/*     */   }
/*     */   
/*     */   private void updateCost()
/*     */   {
/*  91 */     PetVariable cost = this.variableService.findByType(VariableType.COST);
/*     */     
/*  93 */     if (cost != null) {
/*  94 */       Integer intVar = cost.getIntVar();
/*  95 */       if (intVar == null) {
/*  96 */         intVar = Integer.valueOf(1000000);
/*     */       }
/*     */       
/*  99 */       Date startDate = DateUtil.ofHour(Integer.valueOf(8), Integer.valueOf(0), Integer.valueOf(0));
/* 100 */       Date endDate = DateUtil.ofHour(Integer.valueOf(20), Integer.valueOf(0), Integer.valueOf(0));
/* 101 */       Date nowDate = new Date();
/*     */       
/* 103 */       if (DateUtil.isSection(startDate, endDate, nowDate)) {
/* 104 */         intVar = Integer.valueOf(intVar.intValue() + RandomUtil.getNextInt(3500, 4500));
/*     */       } else {
/* 106 */         intVar = Integer.valueOf(intVar.intValue() + RandomUtil.getNextInt(30, 40));
/*     */       }
/* 108 */       cost.setIntVar(intVar);
/* 109 */       cost.setUpdateDate(new Date());
/* 110 */       this.variableService.save(cost);
/*     */     }
/*     */     else {
/* 113 */       savePetVar(cost, VariableType.COST, 1000000);
/*     */     }
/*     */   }
/*     */   
/*     */   private void updateMembers() {
/* 118 */     PetVariable members = this.variableService.findByType(VariableType.MEMBERS);
/*     */     
/* 120 */     if (members != null) {
/* 121 */       Integer intVar = members.getIntVar();
/* 122 */       if (intVar == null) {
/* 123 */         intVar = Integer.valueOf(10000);
/*     */       }
/*     */       
/* 126 */       Date startDate = DateUtil.ofHour(Integer.valueOf(8), Integer.valueOf(0), Integer.valueOf(0));
/* 127 */       Date endDate = DateUtil.ofHour(Integer.valueOf(20), Integer.valueOf(0), Integer.valueOf(0));
/* 128 */       Date nowDate = new Date();
/*     */       
/* 130 */       if (DateUtil.isSection(startDate, endDate, nowDate)) {
/* 131 */         intVar = Integer.valueOf(intVar.intValue() + RandomUtil.getNextInt(80, 120));
/*     */       } else {
/* 133 */         intVar = Integer.valueOf(intVar.intValue() + 1);
/*     */       }
/* 135 */       members.setIntVar(intVar);
/* 136 */       members.setUpdateDate(new Date());
/* 137 */       this.variableService.save(members);
/*     */     }
/*     */     else {
/* 140 */       savePetVar(members, VariableType.MEMBERS, 10000);
/*     */     }
/*     */   }
/*     */   
/*     */   private void savePetVar(PetVariable var, VariableType type, int intVar) {
/* 145 */     var = new PetVariable();
/* 146 */     var.setType(type);
/* 147 */     var.setIntVar(Integer.valueOf(intVar));
/* 148 */     var.setStrVar("0");
/* 149 */     var.setCreateDate(new Date());
/* 150 */     var.setUpdateDate(new Date());
/* 151 */     this.variableService.save(var);
/*     */   }
/*     */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/impl/TimerServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */