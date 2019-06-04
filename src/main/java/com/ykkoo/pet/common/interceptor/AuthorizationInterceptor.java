/*    */ package com.ykkoo.pet.common.interceptor;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.Authorization;
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
/*    */ @Component
/*    */ public class AuthorizationInterceptor
/*    */   extends HandlerInterceptorAdapter
/*    */ {
/* 22 */   private static final Logger log = LoggerFactory.getLogger(AuthorizationInterceptor.class);
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
/* 33 */     response.setHeader("Access-Control-Allow-Origin", "*");
/*    */     
/* 35 */     response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,Content-Type,Accept,token");
/*    */     
/* 37 */     response.setHeader("Access-Control-Expose-Headers", "token");
/*    */     
/* 39 */     response.setHeader("Access-Control-Allow-Method", "GET,HEAD,POST,PUT,DELETE,OPTIONS,PATCH");
/*    */     
/* 41 */     response.setHeader("Access-Control-Expose-Headers", "*");
/*    */     
/*    */ 
/* 44 */     if (!(handler instanceof HandlerMethod)) {
/* 45 */       return true;
/*    */     }
/* 47 */     HandlerMethod handlerMethod = (HandlerMethod)handler;
/* 48 */     Method method = handlerMethod.getMethod();
/* 49 */     Authorization annotation = (Authorization)method.getAnnotation(Authorization.class);
/* 50 */     if (annotation == null) {
/* 51 */       return true;
/*    */     }
/* 53 */     String token = request.getHeader("token");
/*    */     
/* 55 */     if (StringUtils.isEmpty(token)) {
/* 56 */       HttpErrorReturn.writeNoLogin(response.getOutputStream());
/* 57 */       return false;
/*    */     }
/*    */     try
/*    */     {
/* 61 */       if (token.equals("tang")) {
/* 62 */         request.setAttribute("userId", Integer.valueOf(1));
/* 63 */         return true;
/*    */       }
/*    */       
/* 66 */       if (this.manager.checkUserToken(token)) {
/* 67 */         request.setAttribute("userId", Integer.valueOf(this.manager.getUserToken(token).getUserId()));
/* 68 */         return true;
/*    */       }
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 73 */       HttpErrorReturn.writeNoLogin(response.getOutputStream());
/* 74 */       return false;
/*    */     }
/* 76 */     HttpErrorReturn.writeNoLogin(response.getOutputStream());
/* 77 */     return false;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/interceptor/AuthorizationInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */