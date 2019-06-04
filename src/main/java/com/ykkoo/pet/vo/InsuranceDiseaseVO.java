/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ 
/*    */ 
/*    */ public class InsuranceDiseaseVO
/*    */ {
/*    */   @JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long insuranceDiseaseId;
/*    */   private String diseaseName;
/*    */   private String diseaseDesc;
/*    */   private Integer claimNumber;
/*    */   private Integer specificNumber;
/*    */   private String claimExplanation;
/*    */   
/* 16 */   public void setInsuranceDiseaseId(Long insuranceDiseaseId) { this.insuranceDiseaseId = insuranceDiseaseId; } public void setDiseaseName(String diseaseName) { this.diseaseName = diseaseName; } public void setDiseaseDesc(String diseaseDesc) { this.diseaseDesc = diseaseDesc; } public void setClaimNumber(Integer claimNumber) { this.claimNumber = claimNumber; } public void setSpecificNumber(Integer specificNumber) { this.specificNumber = specificNumber; } public void setClaimExplanation(String claimExplanation) { this.claimExplanation = claimExplanation; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof InsuranceDiseaseVO)) return false; InsuranceDiseaseVO other = (InsuranceDiseaseVO)o; if (!other.canEqual(this)) return false; Object this$insuranceDiseaseId = getInsuranceDiseaseId();Object other$insuranceDiseaseId = other.getInsuranceDiseaseId(); if (this$insuranceDiseaseId == null ? other$insuranceDiseaseId != null : !this$insuranceDiseaseId.equals(other$insuranceDiseaseId)) return false; Object this$diseaseName = getDiseaseName();Object other$diseaseName = other.getDiseaseName(); if (this$diseaseName == null ? other$diseaseName != null : !this$diseaseName.equals(other$diseaseName)) return false; Object this$diseaseDesc = getDiseaseDesc();Object other$diseaseDesc = other.getDiseaseDesc(); if (this$diseaseDesc == null ? other$diseaseDesc != null : !this$diseaseDesc.equals(other$diseaseDesc)) return false; Object this$claimNumber = getClaimNumber();Object other$claimNumber = other.getClaimNumber(); if (this$claimNumber == null ? other$claimNumber != null : !this$claimNumber.equals(other$claimNumber)) return false; Object this$specificNumber = getSpecificNumber();Object other$specificNumber = other.getSpecificNumber(); if (this$specificNumber == null ? other$specificNumber != null : !this$specificNumber.equals(other$specificNumber)) return false; Object this$claimExplanation = getClaimExplanation();Object other$claimExplanation = other.getClaimExplanation();return this$claimExplanation == null ? other$claimExplanation == null : this$claimExplanation.equals(other$claimExplanation); } protected boolean canEqual(Object other) { return other instanceof InsuranceDiseaseVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $insuranceDiseaseId = getInsuranceDiseaseId();result = result * 59 + ($insuranceDiseaseId == null ? 43 : $insuranceDiseaseId.hashCode());Object $diseaseName = getDiseaseName();result = result * 59 + ($diseaseName == null ? 43 : $diseaseName.hashCode());Object $diseaseDesc = getDiseaseDesc();result = result * 59 + ($diseaseDesc == null ? 43 : $diseaseDesc.hashCode());Object $claimNumber = getClaimNumber();result = result * 59 + ($claimNumber == null ? 43 : $claimNumber.hashCode());Object $specificNumber = getSpecificNumber();result = result * 59 + ($specificNumber == null ? 43 : $specificNumber.hashCode());Object $claimExplanation = getClaimExplanation();result = result * 59 + ($claimExplanation == null ? 43 : $claimExplanation.hashCode());return result; } public String toString() { return "InsuranceDiseaseVO(insuranceDiseaseId=" + getInsuranceDiseaseId() + ", diseaseName=" + getDiseaseName() + ", diseaseDesc=" + getDiseaseDesc() + ", claimNumber=" + getClaimNumber() + ", specificNumber=" + getSpecificNumber() + ", claimExplanation=" + getClaimExplanation() + ")"; }
/*    */   
/*    */   public Long getInsuranceDiseaseId()
/*    */   {
/* 20 */     return this.insuranceDiseaseId;
/*    */   }
/*    */   
/*    */   public String getDiseaseName() {
/* 24 */     return this.diseaseName;
/*    */   }
/*    */   
/*    */   public String getDiseaseDesc()
/*    */   {
/* 29 */     return this.diseaseDesc;
/*    */   }
/*    */   
/*    */   public Integer getClaimNumber()
/*    */   {
/* 34 */     return this.claimNumber;
/*    */   }
/*    */   
/*    */   public Integer getSpecificNumber()
/*    */   {
/* 39 */     return this.specificNumber;
/*    */   }
/*    */   
/*    */   public String getClaimExplanation()
/*    */   {
/* 44 */     return this.claimExplanation;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceDiseaseVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */