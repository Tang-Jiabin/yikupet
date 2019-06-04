/*    */ package com.ykkoo.pet.bo;
/*    */ 
/*    */ 
/*    */ public class CodeSessionBO
/*    */ {
/*    */   private String openid;
/*    */   
/*    */   private String session_key;
/*    */   private String unionid;
/*    */   private Integer errcode;
/*    */   private String errmsg;
/*    */   
/* 13 */   public void setOpenid(String openid) { this.openid = openid; } public void setSession_key(String session_key) { this.session_key = session_key; } public void setUnionid(String unionid) { this.unionid = unionid; } public void setErrcode(Integer errcode) { this.errcode = errcode; } public void setErrmsg(String errmsg) { this.errmsg = errmsg; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof CodeSessionBO)) return false; CodeSessionBO other = (CodeSessionBO)o; if (!other.canEqual(this)) return false; Object this$openid = getOpenid();Object other$openid = other.getOpenid(); if (this$openid == null ? other$openid != null : !this$openid.equals(other$openid)) return false; Object this$session_key = getSession_key();Object other$session_key = other.getSession_key(); if (this$session_key == null ? other$session_key != null : !this$session_key.equals(other$session_key)) return false; Object this$unionid = getUnionid();Object other$unionid = other.getUnionid(); if (this$unionid == null ? other$unionid != null : !this$unionid.equals(other$unionid)) return false; Object this$errcode = getErrcode();Object other$errcode = other.getErrcode(); if (this$errcode == null ? other$errcode != null : !this$errcode.equals(other$errcode)) return false; Object this$errmsg = getErrmsg();Object other$errmsg = other.getErrmsg();return this$errmsg == null ? other$errmsg == null : this$errmsg.equals(other$errmsg); } protected boolean canEqual(Object other) { return other instanceof CodeSessionBO; } public int hashCode() { int PRIME = 59;int result = 1;Object $openid = getOpenid();result = result * 59 + ($openid == null ? 43 : $openid.hashCode());Object $session_key = getSession_key();result = result * 59 + ($session_key == null ? 43 : $session_key.hashCode());Object $unionid = getUnionid();result = result * 59 + ($unionid == null ? 43 : $unionid.hashCode());Object $errcode = getErrcode();result = result * 59 + ($errcode == null ? 43 : $errcode.hashCode());Object $errmsg = getErrmsg();result = result * 59 + ($errmsg == null ? 43 : $errmsg.hashCode());return result; } public String toString() { return "CodeSessionBO(openid=" + getOpenid() + ", session_key=" + getSession_key() + ", unionid=" + getUnionid() + ", errcode=" + getErrcode() + ", errmsg=" + getErrmsg() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public String getOpenid()
/*    */   {
/* 19 */     return this.openid;
/*    */   }
/*    */   
/*    */   public String getSession_key() {
/* 23 */     return this.session_key;
/*    */   }
/*    */   
/*    */   public String getUnionid() {
/* 27 */     return this.unionid;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Integer getErrcode()
/*    */   {
/* 35 */     return this.errcode;
/*    */   }
/*    */   
/*    */   public String getErrmsg() {
/* 39 */     return this.errmsg;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/bo/CodeSessionBO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */