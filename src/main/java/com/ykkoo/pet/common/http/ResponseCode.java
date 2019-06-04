/*    */ package com.ykkoo.pet.common.http;
/*    */ 
/*    */ 
/*    */ public enum ResponseCode
/*    */ {
/*  6 */   SUCCESS(200, "SUCCESS"), 
/*  7 */   ERROR(400, "ERROR");
/*    */   
/*    */   private final int code;
/*    */   private final String desc;
/*    */   
/*    */   private ResponseCode(int code, String desc)
/*    */   {
/* 14 */     this.code = code;
/* 15 */     this.desc = desc;
/*    */   }
/*    */   
/*    */   public int getCode() {
/* 19 */     return this.code;
/*    */   }
/*    */   
/* 22 */   public String getDesc() { return this.desc; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/http/ResponseCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */