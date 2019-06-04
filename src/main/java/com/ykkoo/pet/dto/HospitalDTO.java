/*     */ package com.ykkoo.pet.dto;
/*     */ 
/*     */ 
/*     */ public class HospitalDTO
/*     */ {
/*     */   private Integer hospitalId;
/*     */   
/*     */   private String hospitalName;
/*     */   private String longitude;
/*     */   private String latitude;
/*     */   private String region;
/*     */   
/*  13 */   public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; } public void setLongitude(String longitude) { this.longitude = longitude; } public void setLatitude(String latitude) { this.latitude = latitude; } public void setRegion(String region) { this.region = region; } public void setDetailedAddress(String detailedAddress) { this.detailedAddress = detailedAddress; } public void setTel(String tel) { this.tel = tel; } public void setHospitalType(Integer hospitalType) { this.hospitalType = hospitalType; } public void setHospitalScope(Integer hospitalScope) { this.hospitalScope = hospitalScope; } public void setCooperationState(Integer cooperationState) { this.cooperationState = cooperationState; } public void setHospitalHeadPortrait(FileDTO hospitalHeadPortrait) { this.hospitalHeadPortrait = hospitalHeadPortrait; } public void setHospitalIntroduction(String hospitalIntroduction) { this.hospitalIntroduction = hospitalIntroduction; } public void setHospitalDetailsPic(FileUploadDTO hospitalDetailsPic) { this.hospitalDetailsPic = hospitalDetailsPic; } public void setScopeProtection(String scopeProtection) { this.scopeProtection = scopeProtection; } public void setBusinessLicense(FileUploadDTO businessLicense) { this.businessLicense = businessLicense; } public void setRebateRatio(Integer rebateRatio) { this.rebateRatio = rebateRatio; } public void setHospitalAccount(String hospitalAccount) { this.hospitalAccount = hospitalAccount; } public void setHospitalPassword(String hospitalPassword) { this.hospitalPassword = hospitalPassword; } public void setContacts(String contacts) { this.contacts = contacts; } public void setPhone(String phone) { this.phone = phone; } public void setInvitationCode(String invitationCode) { this.invitationCode = invitationCode; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof HospitalDTO)) return false; HospitalDTO other = (HospitalDTO)o; if (!other.canEqual(this)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$hospitalName = getHospitalName();Object other$hospitalName = other.getHospitalName(); if (this$hospitalName == null ? other$hospitalName != null : !this$hospitalName.equals(other$hospitalName)) return false; Object this$longitude = getLongitude();Object other$longitude = other.getLongitude(); if (this$longitude == null ? other$longitude != null : !this$longitude.equals(other$longitude)) return false; Object this$latitude = getLatitude();Object other$latitude = other.getLatitude(); if (this$latitude == null ? other$latitude != null : !this$latitude.equals(other$latitude)) return false; Object this$region = getRegion();Object other$region = other.getRegion(); if (this$region == null ? other$region != null : !this$region.equals(other$region)) return false; Object this$detailedAddress = getDetailedAddress();Object other$detailedAddress = other.getDetailedAddress(); if (this$detailedAddress == null ? other$detailedAddress != null : !this$detailedAddress.equals(other$detailedAddress)) return false; Object this$tel = getTel();Object other$tel = other.getTel(); if (this$tel == null ? other$tel != null : !this$tel.equals(other$tel)) return false; Object this$hospitalType = getHospitalType();Object other$hospitalType = other.getHospitalType(); if (this$hospitalType == null ? other$hospitalType != null : !this$hospitalType.equals(other$hospitalType)) return false; Object this$hospitalScope = getHospitalScope();Object other$hospitalScope = other.getHospitalScope(); if (this$hospitalScope == null ? other$hospitalScope != null : !this$hospitalScope.equals(other$hospitalScope)) return false; Object this$cooperationState = getCooperationState();Object other$cooperationState = other.getCooperationState(); if (this$cooperationState == null ? other$cooperationState != null : !this$cooperationState.equals(other$cooperationState)) return false; Object this$hospitalHeadPortrait = getHospitalHeadPortrait();Object other$hospitalHeadPortrait = other.getHospitalHeadPortrait(); if (this$hospitalHeadPortrait == null ? other$hospitalHeadPortrait != null : !this$hospitalHeadPortrait.equals(other$hospitalHeadPortrait)) return false; Object this$hospitalIntroduction = getHospitalIntroduction();Object other$hospitalIntroduction = other.getHospitalIntroduction(); if (this$hospitalIntroduction == null ? other$hospitalIntroduction != null : !this$hospitalIntroduction.equals(other$hospitalIntroduction)) return false; Object this$hospitalDetailsPic = getHospitalDetailsPic();Object other$hospitalDetailsPic = other.getHospitalDetailsPic(); if (this$hospitalDetailsPic == null ? other$hospitalDetailsPic != null : !this$hospitalDetailsPic.equals(other$hospitalDetailsPic)) return false; Object this$scopeProtection = getScopeProtection();Object other$scopeProtection = other.getScopeProtection(); if (this$scopeProtection == null ? other$scopeProtection != null : !this$scopeProtection.equals(other$scopeProtection)) return false; Object this$businessLicense = getBusinessLicense();Object other$businessLicense = other.getBusinessLicense(); if (this$businessLicense == null ? other$businessLicense != null : !this$businessLicense.equals(other$businessLicense)) return false; Object this$rebateRatio = getRebateRatio();Object other$rebateRatio = other.getRebateRatio(); if (this$rebateRatio == null ? other$rebateRatio != null : !this$rebateRatio.equals(other$rebateRatio)) return false; Object this$hospitalAccount = getHospitalAccount();Object other$hospitalAccount = other.getHospitalAccount(); if (this$hospitalAccount == null ? other$hospitalAccount != null : !this$hospitalAccount.equals(other$hospitalAccount)) return false; Object this$hospitalPassword = getHospitalPassword();Object other$hospitalPassword = other.getHospitalPassword(); if (this$hospitalPassword == null ? other$hospitalPassword != null : !this$hospitalPassword.equals(other$hospitalPassword)) return false; Object this$contacts = getContacts();Object other$contacts = other.getContacts(); if (this$contacts == null ? other$contacts != null : !this$contacts.equals(other$contacts)) return false; Object this$phone = getPhone();Object other$phone = other.getPhone(); if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false; Object this$invitationCode = getInvitationCode();Object other$invitationCode = other.getInvitationCode();return this$invitationCode == null ? other$invitationCode == null : this$invitationCode.equals(other$invitationCode); } protected boolean canEqual(Object other) { return other instanceof HospitalDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $hospitalName = getHospitalName();result = result * 59 + ($hospitalName == null ? 43 : $hospitalName.hashCode());Object $longitude = getLongitude();result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());Object $latitude = getLatitude();result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());Object $region = getRegion();result = result * 59 + ($region == null ? 43 : $region.hashCode());Object $detailedAddress = getDetailedAddress();result = result * 59 + ($detailedAddress == null ? 43 : $detailedAddress.hashCode());Object $tel = getTel();result = result * 59 + ($tel == null ? 43 : $tel.hashCode());Object $hospitalType = getHospitalType();result = result * 59 + ($hospitalType == null ? 43 : $hospitalType.hashCode());Object $hospitalScope = getHospitalScope();result = result * 59 + ($hospitalScope == null ? 43 : $hospitalScope.hashCode());Object $cooperationState = getCooperationState();result = result * 59 + ($cooperationState == null ? 43 : $cooperationState.hashCode());Object $hospitalHeadPortrait = getHospitalHeadPortrait();result = result * 59 + ($hospitalHeadPortrait == null ? 43 : $hospitalHeadPortrait.hashCode());Object $hospitalIntroduction = getHospitalIntroduction();result = result * 59 + ($hospitalIntroduction == null ? 43 : $hospitalIntroduction.hashCode());Object $hospitalDetailsPic = getHospitalDetailsPic();result = result * 59 + ($hospitalDetailsPic == null ? 43 : $hospitalDetailsPic.hashCode());Object $scopeProtection = getScopeProtection();result = result * 59 + ($scopeProtection == null ? 43 : $scopeProtection.hashCode());Object $businessLicense = getBusinessLicense();result = result * 59 + ($businessLicense == null ? 43 : $businessLicense.hashCode());Object $rebateRatio = getRebateRatio();result = result * 59 + ($rebateRatio == null ? 43 : $rebateRatio.hashCode());Object $hospitalAccount = getHospitalAccount();result = result * 59 + ($hospitalAccount == null ? 43 : $hospitalAccount.hashCode());Object $hospitalPassword = getHospitalPassword();result = result * 59 + ($hospitalPassword == null ? 43 : $hospitalPassword.hashCode());Object $contacts = getContacts();result = result * 59 + ($contacts == null ? 43 : $contacts.hashCode());Object $phone = getPhone();result = result * 59 + ($phone == null ? 43 : $phone.hashCode());Object $invitationCode = getInvitationCode();result = result * 59 + ($invitationCode == null ? 43 : $invitationCode.hashCode());return result; } public String toString() { return "HospitalDTO(hospitalId=" + getHospitalId() + ", hospitalName=" + getHospitalName() + ", longitude=" + getLongitude() + ", latitude=" + getLatitude() + ", region=" + getRegion() + ", detailedAddress=" + getDetailedAddress() + ", tel=" + getTel() + ", hospitalType=" + getHospitalType() + ", hospitalScope=" + getHospitalScope() + ", cooperationState=" + getCooperationState() + ", hospitalHeadPortrait=" + getHospitalHeadPortrait() + ", hospitalIntroduction=" + getHospitalIntroduction() + ", hospitalDetailsPic=" + getHospitalDetailsPic() + ", scopeProtection=" + getScopeProtection() + ", businessLicense=" + getBusinessLicense() + ", rebateRatio=" + getRebateRatio() + ", hospitalAccount=" + getHospitalAccount() + ", hospitalPassword=" + getHospitalPassword() + ", contacts=" + getContacts() + ", phone=" + getPhone() + ", invitationCode=" + getInvitationCode() + ")"; }
/*     */   
/*     */   private String detailedAddress;
/*     */   private String tel;
/*     */   
/*     */   public Integer getHospitalId() {
/*  19 */     return this.hospitalId;
/*     */   }
/*     */   
/*     */   public String getHospitalName()
/*     */   {
/*  24 */     return this.hospitalName;
/*     */   }
/*     */   
/*     */   public String getLongitude()
/*     */   {
/*  29 */     return this.longitude;
/*     */   }
/*     */   
/*     */   public String getLatitude()
/*     */   {
/*  34 */     return this.latitude;
/*     */   }
/*     */   
/*     */   public String getRegion()
/*     */   {
/*  39 */     return this.region;
/*     */   }
/*     */   
/*     */   public String getDetailedAddress()
/*     */   {
/*  44 */     return this.detailedAddress;
/*     */   }
/*     */   
/*     */   public String getTel()
/*     */   {
/*  49 */     return this.tel;
/*     */   }
/*     */   
/*     */   public Integer getHospitalType()
/*     */   {
/*  54 */     return this.hospitalType;
/*     */   }
/*     */   
/*     */   public Integer getHospitalScope()
/*     */   {
/*  59 */     return this.hospitalScope;
/*     */   }
/*     */   
/*     */   public Integer getCooperationState() {
/*  63 */     return this.cooperationState;
/*     */   }
/*     */   
/*     */   public FileDTO getHospitalHeadPortrait()
/*     */   {
/*  68 */     return this.hospitalHeadPortrait;
/*     */   }
/*     */   
/*     */   public String getHospitalIntroduction() {
/*  72 */     return this.hospitalIntroduction;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  77 */   public FileUploadDTO getHospitalDetailsPic() { return this.hospitalDetailsPic; }
/*     */   
/*     */   private Integer hospitalType;
/*     */   private Integer hospitalScope;
/*     */   private Integer cooperationState;
/*  82 */   public String getScopeProtection() { return this.scopeProtection; }
/*     */   
/*     */   private FileDTO hospitalHeadPortrait;
/*     */   private String hospitalIntroduction;
/*     */   private FileUploadDTO hospitalDetailsPic;
/*     */   private String scopeProtection;
/*     */   private FileUploadDTO businessLicense;
/*     */   
/*  90 */   public FileUploadDTO getBusinessLicense() { return this.businessLicense; }
/*     */   
/*     */ 
/*     */   private Integer rebateRatio;
/*     */   
/*  95 */   public Integer getRebateRatio() { return this.rebateRatio; }
/*     */   
/*     */   private String hospitalAccount;
/*     */   private String hospitalPassword;
/*     */   
/* 100 */   public String getHospitalAccount() { return this.hospitalAccount; }
/*     */   
/*     */   private String contacts;
/*     */   
/* 104 */   public String getHospitalPassword() { return this.hospitalPassword; }
/*     */   
/*     */   private String phone;
/*     */   private String invitationCode;
/*     */   public String getContacts() {
/* 109 */     return this.contacts;
/*     */   }
/*     */   
/*     */   public String getPhone() {
/* 113 */     return this.phone;
/*     */   }
/*     */   
/*     */   public String getInvitationCode() {
/* 117 */     return this.invitationCode;
/*     */   }
/*     */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/HospitalDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */