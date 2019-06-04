/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DiagnosticDTO
/*    */ {
/*    */   private Integer insurancePolicyId;
/*    */   private List<Long> insuranceDiseaseIdList;
/*    */   private String medicalAdvice;
/*    */   
/* 15 */   public void setInsurancePolicyId(Integer insurancePolicyId) { this.insurancePolicyId = insurancePolicyId; } public void setInsuranceDiseaseIdList(List<Long> insuranceDiseaseIdList) { this.insuranceDiseaseIdList = insuranceDiseaseIdList; } public void setMedicalAdvice(String medicalAdvice) { this.medicalAdvice = medicalAdvice; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof DiagnosticDTO)) return false; DiagnosticDTO other = (DiagnosticDTO)o; if (!other.canEqual(this)) return false; Object this$insurancePolicyId = getInsurancePolicyId();Object other$insurancePolicyId = other.getInsurancePolicyId(); if (this$insurancePolicyId == null ? other$insurancePolicyId != null : !this$insurancePolicyId.equals(other$insurancePolicyId)) return false; Object this$insuranceDiseaseIdList = getInsuranceDiseaseIdList();Object other$insuranceDiseaseIdList = other.getInsuranceDiseaseIdList(); if (this$insuranceDiseaseIdList == null ? other$insuranceDiseaseIdList != null : !this$insuranceDiseaseIdList.equals(other$insuranceDiseaseIdList)) return false; Object this$medicalAdvice = getMedicalAdvice();Object other$medicalAdvice = other.getMedicalAdvice();return this$medicalAdvice == null ? other$medicalAdvice == null : this$medicalAdvice.equals(other$medicalAdvice); } protected boolean canEqual(Object other) { return other instanceof DiagnosticDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $insurancePolicyId = getInsurancePolicyId();result = result * 59 + ($insurancePolicyId == null ? 43 : $insurancePolicyId.hashCode());Object $insuranceDiseaseIdList = getInsuranceDiseaseIdList();result = result * 59 + ($insuranceDiseaseIdList == null ? 43 : $insuranceDiseaseIdList.hashCode());Object $medicalAdvice = getMedicalAdvice();result = result * 59 + ($medicalAdvice == null ? 43 : $medicalAdvice.hashCode());return result; } public String toString() { return "DiagnosticDTO(insurancePolicyId=" + getInsurancePolicyId() + ", insuranceDiseaseIdList=" + getInsuranceDiseaseIdList() + ", medicalAdvice=" + getMedicalAdvice() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public Integer getInsurancePolicyId()
/*    */   {
/* 21 */     return this.insurancePolicyId;
/*    */   }
/*    */   
/*    */   public List<Long> getInsuranceDiseaseIdList()
/*    */   {
/* 26 */     return this.insuranceDiseaseIdList;
/*    */   }
/*    */   
/*    */   public String getMedicalAdvice()
/*    */   {
/* 31 */     return this.medicalAdvice;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/DiagnosticDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */