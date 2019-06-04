/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import javax.persistence.GeneratedValue;
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_disease")
/*    */ public class PetDisease {
/*    */   @javax.persistence.Id
/*    */   @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer diseaseId;
/*    */   private Integer insuranceId;
/*    */   private String diseaseName;
/*    */   private Integer diseaseState;
/*    */   
/* 15 */   public void setDiseaseId(Integer diseaseId) { this.diseaseId = diseaseId; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setDiseaseName(String diseaseName) { this.diseaseName = diseaseName; } public void setDiseaseState(Integer diseaseState) { this.diseaseState = diseaseState; } public void setDiseaseDesc(String diseaseDesc) { this.diseaseDesc = diseaseDesc; } public void setClaimNumber(Integer claimNumber) { this.claimNumber = claimNumber; } public void setSpecificNumber(Integer specificNumber) { this.specificNumber = specificNumber; } public void setClaimExplanation(String claimExplanation) { this.claimExplanation = claimExplanation; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetDisease)) return false; PetDisease other = (PetDisease)o; if (!other.canEqual(this)) return false; Object this$diseaseId = getDiseaseId();Object other$diseaseId = other.getDiseaseId(); if (this$diseaseId == null ? other$diseaseId != null : !this$diseaseId.equals(other$diseaseId)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$diseaseName = getDiseaseName();Object other$diseaseName = other.getDiseaseName(); if (this$diseaseName == null ? other$diseaseName != null : !this$diseaseName.equals(other$diseaseName)) return false; Object this$diseaseState = getDiseaseState();Object other$diseaseState = other.getDiseaseState(); if (this$diseaseState == null ? other$diseaseState != null : !this$diseaseState.equals(other$diseaseState)) return false; Object this$diseaseDesc = getDiseaseDesc();Object other$diseaseDesc = other.getDiseaseDesc(); if (this$diseaseDesc == null ? other$diseaseDesc != null : !this$diseaseDesc.equals(other$diseaseDesc)) return false; Object this$claimNumber = getClaimNumber();Object other$claimNumber = other.getClaimNumber(); if (this$claimNumber == null ? other$claimNumber != null : !this$claimNumber.equals(other$claimNumber)) return false; Object this$specificNumber = getSpecificNumber();Object other$specificNumber = other.getSpecificNumber(); if (this$specificNumber == null ? other$specificNumber != null : !this$specificNumber.equals(other$specificNumber)) return false; Object this$claimExplanation = getClaimExplanation();Object other$claimExplanation = other.getClaimExplanation();return this$claimExplanation == null ? other$claimExplanation == null : this$claimExplanation.equals(other$claimExplanation); } protected boolean canEqual(Object other) { return other instanceof PetDisease; } public int hashCode() { int PRIME = 59;int result = 1;Object $diseaseId = getDiseaseId();result = result * 59 + ($diseaseId == null ? 43 : $diseaseId.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $diseaseName = getDiseaseName();result = result * 59 + ($diseaseName == null ? 43 : $diseaseName.hashCode());Object $diseaseState = getDiseaseState();result = result * 59 + ($diseaseState == null ? 43 : $diseaseState.hashCode());Object $diseaseDesc = getDiseaseDesc();result = result * 59 + ($diseaseDesc == null ? 43 : $diseaseDesc.hashCode());Object $claimNumber = getClaimNumber();result = result * 59 + ($claimNumber == null ? 43 : $claimNumber.hashCode());Object $specificNumber = getSpecificNumber();result = result * 59 + ($specificNumber == null ? 43 : $specificNumber.hashCode());Object $claimExplanation = getClaimExplanation();result = result * 59 + ($claimExplanation == null ? 43 : $claimExplanation.hashCode());return result; } public String toString() { return "PetDisease(diseaseId=" + getDiseaseId() + ", insuranceId=" + getInsuranceId() + ", diseaseName=" + getDiseaseName() + ", diseaseState=" + getDiseaseState() + ", diseaseDesc=" + getDiseaseDesc() + ", claimNumber=" + getClaimNumber() + ", specificNumber=" + getSpecificNumber() + ", claimExplanation=" + getClaimExplanation() + ")"; }
/*    */   
/*    */   private String diseaseDesc;
/*    */   private Integer claimNumber;
/*    */   private Integer specificNumber;
/*    */   private String claimExplanation;
/*    */   public Integer getDiseaseId() {
/* 22 */     return this.diseaseId;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceId()
/*    */   {
/* 27 */     return this.insuranceId;
/*    */   }
/*    */   
/*    */   public String getDiseaseName()
/*    */   {
/* 32 */     return this.diseaseName;
/*    */   }
/*    */   
/*    */   public Integer getDiseaseState() {
/* 36 */     return this.diseaseState;
/*    */   }
/*    */   
/*    */   public String getDiseaseDesc()
/*    */   {
/* 41 */     return this.diseaseDesc;
/*    */   }
/*    */   
/*    */   public Integer getClaimNumber()
/*    */   {
/* 46 */     return this.claimNumber;
/*    */   }
/*    */   
/*    */   public Integer getSpecificNumber()
/*    */   {
/* 51 */     return this.specificNumber;
/*    */   }
/*    */   
/*    */   public String getClaimExplanation()
/*    */   {
/* 56 */     return this.claimExplanation;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetDisease.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */