/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_hospital_info")
/*    */ public class PetHospitalInfo {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer hospitalInfoId;
/*    */   private Integer hospitalId;
/*    */   private Integer rebateRatio;
/*    */   private String hospitalAccount;
/*    */   private String hospitalPassword;
/*    */   
/* 16 */   public void setHospitalInfoId(Integer hospitalInfoId) { this.hospitalInfoId = hospitalInfoId; } public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setRebateRatio(Integer rebateRatio) { this.rebateRatio = rebateRatio; } public void setHospitalAccount(String hospitalAccount) { this.hospitalAccount = hospitalAccount; } public void setHospitalPassword(String hospitalPassword) { this.hospitalPassword = hospitalPassword; } public void setContacts(String contacts) { this.contacts = contacts; } public void setPhone(String phone) { this.phone = phone; } public void setInvitationCode(String invitationCode) { this.invitationCode = invitationCode; } public void setToken(String token) { this.token = token; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetHospitalInfo)) return false; PetHospitalInfo other = (PetHospitalInfo)o; if (!other.canEqual(this)) return false; Object this$hospitalInfoId = getHospitalInfoId();Object other$hospitalInfoId = other.getHospitalInfoId(); if (this$hospitalInfoId == null ? other$hospitalInfoId != null : !this$hospitalInfoId.equals(other$hospitalInfoId)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$rebateRatio = getRebateRatio();Object other$rebateRatio = other.getRebateRatio(); if (this$rebateRatio == null ? other$rebateRatio != null : !this$rebateRatio.equals(other$rebateRatio)) return false; Object this$hospitalAccount = getHospitalAccount();Object other$hospitalAccount = other.getHospitalAccount(); if (this$hospitalAccount == null ? other$hospitalAccount != null : !this$hospitalAccount.equals(other$hospitalAccount)) return false; Object this$hospitalPassword = getHospitalPassword();Object other$hospitalPassword = other.getHospitalPassword(); if (this$hospitalPassword == null ? other$hospitalPassword != null : !this$hospitalPassword.equals(other$hospitalPassword)) return false; Object this$contacts = getContacts();Object other$contacts = other.getContacts(); if (this$contacts == null ? other$contacts != null : !this$contacts.equals(other$contacts)) return false; Object this$phone = getPhone();Object other$phone = other.getPhone(); if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false; Object this$invitationCode = getInvitationCode();Object other$invitationCode = other.getInvitationCode(); if (this$invitationCode == null ? other$invitationCode != null : !this$invitationCode.equals(other$invitationCode)) return false; Object this$token = getToken();Object other$token = other.getToken(); if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate();return this$createDate == null ? other$createDate == null : this$createDate.equals(other$createDate); } protected boolean canEqual(Object other) { return other instanceof PetHospitalInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $hospitalInfoId = getHospitalInfoId();result = result * 59 + ($hospitalInfoId == null ? 43 : $hospitalInfoId.hashCode());Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $rebateRatio = getRebateRatio();result = result * 59 + ($rebateRatio == null ? 43 : $rebateRatio.hashCode());Object $hospitalAccount = getHospitalAccount();result = result * 59 + ($hospitalAccount == null ? 43 : $hospitalAccount.hashCode());Object $hospitalPassword = getHospitalPassword();result = result * 59 + ($hospitalPassword == null ? 43 : $hospitalPassword.hashCode());Object $contacts = getContacts();result = result * 59 + ($contacts == null ? 43 : $contacts.hashCode());Object $phone = getPhone();result = result * 59 + ($phone == null ? 43 : $phone.hashCode());Object $invitationCode = getInvitationCode();result = result * 59 + ($invitationCode == null ? 43 : $invitationCode.hashCode());Object $token = getToken();result = result * 59 + ($token == null ? 43 : $token.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());return result; } public String toString() { return "PetHospitalInfo(hospitalInfoId=" + getHospitalInfoId() + ", hospitalId=" + getHospitalId() + ", rebateRatio=" + getRebateRatio() + ", hospitalAccount=" + getHospitalAccount() + ", hospitalPassword=" + getHospitalPassword() + ", contacts=" + getContacts() + ", phone=" + getPhone() + ", invitationCode=" + getInvitationCode() + ", token=" + getToken() + ", createDate=" + getCreateDate() + ")"; }
/*    */   
/*    */   private String contacts;
/*    */   private String phone;
/*    */   private String invitationCode;
/*    */   private String token;
/*    */   private Date createDate;
/* 23 */   public Integer getHospitalInfoId() { return this.hospitalInfoId; }
/*    */   
/*    */ 
/*    */   public Integer getHospitalId()
/*    */   {
/* 28 */     return this.hospitalId;
/*    */   }
/*    */   
/*    */   public Integer getRebateRatio()
/*    */   {
/* 33 */     return this.rebateRatio;
/*    */   }
/*    */   
/*    */   public String getHospitalAccount()
/*    */   {
/* 38 */     return this.hospitalAccount;
/*    */   }
/*    */   
/*    */   public String getHospitalPassword() {
/* 42 */     return this.hospitalPassword;
/*    */   }
/*    */   
/*    */   public String getContacts()
/*    */   {
/* 47 */     return this.contacts;
/*    */   }
/*    */   
/*    */   public String getPhone() {
/* 51 */     return this.phone;
/*    */   }
/*    */   
/*    */   public String getInvitationCode() {
/* 55 */     return this.invitationCode;
/*    */   }
/*    */   
/*    */   public String getToken() {
/* 59 */     return this.token;
/*    */   }
/*    */   
/*    */   public Date getCreateDate()
/*    */   {
/* 64 */     return this.createDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospitalInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */