/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AdminDTO
/*    */ {
/*    */   private String adminName;
/*    */   
/*    */ 
/*    */   private String adminAccount;
/*    */   private String password;
/*    */   
/* 13 */   public void setAdminName(String adminName) { this.adminName = adminName; } public void setAdminAccount(String adminAccount) { this.adminAccount = adminAccount; } public void setPassword(String password) { this.password = password; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof AdminDTO)) return false; AdminDTO other = (AdminDTO)o; if (!other.canEqual(this)) return false; Object this$adminName = getAdminName();Object other$adminName = other.getAdminName(); if (this$adminName == null ? other$adminName != null : !this$adminName.equals(other$adminName)) return false; Object this$adminAccount = getAdminAccount();Object other$adminAccount = other.getAdminAccount(); if (this$adminAccount == null ? other$adminAccount != null : !this$adminAccount.equals(other$adminAccount)) return false; Object this$password = getPassword();Object other$password = other.getPassword();return this$password == null ? other$password == null : this$password.equals(other$password); } protected boolean canEqual(Object other) { return other instanceof AdminDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $adminName = getAdminName();result = result * 59 + ($adminName == null ? 43 : $adminName.hashCode());Object $adminAccount = getAdminAccount();result = result * 59 + ($adminAccount == null ? 43 : $adminAccount.hashCode());Object $password = getPassword();result = result * 59 + ($password == null ? 43 : $password.hashCode());return result; } public String toString() { return "AdminDTO(adminName=" + getAdminName() + ", adminAccount=" + getAdminAccount() + ", password=" + getPassword() + ")"; }
/*    */   
/*    */ 
/* 16 */   public String getAdminName() { return this.adminName; }
/*    */   
/* 18 */   public String getAdminAccount() { return this.adminAccount; }
/*    */   
/* 20 */   public String getPassword() { return this.password; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/AdminDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */