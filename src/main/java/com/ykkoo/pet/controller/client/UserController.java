/*    */ package com.ykkoo.pet.controller.client;
/*    */ 
/*    */ import com.google.common.collect.Maps;
/*    */ import com.ykkoo.pet.common.annotation.Authorization;
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.dto.UserInfoDTO;
/*    */ import com.ykkoo.pet.service.UserService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import io.swagger.annotations.ApiParam;
/*    */ import java.util.Map;
/*    */ import org.springframework.util.StringUtils;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ @Api(value="用户", description="user")
/*    */ @RestController
/*    */ @RequestMapping({"/user"})
/*    */ public class UserController
/*    */ {
/*    */   private UserService userService;
/*    */   
/*    */   public UserController(UserService userService)
/*    */   {
/* 32 */     this.userService = userService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 37 */   private static String parm_1 = "我的保单";
/* 38 */   private static String parm_2 = "理赔进度";
/* 39 */   private static String parm_3 = "会员权益";
/*    */   
/*    */   @ApiOperation("小程序登录")
/*    */   @GetMapping({"smallLogin"})
/*    */   public ServerResponse smallLogin(@ApiParam @RequestParam String code)
/*    */   {
/* 45 */     KVResult result = this.userService.smallLogin(code);
/*    */     
/* 47 */     return ServerResponse.createMessage(result);
/*    */   }
/*    */   
/*    */ 
/*    */   @Authorization
/*    */   @ApiOperation("设置用户信息")
/*    */   @PostMapping({"setUserInfo"})
/*    */   public ServerResponse setUserInfo(@RequestBody UserInfoDTO userInfoDTO, @ApiIgnore @RequestAttribute Integer userId)
/*    */   {
/* 56 */     KVResult result = this.userService.setUserInfo(userInfoDTO, userId);
/*    */     
/* 58 */     return ServerResponse.createMessage(result);
/*    */   }
/*    */   
/*    */ 
/*    */   @ApiOperation("设置按钮文字")
/*    */   @PostMapping({"setButtonText"})
/*    */   public ServerResponse setButtonText(@RequestParam String parm1, @RequestParam String parm2, @RequestParam String parm3, @ApiIgnore @RequestAttribute Integer userId)
/*    */   {
/* 66 */     if (!StringUtils.isEmpty(parm1)) {
/* 67 */       parm_1 = parm1;
/*    */     }
/* 69 */     if (!StringUtils.isEmpty(parm2)) {
/* 70 */       parm_2 = parm2;
/*    */     }
/* 72 */     if (!StringUtils.isEmpty(parm3)) {
/* 73 */       parm_3 = parm3;
/*    */     }
/* 75 */     Map<String, String> map = Maps.newHashMap();
/* 76 */     map.put("parm1", parm_1);
/* 77 */     map.put("parm2", parm_2);
/* 78 */     map.put("parm3", parm_3);
/*    */     
/* 80 */     return ServerResponse.createMessage(KVResult.put(map));
/*    */   }
/*    */   
/*    */   @Authorization
/*    */   @ApiOperation("获取用户信息")
/*    */   @GetMapping({"getUserInfo"})
/*    */   public ServerResponse getUserInfo(@ApiIgnore @RequestAttribute Integer userId)
/*    */   {
/* 88 */     KVResult result = this.userService.getUserInfo(userId);
/*    */     
/* 90 */     return ServerResponse.createMessage(result);
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */