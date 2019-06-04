/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import com.ykkoo.pet.common.type.FileType;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Table(name="pet_file")
/*    */ @javax.persistence.Entity
/*    */ public class PetFile
/*    */   implements Comparable<PetFile>
/*    */ {
/*    */   @javax.persistence.Id
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long fileId;
/*    */   private String fileUrl;
/*    */   private String jumpLink;
/*    */   private FileType fileType;
/*    */   private Integer insuranceId;
/*    */   private Integer hospitalId;
/*    */   
/* 21 */   public void setFileId(Long fileId) { this.fileId = fileId; } public void setFileUrl(String fileUrl) { this.fileUrl = fileUrl; } public void setJumpLink(String jumpLink) { this.jumpLink = jumpLink; } public void setFileType(FileType fileType) { this.fileType = fileType; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setCompensateId(Integer compensateId) { this.compensateId = compensateId; } public void setReservationId(Integer reservationId) { this.reservationId = reservationId; } public void setSequence(Integer sequence) { this.sequence = sequence; } public void setState(Integer state) { this.state = state; } public void setUploadDate(Date uploadDate) { this.uploadDate = uploadDate; } public void setAdminId(Integer adminId) { this.adminId = adminId; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetFile)) return false; PetFile other = (PetFile)o; if (!other.canEqual(this)) return false; Object this$fileId = getFileId();Object other$fileId = other.getFileId(); if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false; Object this$fileUrl = getFileUrl();Object other$fileUrl = other.getFileUrl(); if (this$fileUrl == null ? other$fileUrl != null : !this$fileUrl.equals(other$fileUrl)) return false; Object this$jumpLink = getJumpLink();Object other$jumpLink = other.getJumpLink(); if (this$jumpLink == null ? other$jumpLink != null : !this$jumpLink.equals(other$jumpLink)) return false; Object this$fileType = getFileType();Object other$fileType = other.getFileType(); if (this$fileType == null ? other$fileType != null : !this$fileType.equals(other$fileType)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$compensateId = getCompensateId();Object other$compensateId = other.getCompensateId(); if (this$compensateId == null ? other$compensateId != null : !this$compensateId.equals(other$compensateId)) return false; Object this$reservationId = getReservationId();Object other$reservationId = other.getReservationId(); if (this$reservationId == null ? other$reservationId != null : !this$reservationId.equals(other$reservationId)) return false; Object this$sequence = getSequence();Object other$sequence = other.getSequence(); if (this$sequence == null ? other$sequence != null : !this$sequence.equals(other$sequence)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$uploadDate = getUploadDate();Object other$uploadDate = other.getUploadDate(); if (this$uploadDate == null ? other$uploadDate != null : !this$uploadDate.equals(other$uploadDate)) return false; Object this$adminId = getAdminId();Object other$adminId = other.getAdminId();return this$adminId == null ? other$adminId == null : this$adminId.equals(other$adminId); } protected boolean canEqual(Object other) { return other instanceof PetFile; } public int hashCode() { int PRIME = 59;int result = 1;Object $fileId = getFileId();result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());Object $fileUrl = getFileUrl();result = result * 59 + ($fileUrl == null ? 43 : $fileUrl.hashCode());Object $jumpLink = getJumpLink();result = result * 59 + ($jumpLink == null ? 43 : $jumpLink.hashCode());Object $fileType = getFileType();result = result * 59 + ($fileType == null ? 43 : $fileType.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $compensateId = getCompensateId();result = result * 59 + ($compensateId == null ? 43 : $compensateId.hashCode());Object $reservationId = getReservationId();result = result * 59 + ($reservationId == null ? 43 : $reservationId.hashCode());Object $sequence = getSequence();result = result * 59 + ($sequence == null ? 43 : $sequence.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $uploadDate = getUploadDate();result = result * 59 + ($uploadDate == null ? 43 : $uploadDate.hashCode());Object $adminId = getAdminId();result = result * 59 + ($adminId == null ? 43 : $adminId.hashCode());return result; } public String toString() { return "PetFile(fileId=" + getFileId() + ", fileUrl=" + getFileUrl() + ", jumpLink=" + getJumpLink() + ", fileType=" + getFileType() + ", insuranceId=" + getInsuranceId() + ", hospitalId=" + getHospitalId() + ", compensateId=" + getCompensateId() + ", reservationId=" + getReservationId() + ", sequence=" + getSequence() + ", state=" + getState() + ", uploadDate=" + getUploadDate() + ", adminId=" + getAdminId() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Long getFileId()
/*    */   {
/* 28 */     return this.fileId;
/*    */   }
/*    */   
/*    */   public String getFileUrl() {
/* 32 */     return this.fileUrl;
/*    */   }
/*    */   
/*    */   public String getJumpLink() {
/* 36 */     return this.jumpLink;
/*    */   }
/*    */   
/*    */   private Integer compensateId;
/*    */   private Integer reservationId;
/*    */   private Integer sequence;
/*    */   private Integer state;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date uploadDate;
/*    */   private Integer adminId;
/*    */   public FileType getFileType()
/*    */   {
/* 48 */     return this.fileType;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceId() {
/* 52 */     return this.insuranceId;
/*    */   }
/*    */   
/*    */   public Integer getHospitalId() {
/* 56 */     return this.hospitalId;
/*    */   }
/*    */   
/*    */   public Integer getCompensateId() {
/* 60 */     return this.compensateId;
/*    */   }
/*    */   
/*    */   public Integer getReservationId() {
/* 64 */     return this.reservationId;
/*    */   }
/*    */   
/*    */   public Integer getSequence() {
/* 68 */     return this.sequence;
/*    */   }
/*    */   
/*    */   public Integer getState() {
/* 72 */     return this.state;
/*    */   }
/*    */   
/*    */   public Date getUploadDate()
/*    */   {
/* 77 */     return this.uploadDate;
/*    */   }
/*    */   
/*    */   public Integer getAdminId() {
/* 81 */     return this.adminId;
/*    */   }
/*    */   
/*    */   public int compareTo(PetFile o)
/*    */   {
/* 86 */     return this.sequence.intValue() - o.sequence.intValue();
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */