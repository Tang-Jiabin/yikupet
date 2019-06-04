/*    */ package com.ykkoo.pet.controller.client;
/*    */ 
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.service.HospitalService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import io.swagger.annotations.ApiParam;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Api(value="宠物医院", description="hospital")
/*    */ @RestController
/*    */ @RequestMapping({"/hospital"})
/*    */ public class HospitalController
/*    */ {
/*    */   private HospitalService hospitalService;
/*    */   
/*    */   public HospitalController(HospitalService hospitalService)
/*    */   {
/* 27 */     this.hospitalService = hospitalService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @ApiOperation("宠物医院")
/*    */   @RequestMapping(value={"getHospitalPage"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
/*    */   public ServerResponse getHospitalPage(@ApiParam("页码") @RequestParam(required=false, defaultValue="0") Integer page, @ApiParam("条数") @RequestParam(required=false, defaultValue="10") Integer size, @ApiParam("范围 0-全部 1-狗医院 2-猫医院") @RequestParam(required=false, defaultValue="0") Integer scope, @ApiParam("类型 0-全部  1-芯片注射 2-定点就诊") @RequestParam(required=false, defaultValue="0") Integer type, @ApiParam("医院名称") @RequestParam(required=false, defaultValue="") String hospitalName, @ApiParam("联系人") @RequestParam(required=false, defaultValue="") String contacts)
/*    */   {
/* 41 */     KVResult result = this.hospitalService.getHospitalPage(page, size, scope, type, Integer.valueOf(1), hospitalName, contacts, Integer.valueOf(0));
/*    */     
/* 43 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/HospitalController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */