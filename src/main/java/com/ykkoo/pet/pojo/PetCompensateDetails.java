/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import lombok.Data;

import java.util.Date;
/*    */ @Data
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_compensate_details")
/*    */ public class PetCompensateDetails {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer compensateId;
/*    */   private Integer insurancePolicyId;
/*    */   private Integer userId;
/*    */   private Integer claimStatus;
/*    */   private Integer auditStatus;
private Integer compensateStatus;
/*    */   
/* 16 */   public void setCompensateId(Integer compensateId) { this.compensateId = compensateId; } public void setInsurancePolicyId(Integer insurancePolicyId) { this.insurancePolicyId = insurancePolicyId; } public void setUserId(Integer userId) { this.userId = userId; } public void setClaimStatus(Integer claimStatus) { this.claimStatus = claimStatus; } public void setAuditStatus(Integer auditStatus) { this.auditStatus = auditStatus; } public void setAuditExplain(String auditExplain) { this.auditExplain = auditExplain; } public void setApplicationDate(Date applicationDate) { this.applicationDate = applicationDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public void setInsuranceName(String insuranceName) { this.insuranceName = insuranceName; } public void setInsuranceStartDate(Date insuranceStartDate) { this.insuranceStartDate = insuranceStartDate; } public void setInsuranceEndDate(Date insuranceEndDate) { this.insuranceEndDate = insuranceEndDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetCompensateDetails)) return false; PetCompensateDetails other = (PetCompensateDetails)o; if (!other.canEqual(this)) return false; Object this$compensateId = getCompensateId();Object other$compensateId = other.getCompensateId(); if (this$compensateId == null ? other$compensateId != null : !this$compensateId.equals(other$compensateId)) return false; Object this$insurancePolicyId = getInsurancePolicyId();Object other$insurancePolicyId = other.getInsurancePolicyId(); if (this$insurancePolicyId == null ? other$insurancePolicyId != null : !this$insurancePolicyId.equals(other$insurancePolicyId)) return false; Object this$userId = getUserId();Object other$userId = other.getUserId(); if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false; Object this$claimStatus = getClaimStatus();Object other$claimStatus = other.getClaimStatus(); if (this$claimStatus == null ? other$claimStatus != null : !this$claimStatus.equals(other$claimStatus)) return false; Object this$auditStatus = getAuditStatus();Object other$auditStatus = other.getAuditStatus(); if (this$auditStatus == null ? other$auditStatus != null : !this$auditStatus.equals(other$auditStatus)) return false; Object this$auditExplain = getAuditExplain();Object other$auditExplain = other.getAuditExplain(); if (this$auditExplain == null ? other$auditExplain != null : !this$auditExplain.equals(other$auditExplain)) return false; Object this$applicationDate = getApplicationDate();Object other$applicationDate = other.getApplicationDate(); if (this$applicationDate == null ? other$applicationDate != null : !this$applicationDate.equals(other$applicationDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate(); if (this$updateDate == null ? other$updateDate != null : !this$updateDate.equals(other$updateDate)) return false; Object this$insuranceName = getInsuranceName();Object other$insuranceName = other.getInsuranceName(); if (this$insuranceName == null ? other$insuranceName != null : !this$insuranceName.equals(other$insuranceName)) return false; Object this$insuranceStartDate = getInsuranceStartDate();Object other$insuranceStartDate = other.getInsuranceStartDate(); if (this$insuranceStartDate == null ? other$insuranceStartDate != null : !this$insuranceStartDate.equals(other$insuranceStartDate)) return false; Object this$insuranceEndDate = getInsuranceEndDate();Object other$insuranceEndDate = other.getInsuranceEndDate();return this$insuranceEndDate == null ? other$insuranceEndDate == null : this$insuranceEndDate.equals(other$insuranceEndDate); } protected boolean canEqual(Object other) { return other instanceof PetCompensateDetails; } public int hashCode() { int PRIME = 59;int result = 1;Object $compensateId = getCompensateId();result = result * 59 + ($compensateId == null ? 43 : $compensateId.hashCode());Object $insurancePolicyId = getInsurancePolicyId();result = result * 59 + ($insurancePolicyId == null ? 43 : $insurancePolicyId.hashCode());Object $userId = getUserId();result = result * 59 + ($userId == null ? 43 : $userId.hashCode());Object $claimStatus = getClaimStatus();result = result * 59 + ($claimStatus == null ? 43 : $claimStatus.hashCode());Object $auditStatus = getAuditStatus();result = result * 59 + ($auditStatus == null ? 43 : $auditStatus.hashCode());Object $auditExplain = getAuditExplain();result = result * 59 + ($auditExplain == null ? 43 : $auditExplain.hashCode());Object $applicationDate = getApplicationDate();result = result * 59 + ($applicationDate == null ? 43 : $applicationDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());Object $insuranceName = getInsuranceName();result = result * 59 + ($insuranceName == null ? 43 : $insuranceName.hashCode());Object $insuranceStartDate = getInsuranceStartDate();result = result * 59 + ($insuranceStartDate == null ? 43 : $insuranceStartDate.hashCode());Object $insuranceEndDate = getInsuranceEndDate();result = result * 59 + ($insuranceEndDate == null ? 43 : $insuranceEndDate.hashCode());return result; } public String toString() { return "PetCompensateDetails(compensateId=" + getCompensateId() + ", insurancePolicyId=" + getInsurancePolicyId() + ", userId=" + getUserId() + ", claimStatus=" + getClaimStatus() + ", auditStatus=" + getAuditStatus() + ", auditExplain=" + getAuditExplain() + ", applicationDate=" + getApplicationDate() + ", updateDate=" + getUpdateDate() + ", insuranceName=" + getInsuranceName() + ", insuranceStartDate=" + getInsuranceStartDate() + ", insuranceEndDate=" + getInsuranceEndDate() + ")"; }
/*    */   
/*    */ 
/*    */   private String auditExplain;
/*    */   private Date applicationDate;
/*    */   private Date updateDate;
/*    */   
/* 23 */   public Integer getCompensateId() { return this.compensateId; }
/*    */   
/*    */   private String insuranceName;
/*    */   private Date insuranceStartDate;
/*    */   private Date insuranceEndDate;
/* 28 */   public Integer getInsurancePolicyId() { return this.insurancePolicyId; }
/*    */   
/*    */ 
/*    */   public Integer getUserId()
/*    */   {
/* 33 */     return this.userId;
/*    */   }
/*    */   
/*    */   public Integer getClaimStatus()
/*    */   {
/* 38 */     return this.claimStatus;
/*    */   }
/*    */   
/*    */   public Integer getAuditStatus()
/*    */   {
/* 43 */     return this.auditStatus;
/*    */   }
/*    */   
/*    */   public String getAuditExplain()
/*    */   {
/* 48 */     return this.auditExplain;
/*    */   }
/*    */   
/*    */   public Date getApplicationDate()
/*    */   {
/* 53 */     return this.applicationDate;
/*    */   }
/*    */   
/*    */   public Date getUpdateDate()
/*    */   {
/* 58 */     return this.updateDate;
/*    */   }
/*    */   
/*    */   public String getInsuranceName()
/*    */   {
/* 63 */     return this.insuranceName;
/*    */   }
/*    */   
/*    */   public Date getInsuranceStartDate()
/*    */   {
/* 68 */     return this.insuranceStartDate;
/*    */   }
/*    */   
/*    */   public Date getInsuranceEndDate()
/*    */   {
/* 73 */     return this.insuranceEndDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetCompensateDetails.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */