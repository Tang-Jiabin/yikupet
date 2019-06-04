/*    */ package com.ykkoo.pet.controller.store;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.HospitalAuthorization;
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.dto.DiagnosticDTO;
/*    */ import com.ykkoo.pet.service.HospitalService;
/*    */ import com.ykkoo.pet.service.InsurancePolicyService;
/*    */ import com.ykkoo.pet.service.UserService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import io.swagger.annotations.ApiParam;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ @Api(value="Z商户【预约就诊】", description="/merchant/reservation")
/*    */ @RestController
/*    */ @RequestMapping({"/merchant/reservation"})
/*    */ public class ReservationMerchantController
/*    */ {
/*    */   private HospitalService hospitalService;
/*    */   private InsurancePolicyService insurancePolicyService;
/*    */   private UserService userService;
/*    */   
/*    */   public ReservationMerchantController(HospitalService hospitalService, InsurancePolicyService insurancePolicyService, UserService userService)
/*    */   {
/* 33 */     this.hospitalService = hospitalService;this.insurancePolicyService = insurancePolicyService;this.userService = userService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @HospitalAuthorization
/*    */   @ApiOperation("保单分页")
/*    */   @RequestMapping(value={"getInsurancePolicyPage"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
/*    */   public ServerResponse getInsurancePolicyPage(@ApiParam("页码 (从0开始)") @RequestParam(required=false, defaultValue="0") Integer page, @ApiParam("用户手机号") @RequestParam(required=false, defaultValue="") String phone, @ApiParam("电子卡号") @RequestParam(required=false, defaultValue="") String cardNumber, @ApiIgnore @RequestAttribute Integer hospitalInfoId)
/*    */   {
/* 48 */     KVResult result = this.insurancePolicyService.getInsurancePolicyPage(page, phone, cardNumber, hospitalInfoId);
/* 49 */     return ServerResponse.createMessage(result);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @HospitalAuthorization
/*    */   @ApiOperation("绑定电子卡号")
/*    */   @GetMapping({"/bindingElectronicCard"})
/*    */   public ServerResponse bindingElectronicCard(@ApiParam("保单ID") @RequestParam(required=false, defaultValue="0") Integer insurancePolicyId, @ApiParam("审核状态 2-审核通过 5-审核未通过") @RequestParam(required=false, defaultValue="2") Integer insuranceStatus, @ApiParam("电子卡号") @RequestParam(required=false, defaultValue="") String electronicCard, @ApiIgnore @RequestAttribute Integer hospitalInfoId)
/*    */   {
/* 60 */     KVResult result = this.hospitalService.bindingElectronicCard(insurancePolicyId, insuranceStatus, electronicCard, hospitalInfoId);
/* 61 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */   @HospitalAuthorization
/*    */   @ApiOperation("获取保单详情")
/*    */   @GetMapping({"/getInsurancePolicyDetails"})
/*    */   public ServerResponse getInsurancePolicyDetails(@ApiParam("保单ID") @RequestParam(required=false, defaultValue="0") Integer insurancePolicyId, @ApiIgnore @RequestAttribute Integer hospitalInfoId)
/*    */   {
/* 69 */     KVResult result = this.hospitalService.getInsurancePolicyDetails(insurancePolicyId, hospitalInfoId);
/* 70 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */   @HospitalAuthorization
/*    */   @ApiOperation("添加诊断信息")
/*    */   @PostMapping({"/addDiagnosticInfo"})
/*    */   public ServerResponse addDiagnosticInfo(@RequestBody DiagnosticDTO diagnosticDTO, @ApiIgnore @RequestAttribute Integer hospitalInfoId)
/*    */   {
/* 78 */     KVResult result = this.hospitalService.addDiagnosticInfo(diagnosticDTO, hospitalInfoId);
/* 79 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/store/ReservationMerchantController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */