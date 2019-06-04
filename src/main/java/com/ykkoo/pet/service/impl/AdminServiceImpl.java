/*     */ package com.ykkoo.pet.service.impl;
/*     */ 
/*     */ import com.ykkoo.pet.common.http.KVResult;
/*     */ import com.ykkoo.pet.common.token.TokenManage;
/*     */ import com.ykkoo.pet.common.token.TokenModel;
/*     */ import com.ykkoo.pet.dto.AdminDTO;
/*     */ import com.ykkoo.pet.pojo.PetAdmin;
/*     */ import com.ykkoo.pet.repository.PetAdminRepository;
/*     */ import com.ykkoo.pet.service.AdminService;
/*     */ import com.ykkoo.pet.vo.AdminVO;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.http.HttpStatus;
/*     */ import org.springframework.stereotype.Service;
/*     */ import org.springframework.util.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ public class AdminServiceImpl
/*     */   implements AdminService
/*     */ {
/*  29 */   private static final Logger log = LoggerFactory.getLogger(AdminServiceImpl.class);
/*     */   
/*  31 */   public AdminServiceImpl(PetAdminRepository adminRepository, TokenManage tokenManage) { this.adminRepository = adminRepository;this.tokenManage = tokenManage;
/*     */   }
/*     */   
/*     */ 
/*     */   private PetAdminRepository adminRepository;
/*     */   
/*     */   private TokenManage tokenManage;
/*     */   public KVResult signIn(String adminName, String password, HttpServletRequest request)
/*     */   {
/*  40 */     if ((StringUtils.isEmpty(adminName)) || (StringUtils.isEmpty(password))) {
/*  41 */       return KVResult.put(Integer.valueOf(410), "用户名或密码错误");
/*     */     }
/*     */     
/*  44 */     PetAdmin petAdmin = this.adminRepository.findByAdminAccountAndAdminPassword(adminName, password);
/*     */     
/*     */ 
/*  47 */     if (petAdmin == null) {
/*  48 */       return KVResult.put(Integer.valueOf(410), "用户名或密码错误");
/*     */     }
/*     */     
/*  51 */     TokenModel token = this.tokenManage.createAdminToken(petAdmin.getAdminId());
/*     */     
/*  53 */     AdminVO adminVO = new AdminVO();
/*  54 */     adminVO.setAdminName(petAdmin.getAdminName());
/*  55 */     adminVO.setToken(petAdmin.getToken());
/*     */     
/*     */ 
/*  58 */     return KVResult.put(HttpStatus.OK, adminVO);
/*     */   }
/*     */   
/*     */ 
/*     */   public KVResult addAdmin(AdminDTO adminDTO, Integer adminId)
/*     */   {
/*  64 */     if ((StringUtils.isEmpty(adminDTO.getAdminName())) || 
/*  65 */       (StringUtils.isEmpty(adminDTO.getAdminAccount())) || 
/*  66 */       (StringUtils.isEmpty(adminDTO.getPassword()))) {
/*  67 */       return KVResult.put(Integer.valueOf(411), "用户名密码不能为空");
/*     */     }
/*     */     
/*  70 */     if ((adminDTO.getAdminAccount().length() < 6) || (adminDTO.getPassword().length() < 6)) {
/*  71 */       return KVResult.put(Integer.valueOf(412), "用户名密码不能小于6位");
/*     */     }
/*     */     
/*  74 */     List<PetAdmin> adminList = this.adminRepository.findAllByAdminAccountOrAdminName(adminDTO.getAdminAccount(), adminDTO.getAdminName());
/*     */     
/*  76 */     if (adminList.size() > 0) {
/*  77 */       return KVResult.put(Integer.valueOf(413), "用户名已存在");
/*     */     }
/*     */     
/*  80 */     PetAdmin petAdmin = new PetAdmin();
/*  81 */     petAdmin.setAdminName(adminDTO.getAdminName());
/*  82 */     petAdmin.setAdminAccount(adminDTO.getAdminAccount());
/*  83 */     petAdmin.setAdminPassword(adminDTO.getPassword());
/*  84 */     petAdmin.setToken(" ");
/*  85 */     petAdmin.setCreateDate(new Date());
/*  86 */     petAdmin.setCreateAdmin(adminId);
/*     */     
/*  88 */     this.adminRepository.save(petAdmin);
/*     */     
/*  90 */     return KVResult.put(HttpStatus.OK);
/*     */   }
/*     */   
/*     */   public PetAdmin findByAdminId(Integer adminId)
/*     */   {
/*  95 */     return this.adminRepository.findByAdminId(adminId);
/*     */   }
/*     */   
/*     */   public PetAdmin save(PetAdmin admin)
/*     */   {
/* 100 */     return (PetAdmin)this.adminRepository.save(admin);
/*     */   }
/*     */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/impl/AdminServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */