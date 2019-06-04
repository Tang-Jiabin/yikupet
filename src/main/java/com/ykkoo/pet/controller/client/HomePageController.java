/*    */ package com.ykkoo.pet.controller.client;
/*    */ 
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.service.HomePageService;
/*    */ import com.ykkoo.pet.vo.HomePageVO;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import org.springframework.http.HttpStatus;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ @Api(value="首页", description="homePage")
/*    */ @RestController
/*    */ @RequestMapping({"/homePage"})
/*    */ public class HomePageController
/*    */ {
/*    */   private HomePageService homePageService;
/*    */   
/*    */   public HomePageController(HomePageService homePageService)
/*    */   {
/* 24 */     this.homePageService = homePageService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 29 */   private static Integer show = Integer.valueOf(1);
/*    */   
/*    */   @ApiOperation("首页1.0")
/*    */   @RequestMapping(value={"getV1"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
/*    */   public ServerResponse findOrderPage()
/*    */   {
/* 35 */     KVResult<HomePageVO> result = this.homePageService.getV1();
/*    */     
/* 37 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */   @ApiOperation("getShow")
/*    */   @RequestMapping(value={"getShow"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
/*    */   public ServerResponse getShow(@RequestParam Integer set)
/*    */   {
/* 44 */     if ((set.intValue() == 1) || (set.intValue() == 2)) {
/* 45 */       show = set;
/*    */     }
/* 47 */     KVResult result = KVResult.put(HttpStatus.OK, show);
/* 48 */     return ServerResponse.createMessage(result);
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/HomePageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */