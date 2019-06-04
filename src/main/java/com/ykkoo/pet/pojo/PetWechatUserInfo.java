/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_wechat_user_info")
/*    */ public class PetWechatUserInfo
/*    */ {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer wechatInfoId;
/*    */   private String openid;
/*    */   private String sessionKey;
/*    */   
/* 16 */   public void setWechatInfoId(Integer wechatInfoId) { this.wechatInfoId = wechatInfoId; } public void setOpenid(String openid) { this.openid = openid; } public void setSessionKey(String sessionKey) { this.sessionKey = sessionKey; } public void setUnionid(String unionid) { this.unionid = unionid; } public void setUserInfoId(Integer userInfoId) { this.userInfoId = userInfoId; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetWechatUserInfo)) return false; PetWechatUserInfo other = (PetWechatUserInfo)o; if (!other.canEqual(this)) return false; Object this$wechatInfoId = getWechatInfoId();Object other$wechatInfoId = other.getWechatInfoId(); if (this$wechatInfoId == null ? other$wechatInfoId != null : !this$wechatInfoId.equals(other$wechatInfoId)) return false; Object this$openid = getOpenid();Object other$openid = other.getOpenid(); if (this$openid == null ? other$openid != null : !this$openid.equals(other$openid)) return false; Object this$sessionKey = getSessionKey();Object other$sessionKey = other.getSessionKey(); if (this$sessionKey == null ? other$sessionKey != null : !this$sessionKey.equals(other$sessionKey)) return false; Object this$unionid = getUnionid();Object other$unionid = other.getUnionid(); if (this$unionid == null ? other$unionid != null : !this$unionid.equals(other$unionid)) return false; Object this$userInfoId = getUserInfoId();Object other$userInfoId = other.getUserInfoId(); if (this$userInfoId == null ? other$userInfoId != null : !this$userInfoId.equals(other$userInfoId)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate();return this$updateDate == null ? other$updateDate == null : this$updateDate.equals(other$updateDate); } protected boolean canEqual(Object other) { return other instanceof PetWechatUserInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $wechatInfoId = getWechatInfoId();result = result * 59 + ($wechatInfoId == null ? 43 : $wechatInfoId.hashCode());Object $openid = getOpenid();result = result * 59 + ($openid == null ? 43 : $openid.hashCode());Object $sessionKey = getSessionKey();result = result * 59 + ($sessionKey == null ? 43 : $sessionKey.hashCode());Object $unionid = getUnionid();result = result * 59 + ($unionid == null ? 43 : $unionid.hashCode());Object $userInfoId = getUserInfoId();result = result * 59 + ($userInfoId == null ? 43 : $userInfoId.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());return result; } public String toString() { return "PetWechatUserInfo(wechatInfoId=" + getWechatInfoId() + ", openid=" + getOpenid() + ", sessionKey=" + getSessionKey() + ", unionid=" + getUnionid() + ", userInfoId=" + getUserInfoId() + ", createDate=" + getCreateDate() + ", updateDate=" + getUpdateDate() + ")"; }
/*    */   
/*    */ 
/*    */   private String unionid;
/*    */   
/*    */   private Integer userInfoId;
/*    */   private Date createDate;
/*    */   private Date updateDate;
/*    */   public Integer getWechatInfoId()
/*    */   {
/* 26 */     return this.wechatInfoId;
/*    */   }
/*    */   
/*    */   public String getOpenid() {
/* 30 */     return this.openid;
/*    */   }
/*    */   
/*    */   public String getSessionKey()
/*    */   {
/* 35 */     return this.sessionKey;
/*    */   }
/*    */   
/*    */   public String getUnionid()
/*    */   {
/* 40 */     return this.unionid;
/*    */   }
/*    */   
/*    */   public Integer getUserInfoId()
/*    */   {
/* 45 */     return this.userInfoId;
/*    */   }
/*    */   
/*    */   public Date getCreateDate()
/*    */   {
/* 50 */     return this.createDate;
/*    */   }
/*    */   
/*    */   public Date getUpdateDate()
/*    */   {
/* 55 */     return this.updateDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetWechatUserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */