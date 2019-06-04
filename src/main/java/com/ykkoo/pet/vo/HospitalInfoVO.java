/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ 
/*    */ public class HospitalInfoVO
/*    */ {
/*    */   private Integer rebateRatio;
/*    */   private String hospitalAccount;
/*    */   private String hospitalPassword;
/*    */   private String contacts;
/*    */   private String phone;
/*    */   private String invitationCode;
/*    */   
/* 13 */   public void setRebateRatio(Integer rebateRatio) { this.rebateRatio = rebateRatio; } public void setHospitalAccount(String hospitalAccount) { this.hospitalAccount = hospitalAccount; } public void setHospitalPassword(String hospitalPassword) { this.hospitalPassword = hospitalPassword; } public void setContacts(String contacts) { this.contacts = contacts; } public void setPhone(String phone) { this.phone = phone; } public void setInvitationCode(String invitationCode) { this.invitationCode = invitationCode; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof HospitalInfoVO)) return false; HospitalInfoVO other = (HospitalInfoVO)o; if (!other.canEqual(this)) return false; Object this$rebateRatio = getRebateRatio();Object other$rebateRatio = other.getRebateRatio(); if (this$rebateRatio == null ? other$rebateRatio != null : !this$rebateRatio.equals(other$rebateRatio)) return false; Object this$hospitalAccount = getHospitalAccount();Object other$hospitalAccount = other.getHospitalAccount(); if (this$hospitalAccount == null ? other$hospitalAccount != null : !this$hospitalAccount.equals(other$hospitalAccount)) return false; Object this$hospitalPassword = getHospitalPassword();Object other$hospitalPassword = other.getHospitalPassword(); if (this$hospitalPassword == null ? other$hospitalPassword != null : !this$hospitalPassword.equals(other$hospitalPassword)) return false; Object this$contacts = getContacts();Object other$contacts = other.getContacts(); if (this$contacts == null ? other$contacts != null : !this$contacts.equals(other$contacts)) return false; Object this$phone = getPhone();Object other$phone = other.getPhone(); if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false; Object this$invitationCode = getInvitationCode();Object other$invitationCode = other.getInvitationCode();return this$invitationCode == null ? other$invitationCode == null : this$invitationCode.equals(other$invitationCode); } protected boolean canEqual(Object other) { return other instanceof HospitalInfoVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $rebateRatio = getRebateRatio();result = result * 59 + ($rebateRatio == null ? 43 : $rebateRatio.hashCode());Object $hospitalAccount = getHospitalAccount();result = result * 59 + ($hospitalAccount == null ? 43 : $hospitalAccount.hashCode());Object $hospitalPassword = getHospitalPassword();result = result * 59 + ($hospitalPassword == null ? 43 : $hospitalPassword.hashCode());Object $contacts = getContacts();result = result * 59 + ($contacts == null ? 43 : $contacts.hashCode());Object $phone = getPhone();result = result * 59 + ($phone == null ? 43 : $phone.hashCode());Object $invitationCode = getInvitationCode();result = result * 59 + ($invitationCode == null ? 43 : $invitationCode.hashCode());return result; } public String toString() { return "HospitalInfoVO(rebateRatio=" + getRebateRatio() + ", hospitalAccount=" + getHospitalAccount() + ", hospitalPassword=" + getHospitalPassword() + ", contacts=" + getContacts() + ", phone=" + getPhone() + ", invitationCode=" + getInvitationCode() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public Integer getRebateRatio()
/*    */   {
/* 19 */     return this.rebateRatio;
/*    */   }
/*    */   
/*    */   public String getHospitalAccount()
/*    */   {
/* 24 */     return this.hospitalAccount;
/*    */   }
/*    */   
/*    */   public String getHospitalPassword() {
/* 28 */     return this.hospitalPassword;
/*    */   }
/*    */   
/*    */   public String getContacts()
/*    */   {
/* 33 */     return this.contacts;
/*    */   }
/*    */   
/*    */   public String getPhone() {
/* 37 */     return this.phone;
/*    */   }
/*    */   
/*    */   public String getInvitationCode() {
/* 41 */     return this.invitationCode;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/HospitalInfoVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */