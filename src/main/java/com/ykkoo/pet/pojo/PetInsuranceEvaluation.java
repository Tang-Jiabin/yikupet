/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_insurance_evaluation")
/*    */ public class PetInsuranceEvaluation { @javax.persistence.Id
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long evaluationId;
/*    */   private Integer insuranceId;
/*    */   private String headPortrait;
/*    */   private String userName;
/*    */   private Integer starClass;
/*    */   private String evaluate;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date evaluateDate;
/*    */   private Integer evaluateState;
/*    */   
/* 19 */   public void setEvaluationId(Long evaluationId) { this.evaluationId = evaluationId; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setHeadPortrait(String headPortrait) { this.headPortrait = headPortrait; } public void setUserName(String userName) { this.userName = userName; } public void setStarClass(Integer starClass) { this.starClass = starClass; } public void setEvaluate(String evaluate) { this.evaluate = evaluate; } public void setEvaluateDate(Date evaluateDate) { this.evaluateDate = evaluateDate; } public void setEvaluateState(Integer evaluateState) { this.evaluateState = evaluateState; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetInsuranceEvaluation)) return false; PetInsuranceEvaluation other = (PetInsuranceEvaluation)o; if (!other.canEqual(this)) return false; Object this$evaluationId = getEvaluationId();Object other$evaluationId = other.getEvaluationId(); if (this$evaluationId == null ? other$evaluationId != null : !this$evaluationId.equals(other$evaluationId)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$headPortrait = getHeadPortrait();Object other$headPortrait = other.getHeadPortrait(); if (this$headPortrait == null ? other$headPortrait != null : !this$headPortrait.equals(other$headPortrait)) return false; Object this$userName = getUserName();Object other$userName = other.getUserName(); if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false; Object this$starClass = getStarClass();Object other$starClass = other.getStarClass(); if (this$starClass == null ? other$starClass != null : !this$starClass.equals(other$starClass)) return false; Object this$evaluate = getEvaluate();Object other$evaluate = other.getEvaluate(); if (this$evaluate == null ? other$evaluate != null : !this$evaluate.equals(other$evaluate)) return false; Object this$evaluateDate = getEvaluateDate();Object other$evaluateDate = other.getEvaluateDate(); if (this$evaluateDate == null ? other$evaluateDate != null : !this$evaluateDate.equals(other$evaluateDate)) return false; Object this$evaluateState = getEvaluateState();Object other$evaluateState = other.getEvaluateState();return this$evaluateState == null ? other$evaluateState == null : this$evaluateState.equals(other$evaluateState); } protected boolean canEqual(Object other) { return other instanceof PetInsuranceEvaluation; } public int hashCode() { int PRIME = 59;int result = 1;Object $evaluationId = getEvaluationId();result = result * 59 + ($evaluationId == null ? 43 : $evaluationId.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $headPortrait = getHeadPortrait();result = result * 59 + ($headPortrait == null ? 43 : $headPortrait.hashCode());Object $userName = getUserName();result = result * 59 + ($userName == null ? 43 : $userName.hashCode());Object $starClass = getStarClass();result = result * 59 + ($starClass == null ? 43 : $starClass.hashCode());Object $evaluate = getEvaluate();result = result * 59 + ($evaluate == null ? 43 : $evaluate.hashCode());Object $evaluateDate = getEvaluateDate();result = result * 59 + ($evaluateDate == null ? 43 : $evaluateDate.hashCode());Object $evaluateState = getEvaluateState();result = result * 59 + ($evaluateState == null ? 43 : $evaluateState.hashCode());return result; } public String toString() { return "PetInsuranceEvaluation(evaluationId=" + getEvaluationId() + ", insuranceId=" + getInsuranceId() + ", headPortrait=" + getHeadPortrait() + ", userName=" + getUserName() + ", starClass=" + getStarClass() + ", evaluate=" + getEvaluate() + ", evaluateDate=" + getEvaluateDate() + ", evaluateState=" + getEvaluateState() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Long getEvaluationId()
/*    */   {
/* 26 */     return this.evaluationId;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceId() {
/* 30 */     return this.insuranceId;
/*    */   }
/*    */   
/*    */   public String getHeadPortrait() {
/* 34 */     return this.headPortrait;
/*    */   }
/*    */   
/*    */   public String getUserName() {
/* 38 */     return this.userName;
/*    */   }
/*    */   
/*    */   public Integer getStarClass() {
/* 42 */     return this.starClass;
/*    */   }
/*    */   
/*    */   public String getEvaluate() {
/* 46 */     return this.evaluate;
/*    */   }
/*    */   
/*    */   public Date getEvaluateDate()
/*    */   {
/* 51 */     return this.evaluateDate;
/*    */   }
/*    */   
/*    */   public Integer getEvaluateState() {
/* 55 */     return this.evaluateState;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetInsuranceEvaluation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */