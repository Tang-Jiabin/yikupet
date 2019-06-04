/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_reservation_info")
/*    */ public class PetReservationInfo
/*    */ {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer reservationId;
/*    */   private Integer userId;
/*    */   private Integer animalId;
/*    */   private Integer insurancePolicyId;
/*    */   
/* 17 */   public void setReservationId(Integer reservationId) { this.reservationId = reservationId; } public void setUserId(Integer userId) { this.userId = userId; } public void setAnimalId(Integer animalId) { this.animalId = animalId; } public void setInsurancePolicyId(Integer insurancePolicyId) { this.insurancePolicyId = insurancePolicyId; } public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setReservationStatus(Integer reservationStatus) { this.reservationStatus = reservationStatus; } public void setApplicationDate(Date applicationDate) { this.applicationDate = applicationDate; } public void setConsultationDate(Date consultationDate) { this.consultationDate = consultationDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetReservationInfo)) return false; PetReservationInfo other = (PetReservationInfo)o; if (!other.canEqual(this)) return false; Object this$reservationId = getReservationId();Object other$reservationId = other.getReservationId(); if (this$reservationId == null ? other$reservationId != null : !this$reservationId.equals(other$reservationId)) return false; Object this$userId = getUserId();Object other$userId = other.getUserId(); if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false; Object this$animalId = getAnimalId();Object other$animalId = other.getAnimalId(); if (this$animalId == null ? other$animalId != null : !this$animalId.equals(other$animalId)) return false; Object this$insurancePolicyId = getInsurancePolicyId();Object other$insurancePolicyId = other.getInsurancePolicyId(); if (this$insurancePolicyId == null ? other$insurancePolicyId != null : !this$insurancePolicyId.equals(other$insurancePolicyId)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$reservationStatus = getReservationStatus();Object other$reservationStatus = other.getReservationStatus(); if (this$reservationStatus == null ? other$reservationStatus != null : !this$reservationStatus.equals(other$reservationStatus)) return false; Object this$applicationDate = getApplicationDate();Object other$applicationDate = other.getApplicationDate(); if (this$applicationDate == null ? other$applicationDate != null : !this$applicationDate.equals(other$applicationDate)) return false; Object this$consultationDate = getConsultationDate();Object other$consultationDate = other.getConsultationDate();return this$consultationDate == null ? other$consultationDate == null : this$consultationDate.equals(other$consultationDate); } protected boolean canEqual(Object other) { return other instanceof PetReservationInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $reservationId = getReservationId();result = result * 59 + ($reservationId == null ? 43 : $reservationId.hashCode());Object $userId = getUserId();result = result * 59 + ($userId == null ? 43 : $userId.hashCode());Object $animalId = getAnimalId();result = result * 59 + ($animalId == null ? 43 : $animalId.hashCode());Object $insurancePolicyId = getInsurancePolicyId();result = result * 59 + ($insurancePolicyId == null ? 43 : $insurancePolicyId.hashCode());Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $reservationStatus = getReservationStatus();result = result * 59 + ($reservationStatus == null ? 43 : $reservationStatus.hashCode());Object $applicationDate = getApplicationDate();result = result * 59 + ($applicationDate == null ? 43 : $applicationDate.hashCode());Object $consultationDate = getConsultationDate();result = result * 59 + ($consultationDate == null ? 43 : $consultationDate.hashCode());return result; } public String toString() { return "PetReservationInfo(reservationId=" + getReservationId() + ", userId=" + getUserId() + ", animalId=" + getAnimalId() + ", insurancePolicyId=" + getInsurancePolicyId() + ", hospitalId=" + getHospitalId() + ", reservationStatus=" + getReservationStatus() + ", applicationDate=" + getApplicationDate() + ", consultationDate=" + getConsultationDate() + ")"; }
/*    */   
/*    */   private Integer hospitalId;
/*    */   private Integer reservationStatus;
/*    */   private Date applicationDate;
/*    */   private Date consultationDate;
/*    */   public Integer getReservationId() {
/* 24 */     return this.reservationId;
/*    */   }
/*    */   
/*    */   public Integer getUserId()
/*    */   {
/* 29 */     return this.userId;
/*    */   }
/*    */   
/*    */   public Integer getAnimalId()
/*    */   {
/* 34 */     return this.animalId;
/*    */   }
/*    */   
/*    */   public Integer getInsurancePolicyId()
/*    */   {
/* 39 */     return this.insurancePolicyId;
/*    */   }
/*    */   
/*    */   public Integer getHospitalId()
/*    */   {
/* 44 */     return this.hospitalId;
/*    */   }
/*    */   
/*    */   public Integer getReservationStatus()
/*    */   {
/* 49 */     return this.reservationStatus;
/*    */   }
/*    */   
/*    */   public Date getApplicationDate()
/*    */   {
/* 54 */     return this.applicationDate;
/*    */   }
/*    */   
/*    */   public Date getConsultationDate()
/*    */   {
/* 59 */     return this.consultationDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetReservationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */