/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ 
/*    */ public class DiseaseDTO {
/*    */   private Integer diseaseId;
/*    */   private String diseaseName;
/*    */   private Integer diseaseState;
/*    */   private String diseaseDesc;
/*    */   private Integer claimNumber;
/*    */   private Integer specificNumber;
/*    */   private String claimExplanation;
/*    */   
/* 13 */   public void setDiseaseId(Integer diseaseId) { this.diseaseId = diseaseId; } public void setDiseaseName(String diseaseName) { this.diseaseName = diseaseName; } public void setDiseaseState(Integer diseaseState) { this.diseaseState = diseaseState; } public void setDiseaseDesc(String diseaseDesc) { this.diseaseDesc = diseaseDesc; } public void setClaimNumber(Integer claimNumber) { this.claimNumber = claimNumber; } public void setSpecificNumber(Integer specificNumber) { this.specificNumber = specificNumber; } public void setClaimExplanation(String claimExplanation) { this.claimExplanation = claimExplanation; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof DiseaseDTO)) return false; DiseaseDTO other = (DiseaseDTO)o; if (!other.canEqual(this)) return false; Object this$diseaseId = getDiseaseId();Object other$diseaseId = other.getDiseaseId(); if (this$diseaseId == null ? other$diseaseId != null : !this$diseaseId.equals(other$diseaseId)) return false; Object this$diseaseName = getDiseaseName();Object other$diseaseName = other.getDiseaseName(); if (this$diseaseName == null ? other$diseaseName != null : !this$diseaseName.equals(other$diseaseName)) return false; Object this$diseaseState = getDiseaseState();Object other$diseaseState = other.getDiseaseState(); if (this$diseaseState == null ? other$diseaseState != null : !this$diseaseState.equals(other$diseaseState)) return false; Object this$diseaseDesc = getDiseaseDesc();Object other$diseaseDesc = other.getDiseaseDesc(); if (this$diseaseDesc == null ? other$diseaseDesc != null : !this$diseaseDesc.equals(other$diseaseDesc)) return false; Object this$claimNumber = getClaimNumber();Object other$claimNumber = other.getClaimNumber(); if (this$claimNumber == null ? other$claimNumber != null : !this$claimNumber.equals(other$claimNumber)) return false; Object this$specificNumber = getSpecificNumber();Object other$specificNumber = other.getSpecificNumber(); if (this$specificNumber == null ? other$specificNumber != null : !this$specificNumber.equals(other$specificNumber)) return false; Object this$claimExplanation = getClaimExplanation();Object other$claimExplanation = other.getClaimExplanation();return this$claimExplanation == null ? other$claimExplanation == null : this$claimExplanation.equals(other$claimExplanation); } protected boolean canEqual(Object other) { return other instanceof DiseaseDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $diseaseId = getDiseaseId();result = result * 59 + ($diseaseId == null ? 43 : $diseaseId.hashCode());Object $diseaseName = getDiseaseName();result = result * 59 + ($diseaseName == null ? 43 : $diseaseName.hashCode());Object $diseaseState = getDiseaseState();result = result * 59 + ($diseaseState == null ? 43 : $diseaseState.hashCode());Object $diseaseDesc = getDiseaseDesc();result = result * 59 + ($diseaseDesc == null ? 43 : $diseaseDesc.hashCode());Object $claimNumber = getClaimNumber();result = result * 59 + ($claimNumber == null ? 43 : $claimNumber.hashCode());Object $specificNumber = getSpecificNumber();result = result * 59 + ($specificNumber == null ? 43 : $specificNumber.hashCode());Object $claimExplanation = getClaimExplanation();result = result * 59 + ($claimExplanation == null ? 43 : $claimExplanation.hashCode());return result; } public String toString() { return "DiseaseDTO(diseaseId=" + getDiseaseId() + ", diseaseName=" + getDiseaseName() + ", diseaseState=" + getDiseaseState() + ", diseaseDesc=" + getDiseaseDesc() + ", claimNumber=" + getClaimNumber() + ", specificNumber=" + getSpecificNumber() + ", claimExplanation=" + getClaimExplanation() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Integer getDiseaseId()
/*    */   {
/* 20 */     return this.diseaseId;
/*    */   }
/*    */   
/*    */   public String getDiseaseName() {
/* 24 */     return this.diseaseName;
/*    */   }
/*    */   
/*    */   public Integer getDiseaseState()
/*    */   {
/* 29 */     return this.diseaseState;
/*    */   }
/*    */   
/*    */   public String getDiseaseDesc()
/*    */   {
/* 34 */     return this.diseaseDesc;
/*    */   }
/*    */   
/*    */   public Integer getClaimNumber()
/*    */   {
/* 39 */     return this.claimNumber;
/*    */   }
/*    */   
/*    */   public Integer getSpecificNumber() {
/* 43 */     return this.specificNumber;
/*    */   }
/*    */   
/*    */   public String getClaimExplanation() {
/* 47 */     return this.claimExplanation;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/DiseaseDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */