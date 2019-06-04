/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RotationChartVO
/*    */ {
/*    */   @JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long fileId;
/*    */   private String picUrl;
/*    */   private String jumpLink;
/*    */   
/* 14 */   public void setFileId(Long fileId) { this.fileId = fileId; } public void setPicUrl(String picUrl) { this.picUrl = picUrl; } public void setJumpLink(String jumpLink) { this.jumpLink = jumpLink; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof RotationChartVO)) return false; RotationChartVO other = (RotationChartVO)o; if (!other.canEqual(this)) return false; Object this$fileId = getFileId();Object other$fileId = other.getFileId(); if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false; Object this$picUrl = getPicUrl();Object other$picUrl = other.getPicUrl(); if (this$picUrl == null ? other$picUrl != null : !this$picUrl.equals(other$picUrl)) return false; Object this$jumpLink = getJumpLink();Object other$jumpLink = other.getJumpLink();return this$jumpLink == null ? other$jumpLink == null : this$jumpLink.equals(other$jumpLink); } protected boolean canEqual(Object other) { return other instanceof RotationChartVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $fileId = getFileId();result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());Object $picUrl = getPicUrl();result = result * 59 + ($picUrl == null ? 43 : $picUrl.hashCode());Object $jumpLink = getJumpLink();result = result * 59 + ($jumpLink == null ? 43 : $jumpLink.hashCode());return result; } public String toString() { return "RotationChartVO(fileId=" + getFileId() + ", picUrl=" + getPicUrl() + ", jumpLink=" + getJumpLink() + ")"; }
/*    */   
/*    */ 
/*    */ 
/* 18 */   public Long getFileId() { return this.fileId; }
/*    */   
/* 20 */   public String getPicUrl() { return this.picUrl; }
/*    */   
/* 22 */   public String getJumpLink() { return this.jumpLink; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/RotationChartVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */