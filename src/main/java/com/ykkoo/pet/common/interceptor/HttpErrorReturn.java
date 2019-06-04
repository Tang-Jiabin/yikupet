/*    */ package com.ykkoo.pet.common.interceptor;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import com.ykkoo.pet.utils.GsonUtils;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import org.springframework.beans.TypeMismatchException;
/*    */ import org.springframework.web.bind.MissingServletRequestParameterException;
/*    */ import org.springframework.web.bind.ServletRequestBindingException;
/*    */ import org.springframework.web.servlet.NoHandlerFoundException;
/*    */ 
/*    */ 
/*    */ public class HttpErrorReturn
/*    */ {
/*    */   public static void writeNoLogin(OutputStream outputStream)
/*    */     throws IOException
/*    */   {
/* 18 */     outputStream.write(GsonUtils.create().toJson(new HttpReturnModel(401, "Not login")).getBytes("UTF-8"));
/*    */   }
/*    */   
/*    */   public static void writeLackAuthority(OutputStream outputStream) throws IOException {
/* 22 */     outputStream.write(GsonUtils.create().toJson(new HttpReturnModel(403, "Illegal visit")).getBytes("UTF-8"));
/*    */   }
/*    */   
/*    */   public static void writeDataError(OutputStream outputStream, Exception ex) throws IOException {
/* 26 */     outputStream.write(GsonUtils.create().toJson(new HttpReturnModel(402, "Param error:" + ex.getMessage())).getBytes("UTF-8"));
/*    */   }
/*    */   
/*    */   public static String writeDataTypeMissingError(TypeMismatchException ex) {
/* 30 */     return GsonUtils.create().toJson(new HttpReturnModel(402, "Param type mismatch,Param " + ex.getPropertyName() + "Type is: " + ex.getRequiredType()));
/*    */   }
/*    */   
/*    */   public static String writeDataParamsMissingError(MissingServletRequestParameterException ex) {
/* 34 */     return GsonUtils.create().toJson(new HttpReturnModel(402, "Param missing: " + ex.getParameterName()));
/*    */   }
/*    */   
/*    */   public static String writeDataParamsMissingError(ServletRequestBindingException ex) {
/* 38 */     return GsonUtils.create().toJson(new HttpReturnModel(402, ex.getMessage()));
/*    */   }
/*    */   
/*    */   public static String writeDataActionMissingError(NoHandlerFoundException ex) {
/* 42 */     return GsonUtils.create().toJson(new HttpReturnModel(402, "Action not find " + ex.getRequestURL()));
/*    */   }
/*    */   
/*    */   public static String writeDataUnknownError(Exception ex) {
/* 46 */     return GsonUtils.create().toJson(new HttpReturnModel(402, ex.getMessage()));
/*    */   }
/*    */   
/*    */   public static String writeDataUnknownError(int status, String message) {
/* 50 */     return GsonUtils.create().toJson(new HttpReturnModel(status, message));
/*    */   }
/*    */   
/*    */   public static void writeServerError(OutputStream outputStream, Exception ex) throws IOException {
/* 54 */     outputStream.write(GsonUtils.create().toJson(new HttpReturnModel(500, "Service error:" + ex.getMessage())).getBytes("UTF-8"));
/*    */   }
/*    */   
/*    */   public static String writeServerError(Exception ex) {
/* 58 */     return GsonUtils.create().toJson(new HttpReturnModel(500, "Service error:" + ex.getMessage()));
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/interceptor/HttpErrorReturn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */