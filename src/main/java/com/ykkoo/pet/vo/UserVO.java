/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UserVO
/*    */ {
/*    */   private String nickName;
/*    */   private String headPortrait;
/*    */   private String phone;
/*    */   private String source;
/*    */   private String inviter;
/*    */   
/* 16 */   public void setNickName(String nickName) { this.nickName = nickName; } public void setHeadPortrait(String headPortrait) { this.headPortrait = headPortrait; } public void setPhone(String phone) { this.phone = phone; } public void setSource(String source) { this.source = source; } public void setInviter(String inviter) { this.inviter = inviter; } public void setToken(String token) { this.token = token; } public void setRealName(String realName) { this.realName = realName; } public void setIdentityCard(String identityCard) { this.identityCard = identityCard; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setLoginDate(Date loginDate) { this.loginDate = loginDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserVO)) return false; UserVO other = (UserVO)o; if (!other.canEqual(this)) return false; Object this$nickName = getNickName();Object other$nickName = other.getNickName(); if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false; Object this$headPortrait = getHeadPortrait();Object other$headPortrait = other.getHeadPortrait(); if (this$headPortrait == null ? other$headPortrait != null : !this$headPortrait.equals(other$headPortrait)) return false; Object this$phone = getPhone();Object other$phone = other.getPhone(); if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false; Object this$source = getSource();Object other$source = other.getSource(); if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false; Object this$inviter = getInviter();Object other$inviter = other.getInviter(); if (this$inviter == null ? other$inviter != null : !this$inviter.equals(other$inviter)) return false; Object this$token = getToken();Object other$token = other.getToken(); if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false; Object this$realName = getRealName();Object other$realName = other.getRealName(); if (this$realName == null ? other$realName != null : !this$realName.equals(other$realName)) return false; Object this$identityCard = getIdentityCard();Object other$identityCard = other.getIdentityCard(); if (this$identityCard == null ? other$identityCard != null : !this$identityCard.equals(other$identityCard)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$loginDate = getLoginDate();Object other$loginDate = other.getLoginDate(); if (this$loginDate == null ? other$loginDate != null : !this$loginDate.equals(other$loginDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate();return this$updateDate == null ? other$updateDate == null : this$updateDate.equals(other$updateDate); } protected boolean canEqual(Object other) { return other instanceof UserVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $nickName = getNickName();result = result * 59 + ($nickName == null ? 43 : $nickName.hashCode());Object $headPortrait = getHeadPortrait();result = result * 59 + ($headPortrait == null ? 43 : $headPortrait.hashCode());Object $phone = getPhone();result = result * 59 + ($phone == null ? 43 : $phone.hashCode());Object $source = getSource();result = result * 59 + ($source == null ? 43 : $source.hashCode());Object $inviter = getInviter();result = result * 59 + ($inviter == null ? 43 : $inviter.hashCode());Object $token = getToken();result = result * 59 + ($token == null ? 43 : $token.hashCode());Object $realName = getRealName();result = result * 59 + ($realName == null ? 43 : $realName.hashCode());Object $identityCard = getIdentityCard();result = result * 59 + ($identityCard == null ? 43 : $identityCard.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $loginDate = getLoginDate();result = result * 59 + ($loginDate == null ? 43 : $loginDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());return result; } public String toString() { return "UserVO(nickName=" + getNickName() + ", headPortrait=" + getHeadPortrait() + ", phone=" + getPhone() + ", source=" + getSource() + ", inviter=" + getInviter() + ", token=" + getToken() + ", realName=" + getRealName() + ", identityCard=" + getIdentityCard() + ", createDate=" + getCreateDate() + ", loginDate=" + getLoginDate() + ", updateDate=" + getUpdateDate() + ")"; }
/*    */   
/*    */   private String token;
/*    */   private String realName;
/*    */   private String identityCard;
/*    */   
/* 22 */   public String getNickName() { return this.nickName; }
/*    */   
/*    */   @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date createDate;
/*    */   
/* 27 */   public String getHeadPortrait() { return this.headPortrait; }
/*    */   
/*    */   public String getPhone()
/*    */   {
/* 31 */     return this.phone;
/*    */   }
/*    */   
/*    */   public String getSource()
/*    */   {
/* 36 */     return this.source;
/*    */   }
/*    */   
/*    */   public String getInviter() {
/* 40 */     return this.inviter;
/*    */   }
/*    */   
/*    */   public String getToken()
/*    */   {
/* 45 */     return this.token;
/*    */   }
/*    */   
/*    */   public String getRealName()
/*    */   {
/* 50 */     return this.realName;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 55 */   public String getIdentityCard() { return this.identityCard; }
/*    */   
/*    */   @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date loginDate;
/*    */   @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date updateDate;
/* 61 */   public Date getCreateDate() { return this.createDate; }
/*    */   
/*    */ 
/*    */ 
/*    */   public Date getLoginDate()
/*    */   {
/* 67 */     return this.loginDate;
/*    */   }
/*    */   
/*    */ 
/*    */   public Date getUpdateDate()
/*    */   {
/* 73 */     return this.updateDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/UserVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */