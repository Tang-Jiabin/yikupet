/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_medical_info")
/*    */ public class PetMedicalInfo {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer medicalId;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date medicalDate;
/*    */   private Integer insurancePolicyId;
/*    */   private Long insuranceDiseaseId;
/*    */   private String medicalAdvice;
/*    */   
/* 17 */   public void setMedicalId(Integer medicalId) { this.medicalId = medicalId; } public void setMedicalDate(Date medicalDate) { this.medicalDate = medicalDate; } public void setInsurancePolicyId(Integer insurancePolicyId) { this.insurancePolicyId = insurancePolicyId; } public void setInsuranceDiseaseId(Long insuranceDiseaseId) { this.insuranceDiseaseId = insuranceDiseaseId; } public void setMedicalAdvice(String medicalAdvice) { this.medicalAdvice = medicalAdvice; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetMedicalInfo)) return false; PetMedicalInfo other = (PetMedicalInfo)o; if (!other.canEqual(this)) return false; Object this$medicalId = getMedicalId();Object other$medicalId = other.getMedicalId(); if (this$medicalId == null ? other$medicalId != null : !this$medicalId.equals(other$medicalId)) return false; Object this$medicalDate = getMedicalDate();Object other$medicalDate = other.getMedicalDate(); if (this$medicalDate == null ? other$medicalDate != null : !this$medicalDate.equals(other$medicalDate)) return false; Object this$insurancePolicyId = getInsurancePolicyId();Object other$insurancePolicyId = other.getInsurancePolicyId(); if (this$insurancePolicyId == null ? other$insurancePolicyId != null : !this$insurancePolicyId.equals(other$insurancePolicyId)) return false; Object this$insuranceDiseaseId = getInsuranceDiseaseId();Object other$insuranceDiseaseId = other.getInsuranceDiseaseId(); if (this$insuranceDiseaseId == null ? other$insuranceDiseaseId != null : !this$insuranceDiseaseId.equals(other$insuranceDiseaseId)) return false; Object this$medicalAdvice = getMedicalAdvice();Object other$medicalAdvice = other.getMedicalAdvice();return this$medicalAdvice == null ? other$medicalAdvice == null : this$medicalAdvice.equals(other$medicalAdvice); } protected boolean canEqual(Object other) { return other instanceof PetMedicalInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $medicalId = getMedicalId();result = result * 59 + ($medicalId == null ? 43 : $medicalId.hashCode());Object $medicalDate = getMedicalDate();result = result * 59 + ($medicalDate == null ? 43 : $medicalDate.hashCode());Object $insurancePolicyId = getInsurancePolicyId();result = result * 59 + ($insurancePolicyId == null ? 43 : $insurancePolicyId.hashCode());Object $insuranceDiseaseId = getInsuranceDiseaseId();result = result * 59 + ($insuranceDiseaseId == null ? 43 : $insuranceDiseaseId.hashCode());Object $medicalAdvice = getMedicalAdvice();result = result * 59 + ($medicalAdvice == null ? 43 : $medicalAdvice.hashCode());return result; } public String toString() { return "PetMedicalInfo(medicalId=" + getMedicalId() + ", medicalDate=" + getMedicalDate() + ", insurancePolicyId=" + getInsurancePolicyId() + ", insuranceDiseaseId=" + getInsuranceDiseaseId() + ", medicalAdvice=" + getMedicalAdvice() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Integer getMedicalId()
/*    */   {
/* 24 */     return this.medicalId;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getMedicalDate()
/*    */   {
/* 30 */     return this.medicalDate;
/*    */   }
/*    */   
/*    */   public Integer getInsurancePolicyId()
/*    */   {
/* 35 */     return this.insurancePolicyId;
/*    */   }
/*    */   
/*    */   public Long getInsuranceDiseaseId()
/*    */   {
/* 40 */     return this.insuranceDiseaseId;
/*    */   }
/*    */   
/*    */   public String getMedicalAdvice()
/*    */   {
/* 45 */     return this.medicalAdvice;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetMedicalInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */