/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ public class ReservationInfoVO { private Integer reservationId;
/*    */   private UserVO user;
/*    */   private PetAnimalVO animal;
/*    */   private InsurancePolicyVO insurancePolicy;
/*    */   private HospitalVO hospitalVO;
/*    */   private Integer reservationStatus;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date applicationDate;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date consultationDate;
/*    */   private java.util.List<InsuranceDiseaseVO> insuranceDiseaseList;
/*    */   private java.util.List<com.ykkoo.pet.pojo.PetFile> diagnosticVoucher;
/*    */   
/* 18 */   public void setReservationId(Integer reservationId) { this.reservationId = reservationId; } public void setUser(UserVO user) { this.user = user; } public void setAnimal(PetAnimalVO animal) { this.animal = animal; } public void setInsurancePolicy(InsurancePolicyVO insurancePolicy) { this.insurancePolicy = insurancePolicy; } public void setHospitalVO(HospitalVO hospitalVO) { this.hospitalVO = hospitalVO; } public void setReservationStatus(Integer reservationStatus) { this.reservationStatus = reservationStatus; } public void setApplicationDate(Date applicationDate) { this.applicationDate = applicationDate; } public void setConsultationDate(Date consultationDate) { this.consultationDate = consultationDate; } public void setInsuranceDiseaseList(java.util.List<InsuranceDiseaseVO> insuranceDiseaseList) { this.insuranceDiseaseList = insuranceDiseaseList; } public void setDiagnosticVoucher(java.util.List<com.ykkoo.pet.pojo.PetFile> diagnosticVoucher) { this.diagnosticVoucher = diagnosticVoucher; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof ReservationInfoVO)) return false; ReservationInfoVO other = (ReservationInfoVO)o; if (!other.canEqual(this)) return false; Object this$reservationId = getReservationId();Object other$reservationId = other.getReservationId(); if (this$reservationId == null ? other$reservationId != null : !this$reservationId.equals(other$reservationId)) return false; Object this$user = getUser();Object other$user = other.getUser(); if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false; Object this$animal = getAnimal();Object other$animal = other.getAnimal(); if (this$animal == null ? other$animal != null : !this$animal.equals(other$animal)) return false; Object this$insurancePolicy = getInsurancePolicy();Object other$insurancePolicy = other.getInsurancePolicy(); if (this$insurancePolicy == null ? other$insurancePolicy != null : !this$insurancePolicy.equals(other$insurancePolicy)) return false; Object this$hospitalVO = getHospitalVO();Object other$hospitalVO = other.getHospitalVO(); if (this$hospitalVO == null ? other$hospitalVO != null : !this$hospitalVO.equals(other$hospitalVO)) return false; Object this$reservationStatus = getReservationStatus();Object other$reservationStatus = other.getReservationStatus(); if (this$reservationStatus == null ? other$reservationStatus != null : !this$reservationStatus.equals(other$reservationStatus)) return false; Object this$applicationDate = getApplicationDate();Object other$applicationDate = other.getApplicationDate(); if (this$applicationDate == null ? other$applicationDate != null : !this$applicationDate.equals(other$applicationDate)) return false; Object this$consultationDate = getConsultationDate();Object other$consultationDate = other.getConsultationDate(); if (this$consultationDate == null ? other$consultationDate != null : !this$consultationDate.equals(other$consultationDate)) return false; Object this$insuranceDiseaseList = getInsuranceDiseaseList();Object other$insuranceDiseaseList = other.getInsuranceDiseaseList(); if (this$insuranceDiseaseList == null ? other$insuranceDiseaseList != null : !this$insuranceDiseaseList.equals(other$insuranceDiseaseList)) return false; Object this$diagnosticVoucher = getDiagnosticVoucher();Object other$diagnosticVoucher = other.getDiagnosticVoucher();return this$diagnosticVoucher == null ? other$diagnosticVoucher == null : this$diagnosticVoucher.equals(other$diagnosticVoucher); } protected boolean canEqual(Object other) { return other instanceof ReservationInfoVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $reservationId = getReservationId();result = result * 59 + ($reservationId == null ? 43 : $reservationId.hashCode());Object $user = getUser();result = result * 59 + ($user == null ? 43 : $user.hashCode());Object $animal = getAnimal();result = result * 59 + ($animal == null ? 43 : $animal.hashCode());Object $insurancePolicy = getInsurancePolicy();result = result * 59 + ($insurancePolicy == null ? 43 : $insurancePolicy.hashCode());Object $hospitalVO = getHospitalVO();result = result * 59 + ($hospitalVO == null ? 43 : $hospitalVO.hashCode());Object $reservationStatus = getReservationStatus();result = result * 59 + ($reservationStatus == null ? 43 : $reservationStatus.hashCode());Object $applicationDate = getApplicationDate();result = result * 59 + ($applicationDate == null ? 43 : $applicationDate.hashCode());Object $consultationDate = getConsultationDate();result = result * 59 + ($consultationDate == null ? 43 : $consultationDate.hashCode());Object $insuranceDiseaseList = getInsuranceDiseaseList();result = result * 59 + ($insuranceDiseaseList == null ? 43 : $insuranceDiseaseList.hashCode());Object $diagnosticVoucher = getDiagnosticVoucher();result = result * 59 + ($diagnosticVoucher == null ? 43 : $diagnosticVoucher.hashCode());return result; } public String toString() { return "ReservationInfoVO(reservationId=" + getReservationId() + ", user=" + getUser() + ", animal=" + getAnimal() + ", insurancePolicy=" + getInsurancePolicy() + ", hospitalVO=" + getHospitalVO() + ", reservationStatus=" + getReservationStatus() + ", applicationDate=" + getApplicationDate() + ", consultationDate=" + getConsultationDate() + ", insuranceDiseaseList=" + getInsuranceDiseaseList() + ", diagnosticVoucher=" + getDiagnosticVoucher() + ")"; }
/*    */   
/*    */   public Integer getReservationId() {
/* 21 */     return this.reservationId;
/*    */   }
/*    */   
/*    */   public UserVO getUser()
/*    */   {
/* 26 */     return this.user;
/*    */   }
/*    */   
/*    */   public PetAnimalVO getAnimal()
/*    */   {
/* 31 */     return this.animal;
/*    */   }
/*    */   
/*    */   public InsurancePolicyVO getInsurancePolicy()
/*    */   {
/* 36 */     return this.insurancePolicy;
/*    */   }
/*    */   
/*    */   public HospitalVO getHospitalVO()
/*    */   {
/* 41 */     return this.hospitalVO;
/*    */   }
/*    */   
/*    */   public Integer getReservationStatus()
/*    */   {
/* 46 */     return this.reservationStatus;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getApplicationDate()
/*    */   {
/* 52 */     return this.applicationDate;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getConsultationDate()
/*    */   {
/* 58 */     return this.consultationDate;
/*    */   }
/*    */   
/*    */   public java.util.List<InsuranceDiseaseVO> getInsuranceDiseaseList()
/*    */   {
/* 63 */     return this.insuranceDiseaseList;
/*    */   }
/*    */   
/*    */   public java.util.List<com.ykkoo.pet.pojo.PetFile> getDiagnosticVoucher()
/*    */   {
/* 68 */     return this.diagnosticVoucher;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/ReservationInfoVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */