/*    */ package com.ykkoo.pet.controller.manage;
/*    */ 
/*    */ import com.ykkoo.pet.common.annotation.AdminAuthorization;
/*    */ import com.ykkoo.pet.common.http.KVResult;
/*    */ import com.ykkoo.pet.common.http.ServerResponse;
/*    */ import com.ykkoo.pet.common.type.FileType;
/*    */ import com.ykkoo.pet.dto.FileUpdateDTO;
/*    */ import com.ykkoo.pet.dto.FileUploadDTO;
/*    */ import com.ykkoo.pet.service.FileService;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import io.swagger.annotations.ApiParam;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import springfox.documentation.annotations.ApiIgnore;
/*    */ 
/*    */ @io.swagger.annotations.Api(value="Z管理【文件】", description="file")
/*    */ @RestController
/*    */ @org.springframework.web.bind.annotation.RequestMapping({"/manage/file"})
/*    */ @AdminAuthorization
/*    */ public class FileUploadManageController
/*    */ {
/*    */   private FileService fileService;
/*    */   
/*    */   public FileUploadManageController(FileService fileService)
/*    */   {
/* 28 */     this.fileService = fileService;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   @AdminAuthorization
/*    */   @ApiOperation("上传")
/*    */   @PostMapping({"/upload"})
/*    */   public ServerResponse upload(FileUploadDTO fileUploadDTO, @ApiIgnore @RequestAttribute Integer adminId)
/*    */   {
/* 38 */     KVResult result = this.fileService.upload(fileUploadDTO, adminId);
/* 39 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */   @AdminAuthorization
/*    */   @ApiOperation("更新")
/*    */   @PostMapping({"/update"})
/*    */   public ServerResponse update(@org.springframework.web.bind.annotation.RequestBody FileUpdateDTO fileUpdateDTO, @ApiIgnore @RequestAttribute Integer adminId) {
/* 46 */     KVResult result = this.fileService.update(fileUpdateDTO, adminId);
/* 47 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   @AdminAuthorization
/*    */   @ApiOperation("文件分页")
/*    */   @org.springframework.web.bind.annotation.GetMapping({"/getFilePage"})
/*    */   public ServerResponse getFilePage(@ApiParam("页码") @RequestParam(required=false, defaultValue="0") Integer page, @ApiParam("条数") @RequestParam(required=false, defaultValue="10") Integer size, @ApiParam("文件类型") @RequestParam(required=false, defaultValue="ALL") FileType fileType, @ApiParam("文件状态") @RequestParam(required=false, defaultValue="0") Integer state, @ApiIgnore @RequestAttribute Integer adminId)
/*    */   {
/* 58 */     KVResult result = this.fileService.getFilePage(page, size, fileType, state, adminId);
/* 59 */     return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/manage/FileUploadManageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */