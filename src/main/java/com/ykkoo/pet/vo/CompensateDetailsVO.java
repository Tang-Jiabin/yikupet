/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ public class CompensateDetailsVO
/*    */ {
/*    */   private Integer compensateId;
/*    */   private Integer userId;
/*    */   private Integer claimStatus;
/*    */   private Integer auditStatus;
/*    */   private String auditExplain;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date applicationDate;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date updateDate;
/*    */   
/* 18 */   public void setCompensateId(Integer compensateId) { this.compensateId = compensateId; } public void setUserId(Integer userId) { this.userId = userId; } public void setClaimStatus(Integer claimStatus) { this.claimStatus = claimStatus; } public void setAuditStatus(Integer auditStatus) { this.auditStatus = auditStatus; } public void setAuditExplain(String auditExplain) { this.auditExplain = auditExplain; } public void setApplicationDate(Date applicationDate) { this.applicationDate = applicationDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public void setInsuranceName(String insuranceName) { this.insuranceName = insuranceName; } public void setInsuranceStartDate(Date insuranceStartDate) { this.insuranceStartDate = insuranceStartDate; } public void setInsuranceEndDate(Date insuranceEndDate) { this.insuranceEndDate = insuranceEndDate; } public void setInsurancePolicyVO(InsurancePolicyVO insurancePolicyVO) { this.insurancePolicyVO = insurancePolicyVO; } public void setUserVO(UserVO userVO) { this.userVO = userVO; } public void setClaimInvoice(java.util.List<com.ykkoo.pet.pojo.PetFile> claimInvoice) { this.claimInvoice = claimInvoice; } public void setClaimDiagnosis(java.util.List<com.ykkoo.pet.pojo.PetFile> claimDiagnosis) { this.claimDiagnosis = claimDiagnosis; } public void setClaimVoucher(java.util.List<com.ykkoo.pet.pojo.PetFile> claimVoucher) { this.claimVoucher = claimVoucher; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof CompensateDetailsVO)) return false; CompensateDetailsVO other = (CompensateDetailsVO)o; if (!other.canEqual(this)) return false; Object this$compensateId = getCompensateId();Object other$compensateId = other.getCompensateId(); if (this$compensateId == null ? other$compensateId != null : !this$compensateId.equals(other$compensateId)) return false; Object this$userId = getUserId();Object other$userId = other.getUserId(); if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false; Object this$claimStatus = getClaimStatus();Object other$claimStatus = other.getClaimStatus(); if (this$claimStatus == null ? other$claimStatus != null : !this$claimStatus.equals(other$claimStatus)) return false; Object this$auditStatus = getAuditStatus();Object other$auditStatus = other.getAuditStatus(); if (this$auditStatus == null ? other$auditStatus != null : !this$auditStatus.equals(other$auditStatus)) return false; Object this$auditExplain = getAuditExplain();Object other$auditExplain = other.getAuditExplain(); if (this$auditExplain == null ? other$auditExplain != null : !this$auditExplain.equals(other$auditExplain)) return false; Object this$applicationDate = getApplicationDate();Object other$applicationDate = other.getApplicationDate(); if (this$applicationDate == null ? other$applicationDate != null : !this$applicationDate.equals(other$applicationDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate(); if (this$updateDate == null ? other$updateDate != null : !this$updateDate.equals(other$updateDate)) return false; Object this$insuranceName = getInsuranceName();Object other$insuranceName = other.getInsuranceName(); if (this$insuranceName == null ? other$insuranceName != null : !this$insuranceName.equals(other$insuranceName)) return false; Object this$insuranceStartDate = getInsuranceStartDate();Object other$insuranceStartDate = other.getInsuranceStartDate(); if (this$insuranceStartDate == null ? other$insuranceStartDate != null : !this$insuranceStartDate.equals(other$insuranceStartDate)) return false; Object this$insuranceEndDate = getInsuranceEndDate();Object other$insuranceEndDate = other.getInsuranceEndDate(); if (this$insuranceEndDate == null ? other$insuranceEndDate != null : !this$insuranceEndDate.equals(other$insuranceEndDate)) return false; Object this$insurancePolicyVO = getInsurancePolicyVO();Object other$insurancePolicyVO = other.getInsurancePolicyVO(); if (this$insurancePolicyVO == null ? other$insurancePolicyVO != null : !this$insurancePolicyVO.equals(other$insurancePolicyVO)) return false; Object this$userVO = getUserVO();Object other$userVO = other.getUserVO(); if (this$userVO == null ? other$userVO != null : !this$userVO.equals(other$userVO)) return false; Object this$claimInvoice = getClaimInvoice();Object other$claimInvoice = other.getClaimInvoice(); if (this$claimInvoice == null ? other$claimInvoice != null : !this$claimInvoice.equals(other$claimInvoice)) return false; Object this$claimDiagnosis = getClaimDiagnosis();Object other$claimDiagnosis = other.getClaimDiagnosis(); if (this$claimDiagnosis == null ? other$claimDiagnosis != null : !this$claimDiagnosis.equals(other$claimDiagnosis)) return false; Object this$claimVoucher = getClaimVoucher();Object other$claimVoucher = other.getClaimVoucher();return this$claimVoucher == null ? other$claimVoucher == null : this$claimVoucher.equals(other$claimVoucher); } protected boolean canEqual(Object other) { return other instanceof CompensateDetailsVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $compensateId = getCompensateId();result = result * 59 + ($compensateId == null ? 43 : $compensateId.hashCode());Object $userId = getUserId();result = result * 59 + ($userId == null ? 43 : $userId.hashCode());Object $claimStatus = getClaimStatus();result = result * 59 + ($claimStatus == null ? 43 : $claimStatus.hashCode());Object $auditStatus = getAuditStatus();result = result * 59 + ($auditStatus == null ? 43 : $auditStatus.hashCode());Object $auditExplain = getAuditExplain();result = result * 59 + ($auditExplain == null ? 43 : $auditExplain.hashCode());Object $applicationDate = getApplicationDate();result = result * 59 + ($applicationDate == null ? 43 : $applicationDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());Object $insuranceName = getInsuranceName();result = result * 59 + ($insuranceName == null ? 43 : $insuranceName.hashCode());Object $insuranceStartDate = getInsuranceStartDate();result = result * 59 + ($insuranceStartDate == null ? 43 : $insuranceStartDate.hashCode());Object $insuranceEndDate = getInsuranceEndDate();result = result * 59 + ($insuranceEndDate == null ? 43 : $insuranceEndDate.hashCode());Object $insurancePolicyVO = getInsurancePolicyVO();result = result * 59 + ($insurancePolicyVO == null ? 43 : $insurancePolicyVO.hashCode());Object $userVO = getUserVO();result = result * 59 + ($userVO == null ? 43 : $userVO.hashCode());Object $claimInvoice = getClaimInvoice();result = result * 59 + ($claimInvoice == null ? 43 : $claimInvoice.hashCode());Object $claimDiagnosis = getClaimDiagnosis();result = result * 59 + ($claimDiagnosis == null ? 43 : $claimDiagnosis.hashCode());Object $claimVoucher = getClaimVoucher();result = result * 59 + ($claimVoucher == null ? 43 : $claimVoucher.hashCode());return result; } public String toString() { return "CompensateDetailsVO(compensateId=" + getCompensateId() + ", userId=" + getUserId() + ", claimStatus=" + getClaimStatus() + ", auditStatus=" + getAuditStatus() + ", auditExplain=" + getAuditExplain() + ", applicationDate=" + getApplicationDate() + ", updateDate=" + getUpdateDate() + ", insuranceName=" + getInsuranceName() + ", insuranceStartDate=" + getInsuranceStartDate() + ", insuranceEndDate=" + getInsuranceEndDate() + ", insurancePolicyVO=" + getInsurancePolicyVO() + ", userVO=" + getUserVO() + ", claimInvoice=" + getClaimInvoice() + ", claimDiagnosis=" + getClaimDiagnosis() + ", claimVoucher=" + getClaimVoucher() + ")"; }
/*    */   
/*    */ 
/*    */   private String insuranceName;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date insuranceStartDate;
/*    */   
/* 25 */   public Integer getCompensateId() { return this.compensateId; }
/*    */   
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date insuranceEndDate;
/*    */   
/* 30 */   public Integer getUserId() { return this.userId; }
/*    */   
/*    */   private InsurancePolicyVO insurancePolicyVO;
/*    */   private UserVO userVO;
/*    */   
/* 35 */   public Integer getClaimStatus() { return this.claimStatus; }
/*    */   
/*    */   private java.util.List<com.ykkoo.pet.pojo.PetFile> claimInvoice;
/*    */   private java.util.List<com.ykkoo.pet.pojo.PetFile> claimDiagnosis;
/*    */   private java.util.List<com.ykkoo.pet.pojo.PetFile> claimVoucher;
/* 40 */   public Integer getAuditStatus() { return this.auditStatus; }
/*    */   
/*    */ 
/*    */   public String getAuditExplain()
/*    */   {
/* 45 */     return this.auditExplain;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getApplicationDate()
/*    */   {
/* 51 */     return this.applicationDate;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getUpdateDate()
/*    */   {
/* 57 */     return this.updateDate;
/*    */   }
/*    */   
/*    */   public String getInsuranceName()
/*    */   {
/* 62 */     return this.insuranceName;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getInsuranceStartDate()
/*    */   {
/* 68 */     return this.insuranceStartDate;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getInsuranceEndDate()
/*    */   {
/* 74 */     return this.insuranceEndDate;
/*    */   }
/*    */   
/*    */   public InsurancePolicyVO getInsurancePolicyVO()
/*    */   {
/* 79 */     return this.insurancePolicyVO;
/*    */   }
/*    */   
/*    */   public UserVO getUserVO()
/*    */   {
/* 84 */     return this.userVO;
/*    */   }
/*    */   
/*    */   public java.util.List<com.ykkoo.pet.pojo.PetFile> getClaimInvoice()
/*    */   {
/* 89 */     return this.claimInvoice;
/*    */   }
/*    */   
/*    */   public java.util.List<com.ykkoo.pet.pojo.PetFile> getClaimDiagnosis()
/*    */   {
/* 94 */     return this.claimDiagnosis;
/*    */   }
/*    */   
/*    */   public java.util.List<com.ykkoo.pet.pojo.PetFile> getClaimVoucher()
/*    */   {
/* 99 */     return this.claimVoucher;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/CompensateDetailsVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */