/*    */ package com.ykkoo.pet.controller.client;
/*    */ 
/*    */ import com.ykkoo.pet.service.PayService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiIgnore
/*    */ @Api(value="支付", description="/pay")
/*    */ @RestController
/*    */ @RequestMapping({"/pay"})
/*    */ public class PayController
/*    */ {
/*    */   private PayService payService;
/*    */   
/*    */   public PayController(PayService payService)
/*    */   {
/* 29 */     this.payService = payService;
/*    */   }
/*    */   
/*    */   @ApiIgnore
/*    */   @ApiOperation("微信回调通知")
/*    */   @RequestMapping(value={"tenCallback"}, produces={"text/plain"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
/*    */   public String tenCallback(HttpServletRequest request, HttpServletResponse response)
/*    */     throws IOException
/*    */   {
/* 38 */     return this.payService.tenPayCallback(request, response);
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/PayController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */