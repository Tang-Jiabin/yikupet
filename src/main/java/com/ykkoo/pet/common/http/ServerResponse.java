/*     */ package com.ykkoo.pet.common.http;
/*     */ 
/*     */ import com.fasterxml.jackson.annotation.JsonIgnore;
/*     */ import com.fasterxml.jackson.annotation.JsonInclude;
/*     */ import com.fasterxml.jackson.annotation.JsonInclude.Include;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonInclude(JsonInclude.Include.NON_NULL)
/*     */ public class ServerResponse<T>
/*     */   implements Serializable
/*     */ {
/*     */   private int status;
/*     */   private String msg;
/*     */   private T data;
/*     */   
/*  20 */   private ServerResponse(int status) { this.status = status; }
/*     */   
/*     */   private ServerResponse(int status, T data) {
/*  23 */     this.status = status;
/*  24 */     this.data = data;
/*     */   }
/*     */   
/*     */   private ServerResponse(int status, String msg, T data) {
/*  28 */     this.status = status;
/*  29 */     this.msg = msg;
/*  30 */     this.data = data;
/*     */   }
/*     */   
/*     */   private ServerResponse(int status, String msg) {
/*  34 */     this.status = status;
/*  35 */     this.msg = msg;
/*     */   }
/*     */   
/*     */   public static ServerResponse createMessageData(Integer key, Object val) {
/*  39 */     return new ServerResponse(key.intValue(), val);
/*     */   }
/*     */   
/*     */   @JsonIgnore
/*     */   public boolean isSuccess()
/*     */   {
/*  45 */     return this.status == ResponseCode.SUCCESS.getCode();
/*     */   }
/*     */   
/*     */   public int getStatus() {
/*  49 */     return this.status;
/*     */   }
/*     */   
/*  52 */   public T getData() { return (T)this.data; }
/*     */   
/*     */   public String getMsg() {
/*  55 */     return this.msg;
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createBySuccess()
/*     */   {
/*  60 */     return new ServerResponse(ResponseCode.SUCCESS.getCode());
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createBySuccessMessage(String msg) {
/*  64 */     return new ServerResponse(ResponseCode.SUCCESS.getCode(), msg);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ServerResponse<T> createBySuccess(Integer code, T data)
/*     */   {
/*  72 */     return new ServerResponse(code.intValue(), data);
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createByError()
/*     */   {
/*  77 */     return new ServerResponse(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createByErrorMessage(String errorMessage)
/*     */   {
/*  82 */     return new ServerResponse(ResponseCode.ERROR.getCode(), errorMessage);
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode, String errorMessage) {
/*  86 */     return new ServerResponse(errorCode, errorMessage);
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createMessage(int code, String msg, T data) {
/*  90 */     return new ServerResponse(code, msg, data);
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createMessage(KVResult<T> result) {
/*  94 */     return createMessage(result.getKey().intValue(), result.getVal());
/*     */   }
/*     */   
/*     */   public static <T> ServerResponse<T> createMessage(int code, T data)
/*     */   {
/*  99 */     if ((data instanceof String)) {
/* 100 */       return new ServerResponse(code, data.toString());
/*     */     }
/* 102 */     return new ServerResponse(code, data);
/*     */   }
/*     */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/http/ServerResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */