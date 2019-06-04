/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import com.ykkoo.pet.common.type.FileType;
/*    */ 
/*    */ 
/*    */ public class InsuranceDetailsPicVO
/*    */ {
/*    */   private String fileUrl;
/*    */   private String jumpLink;
/*    */   private FileType fileType;
/*    */   private Integer insuranceId;
/*    */   private Integer sequence;
/*    */   private Integer state;
/*    */   private java.util.Date uploadDate;
/*    */   
/* 16 */   public void setFileUrl(String fileUrl) { this.fileUrl = fileUrl; } public void setJumpLink(String jumpLink) { this.jumpLink = jumpLink; } public void setFileType(FileType fileType) { this.fileType = fileType; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setSequence(Integer sequence) { this.sequence = sequence; } public void setState(Integer state) { this.state = state; } public void setUploadDate(java.util.Date uploadDate) { this.uploadDate = uploadDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof InsuranceDetailsPicVO)) return false; InsuranceDetailsPicVO other = (InsuranceDetailsPicVO)o; if (!other.canEqual(this)) return false; Object this$fileUrl = getFileUrl();Object other$fileUrl = other.getFileUrl(); if (this$fileUrl == null ? other$fileUrl != null : !this$fileUrl.equals(other$fileUrl)) return false; Object this$jumpLink = getJumpLink();Object other$jumpLink = other.getJumpLink(); if (this$jumpLink == null ? other$jumpLink != null : !this$jumpLink.equals(other$jumpLink)) return false; Object this$fileType = getFileType();Object other$fileType = other.getFileType(); if (this$fileType == null ? other$fileType != null : !this$fileType.equals(other$fileType)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$sequence = getSequence();Object other$sequence = other.getSequence(); if (this$sequence == null ? other$sequence != null : !this$sequence.equals(other$sequence)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$uploadDate = getUploadDate();Object other$uploadDate = other.getUploadDate();return this$uploadDate == null ? other$uploadDate == null : this$uploadDate.equals(other$uploadDate); } protected boolean canEqual(Object other) { return other instanceof InsuranceDetailsPicVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $fileUrl = getFileUrl();result = result * 59 + ($fileUrl == null ? 43 : $fileUrl.hashCode());Object $jumpLink = getJumpLink();result = result * 59 + ($jumpLink == null ? 43 : $jumpLink.hashCode());Object $fileType = getFileType();result = result * 59 + ($fileType == null ? 43 : $fileType.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $sequence = getSequence();result = result * 59 + ($sequence == null ? 43 : $sequence.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $uploadDate = getUploadDate();result = result * 59 + ($uploadDate == null ? 43 : $uploadDate.hashCode());return result; } public String toString() { return "InsuranceDetailsPicVO(fileUrl=" + getFileUrl() + ", jumpLink=" + getJumpLink() + ", fileType=" + getFileType() + ", insuranceId=" + getInsuranceId() + ", sequence=" + getSequence() + ", state=" + getState() + ", uploadDate=" + getUploadDate() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getFileUrl()
/*    */   {
/* 22 */     return this.fileUrl;
/*    */   }
/*    */   
/*    */   public String getJumpLink() {
/* 26 */     return this.jumpLink;
/*    */   }
/*    */   
/*    */   public FileType getFileType() {
/* 30 */     return this.fileType;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceId() {
/* 34 */     return this.insuranceId;
/*    */   }
/*    */   
/*    */   public Integer getSequence() {
/* 38 */     return this.sequence;
/*    */   }
/*    */   
/*    */   public Integer getState() {
/* 42 */     return this.state;
/*    */   }
/*    */   
/*    */   public java.util.Date getUploadDate() {
/* 46 */     return this.uploadDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceDetailsPicVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */