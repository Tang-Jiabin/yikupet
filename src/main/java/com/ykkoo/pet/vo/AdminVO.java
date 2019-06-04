/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AdminVO
/*    */ {
/*    */   private String adminName;
/*    */   
/*    */ 
/*    */   private String token;
/*    */   
/*    */ 
/* 13 */   public void setAdminName(String adminName) { this.adminName = adminName; } public void setToken(String token) { this.token = token; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof AdminVO)) return false; AdminVO other = (AdminVO)o; if (!other.canEqual(this)) return false; Object this$adminName = getAdminName();Object other$adminName = other.getAdminName(); if (this$adminName == null ? other$adminName != null : !this$adminName.equals(other$adminName)) return false; Object this$token = getToken();Object other$token = other.getToken();return this$token == null ? other$token == null : this$token.equals(other$token); } protected boolean canEqual(Object other) { return other instanceof AdminVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $adminName = getAdminName();result = result * 59 + ($adminName == null ? 43 : $adminName.hashCode());Object $token = getToken();result = result * 59 + ($token == null ? 43 : $token.hashCode());return result; } public String toString() { return "AdminVO(adminName=" + getAdminName() + ", token=" + getToken() + ")"; }
/*    */   
/*    */ 
/* 16 */   public String getAdminName() { return this.adminName; }
/*    */   
/* 18 */   public String getToken() { return this.token; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/AdminVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */