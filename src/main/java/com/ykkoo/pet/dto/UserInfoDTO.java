/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ 
/*    */ public class UserInfoDTO {
/*    */   private String headPortrait;
/*    */   private String nickName;
/*    */   private Integer gender;
/*    */   private String rawData;
/*    */   private String signature;
/*    */   private String encryptedData;
/*    */   private String iv;
/*    */   
/* 13 */   public void setHeadPortrait(String headPortrait) { this.headPortrait = headPortrait; } public void setNickName(String nickName) { this.nickName = nickName; } public void setGender(Integer gender) { this.gender = gender; } public void setRawData(String rawData) { this.rawData = rawData; } public void setSignature(String signature) { this.signature = signature; } public void setEncryptedData(String encryptedData) { this.encryptedData = encryptedData; } public void setIv(String iv) { this.iv = iv; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserInfoDTO)) return false; UserInfoDTO other = (UserInfoDTO)o; if (!other.canEqual(this)) return false; Object this$headPortrait = getHeadPortrait();Object other$headPortrait = other.getHeadPortrait(); if (this$headPortrait == null ? other$headPortrait != null : !this$headPortrait.equals(other$headPortrait)) return false; Object this$nickName = getNickName();Object other$nickName = other.getNickName(); if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false; Object this$gender = getGender();Object other$gender = other.getGender(); if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false; Object this$rawData = getRawData();Object other$rawData = other.getRawData(); if (this$rawData == null ? other$rawData != null : !this$rawData.equals(other$rawData)) return false; Object this$signature = getSignature();Object other$signature = other.getSignature(); if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) return false; Object this$encryptedData = getEncryptedData();Object other$encryptedData = other.getEncryptedData(); if (this$encryptedData == null ? other$encryptedData != null : !this$encryptedData.equals(other$encryptedData)) return false; Object this$iv = getIv();Object other$iv = other.getIv();return this$iv == null ? other$iv == null : this$iv.equals(other$iv); } protected boolean canEqual(Object other) { return other instanceof UserInfoDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $headPortrait = getHeadPortrait();result = result * 59 + ($headPortrait == null ? 43 : $headPortrait.hashCode());Object $nickName = getNickName();result = result * 59 + ($nickName == null ? 43 : $nickName.hashCode());Object $gender = getGender();result = result * 59 + ($gender == null ? 43 : $gender.hashCode());Object $rawData = getRawData();result = result * 59 + ($rawData == null ? 43 : $rawData.hashCode());Object $signature = getSignature();result = result * 59 + ($signature == null ? 43 : $signature.hashCode());Object $encryptedData = getEncryptedData();result = result * 59 + ($encryptedData == null ? 43 : $encryptedData.hashCode());Object $iv = getIv();result = result * 59 + ($iv == null ? 43 : $iv.hashCode());return result; } public String toString() { return "UserInfoDTO(headPortrait=" + getHeadPortrait() + ", nickName=" + getNickName() + ", gender=" + getGender() + ", rawData=" + getRawData() + ", signature=" + getSignature() + ", encryptedData=" + getEncryptedData() + ", iv=" + getIv() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getHeadPortrait()
/*    */   {
/* 19 */     return this.headPortrait;
/*    */   }
/*    */   
/*    */   public String getNickName()
/*    */   {
/* 24 */     return this.nickName;
/*    */   }
/*    */   
/*    */   public Integer getGender()
/*    */   {
/* 29 */     return this.gender;
/*    */   }
/*    */   
/*    */   public String getRawData()
/*    */   {
/* 34 */     return this.rawData;
/*    */   }
/*    */   
/*    */   public String getSignature() {
/* 38 */     return this.signature;
/*    */   }
/*    */   
/*    */   public String getEncryptedData() {
/* 42 */     return this.encryptedData;
/*    */   }
/*    */   
/*    */   public String getIv() {
/* 46 */     return this.iv;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/UserInfoDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */