/*    */ package com.ykkoo.pet.service.impl;
/*    */ 
/*    */ import com.ykkoo.pet.common.type.VariableType;
/*    */ import com.ykkoo.pet.pojo.PetVariable;
/*    */ import com.ykkoo.pet.repository.PetVariableRepository;
/*    */ import com.ykkoo.pet.service.VariableService;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class VariableServiceImpl
/*    */   implements VariableService
/*    */ {
/* 19 */   private static final Logger log = LoggerFactory.getLogger(VariableServiceImpl.class);
/*    */   
/* 21 */   public VariableServiceImpl(PetVariableRepository petVariableRepository) { this.petVariableRepository = petVariableRepository; }
/*    */   
/*    */ 
/*    */   private PetVariableRepository petVariableRepository;
/*    */   
/*    */   public PetVariable findByType(VariableType type)
/*    */   {
/* 28 */     return this.petVariableRepository.findByType(type);
/*    */   }
/*    */   
/*    */   public PetVariable save(PetVariable var)
/*    */   {
/* 33 */     return (PetVariable)this.petVariableRepository.save(var);
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/impl/VariableServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */