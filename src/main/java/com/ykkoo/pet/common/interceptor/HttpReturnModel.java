/*    */ package com.ykkoo.pet.common.interceptor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HttpReturnModel
/*    */ {
/* 10 */   public void setStatus(int status) { this.status = status; } public void setMessage(String message) { this.message = message; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof HttpReturnModel)) return false; HttpReturnModel other = (HttpReturnModel)o; if (!other.canEqual(this)) return false; if (getStatus() != other.getStatus()) return false; Object this$message = getMessage();Object other$message = other.getMessage();return this$message == null ? other$message == null : this$message.equals(other$message); } protected boolean canEqual(Object other) { return other instanceof HttpReturnModel; } public int hashCode() { int PRIME = 59;int result = 1;result = result * 59 + getStatus();Object $message = getMessage();result = result * 59 + ($message == null ? 43 : $message.hashCode());return result; } public String toString() { return "HttpReturnModel(status=" + getStatus() + ", message=" + getMessage() + ")"; }
/* 11 */   public HttpReturnModel(int status, String message) { this.status = status;this.message = message;
/*    */   }
/*    */   
/*    */ 
/* 15 */   public int getStatus() { return this.status; } private int status = 200;
/* 16 */   public String getMessage() { return this.message; } private String message = "SUCCESS";
/*    */   
/*    */   public HttpReturnModel() {}
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/interceptor/HttpReturnModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */