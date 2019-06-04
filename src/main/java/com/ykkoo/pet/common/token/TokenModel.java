/*    */ package com.ykkoo.pet.common.token;
/*    */ 
/*    */ public class TokenModel
/*    */ {
/*    */   private int userId;
/*    */   private String token;
/*    */   
/*    */   public boolean equals(Object o) {
/*  9 */     if (o == this) return true; if (!(o instanceof TokenModel)) return false; TokenModel other = (TokenModel)o; if (!other.canEqual(this)) return false; if (getUserId() != other.getUserId()) return false; Object this$token = getToken();Object other$token = other.getToken();return this$token == null ? other$token == null : this$token.equals(other$token); } protected boolean canEqual(Object other) { return other instanceof TokenModel; } public int hashCode() { int PRIME = 59;int result = 1;result = result * 59 + getUserId();Object $token = getToken();result = result * 59 + ($token == null ? 43 : $token.hashCode());return result; } public String toString() { return "TokenModel(userId=" + getUserId() + ", token=" + getToken() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public TokenModel(int userId, String token)
/*    */   {
/* 19 */     this.userId = userId;
/* 20 */     this.token = token;
/*    */   }
/*    */   
/*    */   public int getUserId() {
/* 24 */     return this.userId;
/*    */   }
/*    */   
/*    */   public void setUserId(int userId) {
/* 28 */     this.userId = userId;
/*    */   }
/*    */   
/*    */   public String getToken() {
/* 32 */     return this.token;
/*    */   }
/*    */   
/*    */   public void setToken(String token) {
/* 36 */     this.token = token;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/token/TokenModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */