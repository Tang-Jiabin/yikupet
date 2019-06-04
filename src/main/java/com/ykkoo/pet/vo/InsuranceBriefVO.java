/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ 
/*    */ 
/*    */ public class InsuranceBriefVO
/*    */ {
/*    */   @JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long fileId;
/*    */   private String picUrl;
/*    */   private String jumpLink;
/*    */   private Integer insuranceId;
/*    */   
/* 14 */   public void setFileId(Long fileId) { this.fileId = fileId; } public void setPicUrl(String picUrl) { this.picUrl = picUrl; } public void setJumpLink(String jumpLink) { this.jumpLink = jumpLink; } public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof InsuranceBriefVO)) return false; InsuranceBriefVO other = (InsuranceBriefVO)o; if (!other.canEqual(this)) return false; Object this$fileId = getFileId();Object other$fileId = other.getFileId(); if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false; Object this$picUrl = getPicUrl();Object other$picUrl = other.getPicUrl(); if (this$picUrl == null ? other$picUrl != null : !this$picUrl.equals(other$picUrl)) return false; Object this$jumpLink = getJumpLink();Object other$jumpLink = other.getJumpLink(); if (this$jumpLink == null ? other$jumpLink != null : !this$jumpLink.equals(other$jumpLink)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId();return this$insuranceId == null ? other$insuranceId == null : this$insuranceId.equals(other$insuranceId); } protected boolean canEqual(Object other) { return other instanceof InsuranceBriefVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $fileId = getFileId();result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());Object $picUrl = getPicUrl();result = result * 59 + ($picUrl == null ? 43 : $picUrl.hashCode());Object $jumpLink = getJumpLink();result = result * 59 + ($jumpLink == null ? 43 : $jumpLink.hashCode());Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());return result; } public String toString() { return "InsuranceBriefVO(fileId=" + getFileId() + ", picUrl=" + getPicUrl() + ", jumpLink=" + getJumpLink() + ", insuranceId=" + getInsuranceId() + ")"; }
/*    */   
/*    */ 
/*    */ 
/* 18 */   public Long getFileId() { return this.fileId; }
/*    */   
/* 20 */   public String getPicUrl() { return this.picUrl; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 25 */   public String getJumpLink() { return this.jumpLink; }
/*    */   
/* 27 */   public Integer getInsuranceId() { return this.insuranceId; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/InsuranceBriefVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */