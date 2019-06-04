/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_insurance")
/*    */ public class PetInsurance {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer insuranceId;
/*    */   private String insuranceName;
/*    */   private Integer insuranceType;
/*    */   private Integer insuranceState;
/*    */   private String securityCardPic;
/*    */   private Integer insurancePrice;
/*    */   private String underwritingScope;
/*    */   
/* 19 */   public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setInsuranceName(String insuranceName) { this.insuranceName = insuranceName; } public void setInsuranceType(Integer insuranceType) { this.insuranceType = insuranceType; } public void setInsuranceState(Integer insuranceState) { this.insuranceState = insuranceState; } public void setSecurityCardPic(String securityCardPic) { this.securityCardPic = securityCardPic; } public void setInsurancePrice(Integer insurancePrice) { this.insurancePrice = insurancePrice; } public void setUnderwritingScope(String underwritingScope) { this.underwritingScope = underwritingScope; } public void setGuaranteeAmount(String guaranteeAmount) { this.guaranteeAmount = guaranteeAmount; } public void setAgeSupport(String ageSupport) { this.ageSupport = ageSupport; } public void setGuaranteeTime(Integer guaranteeTime) { this.guaranteeTime = guaranteeTime; } public void setDiseaseProtection(String diseaseProtection) { this.diseaseProtection = diseaseProtection; } public void setClaimExplanation(String claimExplanation) { this.claimExplanation = claimExplanation; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetInsurance)) return false; PetInsurance other = (PetInsurance)o; if (!other.canEqual(this)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$insuranceName = getInsuranceName();Object other$insuranceName = other.getInsuranceName(); if (this$insuranceName == null ? other$insuranceName != null : !this$insuranceName.equals(other$insuranceName)) return false; Object this$insuranceType = getInsuranceType();Object other$insuranceType = other.getInsuranceType(); if (this$insuranceType == null ? other$insuranceType != null : !this$insuranceType.equals(other$insuranceType)) return false; Object this$insuranceState = getInsuranceState();Object other$insuranceState = other.getInsuranceState(); if (this$insuranceState == null ? other$insuranceState != null : !this$insuranceState.equals(other$insuranceState)) return false; Object this$securityCardPic = getSecurityCardPic();Object other$securityCardPic = other.getSecurityCardPic(); if (this$securityCardPic == null ? other$securityCardPic != null : !this$securityCardPic.equals(other$securityCardPic)) return false; Object this$insurancePrice = getInsurancePrice();Object other$insurancePrice = other.getInsurancePrice(); if (this$insurancePrice == null ? other$insurancePrice != null : !this$insurancePrice.equals(other$insurancePrice)) return false; Object this$underwritingScope = getUnderwritingScope();Object other$underwritingScope = other.getUnderwritingScope(); if (this$underwritingScope == null ? other$underwritingScope != null : !this$underwritingScope.equals(other$underwritingScope)) return false; Object this$guaranteeAmount = getGuaranteeAmount();Object other$guaranteeAmount = other.getGuaranteeAmount(); if (this$guaranteeAmount == null ? other$guaranteeAmount != null : !this$guaranteeAmount.equals(other$guaranteeAmount)) return false; Object this$ageSupport = getAgeSupport();Object other$ageSupport = other.getAgeSupport(); if (this$ageSupport == null ? other$ageSupport != null : !this$ageSupport.equals(other$ageSupport)) return false; Object this$guaranteeTime = getGuaranteeTime();Object other$guaranteeTime = other.getGuaranteeTime(); if (this$guaranteeTime == null ? other$guaranteeTime != null : !this$guaranteeTime.equals(other$guaranteeTime)) return false; Object this$diseaseProtection = getDiseaseProtection();Object other$diseaseProtection = other.getDiseaseProtection(); if (this$diseaseProtection == null ? other$diseaseProtection != null : !this$diseaseProtection.equals(other$diseaseProtection)) return false; Object this$claimExplanation = getClaimExplanation();Object other$claimExplanation = other.getClaimExplanation(); if (this$claimExplanation == null ? other$claimExplanation != null : !this$claimExplanation.equals(other$claimExplanation)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate();return this$updateDate == null ? other$updateDate == null : this$updateDate.equals(other$updateDate); } protected boolean canEqual(Object other) { return other instanceof PetInsurance; } public int hashCode() { int PRIME = 59;int result = 1;Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $insuranceName = getInsuranceName();result = result * 59 + ($insuranceName == null ? 43 : $insuranceName.hashCode());Object $insuranceType = getInsuranceType();result = result * 59 + ($insuranceType == null ? 43 : $insuranceType.hashCode());Object $insuranceState = getInsuranceState();result = result * 59 + ($insuranceState == null ? 43 : $insuranceState.hashCode());Object $securityCardPic = getSecurityCardPic();result = result * 59 + ($securityCardPic == null ? 43 : $securityCardPic.hashCode());Object $insurancePrice = getInsurancePrice();result = result * 59 + ($insurancePrice == null ? 43 : $insurancePrice.hashCode());Object $underwritingScope = getUnderwritingScope();result = result * 59 + ($underwritingScope == null ? 43 : $underwritingScope.hashCode());Object $guaranteeAmount = getGuaranteeAmount();result = result * 59 + ($guaranteeAmount == null ? 43 : $guaranteeAmount.hashCode());Object $ageSupport = getAgeSupport();result = result * 59 + ($ageSupport == null ? 43 : $ageSupport.hashCode());Object $guaranteeTime = getGuaranteeTime();result = result * 59 + ($guaranteeTime == null ? 43 : $guaranteeTime.hashCode());Object $diseaseProtection = getDiseaseProtection();result = result * 59 + ($diseaseProtection == null ? 43 : $diseaseProtection.hashCode());Object $claimExplanation = getClaimExplanation();result = result * 59 + ($claimExplanation == null ? 43 : $claimExplanation.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());return result; } public String toString() { return "PetInsurance(insuranceId=" + getInsuranceId() + ", insuranceName=" + getInsuranceName() + ", insuranceType=" + getInsuranceType() + ", insuranceState=" + getInsuranceState() + ", securityCardPic=" + getSecurityCardPic() + ", insurancePrice=" + getInsurancePrice() + ", underwritingScope=" + getUnderwritingScope() + ", guaranteeAmount=" + getGuaranteeAmount() + ", ageSupport=" + getAgeSupport() + ", guaranteeTime=" + getGuaranteeTime() + ", diseaseProtection=" + getDiseaseProtection() + ", claimExplanation=" + getClaimExplanation() + ", createDate=" + getCreateDate() + ", updateDate=" + getUpdateDate() + ")"; }
/*    */   
/*    */ 
/*    */   private String guaranteeAmount;
/*    */   private String ageSupport;
/*    */   private Integer guaranteeTime;
/*    */   
/* 26 */   public Integer getInsuranceId() { return this.insuranceId; }
/*    */   
/*    */   private String diseaseProtection;
/*    */   
/* 30 */   public String getInsuranceName() { return this.insuranceName; }
/*    */   
/*    */   private String claimExplanation;
/*    */   
/* 34 */   public Integer getInsuranceType() { return this.insuranceType; }
/*    */   
/*    */   private Date createDate;
/*    */   private Date updateDate;
/*    */   public Integer getInsuranceState() {
/* 39 */     return this.insuranceState;
/*    */   }
/*    */   
/*    */   public String getSecurityCardPic()
/*    */   {
/* 44 */     return this.securityCardPic;
/*    */   }
/*    */   
/*    */   public Integer getInsurancePrice()
/*    */   {
/* 49 */     return this.insurancePrice;
/*    */   }
/*    */   
/*    */   public String getUnderwritingScope()
/*    */   {
/* 54 */     return this.underwritingScope;
/*    */   }
/*    */   
/*    */   public String getGuaranteeAmount() {
/* 58 */     return this.guaranteeAmount;
/*    */   }
/*    */   
/*    */   public String getAgeSupport() {
/* 62 */     return this.ageSupport;
/*    */   }
/*    */   
/*    */   public Integer getGuaranteeTime() {
/* 66 */     return this.guaranteeTime;
/*    */   }
/*    */   
/*    */   public String getDiseaseProtection() {
/* 70 */     return this.diseaseProtection;
/*    */   }
/*    */   
/*    */   public String getClaimExplanation() {
/* 74 */     return this.claimExplanation;
/*    */   }
/*    */   
/*    */   public Date getCreateDate() {
/* 78 */     return this.createDate;
/*    */   }
/*    */   
/*    */   public Date getUpdateDate() {
/* 82 */     return this.updateDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetInsurance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */