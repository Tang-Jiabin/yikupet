/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ public class InsurancePolicyVO
/*    */ {
/*    */   private Integer insurancePolicyId;
/*    */   private Integer insuranceStatus;
/*    */   private Integer claimNumber;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date insuranceStartDate;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date insuranceEndDate;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date insuranceUpdateDate;
/*    */   
/* 18 */   public void setInsurancePolicyId(Integer insurancePolicyId) { this.insurancePolicyId = insurancePolicyId; } public void setInsuranceStatus(Integer insuranceStatus) { this.insuranceStatus = insuranceStatus; } public void setClaimNumber(Integer claimNumber) { this.claimNumber = claimNumber; } public void setInsuranceStartDate(Date insuranceStartDate) { this.insuranceStartDate = insuranceStartDate; } public void setInsuranceEndDate(Date insuranceEndDate) { this.insuranceEndDate = insuranceEndDate; } public void setInsuranceUpdateDate(Date insuranceUpdateDate) { this.insuranceUpdateDate = insuranceUpdateDate; } public void setPolicyDocuments(String policyDocuments) { this.policyDocuments = policyDocuments; } public void setInsuranceVO(InsuranceVO insuranceVO) { this.insuranceVO = insuranceVO; } public void setAnimalVO(PetAnimalVO animalVO) { this.animalVO = animalVO; } public void setUserVO(UserVO userVO) { this.userVO = userVO; } public void setInsuranceDiseaseVOList(java.util.List<InsuranceDiseaseVO> insuranceDiseaseVOList) { this.insuranceDiseaseVOList = insuranceDiseaseVOList; } public void setMedicalInfoList(java.util.List<PetMedicalInfoVO> medicalInfoList) { this.medicalInfoList = medicalInfoList; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof InsurancePolicyVO)) return false; InsurancePolicyVO other = (InsurancePolicyVO)o; if (!other.canEqual(this)) return false; Object this$insurancePolicyId = getInsurancePolicyId();Object other$insurancePolicyId = other.getInsurancePolicyId(); if (this$insurancePolicyId == null ? other$insurancePolicyId != null : !this$insurancePolicyId.equals(other$insurancePolicyId)) return false; Object this$insuranceStatus = getInsuranceStatus();Object other$insuranceStatus = other.getInsuranceStatus(); if (this$insuranceStatus == null ? other$insuranceStatus != null : !this$insuranceStatus.equals(other$insuranceStatus)) return false; Object this$claimNumber = getClaimNumber();Object other$claimNumber = other.getClaimNumber(); if (this$claimNumber == null ? other$claimNumber != null : !this$claimNumber.equals(other$claimNumber)) return false; Object this$insuranceStartDate = getInsuranceStartDate();Object other$insuranceStartDate = other.getInsuranceStartDate(); if (this$insuranceStartDate == null ? other$insuranceStartDate != null : !this$insuranceStartDate.equals(other$insuranceStartDate)) return false; Object this$insuranceEndDate = getInsuranceEndDate();Object other$insuranceEndDate = other.getInsuranceEndDate(); if (this$insuranceEndDate == null ? other$insuranceEndDate != null : !this$insuranceEndDate.equals(other$insuranceEndDate)) return false; Object this$insuranceUpdateDate = getInsuranceUpdateDate();Object other$insuranceUpdateDate = other.getInsuranceUpdateDate(); if (this$insuranceUpdateDate == null ? other$insuranceUpdateDate != null : !this$insuranceUpdateDate.equals(other$insuranceUpdateDate)) return false; Object this$policyDocuments = getPolicyDocuments();Object other$policyDocuments = other.getPolicyDocuments(); if (this$policyDocuments == null ? other$policyDocuments != null : !this$policyDocuments.equals(other$policyDocuments)) return false; Object this$insuranceVO = getInsuranceVO();Object other$insuranceVO = other.getInsuranceVO(); if (this$insuranceVO == null ? other$insuranceVO != null : !this$insuranceVO.equals(other$insuranceVO)) return false; Object this$animalVO = getAnimalVO();Object other$animalVO = other.getAnimalVO(); if (this$animalVO == null ? other$animalVO != null : !this$animalVO.equals(other$animalVO)) return false; Object this$userVO = getUserVO();Object other$userVO = other.getUserVO(); if (this$userVO == null ? other$userVO != null : !this$userVO.equals(other$userVO)) return false; Object this$insuranceDiseaseVOList = getInsuranceDiseaseVOList();Object other$insuranceDiseaseVOList = other.getInsuranceDiseaseVOList(); if (this$insuranceDiseaseVOList == null ? other$insuranceDiseaseVOList != null : !this$insuranceDiseaseVOList.equals(other$insuranceDiseaseVOList)) return false; Object this$medicalInfoList = getMedicalInfoList();Object other$medicalInfoList = other.getMedicalInfoList();return this$medicalInfoList == null ? other$medicalInfoList == null : this$medicalInfoList.equals(other$medicalInfoList); } protected boolean canEqual(Object other) { return other instanceof InsurancePolicyVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $insurancePolicyId = getInsurancePolicyId();result = result * 59 + ($insurancePolicyId == null ? 43 : $insurancePolicyId.hashCode());Object $insuranceStatus = getInsuranceStatus();result = result * 59 + ($insuranceStatus == null ? 43 : $insuranceStatus.hashCode());Object $claimNumber = getClaimNumber();result = result * 59 + ($claimNumber == null ? 43 : $claimNumber.hashCode());Object $insuranceStartDate = getInsuranceStartDate();result = result * 59 + ($insuranceStartDate == null ? 43 : $insuranceStartDate.hashCode());Object $insuranceEndDate = getInsuranceEndDate();result = result * 59 + ($insuranceEndDate == null ? 43 : $insuranceEndDate.hashCode());Object $insuranceUpdateDate = getInsuranceUpdateDate();result = result * 59 + ($insuranceUpdateDate == null ? 43 : $insuranceUpdateDate.hashCode());Object $policyDocuments = getPolicyDocuments();result = result * 59 + ($policyDocuments == null ? 43 : $policyDocuments.hashCode());Object $insuranceVO = getInsuranceVO();result = result * 59 + ($insuranceVO == null ? 43 : $insuranceVO.hashCode());Object $animalVO = getAnimalVO();result = result * 59 + ($animalVO == null ? 43 : $animalVO.hashCode());Object $userVO = getUserVO();result = result * 59 + ($userVO == null ? 43 : $userVO.hashCode());Object $insuranceDiseaseVOList = getInsuranceDiseaseVOList();result = result * 59 + ($insuranceDiseaseVOList == null ? 43 : $insuranceDiseaseVOList.hashCode());Object $medicalInfoList = getMedicalInfoList();result = result * 59 + ($medicalInfoList == null ? 43 : $medicalInfoList.hashCode());return result; } public String toString() { return "InsurancePolicyVO(insurancePolicyId=" + getInsurancePolicyId() + ", insuranceStatus=" + getInsuranceStatus() + ", claimNumber=" + getClaimNumber() + ", insuranceStartDate=" + getInsuranceStartDate() + ", insuranceEndDate=" + getInsuranceEndDate() + ", insuranceUpdateDate=" + getInsuranceUpdateDate() + ", policyDocuments=" + getPolicyDocuments() + ", insuranceVO=" + getInsuranceVO() + ", animalVO=" + getAnimalVO() + ", userVO=" + getUserVO() + ", insuranceDiseaseVOList=" + getInsuranceDiseaseVOList() + ", medicalInfoList=" + getMedicalInfoList() + ")"; }
/*    */   
/*    */   private String policyDocuments;
/*    */   private InsuranceVO insuranceVO;
/*    */   private PetAnimalVO animalVO;
/*    */   
/*    */   public Integer getInsurancePolicyId() {
/* 25 */     return this.insurancePolicyId;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceStatus() {
/* 29 */     return this.insuranceStatus;
/*    */   }
/*    */   
/*    */   public Integer getClaimNumber()
/*    */   {
/* 34 */     return this.claimNumber;
/*    */   }
/*    */   
/*    */   private UserVO userVO;
/*    */   private java.util.List<InsuranceDiseaseVO> insuranceDiseaseVOList;
/*    */   private java.util.List<PetMedicalInfoVO> medicalInfoList;
/* 40 */   public Date getInsuranceStartDate() { return this.insuranceStartDate; }
/*    */   
/*    */ 
/*    */   public Date getInsuranceEndDate()
/*    */   {
/* 45 */     return this.insuranceEndDate;
/*    */   }
/*    */   
/*    */   public Date getInsuranceUpdateDate()
/*    */   {
/* 50 */     return this.insuranceUpdateDate;
/*    */   }
/*    */   
/*    */   public String getPolicyDocuments()
/*    */   {
/* 55 */     return this.policyDocuments;
/*    */   }
/*    */   
/*    */   public InsuranceVO getInsuranceVO()
/*    */   {
/* 60 */     return this.insuranceVO;
/*    */   }
/*    */   
/*    */   public PetAnimalVO getAnimalVO()
/*    */   {
/* 65 */     return this.animalVO;
/*    */   }
/*    */   
/*    */   public UserVO getUserVO() {
/* 69 */     return this.userVO;
/*    */   }
/*    */   
/*    */   public java.util.List<InsuranceDiseaseVO> getInsuranceDiseaseVOList()
/*    */   {
/* 74 */     return this.insuranceDiseaseVOList;
/*    */   }
/*    */   
/*    */   public java.util.List<PetMedicalInfoVO> getMedicalInfoList()
/*    */   {
/* 79 */     return this.medicalInfoList;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsurancePolicyVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */