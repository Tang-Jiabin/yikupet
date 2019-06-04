/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ 
/*    */ public class InsurancePolicyDTO
/*    */ {
/*    */   private Integer insuranceId;
/*    */   
/*    */   private String realName;
/*    */   private String identityCard;
/*    */   private String phone;
/*    */   private String petName;
/*    */   
/* 13 */   public void setInsuranceId(Integer insuranceId) { this.insuranceId = insuranceId; } public void setRealName(String realName) { this.realName = realName; } public void setIdentityCard(String identityCard) { this.identityCard = identityCard; } public void setPhone(String phone) { this.phone = phone; } public void setPetName(String petName) { this.petName = petName; } public void setPetAge(String petAge) { this.petAge = petAge; } public void setPetBreeds(String petBreeds) { this.petBreeds = petBreeds; } public void setPetInfo(String petInfo) { this.petInfo = petInfo; } public void setInvitationCode(String invitationCode) { this.invitationCode = invitationCode; } public void setIp(String ip) { this.ip = ip; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof InsurancePolicyDTO)) return false; InsurancePolicyDTO other = (InsurancePolicyDTO)o; if (!other.canEqual(this)) return false; Object this$insuranceId = getInsuranceId();Object other$insuranceId = other.getInsuranceId(); if (this$insuranceId == null ? other$insuranceId != null : !this$insuranceId.equals(other$insuranceId)) return false; Object this$realName = getRealName();Object other$realName = other.getRealName(); if (this$realName == null ? other$realName != null : !this$realName.equals(other$realName)) return false; Object this$identityCard = getIdentityCard();Object other$identityCard = other.getIdentityCard(); if (this$identityCard == null ? other$identityCard != null : !this$identityCard.equals(other$identityCard)) return false; Object this$phone = getPhone();Object other$phone = other.getPhone(); if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false; Object this$petName = getPetName();Object other$petName = other.getPetName(); if (this$petName == null ? other$petName != null : !this$petName.equals(other$petName)) return false; Object this$petAge = getPetAge();Object other$petAge = other.getPetAge(); if (this$petAge == null ? other$petAge != null : !this$petAge.equals(other$petAge)) return false; Object this$petBreeds = getPetBreeds();Object other$petBreeds = other.getPetBreeds(); if (this$petBreeds == null ? other$petBreeds != null : !this$petBreeds.equals(other$petBreeds)) return false; Object this$petInfo = getPetInfo();Object other$petInfo = other.getPetInfo(); if (this$petInfo == null ? other$petInfo != null : !this$petInfo.equals(other$petInfo)) return false; Object this$invitationCode = getInvitationCode();Object other$invitationCode = other.getInvitationCode(); if (this$invitationCode == null ? other$invitationCode != null : !this$invitationCode.equals(other$invitationCode)) return false; Object this$ip = getIp();Object other$ip = other.getIp();return this$ip == null ? other$ip == null : this$ip.equals(other$ip); } protected boolean canEqual(Object other) { return other instanceof InsurancePolicyDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $insuranceId = getInsuranceId();result = result * 59 + ($insuranceId == null ? 43 : $insuranceId.hashCode());Object $realName = getRealName();result = result * 59 + ($realName == null ? 43 : $realName.hashCode());Object $identityCard = getIdentityCard();result = result * 59 + ($identityCard == null ? 43 : $identityCard.hashCode());Object $phone = getPhone();result = result * 59 + ($phone == null ? 43 : $phone.hashCode());Object $petName = getPetName();result = result * 59 + ($petName == null ? 43 : $petName.hashCode());Object $petAge = getPetAge();result = result * 59 + ($petAge == null ? 43 : $petAge.hashCode());Object $petBreeds = getPetBreeds();result = result * 59 + ($petBreeds == null ? 43 : $petBreeds.hashCode());Object $petInfo = getPetInfo();result = result * 59 + ($petInfo == null ? 43 : $petInfo.hashCode());Object $invitationCode = getInvitationCode();result = result * 59 + ($invitationCode == null ? 43 : $invitationCode.hashCode());Object $ip = getIp();result = result * 59 + ($ip == null ? 43 : $ip.hashCode());return result; } public String toString() { return "InsurancePolicyDTO(insuranceId=" + getInsuranceId() + ", realName=" + getRealName() + ", identityCard=" + getIdentityCard() + ", phone=" + getPhone() + ", petName=" + getPetName() + ", petAge=" + getPetAge() + ", petBreeds=" + getPetBreeds() + ", petInfo=" + getPetInfo() + ", invitationCode=" + getInvitationCode() + ", ip=" + getIp() + ")"; }
/*    */   
/*    */ 
/*    */   private String petAge;
/*    */   private String petBreeds;
/*    */   
/* 19 */   public Integer getInsuranceId() { return this.insuranceId; }
/*    */   
/*    */   private String petInfo;
/*    */   private String invitationCode;
/*    */   private String ip;
/* 24 */   public String getRealName() { return this.realName; }
/*    */   
/*    */ 
/*    */   public String getIdentityCard()
/*    */   {
/* 29 */     return this.identityCard;
/*    */   }
/*    */   
/*    */   public String getPhone()
/*    */   {
/* 34 */     return this.phone;
/*    */   }
/*    */   
/*    */   public String getPetName()
/*    */   {
/* 39 */     return this.petName;
/*    */   }
/*    */   
/*    */   public String getPetAge() {
/* 43 */     return this.petAge;
/*    */   }
/*    */   
/*    */   public String getPetBreeds()
/*    */   {
/* 48 */     return this.petBreeds;
/*    */   }
/*    */   
/*    */   public String getPetInfo()
/*    */   {
/* 53 */     return this.petInfo;
/*    */   }
/*    */   
/*    */   public String getInvitationCode()
/*    */   {
/* 58 */     return this.invitationCode;
/*    */   }
/*    */   
/*    */   public String getIp()
/*    */   {
/* 63 */     return this.ip;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/InsurancePolicyDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */