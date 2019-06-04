/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsuranceEvaluationVO
/*    */ {
/*    */   private String headPortrait;
/*    */   private String userName;
/*    */   private Integer starClass;
/*    */   private String evaluate;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date evaluateDate;
/*    */   
/* 16 */   public void setHeadPortrait(String headPortrait) { this.headPortrait = headPortrait; } public void setUserName(String userName) { this.userName = userName; } public void setStarClass(Integer starClass) { this.starClass = starClass; } public void setEvaluate(String evaluate) { this.evaluate = evaluate; } public void setEvaluateDate(Date evaluateDate) { this.evaluateDate = evaluateDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof InsuranceEvaluationVO)) return false; InsuranceEvaluationVO other = (InsuranceEvaluationVO)o; if (!other.canEqual(this)) return false; Object this$headPortrait = getHeadPortrait();Object other$headPortrait = other.getHeadPortrait(); if (this$headPortrait == null ? other$headPortrait != null : !this$headPortrait.equals(other$headPortrait)) return false; Object this$userName = getUserName();Object other$userName = other.getUserName(); if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false; Object this$starClass = getStarClass();Object other$starClass = other.getStarClass(); if (this$starClass == null ? other$starClass != null : !this$starClass.equals(other$starClass)) return false; Object this$evaluate = getEvaluate();Object other$evaluate = other.getEvaluate(); if (this$evaluate == null ? other$evaluate != null : !this$evaluate.equals(other$evaluate)) return false; Object this$evaluateDate = getEvaluateDate();Object other$evaluateDate = other.getEvaluateDate();return this$evaluateDate == null ? other$evaluateDate == null : this$evaluateDate.equals(other$evaluateDate); } protected boolean canEqual(Object other) { return other instanceof InsuranceEvaluationVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $headPortrait = getHeadPortrait();result = result * 59 + ($headPortrait == null ? 43 : $headPortrait.hashCode());Object $userName = getUserName();result = result * 59 + ($userName == null ? 43 : $userName.hashCode());Object $starClass = getStarClass();result = result * 59 + ($starClass == null ? 43 : $starClass.hashCode());Object $evaluate = getEvaluate();result = result * 59 + ($evaluate == null ? 43 : $evaluate.hashCode());Object $evaluateDate = getEvaluateDate();result = result * 59 + ($evaluateDate == null ? 43 : $evaluateDate.hashCode());return result; } public String toString() { return "InsuranceEvaluationVO(headPortrait=" + getHeadPortrait() + ", userName=" + getUserName() + ", starClass=" + getStarClass() + ", evaluate=" + getEvaluate() + ", evaluateDate=" + getEvaluateDate() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getHeadPortrait()
/*    */   {
/* 22 */     return this.headPortrait;
/*    */   }
/*    */   
/*    */   public String getUserName() {
/* 26 */     return this.userName;
/*    */   }
/*    */   
/*    */   public Integer getStarClass() {
/* 30 */     return this.starClass;
/*    */   }
/*    */   
/*    */   public String getEvaluate() {
/* 34 */     return this.evaluate;
/*    */   }
/*    */   
/*    */   public Date getEvaluateDate()
/*    */   {
/* 39 */     return this.evaluateDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceEvaluationVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */