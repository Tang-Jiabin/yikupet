/*    */ package com.ykkoo.pet.controller.manage;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.AdminAuthorization;
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.dto.AdminDTO;
/*    */ import com.ykkoo.pet.service.AdminService;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.web.bind.annotation.RequestAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ @Api(value="Z管理【管理员】", description="admin")
/*    */ @RestController
/*    */ @RequestMapping({"/manage/admin"})
/*    */ @AdminAuthorization
/*    */ public class AdminManageController
/*    */ {
/*    */   private AdminService adminService;
/*    */   
/*    */   public AdminManageController(AdminService adminService)
/*    */   {
/* 29 */     this.adminService = adminService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @ApiOperation("管理员登录")
/*    */   @RequestMapping(value={"signIn"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
/*    */   public ServerResponse signIn(@RequestParam String adminName, @RequestParam String password, @Autowired HttpServletRequest request)
/*    */   {
/* 40 */     KVResult result = this.adminService.signIn(adminName, password, request);
/*    */     
/* 42 */     return ServerResponse.createMessage(result);
/*    */   }
/*    */   
/*    */   @AdminAuthorization
/*    */   @ApiOperation("添加管理员")
/*    */   @RequestMapping(value={"addAdmin"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
/*    */   public ServerResponse addAdmin(@RequestBody AdminDTO adminDTO, @ApiIgnore @RequestAttribute Integer adminId)
/*    */   {
/* 50 */     KVResult result = this.adminService.addAdmin(adminDTO, adminId);
/*    */     
/* 52 */     return ServerResponse.createMessage(result);
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/manage/AdminManageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */