/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PetMedicalInfoVO
/*    */ {
/*    */   @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date medicalDate;
/*    */   private Integer insurancePolicyId;
/*    */   private String insuranceDiseaseName;
/*    */   private String medicalAdvice;
/*    */   
/* 16 */   public void setMedicalDate(Date medicalDate) { this.medicalDate = medicalDate; } public void setInsurancePolicyId(Integer insurancePolicyId) { this.insurancePolicyId = insurancePolicyId; } public void setInsuranceDiseaseName(String insuranceDiseaseName) { this.insuranceDiseaseName = insuranceDiseaseName; } public void setMedicalAdvice(String medicalAdvice) { this.medicalAdvice = medicalAdvice; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetMedicalInfoVO)) return false; PetMedicalInfoVO other = (PetMedicalInfoVO)o; if (!other.canEqual(this)) return false; Object this$medicalDate = getMedicalDate();Object other$medicalDate = other.getMedicalDate(); if (this$medicalDate == null ? other$medicalDate != null : !this$medicalDate.equals(other$medicalDate)) return false; Object this$insurancePolicyId = getInsurancePolicyId();Object other$insurancePolicyId = other.getInsurancePolicyId(); if (this$insurancePolicyId == null ? other$insurancePolicyId != null : !this$insurancePolicyId.equals(other$insurancePolicyId)) return false; Object this$insuranceDiseaseName = getInsuranceDiseaseName();Object other$insuranceDiseaseName = other.getInsuranceDiseaseName(); if (this$insuranceDiseaseName == null ? other$insuranceDiseaseName != null : !this$insuranceDiseaseName.equals(other$insuranceDiseaseName)) return false; Object this$medicalAdvice = getMedicalAdvice();Object other$medicalAdvice = other.getMedicalAdvice();return this$medicalAdvice == null ? other$medicalAdvice == null : this$medicalAdvice.equals(other$medicalAdvice); } protected boolean canEqual(Object other) { return other instanceof PetMedicalInfoVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $medicalDate = getMedicalDate();result = result * 59 + ($medicalDate == null ? 43 : $medicalDate.hashCode());Object $insurancePolicyId = getInsurancePolicyId();result = result * 59 + ($insurancePolicyId == null ? 43 : $insurancePolicyId.hashCode());Object $insuranceDiseaseName = getInsuranceDiseaseName();result = result * 59 + ($insuranceDiseaseName == null ? 43 : $insuranceDiseaseName.hashCode());Object $medicalAdvice = getMedicalAdvice();result = result * 59 + ($medicalAdvice == null ? 43 : $medicalAdvice.hashCode());return result; } public String toString() { return "PetMedicalInfoVO(medicalDate=" + getMedicalDate() + ", insurancePolicyId=" + getInsurancePolicyId() + ", insuranceDiseaseName=" + getInsuranceDiseaseName() + ", medicalAdvice=" + getMedicalAdvice() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Date getMedicalDate()
/*    */   {
/* 23 */     return this.medicalDate;
/*    */   }
/*    */   
/*    */   public Integer getInsurancePolicyId()
/*    */   {
/* 28 */     return this.insurancePolicyId;
/*    */   }
/*    */   
/*    */   public String getInsuranceDiseaseName()
/*    */   {
/* 33 */     return this.insuranceDiseaseName;
/*    */   }
/*    */   
/*    */   public String getMedicalAdvice()
/*    */   {
/* 38 */     return this.medicalAdvice;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/PetMedicalInfoVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */