/*    */ package com.ykkoo.pet.controller.manage;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.AdminAuthorization;
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.service.TimerService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.scheduling.annotation.Scheduled;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiIgnore
/*    */ @Api(value="Z管理【定时器】", description="timer")
/*    */ @RestController
/*    */ @RequestMapping({"/timer"})
/*    */ public class TimerManageController
/*    */ {
/* 24 */   private static final Logger log = LoggerFactory.getLogger(TimerManageController.class);
/*    */   private TimerService timerService;
/*    */   
/*    */   public TimerManageController(TimerService timerService)
/*    */   {
/* 29 */     this.timerService = timerService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @AdminAuthorization
/*    */   @Scheduled(cron="0 0 * * * ?")
/*    */   @ApiOperation("每小时执行一次")
/*    */   @GetMapping({"update1h"})
/*    */   public void update1h()
/*    */   {
/* 42 */     log.info("每小时执行一次定时任务");
/* 43 */     KVResult result = this.timerService.update1h();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   @AdminAuthorization
/*    */   @Scheduled(cron="0 0 0 * * ?")
/*    */   @ApiOperation("每天执行一次")
/*    */   @GetMapping({"update1d"})
/*    */   public void update1d()
/*    */   {
/* 54 */     log.info("每天执行一次定时任务");
/* 55 */     KVResult result = this.timerService.update1d();
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/manage/TimerManageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */