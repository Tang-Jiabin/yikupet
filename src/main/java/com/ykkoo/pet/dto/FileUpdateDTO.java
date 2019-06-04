/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ import com.ykkoo.pet.common.type.FileType;
/*    */ 
/*    */ public class FileUpdateDTO { @com.fasterxml.jackson.annotation.JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long fileId;
/*    */   private String jumpLink;
/*    */   private FileType fileType;
/*    */   private Integer state;
/*    */   private Integer insuranceId;
/*    */   private Integer hospitalId;
/*    */   private Integer compensateId;
/*    */   private Integer sequence;
/*    */   
/* 15 */   public void setFileId(Long fileId) { this.fileId = fileId; } public void setJumpLink(String jumpLink) { this.jumpLink = jumpLink; } public void setFileType(FileType fileType) { this.fileType = fileType; } public void setState(Integer state) { this.state = state; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setCompensateId(Integer compensateId) { this.compensateId = compensateId; } public void setSequence(Integer sequence) { this.sequence = sequence; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof FileUpdateDTO)) return false; FileUpdateDTO other = (FileUpdateDTO)o; if (!other.canEqual(this)) return false; Object this$fileId = getFileId();Object other$fileId = other.getFileId(); if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false; Object this$jumpLink = getJumpLink();Object other$jumpLink = other.getJumpLink(); if (this$jumpLink == null ? other$jumpLink != null : !this$jumpLink.equals(other$jumpLink)) return false; Object this$fileType = getFileType();Object other$fileType = other.getFileType(); if (this$fileType == null ? other$fileType != null : !this$fileType.equals(other$fileType)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$compensateId = getCompensateId();Object other$compensateId = other.getCompensateId(); if (this$compensateId == null ? other$compensateId != null : !this$compensateId.equals(other$compensateId)) return false; Object this$sequence = getSequence();Object other$sequence = other.getSequence();return this$sequence == null ? other$sequence == null : this$sequence.equals(other$sequence); } protected boolean canEqual(Object other) { return other instanceof FileUpdateDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $fileId = getFileId();result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());Object $jumpLink = getJumpLink();result = result * 59 + ($jumpLink == null ? 43 : $jumpLink.hashCode());Object $fileType = getFileType();result = result * 59 + ($fileType == null ? 43 : $fileType.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $compensateId = getCompensateId();result = result * 59 + ($compensateId == null ? 43 : $compensateId.hashCode());Object $sequence = getSequence();result = result * 59 + ($sequence == null ? 43 : $sequence.hashCode());return result; } public String toString() { return "FileUpdateDTO(fileId=" + getFileId() + ", jumpLink=" + getJumpLink() + ", fileType=" + getFileType() + ", state=" + getState() + ", insuranceId=" + getInsuranceId() + ", hospitalId=" + getHospitalId() + ", compensateId=" + getCompensateId() + ", sequence=" + getSequence() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Long getFileId()
/*    */   {
/* 22 */     return this.fileId;
/*    */   }
/*    */   
/*    */   public String getJumpLink()
/*    */   {
/* 27 */     return this.jumpLink;
/*    */   }
/*    */   
/*    */   public FileType getFileType()
/*    */   {
/* 32 */     return this.fileType;
/*    */   }
/*    */   
/*    */   public Integer getState() {
/* 36 */     return this.state;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceId() {
/* 40 */     return this.insuranceId;
/*    */   }
/*    */   
/*    */   public Integer getHospitalId() {
/* 44 */     return this.hospitalId;
/*    */   }
/*    */   
/*    */   public Integer getCompensateId() {
/* 48 */     return this.compensateId;
/*    */   }
/*    */   
/*    */   public Integer getSequence() {
/* 52 */     return this.sequence;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/FileUpdateDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */