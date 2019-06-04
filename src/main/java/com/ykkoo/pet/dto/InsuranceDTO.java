/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class InsuranceDTO {
/*    */   private Integer insuranceId;
/*    */   private String insuranceName;
/*    */   private Integer insuranceType;
/*    */   private Integer insuranceState;
/*    */   private FileDTO securityCardPic;
/*    */   private Integer insurancePrice;
/*    */   private String underwritingScope;
/*    */   
/* 15 */   public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setInsuranceName(String insuranceName) { this.insuranceName = insuranceName; } public void setInsuranceType(Integer insuranceType) { this.insuranceType = insuranceType; } public void setInsuranceState(Integer insuranceState) { this.insuranceState = insuranceState; } public void setSecurityCardPic(FileDTO securityCardPic) { this.securityCardPic = securityCardPic; } public void setInsurancePrice(Integer insurancePrice) { this.insurancePrice = insurancePrice; } public void setUnderwritingScope(String underwritingScope) { this.underwritingScope = underwritingScope; } public void setGuaranteeAmount(String guaranteeAmount) { this.guaranteeAmount = guaranteeAmount; } public void setAgeSupport(String ageSupport) { this.ageSupport = ageSupport; } public void setGuaranteeTime(Integer guaranteeTime) { this.guaranteeTime = guaranteeTime; } public void setDiseaseProtection(String diseaseProtection) { this.diseaseProtection = diseaseProtection; } public void setClaimExplanation(String claimExplanation) { this.claimExplanation = claimExplanation; } public void setInsuranceDetailsPic(FileUploadDTO insuranceDetailsPic) { this.insuranceDetailsPic = insuranceDetailsPic; } public void setDisease(List<DiseaseDTO> disease) { this.disease = disease; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof InsuranceDTO)) return false; InsuranceDTO other = (InsuranceDTO)o; if (!other.canEqual(this)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$insuranceName = getInsuranceName();Object other$insuranceName = other.getInsuranceName(); if (this$insuranceName == null ? other$insuranceName != null : !this$insuranceName.equals(other$insuranceName)) return false; Object this$insuranceType = getInsuranceType();Object other$insuranceType = other.getInsuranceType(); if (this$insuranceType == null ? other$insuranceType != null : !this$insuranceType.equals(other$insuranceType)) return false; Object this$insuranceState = getInsuranceState();Object other$insuranceState = other.getInsuranceState(); if (this$insuranceState == null ? other$insuranceState != null : !this$insuranceState.equals(other$insuranceState)) return false; Object this$securityCardPic = getSecurityCardPic();Object other$securityCardPic = other.getSecurityCardPic(); if (this$securityCardPic == null ? other$securityCardPic != null : !this$securityCardPic.equals(other$securityCardPic)) return false; Object this$insurancePrice = getInsurancePrice();Object other$insurancePrice = other.getInsurancePrice(); if (this$insurancePrice == null ? other$insurancePrice != null : !this$insurancePrice.equals(other$insurancePrice)) return false; Object this$underwritingScope = getUnderwritingScope();Object other$underwritingScope = other.getUnderwritingScope(); if (this$underwritingScope == null ? other$underwritingScope != null : !this$underwritingScope.equals(other$underwritingScope)) return false; Object this$guaranteeAmount = getGuaranteeAmount();Object other$guaranteeAmount = other.getGuaranteeAmount(); if (this$guaranteeAmount == null ? other$guaranteeAmount != null : !this$guaranteeAmount.equals(other$guaranteeAmount)) return false; Object this$ageSupport = getAgeSupport();Object other$ageSupport = other.getAgeSupport(); if (this$ageSupport == null ? other$ageSupport != null : !this$ageSupport.equals(other$ageSupport)) return false; Object this$guaranteeTime = getGuaranteeTime();Object other$guaranteeTime = other.getGuaranteeTime(); if (this$guaranteeTime == null ? other$guaranteeTime != null : !this$guaranteeTime.equals(other$guaranteeTime)) return false; Object this$diseaseProtection = getDiseaseProtection();Object other$diseaseProtection = other.getDiseaseProtection(); if (this$diseaseProtection == null ? other$diseaseProtection != null : !this$diseaseProtection.equals(other$diseaseProtection)) return false; Object this$claimExplanation = getClaimExplanation();Object other$claimExplanation = other.getClaimExplanation(); if (this$claimExplanation == null ? other$claimExplanation != null : !this$claimExplanation.equals(other$claimExplanation)) return false; Object this$insuranceDetailsPic = getInsuranceDetailsPic();Object other$insuranceDetailsPic = other.getInsuranceDetailsPic(); if (this$insuranceDetailsPic == null ? other$insuranceDetailsPic != null : !this$insuranceDetailsPic.equals(other$insuranceDetailsPic)) return false; Object this$disease = getDisease();Object other$disease = other.getDisease();return this$disease == null ? other$disease == null : this$disease.equals(other$disease); } protected boolean canEqual(Object other) { return other instanceof InsuranceDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $insuranceName = getInsuranceName();result = result * 59 + ($insuranceName == null ? 43 : $insuranceName.hashCode());Object $insuranceType = getInsuranceType();result = result * 59 + ($insuranceType == null ? 43 : $insuranceType.hashCode());Object $insuranceState = getInsuranceState();result = result * 59 + ($insuranceState == null ? 43 : $insuranceState.hashCode());Object $securityCardPic = getSecurityCardPic();result = result * 59 + ($securityCardPic == null ? 43 : $securityCardPic.hashCode());Object $insurancePrice = getInsurancePrice();result = result * 59 + ($insurancePrice == null ? 43 : $insurancePrice.hashCode());Object $underwritingScope = getUnderwritingScope();result = result * 59 + ($underwritingScope == null ? 43 : $underwritingScope.hashCode());Object $guaranteeAmount = getGuaranteeAmount();result = result * 59 + ($guaranteeAmount == null ? 43 : $guaranteeAmount.hashCode());Object $ageSupport = getAgeSupport();result = result * 59 + ($ageSupport == null ? 43 : $ageSupport.hashCode());Object $guaranteeTime = getGuaranteeTime();result = result * 59 + ($guaranteeTime == null ? 43 : $guaranteeTime.hashCode());Object $diseaseProtection = getDiseaseProtection();result = result * 59 + ($diseaseProtection == null ? 43 : $diseaseProtection.hashCode());Object $claimExplanation = getClaimExplanation();result = result * 59 + ($claimExplanation == null ? 43 : $claimExplanation.hashCode());Object $insuranceDetailsPic = getInsuranceDetailsPic();result = result * 59 + ($insuranceDetailsPic == null ? 43 : $insuranceDetailsPic.hashCode());Object $disease = getDisease();result = result * 59 + ($disease == null ? 43 : $disease.hashCode());return result; } public String toString() { return "InsuranceDTO(insuranceId=" + getInsuranceId() + ", insuranceName=" + getInsuranceName() + ", insuranceType=" + getInsuranceType() + ", insuranceState=" + getInsuranceState() + ", securityCardPic=" + getSecurityCardPic() + ", insurancePrice=" + getInsurancePrice() + ", underwritingScope=" + getUnderwritingScope() + ", guaranteeAmount=" + getGuaranteeAmount() + ", ageSupport=" + getAgeSupport() + ", guaranteeTime=" + getGuaranteeTime() + ", diseaseProtection=" + getDiseaseProtection() + ", claimExplanation=" + getClaimExplanation() + ", insuranceDetailsPic=" + getInsuranceDetailsPic() + ", disease=" + getDisease() + ")"; }
/*    */   
/*    */   private String guaranteeAmount;
/*    */   private String ageSupport;
/*    */   private Integer guaranteeTime;
/*    */   
/* 21 */   public Integer getInsuranceId() { return this.insuranceId; }
/*    */   
/*    */   private String diseaseProtection;
/*    */   
/* 25 */   public String getInsuranceName() { return this.insuranceName; }
/*    */   
/*    */   private String claimExplanation;
/*    */   
/* 29 */   public Integer getInsuranceType() { return this.insuranceType; }
/*    */   
/*    */   private FileUploadDTO insuranceDetailsPic;
/*    */   private List<DiseaseDTO> disease;
/* 33 */   public Integer getInsuranceState() { return this.insuranceState; }
/*    */   
/*    */ 
/*    */   public FileDTO getSecurityCardPic()
/*    */   {
/* 38 */     return this.securityCardPic;
/*    */   }
/*    */   
/*    */   public Integer getInsurancePrice()
/*    */   {
/* 43 */     return this.insurancePrice;
/*    */   }
/*    */   
/*    */   public String getUnderwritingScope()
/*    */   {
/* 48 */     return this.underwritingScope;
/*    */   }
/*    */   
/*    */   public String getGuaranteeAmount() {
/* 52 */     return this.guaranteeAmount;
/*    */   }
/*    */   
/*    */   public String getAgeSupport() {
/* 56 */     return this.ageSupport;
/*    */   }
/*    */   
/*    */   public Integer getGuaranteeTime() {
/* 60 */     return this.guaranteeTime;
/*    */   }
/*    */   
/*    */   public String getDiseaseProtection() {
/* 64 */     return this.diseaseProtection;
/*    */   }
/*    */   
/*    */   public String getClaimExplanation() {
/* 68 */     return this.claimExplanation;
/*    */   }
/*    */   
/*    */   public FileUploadDTO getInsuranceDetailsPic() {
/* 72 */     return this.insuranceDetailsPic;
/*    */   }
/*    */   
/*    */   public List<DiseaseDTO> getDisease() {
/* 76 */     return this.disease;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/InsuranceDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */