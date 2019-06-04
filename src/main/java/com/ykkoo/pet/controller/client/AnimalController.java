/*    */ package com.ykkoo.pet.controller.client;
/*    */ 
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.service.PetAnimalService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import io.swagger.annotations.ApiParam;
/*    */ import org.springframework.web.bind.annotation.RequestAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ @Api(value="宠物", description="animal")
/*    */ @RestController
/*    */ @RequestMapping({"/animal"})
/*    */ public class AnimalController
/*    */ {
/*    */   private PetAnimalService animalService;
/*    */   
/*    */   public AnimalController(PetAnimalService animalService)
/*    */   {
/* 24 */     this.animalService = animalService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @ApiOperation("宠物分页")
/*    */   @RequestMapping(value={"getAnimalPage"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
/*    */   public ServerResponse getAnimalPage(@RequestParam(required=false, defaultValue="0") Integer page, @ApiParam(" 0-全部 1-狗 2-猫") @RequestParam(required=false, defaultValue="0") Integer animalSpecies, @ApiIgnore @RequestAttribute Integer userId)
/*    */   {
/* 36 */     KVResult result = this.animalService.getAnimalPage(page, animalSpecies, userId);
/*    */     
/* 38 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/AnimalController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */