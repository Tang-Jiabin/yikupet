/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_admin")
/*    */ public class PetAdmin
/*    */ {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer adminId;
/*    */   private String adminName;
/*    */   private String adminAccount;
/*    */   
/* 16 */   public void setAdminId(Integer adminId) { this.adminId = adminId; } public void setAdminName(String adminName) { this.adminName = adminName; } public void setAdminAccount(String adminAccount) { this.adminAccount = adminAccount; } public void setAdminPassword(String adminPassword) { this.adminPassword = adminPassword; } public void setToken(String token) { this.token = token; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setCreateAdmin(Integer createAdmin) { this.createAdmin = createAdmin; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetAdmin)) return false; PetAdmin other = (PetAdmin)o; if (!other.canEqual(this)) return false; Object this$adminId = getAdminId();Object other$adminId = other.getAdminId(); if (this$adminId == null ? other$adminId != null : !this$adminId.equals(other$adminId)) return false; Object this$adminName = getAdminName();Object other$adminName = other.getAdminName(); if (this$adminName == null ? other$adminName != null : !this$adminName.equals(other$adminName)) return false; Object this$adminAccount = getAdminAccount();Object other$adminAccount = other.getAdminAccount(); if (this$adminAccount == null ? other$adminAccount != null : !this$adminAccount.equals(other$adminAccount)) return false; Object this$adminPassword = getAdminPassword();Object other$adminPassword = other.getAdminPassword(); if (this$adminPassword == null ? other$adminPassword != null : !this$adminPassword.equals(other$adminPassword)) return false; Object this$token = getToken();Object other$token = other.getToken(); if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$createAdmin = getCreateAdmin();Object other$createAdmin = other.getCreateAdmin();return this$createAdmin == null ? other$createAdmin == null : this$createAdmin.equals(other$createAdmin); } protected boolean canEqual(Object other) { return other instanceof PetAdmin; } public int hashCode() { int PRIME = 59;int result = 1;Object $adminId = getAdminId();result = result * 59 + ($adminId == null ? 43 : $adminId.hashCode());Object $adminName = getAdminName();result = result * 59 + ($adminName == null ? 43 : $adminName.hashCode());Object $adminAccount = getAdminAccount();result = result * 59 + ($adminAccount == null ? 43 : $adminAccount.hashCode());Object $adminPassword = getAdminPassword();result = result * 59 + ($adminPassword == null ? 43 : $adminPassword.hashCode());Object $token = getToken();result = result * 59 + ($token == null ? 43 : $token.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $createAdmin = getCreateAdmin();result = result * 59 + ($createAdmin == null ? 43 : $createAdmin.hashCode());return result; } public String toString() { return "PetAdmin(adminId=" + getAdminId() + ", adminName=" + getAdminName() + ", adminAccount=" + getAdminAccount() + ", adminPassword=" + getAdminPassword() + ", token=" + getToken() + ", createDate=" + getCreateDate() + ", createAdmin=" + getCreateAdmin() + ")"; }
/*    */   
/*    */ 
/*    */   private String adminPassword;
/*    */   private String token;
/*    */   private Date createDate;
/*    */   private Integer createAdmin;
/* 23 */   public Integer getAdminId() { return this.adminId; }
/*    */   
/* 25 */   public String getAdminName() { return this.adminName; }
/*    */   
/* 27 */   public String getAdminAccount() { return this.adminAccount; }
/*    */   
/* 29 */   public String getAdminPassword() { return this.adminPassword; }
/*    */   
/* 31 */   public String getToken() { return this.token; }
/*    */   
/* 33 */   public Date getCreateDate() { return this.createDate; }
/*    */   
/* 35 */   public Integer getCreateAdmin() { return this.createAdmin; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetAdmin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */