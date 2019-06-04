/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ import com.ykkoo.pet.common.type.FileType;
/*    */ 
/*    */ 
/*    */ public class FileDTO
/*    */ {
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long fileId;
/*    */   private String alias;
/*    */   private String uploadPath;
/*    */   private String jumpLink;
/*    */   private FileType fileType;
/*    */   private Integer insuranceId;
/*    */   
/* 16 */   public void setFileId(Long fileId) { this.fileId = fileId; } public void setAlias(String alias) { this.alias = alias; } public void setUploadPath(String uploadPath) { this.uploadPath = uploadPath; } public void setJumpLink(String jumpLink) { this.jumpLink = jumpLink; } public void setFileType(FileType fileType) { this.fileType = fileType; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setCompensateId(Integer compensateId) { this.compensateId = compensateId; } public void setReservationId(Integer reservationId) { this.reservationId = reservationId; } public void setSequence(Integer sequence) { this.sequence = sequence; } public void setFileName(String fileName) { this.fileName = fileName; } public void setState(Integer state) { this.state = state; } public void setFile(org.springframework.web.multipart.MultipartFile file) { this.file = file; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof FileDTO)) return false; FileDTO other = (FileDTO)o; if (!other.canEqual(this)) return false; Object this$fileId = getFileId();Object other$fileId = other.getFileId(); if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false; Object this$alias = getAlias();Object other$alias = other.getAlias(); if (this$alias == null ? other$alias != null : !this$alias.equals(other$alias)) return false; Object this$uploadPath = getUploadPath();Object other$uploadPath = other.getUploadPath(); if (this$uploadPath == null ? other$uploadPath != null : !this$uploadPath.equals(other$uploadPath)) return false; Object this$jumpLink = getJumpLink();Object other$jumpLink = other.getJumpLink(); if (this$jumpLink == null ? other$jumpLink != null : !this$jumpLink.equals(other$jumpLink)) return false; Object this$fileType = getFileType();Object other$fileType = other.getFileType(); if (this$fileType == null ? other$fileType != null : !this$fileType.equals(other$fileType)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$compensateId = getCompensateId();Object other$compensateId = other.getCompensateId(); if (this$compensateId == null ? other$compensateId != null : !this$compensateId.equals(other$compensateId)) return false; Object this$reservationId = getReservationId();Object other$reservationId = other.getReservationId(); if (this$reservationId == null ? other$reservationId != null : !this$reservationId.equals(other$reservationId)) return false; Object this$sequence = getSequence();Object other$sequence = other.getSequence(); if (this$sequence == null ? other$sequence != null : !this$sequence.equals(other$sequence)) return false; Object this$fileName = getFileName();Object other$fileName = other.getFileName(); if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$file = getFile();Object other$file = other.getFile();return this$file == null ? other$file == null : this$file.equals(other$file); } protected boolean canEqual(Object other) { return other instanceof FileDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $fileId = getFileId();result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());Object $alias = getAlias();result = result * 59 + ($alias == null ? 43 : $alias.hashCode());Object $uploadPath = getUploadPath();result = result * 59 + ($uploadPath == null ? 43 : $uploadPath.hashCode());Object $jumpLink = getJumpLink();result = result * 59 + ($jumpLink == null ? 43 : $jumpLink.hashCode());Object $fileType = getFileType();result = result * 59 + ($fileType == null ? 43 : $fileType.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $compensateId = getCompensateId();result = result * 59 + ($compensateId == null ? 43 : $compensateId.hashCode());Object $reservationId = getReservationId();result = result * 59 + ($reservationId == null ? 43 : $reservationId.hashCode());Object $sequence = getSequence();result = result * 59 + ($sequence == null ? 43 : $sequence.hashCode());Object $fileName = getFileName();result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $file = getFile();result = result * 59 + ($file == null ? 43 : $file.hashCode());return result; } public String toString() { return "FileDTO(fileId=" + getFileId() + ", alias=" + getAlias() + ", uploadPath=" + getUploadPath() + ", jumpLink=" + getJumpLink() + ", fileType=" + getFileType() + ", insuranceId=" + getInsuranceId() + ", hospitalId=" + getHospitalId() + ", compensateId=" + getCompensateId() + ", reservationId=" + getReservationId() + ", sequence=" + getSequence() + ", fileName=" + getFileName() + ", state=" + getState() + ", file=" + getFile() + ")"; }
/*    */   
/*    */   public Long getFileId()
/*    */   {
/* 20 */     return this.fileId;
/*    */   }
/*    */   
/*    */   public String getAlias() {
/* 24 */     return this.alias;
/*    */   }
/*    */   
/*    */   public String getUploadPath() {
/* 28 */     return this.uploadPath;
/*    */   }
/*    */   
/*    */   public String getJumpLink() {
/* 32 */     return this.jumpLink;
/*    */   }
/*    */   
/*    */   private Integer hospitalId;
/*    */   private Integer compensateId;
/*    */   private Integer reservationId;
/*    */   private Integer sequence;
/*    */   private String fileName;
/*    */   private Integer state;
/*    */   private org.springframework.web.multipart.MultipartFile file;
/*    */   public FileType getFileType()
/*    */   {
/* 44 */     return this.fileType;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceId() {
/* 48 */     return this.insuranceId;
/*    */   }
/*    */   
/*    */   public Integer getHospitalId() {
/* 52 */     return this.hospitalId;
/*    */   }
/*    */   
/*    */   public Integer getCompensateId() {
/* 56 */     return this.compensateId;
/*    */   }
/*    */   
/*    */   public Integer getReservationId() {
/* 60 */     return this.reservationId;
/*    */   }
/*    */   
/*    */   public Integer getSequence() {
/* 64 */     return this.sequence;
/*    */   }
/*    */   
/*    */   public String getFileName() {
/* 68 */     return this.fileName;
/*    */   }
/*    */   
/*    */   public Integer getState() {
/* 72 */     return this.state;
/*    */   }
/*    */   
/*    */   public org.springframework.web.multipart.MultipartFile getFile() {
/* 76 */     return this.file;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/FileDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */