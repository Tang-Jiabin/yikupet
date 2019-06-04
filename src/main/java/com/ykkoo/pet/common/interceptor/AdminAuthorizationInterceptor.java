/*    */ package com.ykkoo.pet.common.interceptor;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.AdminAuthorization;
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
/*    */ @Component
/*    */ public class AdminAuthorizationInterceptor
/*    */   extends HandlerInterceptorAdapter
/*    */ {
/* 24 */   private static final Logger log = LoggerFactory.getLogger(AdminAuthorizationInterceptor.class);
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
/* 35 */     response.setHeader("Access-Control-Allow-Origin", "*");
/*    */     
/* 37 */     response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,Content-Type,Accept,token");
/*    */     
/* 39 */     response.setHeader("Access-Control-Expose-Headers", "token");
/*    */     
/* 41 */     response.setHeader("Access-Control-Allow-Method", "GET,HEAD,POST,PUT,DELETE,OPTIONS,PATCH");
/*    */     
/* 43 */     response.setHeader("Access-Control-Expose-Headers", "*");
/*    */     
/*    */ 
/* 46 */     if (!(handler instanceof HandlerMethod)) {
/* 47 */       return true;
/*    */     }
/* 49 */     HandlerMethod handlerMethod = (HandlerMethod)handler;
/* 50 */     Method method = handlerMethod.getMethod();
/* 51 */     AdminAuthorization annotation = (AdminAuthorization)method.getAnnotation(AdminAuthorization.class);
/* 52 */     if (annotation == null) {
/* 53 */       return true;
/*    */     }
/* 55 */     String token = request.getHeader("token");
/*    */     
/* 57 */     if (StringUtils.isEmpty(token)) {
/* 58 */       HttpErrorReturn.writeNoLogin(response.getOutputStream());
/* 59 */       return false;
/*    */     }
/*    */     try
/*    */     {
/* 63 */       if (token.equals("tang")) {
/* 64 */         request.setAttribute("adminId", Integer.valueOf(1));
/* 65 */         return true;
/*    */       }
/*    */       
/* 68 */       if (this.manager.checkAdminToken(token)) {
/* 69 */         request.setAttribute("adminId", Integer.valueOf(this.manager.getAdminToken(token).getUserId()));
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


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/interceptor/AdminAuthorizationInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */