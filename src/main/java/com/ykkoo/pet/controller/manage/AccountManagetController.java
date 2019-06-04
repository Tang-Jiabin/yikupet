/*    */ package com.ykkoo.pet.controller.manage;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.AdminAuthorization;
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.service.AccountMerchantService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import io.swagger.annotations.ApiParam;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.RequestAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Api(value="Z管理【账户】", description="/manage/account")
/*    */ @RestController
/*    */ @RequestMapping({"/manage/account"})
/*    */ public class AccountManagetController
/*    */ {
/*    */   private AccountMerchantService accountMerchantService;
/*    */   
/*    */   public AccountManagetController(AccountMerchantService accountMerchantService)
/*    */   {
/* 28 */     this.accountMerchantService = accountMerchantService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @AdminAuthorization
/*    */   @ApiOperation("获取提现分页")
/*    */   @GetMapping({"/getWithdrawalPage"})
/*    */   public ServerResponse getWithdrawalPage(@ApiParam("页码") @RequestParam(required=false, defaultValue="0") Integer page, @ApiParam("条数") @RequestParam(required=false, defaultValue="10") Integer size, @ApiParam("姓名") @RequestParam(required=false, defaultValue="0") String name, @ApiParam("提现状态 0-全部 1-提现中 2-已提现") @RequestParam(required=false, defaultValue="0") Integer state, @ApiIgnore @RequestAttribute Integer adminId)
/*    */   {
/* 43 */     KVResult result = this.accountMerchantService.getWithdrawalPage(page, size, name, state, adminId);
/* 44 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   @AdminAuthorization
/*    */   @ApiOperation("更新提现信息")
/*    */   @GetMapping({"/updateWithdrawal"})
/*    */   public ServerResponse updateWithdrawal(@ApiParam("提现ID") @RequestParam Integer withdrawalId, @ApiParam("提现状态 1-提现中 2-已提现") @RequestParam(required=false, defaultValue="0") Integer state, @ApiIgnore @RequestAttribute Integer adminId)
/*    */   {
/* 54 */     KVResult result = this.accountMerchantService.updateWithdrawal(withdrawalId, state, adminId);
/* 55 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/manage/AccountManagetController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */