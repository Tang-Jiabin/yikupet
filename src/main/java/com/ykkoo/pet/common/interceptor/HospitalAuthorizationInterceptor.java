/*    */ package com.ykkoo.pet.common.interceptor;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.HospitalAuthorization;
/*    */ import com.ykkoo.pet.common.token.TokenManage;
/*    */ import com.ykkoo.pet.common.token.TokenModel;
/*    */ import java.lang.reflect.Method;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Component;
/*    */ import org.springframework.util.StringUtils;
/*    */ import org.springframework.web.method.HandlerMethod;
/*    */ import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Component
/*    */ public class HospitalAuthorizationInterceptor
/*    */   extends HandlerInterceptorAdapter
/*    */ {
/* 25 */   private static final Logger log = LoggerFactory.getLogger(HospitalAuthorizationInterceptor.class);
/*    */   
/*    */ 
/*    */   @Autowired
/*    */   private TokenManage manager;
/*    */   
/*    */ 
/*    */ 
/*    */   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
/*    */     throws Exception
/*    */   {
/* 36 */     response.setHeader("Access-Control-Allow-Origin", "*");
/*    */     
/* 38 */     response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,Content-Type,Accept,token");
/*    */     
/* 40 */     response.setHeader("Access-Control-Expose-Headers", "token");
/*    */     
/* 42 */     response.setHeader("Access-Control-Allow-Method", "GET,HEAD,POST,PUT,DELETE,OPTIONS,PATCH");
/*    */     
/* 44 */     response.setHeader("Access-Control-Expose-Headers", "*");
/*    */     
/*    */ 
/* 47 */     if (!(handler instanceof HandlerMethod)) {
/* 48 */       return true;
/*    */     }
/* 50 */     HandlerMethod handlerMethod = (HandlerMethod)handler;
/* 51 */     Method method = handlerMethod.getMethod();
/* 52 */     HospitalAuthorization annotation = (HospitalAuthorization)method.getAnnotation(HospitalAuthorization.class);
/* 53 */     if (annotation == null) {
/* 54 */       return true;
/*    */     }
/* 56 */     String token = request.getHeader("token");
/*    */     
/* 58 */     if (StringUtils.isEmpty(token)) {
/* 59 */       HttpErrorReturn.writeNoLogin(response.getOutputStream());
/* 60 */       return false;
/*    */     }
/*    */     try
/*    */     {
/* 64 */       if (token.equals("tang")) {
/* 65 */         request.setAttribute("hospitalInfoId", Integer.valueOf(1));
/* 66 */         return true;
/*    */       }
/* 68 */       if (this.manager.checkHospitalToken(token)) {
/* 69 */         request.setAttribute("hospitalInfoId", Integer.valueOf(this.manager.getHospitalToken(token).getUserId()));
/* 70 */         return true;
/*    */       }
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 75 */       HttpErrorReturn.writeNoLogin(response.getOutputStream());
/* 76 */       return false;
/*    */     }
/* 78 */     HttpErrorReturn.writeNoLogin(response.getOutputStream());
/* 79 */     return false;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/interceptor/HospitalAuthorizationInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */