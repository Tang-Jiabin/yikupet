/*     */ package com.ykkoo.pet.vo;
/*     */ 
/*     */ import com.ykkoo.pet.pojo.PetFile;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HospitalVO
/*     */ {
/*     */   private Integer hospitalId;
/*     */   private String hospitalName;
/*     */   private String longitude;
/*     */   private String latitude;
/*     */   private String region;
/*     */   private String detailedAddress;
/*     */   private String tel;
/*     */   private Integer hospitalType;
/*     */   
/*  19 */   public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; } public void setLongitude(String longitude) { this.longitude = longitude; } public void setLatitude(String latitude) { this.latitude = latitude; } public void setRegion(String region) { this.region = region; } public void setDetailedAddress(String detailedAddress) { this.detailedAddress = detailedAddress; } public void setTel(String tel) { this.tel = tel; } public void setHospitalType(Integer hospitalType) { this.hospitalType = hospitalType; } public void setHospitalScope(Integer hospitalScope) { this.hospitalScope = hospitalScope; } public void setCooperationState(Integer cooperationState) { this.cooperationState = cooperationState; } public void setHospitalHeadPortrait(String hospitalHeadPortrait) { this.hospitalHeadPortrait = hospitalHeadPortrait; } public void setHospitalIntroduction(String hospitalIntroduction) { this.hospitalIntroduction = hospitalIntroduction; } public void setScopeProtection(String scopeProtection) { this.scopeProtection = scopeProtection; } public void setHospitalDetailsPic(List<PetFile> hospitalDetailsPic) { this.hospitalDetailsPic = hospitalDetailsPic; } public void setBusinessLicense(List<PetFile> businessLicense) { this.businessLicense = businessLicense; } public void setCreateDate(java.util.Date createDate) { this.createDate = createDate; } public void setHospitalInfoVO(HospitalInfoVO hospitalInfoVO) { this.hospitalInfoVO = hospitalInfoVO; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof HospitalVO)) return false; HospitalVO other = (HospitalVO)o; if (!other.canEqual(this)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$hospitalName = getHospitalName();Object other$hospitalName = other.getHospitalName(); if (this$hospitalName == null ? other$hospitalName != null : !this$hospitalName.equals(other$hospitalName)) return false; Object this$longitude = getLongitude();Object other$longitude = other.getLongitude(); if (this$longitude == null ? other$longitude != null : !this$longitude.equals(other$longitude)) return false; Object this$latitude = getLatitude();Object other$latitude = other.getLatitude(); if (this$latitude == null ? other$latitude != null : !this$latitude.equals(other$latitude)) return false; Object this$region = getRegion();Object other$region = other.getRegion(); if (this$region == null ? other$region != null : !this$region.equals(other$region)) return false; Object this$detailedAddress = getDetailedAddress();Object other$detailedAddress = other.getDetailedAddress(); if (this$detailedAddress == null ? other$detailedAddress != null : !this$detailedAddress.equals(other$detailedAddress)) return false; Object this$tel = getTel();Object other$tel = other.getTel(); if (this$tel == null ? other$tel != null : !this$tel.equals(other$tel)) return false; Object this$hospitalType = getHospitalType();Object other$hospitalType = other.getHospitalType(); if (this$hospitalType == null ? other$hospitalType != null : !this$hospitalType.equals(other$hospitalType)) return false; Object this$hospitalScope = getHospitalScope();Object other$hospitalScope = other.getHospitalScope(); if (this$hospitalScope == null ? other$hospitalScope != null : !this$hospitalScope.equals(other$hospitalScope)) return false; Object this$cooperationState = getCooperationState();Object other$cooperationState = other.getCooperationState(); if (this$cooperationState == null ? other$cooperationState != null : !this$cooperationState.equals(other$cooperationState)) return false; Object this$hospitalHeadPortrait = getHospitalHeadPortrait();Object other$hospitalHeadPortrait = other.getHospitalHeadPortrait(); if (this$hospitalHeadPortrait == null ? other$hospitalHeadPortrait != null : !this$hospitalHeadPortrait.equals(other$hospitalHeadPortrait)) return false; Object this$hospitalIntroduction = getHospitalIntroduction();Object other$hospitalIntroduction = other.getHospitalIntroduction(); if (this$hospitalIntroduction == null ? other$hospitalIntroduction != null : !this$hospitalIntroduction.equals(other$hospitalIntroduction)) return false; Object this$scopeProtection = getScopeProtection();Object other$scopeProtection = other.getScopeProtection(); if (this$scopeProtection == null ? other$scopeProtection != null : !this$scopeProtection.equals(other$scopeProtection)) return false; Object this$hospitalDetailsPic = getHospitalDetailsPic();Object other$hospitalDetailsPic = other.getHospitalDetailsPic(); if (this$hospitalDetailsPic == null ? other$hospitalDetailsPic != null : !this$hospitalDetailsPic.equals(other$hospitalDetailsPic)) return false; Object this$businessLicense = getBusinessLicense();Object other$businessLicense = other.getBusinessLicense(); if (this$businessLicense == null ? other$businessLicense != null : !this$businessLicense.equals(other$businessLicense)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$hospitalInfoVO = getHospitalInfoVO();Object other$hospitalInfoVO = other.getHospitalInfoVO();return this$hospitalInfoVO == null ? other$hospitalInfoVO == null : this$hospitalInfoVO.equals(other$hospitalInfoVO); } protected boolean canEqual(Object other) { return other instanceof HospitalVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $hospitalName = getHospitalName();result = result * 59 + ($hospitalName == null ? 43 : $hospitalName.hashCode());Object $longitude = getLongitude();result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());Object $latitude = getLatitude();result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());Object $region = getRegion();result = result * 59 + ($region == null ? 43 : $region.hashCode());Object $detailedAddress = getDetailedAddress();result = result * 59 + ($detailedAddress == null ? 43 : $detailedAddress.hashCode());Object $tel = getTel();result = result * 59 + ($tel == null ? 43 : $tel.hashCode());Object $hospitalType = getHospitalType();result = result * 59 + ($hospitalType == null ? 43 : $hospitalType.hashCode());Object $hospitalScope = getHospitalScope();result = result * 59 + ($hospitalScope == null ? 43 : $hospitalScope.hashCode());Object $cooperationState = getCooperationState();result = result * 59 + ($cooperationState == null ? 43 : $cooperationState.hashCode());Object $hospitalHeadPortrait = getHospitalHeadPortrait();result = result * 59 + ($hospitalHeadPortrait == null ? 43 : $hospitalHeadPortrait.hashCode());Object $hospitalIntroduction = getHospitalIntroduction();result = result * 59 + ($hospitalIntroduction == null ? 43 : $hospitalIntroduction.hashCode());Object $scopeProtection = getScopeProtection();result = result * 59 + ($scopeProtection == null ? 43 : $scopeProtection.hashCode());Object $hospitalDetailsPic = getHospitalDetailsPic();result = result * 59 + ($hospitalDetailsPic == null ? 43 : $hospitalDetailsPic.hashCode());Object $businessLicense = getBusinessLicense();result = result * 59 + ($businessLicense == null ? 43 : $businessLicense.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $hospitalInfoVO = getHospitalInfoVO();result = result * 59 + ($hospitalInfoVO == null ? 43 : $hospitalInfoVO.hashCode());return result; } public String toString() { return "HospitalVO(hospitalId=" + getHospitalId() + ", hospitalName=" + getHospitalName() + ", longitude=" + getLongitude() + ", latitude=" + getLatitude() + ", region=" + getRegion() + ", detailedAddress=" + getDetailedAddress() + ", tel=" + getTel() + ", hospitalType=" + getHospitalType() + ", hospitalScope=" + getHospitalScope() + ", cooperationState=" + getCooperationState() + ", hospitalHeadPortrait=" + getHospitalHeadPortrait() + ", hospitalIntroduction=" + getHospitalIntroduction() + ", scopeProtection=" + getScopeProtection() + ", hospitalDetailsPic=" + getHospitalDetailsPic() + ", businessLicense=" + getBusinessLicense() + ", createDate=" + getCreateDate() + ", hospitalInfoVO=" + getHospitalInfoVO() + ")"; }
/*     */   
/*     */   public Integer getHospitalId() {
/*  22 */     return this.hospitalId;
/*     */   }
/*     */   
/*     */   public String getHospitalName()
/*     */   {
/*  27 */     return this.hospitalName;
/*     */   }
/*     */   
/*     */   public String getLongitude()
/*     */   {
/*  32 */     return this.longitude;
/*     */   }
/*     */   
/*     */   public String getLatitude()
/*     */   {
/*  37 */     return this.latitude;
/*     */   }
/*     */   
/*     */   public String getRegion()
/*     */   {
/*  42 */     return this.region;
/*     */   }
/*     */   
/*     */   public String getDetailedAddress()
/*     */   {
/*  47 */     return this.detailedAddress;
/*     */   }
/*     */   
/*     */   public String getTel()
/*     */   {
/*  52 */     return this.tel;
/*     */   }
/*     */   
/*     */   public Integer getHospitalType()
/*     */   {
/*  57 */     return this.hospitalType;
/*     */   }
/*     */   
/*     */   public Integer getHospitalScope()
/*     */   {
/*  62 */     return this.hospitalScope;
/*     */   }
/*     */   
/*     */   public Integer getCooperationState() {
/*  66 */     return this.cooperationState;
/*     */   }
/*     */   
/*     */   public String getHospitalHeadPortrait()
/*     */   {
/*  71 */     return this.hospitalHeadPortrait;
/*     */   }
/*     */   
/*     */   public String getHospitalIntroduction() {
/*  75 */     return this.hospitalIntroduction;
/*     */   }
/*     */   
/*     */   public String getScopeProtection()
/*     */   {
/*  80 */     return this.scopeProtection;
/*     */   }
/*     */   
/*     */   public List<PetFile> getHospitalDetailsPic()
/*     */   {
/*  85 */     return this.hospitalDetailsPic;
/*     */   }
/*     */   
/*     */   public List<PetFile> getBusinessLicense()
/*     */   {
/*  90 */     return this.businessLicense;
/*     */   }
/*     */   
/*     */   private Integer hospitalScope;
/*     */   private Integer cooperationState;
/*     */   
/*  96 */   public java.util.Date getCreateDate() { return this.createDate; }
/*     */   
/*     */   private String hospitalHeadPortrait;
/*     */   private String hospitalIntroduction;
/*     */   
/* 101 */   public HospitalInfoVO getHospitalInfoVO() { return this.hospitalInfoVO; }
/*     */   
/*     */   private String scopeProtection;
/*     */   private List<PetFile> hospitalDetailsPic;
/*     */   private List<PetFile> businessLicense;
/*     */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*     */   private java.util.Date createDate;
/*     */   private HospitalInfoVO hospitalInfoVO;
/*     */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/HospitalVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */