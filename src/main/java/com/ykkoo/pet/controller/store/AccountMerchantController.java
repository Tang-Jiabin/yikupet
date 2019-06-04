/*    */ package com.ykkoo.pet.controller.store;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.HospitalAuthorization;
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.service.AccountMerchantService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import io.swagger.annotations.ApiParam;
/*    */ import java.util.List;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ @Api(value="Z商户【账户】", description="/merchant/account")
/*    */ @RestController
/*    */ @org.springframework.web.bind.annotation.RequestMapping({"/merchant/account"})
/*    */ public class AccountMerchantController
/*    */ {
/*    */   private AccountMerchantService accountMerchantService;
/*    */   
/*    */   public AccountMerchantController(AccountMerchantService accountMerchantService)
/*    */   {
/* 27 */     this.accountMerchantService = accountMerchantService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @HospitalAuthorization
/*    */   @ApiOperation("获取账户详情")
/*    */   @GetMapping({"/getAccountInfo"})
/*    */   public ServerResponse getAccountInfo(@ApiParam("提现状态 1-未提现 2-提现中 3-已提现") @RequestParam(required=false, defaultValue="1") Integer state, @ApiIgnore @RequestAttribute Integer hospitalInfoId)
/*    */   {
/* 38 */     KVResult result = this.accountMerchantService.getAccountInfo(state, hospitalInfoId);
/* 39 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @HospitalAuthorization
/*    */   @ApiOperation("提现")
/*    */   @PostMapping({"/cashWithdrawal"})
/*    */   public ServerResponse cashWithdrawal(@ApiParam("提现金额") @RequestParam Double amount, @ApiParam("银行卡号") @RequestParam String cardNumber, @ApiParam("开户行") @RequestParam String cardBank, @ApiParam("真实姓名") @RequestParam String name, @ApiParam("资金id集合") @RequestParam List<Integer> accountIdList, @ApiIgnore @RequestAttribute Integer hospitalInfoId)
/*    */   {
/* 52 */     KVResult result = this.accountMerchantService.cashWithdrawal(amount, cardNumber, cardBank, name, accountIdList, hospitalInfoId);
/* 53 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */ 
/*    */   @HospitalAuthorization
/*    */   @ApiOperation("获取提现详情")
/*    */   @GetMapping({"/getWithdrawalInfo"})
/*    */   public ServerResponse getWithdrawalInfo(@ApiParam("提现状态 0-全部 1-提现中 2-已提现") @RequestParam(required=false, defaultValue="0") Integer state, @ApiIgnore @RequestAttribute Integer hospitalInfoId)
/*    */   {
/* 62 */     KVResult result = this.accountMerchantService.getWithdrawalInfo(state, hospitalInfoId);
/* 63 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/store/AccountMerchantController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */