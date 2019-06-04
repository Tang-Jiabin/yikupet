/*     */ package com.ykkoo.pet.common.token.impl;
/*     */ 
/*     */ import com.auth0.jwt.JWT;
/*     */ import com.auth0.jwt.JWTCreator.Builder;
/*     */ import com.auth0.jwt.algorithms.Algorithm;
/*     */ import com.auth0.jwt.interfaces.DecodedJWT;
/*     */ import com.ykkoo.pet.common.token.TokenModel;
/*     */ import com.ykkoo.pet.pojo.PetHospitalInfo;
/*     */ import com.ykkoo.pet.repository.PetAdminRepository;
/*     */ import com.ykkoo.pet.repository.PetUserInfoRepository;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import org.springframework.util.StringUtils;
/*     */ 
/*     */ @org.springframework.stereotype.Service
/*     */ public class TokenManageImpl implements com.ykkoo.pet.common.token.TokenManage
/*     */ {
/*     */   private PetAdminRepository adminRepository;
/*     */   private PetUserInfoRepository userInfoRepository;
/*     */   private com.ykkoo.pet.repository.PetHospitalInfoRepository hospitalInfoRepository;
/*     */   private static final String ISSUER = "pet.ykkoo.com";
/*     */   private static final String ADMIN_SECRET = "R78{7(53!~3&>5}3}61^~LX,0m";
/*     */   private static final String ADMIN_KEY = "admin";
/*     */   private static final String USER_SECRET = "D34{ad!~3&>5}3_)(g^~LX,0FEm";
/*     */   private static final String USER_KEY = "user";
/*     */   private static final String HOSPITAL_SECRET = "f*HdDol&{:L6ad92odSsDffGod";
/*     */   private static final String HOSPITAL_KEY = "hospital";
/*     */   
/*     */   public TokenManageImpl(PetAdminRepository adminRepository, PetUserInfoRepository userInfoRepository, com.ykkoo.pet.repository.PetHospitalInfoRepository hospitalInfoRepository)
/*     */   {
/*  30 */     this.adminRepository = adminRepository;this.userInfoRepository = userInfoRepository;this.hospitalInfoRepository = hospitalInfoRepository;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TokenModel createAdminToken(Integer adminId)
/*     */   {
/*  51 */     String token = null;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       token = JWT.create().withIssuer("pet.ykkoo.com").withJWTId(java.util.UUID.randomUUID().toString().toUpperCase()).withClaim("admin", adminId).sign(Algorithm.HMAC256("R78{7(53!~3&>5}3}61^~LX,0m"));
/*     */     } catch (UnsupportedEncodingException e) {
/*  59 */       token = "error";
/*     */     }
/*     */     
/*  62 */     TokenModel model = new TokenModel(adminId.intValue(), token);
/*  63 */     com.ykkoo.pet.pojo.PetAdmin admin = this.adminRepository.findByAdminId(adminId);
/*  64 */     admin.setToken(token);
/*  65 */     this.adminRepository.save(admin);
/*     */     
/*  67 */     return model;
/*     */   }
/*     */   
/*     */   public boolean checkAdminToken(String token) throws com.auth0.jwt.exceptions.JWTVerificationException
/*     */   {
/*  72 */     if (StringUtils.isEmpty(token)) {
/*  73 */       return false;
/*     */     }
/*     */     try {
/*  76 */       TokenModel tokenModel = getAdminToken(token);
/*  77 */       String dbtoken = null;
/*     */       
/*  79 */       com.ykkoo.pet.pojo.PetAdmin admin = null;
/*  80 */       if (!StringUtils.isEmpty(tokenModel)) {
/*  81 */         admin = this.adminRepository.findByAdminId(Integer.valueOf(tokenModel.getUserId()));
/*     */       }
/*  83 */       if (admin != null) {
/*  84 */         dbtoken = admin.getToken();
/*     */       }
/*  86 */       return (dbtoken != null) && (token.equals(dbtoken));
/*     */     } catch (Exception e) {
/*  88 */       e.printStackTrace();
/*     */     }
/*  90 */     return false;
/*     */   }
/*     */   
/*     */   public TokenModel getAdminToken(String authentication)
/*     */     throws UnsupportedEncodingException, com.auth0.jwt.exceptions.JWTVerificationException
/*     */   {
/*  96 */     String secret = "R78{7(53!~3&>5}3}61^~LX,0m";
/*  97 */     String key = "admin";
/*     */     
/*     */ 
/*     */ 
/* 101 */     com.auth0.jwt.JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret)).withIssuer("pet.ykkoo.com").build();
/* 102 */     DecodedJWT jwt = verifier.verify(authentication);
/* 103 */     Integer adminId = jwt.getClaim(key).asInt();
/* 104 */     if (adminId == null) {
/* 105 */       return null;
/*     */     }
/* 107 */     return new TokenModel(adminId.intValue(), jwt.getToken());
/*     */   }
/*     */   
/*     */   public TokenModel createUserToken(Integer userId)
/*     */   {
/* 112 */     String token = null;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 118 */       token = JWT.create().withIssuer("pet.ykkoo.com").withJWTId(java.util.UUID.randomUUID().toString().toUpperCase()).withClaim("user", userId).sign(Algorithm.HMAC256("D34{ad!~3&>5}3_)(g^~LX,0FEm"));
/*     */     } catch (UnsupportedEncodingException e) {
/* 120 */       token = "error";
/*     */     }
/*     */     
/* 123 */     TokenModel model = new TokenModel(userId.intValue(), token);
/* 124 */     com.ykkoo.pet.pojo.PetUserInfo userInfo = this.userInfoRepository.findByUserId(userId);
/* 125 */     userInfo.setToken(token);
/* 126 */     this.userInfoRepository.save(userInfo);
/*     */     
/* 128 */     return model;
/*     */   }
/*     */   
/*     */   public boolean checkUserToken(String token)
/*     */   {
/* 133 */     if (StringUtils.isEmpty(token)) {
/* 134 */       return false;
/*     */     }
/*     */     try {
/* 137 */       TokenModel tokenModel = getUserToken(token);
/* 138 */       String dbtoken = null;
/*     */       
/* 140 */       com.ykkoo.pet.pojo.PetUserInfo userInfo = null;
/* 141 */       if (!StringUtils.isEmpty(tokenModel)) {
/* 142 */         userInfo = this.userInfoRepository.findByUserId(Integer.valueOf(tokenModel.getUserId()));
/*     */       }
/* 144 */       if (userInfo != null) {
/* 145 */         dbtoken = userInfo.getToken();
/*     */       }
/* 147 */       return (dbtoken != null) && (token.equals(dbtoken));
/*     */     } catch (Exception e) {
/* 149 */       e.printStackTrace();
/*     */     }
/* 151 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public TokenModel getUserToken(String token)
/*     */     throws UnsupportedEncodingException
/*     */   {
/* 158 */     com.auth0.jwt.JWTVerifier verifier = JWT.require(Algorithm.HMAC256("D34{ad!~3&>5}3_)(g^~LX,0FEm")).withIssuer("pet.ykkoo.com").build();
/* 159 */     DecodedJWT jwt = verifier.verify(token);
/* 160 */     Integer adminId = jwt.getClaim("user").asInt();
/* 161 */     if (adminId == null) {
/* 162 */       return null;
/*     */     }
/* 164 */     return new TokenModel(adminId.intValue(), jwt.getToken());
/*     */   }
/*     */   
/*     */ 
/*     */   public TokenModel createHospitalToken(PetHospitalInfo hospitalInfo)
/*     */   {
/* 170 */     String token = null;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 176 */       token = JWT.create().withIssuer("pet.ykkoo.com").withJWTId(java.util.UUID.randomUUID().toString().toUpperCase()).withClaim("hospital", hospitalInfo.getHospitalInfoId()).sign(Algorithm.HMAC256("f*HdDol&{:L6ad92odSsDffGod"));
/*     */     } catch (UnsupportedEncodingException e) {
/* 178 */       token = "error";
/*     */     }
/*     */     
/* 181 */     TokenModel model = new TokenModel(hospitalInfo.getHospitalInfoId().intValue(), token);
/* 182 */     hospitalInfo.setToken(model.getToken());
/* 183 */     this.hospitalInfoRepository.save(hospitalInfo);
/*     */     
/* 185 */     return model;
/*     */   }
/*     */   
/*     */   public boolean checkHospitalToken(String token)
/*     */   {
/* 190 */     if (StringUtils.isEmpty(token)) {
/* 191 */       return false;
/*     */     }
/*     */     try {
/* 194 */       TokenModel tokenModel = getHospitalToken(token);
/* 195 */       String dbtoken = null;
/*     */       
/* 197 */       PetHospitalInfo hospitalInfo = null;
/* 198 */       if (!StringUtils.isEmpty(tokenModel)) {
/* 199 */         hospitalInfo = this.hospitalInfoRepository.findByHospitalInfoId(tokenModel.getUserId());
/*     */       }
/* 201 */       if (hospitalInfo != null) {
/* 202 */         dbtoken = hospitalInfo.getToken();
/*     */       }
/* 204 */       return (dbtoken != null) && (token.equals(dbtoken));
/*     */     } catch (Exception e) {
/* 206 */       e.printStackTrace();
/*     */     }
/* 208 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public TokenModel getHospitalToken(String token)
/*     */     throws UnsupportedEncodingException
/*     */   {
/* 215 */     com.auth0.jwt.JWTVerifier verifier = JWT.require(Algorithm.HMAC256("f*HdDol&{:L6ad92odSsDffGod")).withIssuer("pet.ykkoo.com").build();
/* 216 */     DecodedJWT jwt = verifier.verify(token);
/* 217 */     Integer hospitalInfoId = jwt.getClaim("hospital").asInt();
/* 218 */     if (hospitalInfoId == null) {
/* 219 */       return null;
/*     */     }
/* 221 */     return new TokenModel(hospitalInfoId.intValue(), jwt.getToken());
/*     */   }
/*     */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/token/impl/TokenManageImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */