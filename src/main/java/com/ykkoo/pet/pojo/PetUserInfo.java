/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_user_info")
/*    */ public class PetUserInfo { @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer userId;
/*    */   private String headPortrait;
/*    */   private String nickName;
/*    */   private String source;
/*    */   private String inviter;
/*    */   private String phone;
/*    */   
/* 16 */   public void setUserId(Integer userId) { this.userId = userId; } public void setHeadPortrait(String headPortrait) { this.headPortrait = headPortrait; } public void setNickName(String nickName) { this.nickName = nickName; } public void setSource(String source) { this.source = source; } public void setInviter(String inviter) { this.inviter = inviter; } public void setPhone(String phone) { this.phone = phone; } public void setToken(String token) { this.token = token; } public void setGender(Integer gender) { this.gender = gender; } public void setRealName(String realName) { this.realName = realName; } public void setIdentityCard(String identityCard) { this.identityCard = identityCard; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public void setLoginDate(Date loginDate) { this.loginDate = loginDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetUserInfo)) return false; PetUserInfo other = (PetUserInfo)o; if (!other.canEqual(this)) return false; Object this$userId = getUserId();Object other$userId = other.getUserId(); if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false; Object this$headPortrait = getHeadPortrait();Object other$headPortrait = other.getHeadPortrait(); if (this$headPortrait == null ? other$headPortrait != null : !this$headPortrait.equals(other$headPortrait)) return false; Object this$nickName = getNickName();Object other$nickName = other.getNickName(); if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false; Object this$source = getSource();Object other$source = other.getSource(); if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false; Object this$inviter = getInviter();Object other$inviter = other.getInviter(); if (this$inviter == null ? other$inviter != null : !this$inviter.equals(other$inviter)) return false; Object this$phone = getPhone();Object other$phone = other.getPhone(); if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false; Object this$token = getToken();Object other$token = other.getToken(); if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false; Object this$gender = getGender();Object other$gender = other.getGender(); if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false; Object this$realName = getRealName();Object other$realName = other.getRealName(); if (this$realName == null ? other$realName != null : !this$realName.equals(other$realName)) return false; Object this$identityCard = getIdentityCard();Object other$identityCard = other.getIdentityCard(); if (this$identityCard == null ? other$identityCard != null : !this$identityCard.equals(other$identityCard)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate(); if (this$updateDate == null ? other$updateDate != null : !this$updateDate.equals(other$updateDate)) return false; Object this$loginDate = getLoginDate();Object other$loginDate = other.getLoginDate();return this$loginDate == null ? other$loginDate == null : this$loginDate.equals(other$loginDate); } protected boolean canEqual(Object other) { return other instanceof PetUserInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $userId = getUserId();result = result * 59 + ($userId == null ? 43 : $userId.hashCode());Object $headPortrait = getHeadPortrait();result = result * 59 + ($headPortrait == null ? 43 : $headPortrait.hashCode());Object $nickName = getNickName();result = result * 59 + ($nickName == null ? 43 : $nickName.hashCode());Object $source = getSource();result = result * 59 + ($source == null ? 43 : $source.hashCode());Object $inviter = getInviter();result = result * 59 + ($inviter == null ? 43 : $inviter.hashCode());Object $phone = getPhone();result = result * 59 + ($phone == null ? 43 : $phone.hashCode());Object $token = getToken();result = result * 59 + ($token == null ? 43 : $token.hashCode());Object $gender = getGender();result = result * 59 + ($gender == null ? 43 : $gender.hashCode());Object $realName = getRealName();result = result * 59 + ($realName == null ? 43 : $realName.hashCode());Object $identityCard = getIdentityCard();result = result * 59 + ($identityCard == null ? 43 : $identityCard.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());Object $loginDate = getLoginDate();result = result * 59 + ($loginDate == null ? 43 : $loginDate.hashCode());return result; } public String toString() { return "PetUserInfo(userId=" + getUserId() + ", headPortrait=" + getHeadPortrait() + ", nickName=" + getNickName() + ", source=" + getSource() + ", inviter=" + getInviter() + ", phone=" + getPhone() + ", token=" + getToken() + ", gender=" + getGender() + ", realName=" + getRealName() + ", identityCard=" + getIdentityCard() + ", createDate=" + getCreateDate() + ", updateDate=" + getUpdateDate() + ", loginDate=" + getLoginDate() + ")"; }
/*    */   
/*    */ 
/*    */   private String token;
/*    */   private Integer gender;
/*    */   private String realName;
/*    */   
/* 23 */   public Integer getUserId() { return this.userId; }
/*    */   
/*    */   private String identityCard;
/*    */   private Date createDate;
/*    */   
/* 28 */   public String getHeadPortrait() { return this.headPortrait; }
/*    */   
/*    */   private Date updateDate;
/*    */   private Date loginDate;
/*    */   public String getNickName() {
/* 33 */     return this.nickName;
/*    */   }
/*    */   
/*    */   public String getSource()
/*    */   {
/* 38 */     return this.source;
/*    */   }
/*    */   
/*    */   public String getInviter()
/*    */   {
/* 43 */     return this.inviter;
/*    */   }
/*    */   
/*    */   public String getPhone()
/*    */   {
/* 48 */     return this.phone;
/*    */   }
/*    */   
/*    */   public String getToken()
/*    */   {
/* 53 */     return this.token;
/*    */   }
/*    */   
/*    */   public Integer getGender()
/*    */   {
/* 58 */     return this.gender;
/*    */   }
/*    */   
/*    */   public String getRealName()
/*    */   {
/* 63 */     return this.realName;
/*    */   }
/*    */   
/*    */   public String getIdentityCard()
/*    */   {
/* 68 */     return this.identityCard;
/*    */   }
/*    */   
/*    */   public Date getCreateDate()
/*    */   {
/* 73 */     return this.createDate;
/*    */   }
/*    */   
/*    */   public Date getUpdateDate()
/*    */   {
/* 78 */     return this.updateDate;
/*    */   }
/*    */   
/*    */   public Date getLoginDate()
/*    */   {
/* 83 */     return this.loginDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetUserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */