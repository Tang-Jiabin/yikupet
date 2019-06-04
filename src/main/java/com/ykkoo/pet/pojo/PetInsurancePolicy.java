/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import lombok.Data;

import java.util.Date;
/*    */ @Data
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_insurance_policy")
/*    */ public class PetInsurancePolicy { @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer insurancePolicyId;
/*    */   private Integer userId;
/*    */   private Integer animalId;
/*    */   private Integer insuranceId;
/*    */   private Integer insuranceType;
/*    */   private Integer insuranceStatus;
private Integer claimStatus;
private Integer auditStatus;
private String auditExplain;

/*    */   
/* 16 */   public void setInsurancePolicyId(Integer insurancePolicyId) { this.insurancePolicyId = insurancePolicyId; } public void setUserId(Integer userId) { this.userId = userId; } public void setAnimalId(Integer animalId) { this.animalId = animalId; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setInsuranceType(Integer insuranceType) { this.insuranceType = insuranceType; } public void setInsuranceStatus(Integer insuranceStatus) { this.insuranceStatus = insuranceStatus; } public void setClaimNumber(Integer claimNumber) { this.claimNumber = claimNumber; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setInsuranceStartDate(Date insuranceStartDate) { this.insuranceStartDate = insuranceStartDate; } public void setInsuranceEndDate(Date insuranceEndDate) { this.insuranceEndDate = insuranceEndDate; } public void setInsuranceUpdateDate(Date insuranceUpdateDate) { this.insuranceUpdateDate = insuranceUpdateDate; } public void setPolicyDocuments(String policyDocuments) { this.policyDocuments = policyDocuments; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetInsurancePolicy)) return false; PetInsurancePolicy other = (PetInsurancePolicy)o; if (!other.canEqual(this)) return false; Object this$insurancePolicyId = getInsurancePolicyId();Object other$insurancePolicyId = other.getInsurancePolicyId(); if (this$insurancePolicyId == null ? other$insurancePolicyId != null : !this$insurancePolicyId.equals(other$insurancePolicyId)) return false; Object this$userId = getUserId();Object other$userId = other.getUserId(); if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false; Object this$animalId = getAnimalId();Object other$animalId = other.getAnimalId(); if (this$animalId == null ? other$animalId != null : !this$animalId.equals(other$animalId)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$insuranceType = getInsuranceType();Object other$insuranceType = other.getInsuranceType(); if (this$insuranceType == null ? other$insuranceType != null : !this$insuranceType.equals(other$insuranceType)) return false; Object this$insuranceStatus = getInsuranceStatus();Object other$insuranceStatus = other.getInsuranceStatus(); if (this$insuranceStatus == null ? other$insuranceStatus != null : !this$insuranceStatus.equals(other$insuranceStatus)) return false; Object this$claimNumber = getClaimNumber();Object other$claimNumber = other.getClaimNumber(); if (this$claimNumber == null ? other$claimNumber != null : !this$claimNumber.equals(other$claimNumber)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$insuranceStartDate = getInsuranceStartDate();Object other$insuranceStartDate = other.getInsuranceStartDate(); if (this$insuranceStartDate == null ? other$insuranceStartDate != null : !this$insuranceStartDate.equals(other$insuranceStartDate)) return false; Object this$insuranceEndDate = getInsuranceEndDate();Object other$insuranceEndDate = other.getInsuranceEndDate(); if (this$insuranceEndDate == null ? other$insuranceEndDate != null : !this$insuranceEndDate.equals(other$insuranceEndDate)) return false; Object this$insuranceUpdateDate = getInsuranceUpdateDate();Object other$insuranceUpdateDate = other.getInsuranceUpdateDate(); if (this$insuranceUpdateDate == null ? other$insuranceUpdateDate != null : !this$insuranceUpdateDate.equals(other$insuranceUpdateDate)) return false; Object this$policyDocuments = getPolicyDocuments();Object other$policyDocuments = other.getPolicyDocuments();return this$policyDocuments == null ? other$policyDocuments == null : this$policyDocuments.equals(other$policyDocuments); } protected boolean canEqual(Object other) { return other instanceof PetInsurancePolicy; } public int hashCode() { int PRIME = 59;int result = 1;Object $insurancePolicyId = getInsurancePolicyId();result = result * 59 + ($insurancePolicyId == null ? 43 : $insurancePolicyId.hashCode());Object $userId = getUserId();result = result * 59 + ($userId == null ? 43 : $userId.hashCode());Object $animalId = getAnimalId();result = result * 59 + ($animalId == null ? 43 : $animalId.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $insuranceType = getInsuranceType();result = result * 59 + ($insuranceType == null ? 43 : $insuranceType.hashCode());Object $insuranceStatus = getInsuranceStatus();result = result * 59 + ($insuranceStatus == null ? 43 : $insuranceStatus.hashCode());Object $claimNumber = getClaimNumber();result = result * 59 + ($claimNumber == null ? 43 : $claimNumber.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $insuranceStartDate = getInsuranceStartDate();result = result * 59 + ($insuranceStartDate == null ? 43 : $insuranceStartDate.hashCode());Object $insuranceEndDate = getInsuranceEndDate();result = result * 59 + ($insuranceEndDate == null ? 43 : $insuranceEndDate.hashCode());Object $insuranceUpdateDate = getInsuranceUpdateDate();result = result * 59 + ($insuranceUpdateDate == null ? 43 : $insuranceUpdateDate.hashCode());Object $policyDocuments = getPolicyDocuments();result = result * 59 + ($policyDocuments == null ? 43 : $policyDocuments.hashCode());return result; } public String toString() { return "PetInsurancePolicy(insurancePolicyId=" + getInsurancePolicyId() + ", userId=" + getUserId() + ", animalId=" + getAnimalId() + ", insuranceId=" + getInsuranceId() + ", insuranceType=" + getInsuranceType() + ", insuranceStatus=" + getInsuranceStatus() + ", claimNumber=" + getClaimNumber() + ", createDate=" + getCreateDate() + ", insuranceStartDate=" + getInsuranceStartDate() + ", insuranceEndDate=" + getInsuranceEndDate() + ", insuranceUpdateDate=" + getInsuranceUpdateDate() + ", policyDocuments=" + getPolicyDocuments() + ")"; }
/*    */   
/*    */ 
/*    */   private Integer claimNumber;
/*    */   private Date createDate;
/*    */   private Date insuranceStartDate;
/*    */   
/* 23 */   public Integer getInsurancePolicyId() { return this.insurancePolicyId; }
/*    */   
/*    */   private Date insuranceEndDate;
/*    */   private Date insuranceUpdateDate;
/*    */   private String policyDocuments;
/* 28 */   public Integer getUserId() { return this.userId; }
/*    */   
/*    */ 
/*    */   public Integer getAnimalId()
/*    */   {
/* 33 */     return this.animalId;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceId()
/*    */   {
/* 38 */     return this.insuranceId;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceType()
/*    */   {
/* 43 */     return this.insuranceType;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceStatus()
/*    */   {
/* 48 */     return this.insuranceStatus;
/*    */   }
/*    */   
/*    */   public Integer getClaimNumber()
/*    */   {
/* 53 */     return this.claimNumber;
/*    */   }
/*    */   
/*    */   public Date getCreateDate()
/*    */   {
/* 58 */     return this.createDate;
/*    */   }
/*    */   
/*    */   public Date getInsuranceStartDate()
/*    */   {
/* 63 */     return this.insuranceStartDate;
/*    */   }
/*    */   
/*    */   public Date getInsuranceEndDate()
/*    */   {
/* 68 */     return this.insuranceEndDate;
/*    */   }
/*    */   
/*    */   public Date getInsuranceUpdateDate()
/*    */   {
/* 73 */     return this.insuranceUpdateDate;
/*    */   }
/*    */   
/*    */   public String getPolicyDocuments()
/*    */   {
/* 78 */     return this.policyDocuments;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetInsurancePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */