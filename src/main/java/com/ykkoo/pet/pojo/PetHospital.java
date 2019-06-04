/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_hospital")
/*    */ public class PetHospital { @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer hospitalId;
/*    */   private String hospitalName;
/*    */   private String longitude;
/*    */   private String latitude;
/*    */   private String region;
/*    */   private String detailedAddress;
/*    */   private String tel;
/*    */   
/* 17 */   public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; } public void setLongitude(String longitude) { this.longitude = longitude; } public void setLatitude(String latitude) { this.latitude = latitude; } public void setRegion(String region) { this.region = region; } public void setDetailedAddress(String detailedAddress) { this.detailedAddress = detailedAddress; } public void setTel(String tel) { this.tel = tel; } public void setHospitalType(Integer hospitalType) { this.hospitalType = hospitalType; } public void setHospitalScope(Integer hospitalScope) { this.hospitalScope = hospitalScope; } public void setCooperationState(Integer cooperationState) { this.cooperationState = cooperationState; } public void setHospitalHeadPortrait(String hospitalHeadPortrait) { this.hospitalHeadPortrait = hospitalHeadPortrait; } public void setHospitalIntroduction(String hospitalIntroduction) { this.hospitalIntroduction = hospitalIntroduction; } public void setScopeProtection(String scopeProtection) { this.scopeProtection = scopeProtection; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetHospital)) return false; PetHospital other = (PetHospital)o; if (!other.canEqual(this)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$hospitalName = getHospitalName();Object other$hospitalName = other.getHospitalName(); if (this$hospitalName == null ? other$hospitalName != null : !this$hospitalName.equals(other$hospitalName)) return false; Object this$longitude = getLongitude();Object other$longitude = other.getLongitude(); if (this$longitude == null ? other$longitude != null : !this$longitude.equals(other$longitude)) return false; Object this$latitude = getLatitude();Object other$latitude = other.getLatitude(); if (this$latitude == null ? other$latitude != null : !this$latitude.equals(other$latitude)) return false; Object this$region = getRegion();Object other$region = other.getRegion(); if (this$region == null ? other$region != null : !this$region.equals(other$region)) return false; Object this$detailedAddress = getDetailedAddress();Object other$detailedAddress = other.getDetailedAddress(); if (this$detailedAddress == null ? other$detailedAddress != null : !this$detailedAddress.equals(other$detailedAddress)) return false; Object this$tel = getTel();Object other$tel = other.getTel(); if (this$tel == null ? other$tel != null : !this$tel.equals(other$tel)) return false; Object this$hospitalType = getHospitalType();Object other$hospitalType = other.getHospitalType(); if (this$hospitalType == null ? other$hospitalType != null : !this$hospitalType.equals(other$hospitalType)) return false; Object this$hospitalScope = getHospitalScope();Object other$hospitalScope = other.getHospitalScope(); if (this$hospitalScope == null ? other$hospitalScope != null : !this$hospitalScope.equals(other$hospitalScope)) return false; Object this$cooperationState = getCooperationState();Object other$cooperationState = other.getCooperationState(); if (this$cooperationState == null ? other$cooperationState != null : !this$cooperationState.equals(other$cooperationState)) return false; Object this$hospitalHeadPortrait = getHospitalHeadPortrait();Object other$hospitalHeadPortrait = other.getHospitalHeadPortrait(); if (this$hospitalHeadPortrait == null ? other$hospitalHeadPortrait != null : !this$hospitalHeadPortrait.equals(other$hospitalHeadPortrait)) return false; Object this$hospitalIntroduction = getHospitalIntroduction();Object other$hospitalIntroduction = other.getHospitalIntroduction(); if (this$hospitalIntroduction == null ? other$hospitalIntroduction != null : !this$hospitalIntroduction.equals(other$hospitalIntroduction)) return false; Object this$scopeProtection = getScopeProtection();Object other$scopeProtection = other.getScopeProtection(); if (this$scopeProtection == null ? other$scopeProtection != null : !this$scopeProtection.equals(other$scopeProtection)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate();return this$updateDate == null ? other$updateDate == null : this$updateDate.equals(other$updateDate); } protected boolean canEqual(Object other) { return other instanceof PetHospital; } public int hashCode() { int PRIME = 59;int result = 1;Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $hospitalName = getHospitalName();result = result * 59 + ($hospitalName == null ? 43 : $hospitalName.hashCode());Object $longitude = getLongitude();result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());Object $latitude = getLatitude();result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());Object $region = getRegion();result = result * 59 + ($region == null ? 43 : $region.hashCode());Object $detailedAddress = getDetailedAddress();result = result * 59 + ($detailedAddress == null ? 43 : $detailedAddress.hashCode());Object $tel = getTel();result = result * 59 + ($tel == null ? 43 : $tel.hashCode());Object $hospitalType = getHospitalType();result = result * 59 + ($hospitalType == null ? 43 : $hospitalType.hashCode());Object $hospitalScope = getHospitalScope();result = result * 59 + ($hospitalScope == null ? 43 : $hospitalScope.hashCode());Object $cooperationState = getCooperationState();result = result * 59 + ($cooperationState == null ? 43 : $cooperationState.hashCode());Object $hospitalHeadPortrait = getHospitalHeadPortrait();result = result * 59 + ($hospitalHeadPortrait == null ? 43 : $hospitalHeadPortrait.hashCode());Object $hospitalIntroduction = getHospitalIntroduction();result = result * 59 + ($hospitalIntroduction == null ? 43 : $hospitalIntroduction.hashCode());Object $scopeProtection = getScopeProtection();result = result * 59 + ($scopeProtection == null ? 43 : $scopeProtection.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());return result; } public String toString() { return "PetHospital(hospitalId=" + getHospitalId() + ", hospitalName=" + getHospitalName() + ", longitude=" + getLongitude() + ", latitude=" + getLatitude() + ", region=" + getRegion() + ", detailedAddress=" + getDetailedAddress() + ", tel=" + getTel() + ", hospitalType=" + getHospitalType() + ", hospitalScope=" + getHospitalScope() + ", cooperationState=" + getCooperationState() + ", hospitalHeadPortrait=" + getHospitalHeadPortrait() + ", hospitalIntroduction=" + getHospitalIntroduction() + ", scopeProtection=" + getScopeProtection() + ", createDate=" + getCreateDate() + ", updateDate=" + getUpdateDate() + ")"; }
/*    */   
/*    */   private Integer hospitalType;
/*    */   private Integer hospitalScope;
/*    */   private Integer cooperationState;
/*    */   private String hospitalHeadPortrait;
/*    */   
/* 24 */   public Integer getHospitalId() { return this.hospitalId; }
/*    */   
/*    */   private String hospitalIntroduction;
/*    */   private String scopeProtection;
/*    */   
/* 29 */   public String getHospitalName() { return this.hospitalName; }
/*    */   
/*    */   private Date createDate;
/*    */   private Date updateDate;
/*    */   public String getLongitude() {
/* 34 */     return this.longitude;
/*    */   }
/*    */   
/*    */   public String getLatitude()
/*    */   {
/* 39 */     return this.latitude;
/*    */   }
/*    */   
/*    */   public String getRegion()
/*    */   {
/* 44 */     return this.region;
/*    */   }
/*    */   
/*    */   public String getDetailedAddress()
/*    */   {
/* 49 */     return this.detailedAddress;
/*    */   }
/*    */   
/*    */   public String getTel()
/*    */   {
/* 54 */     return this.tel;
/*    */   }
/*    */   
/*    */   public Integer getHospitalType()
/*    */   {
/* 59 */     return this.hospitalType;
/*    */   }
/*    */   
/*    */   public Integer getHospitalScope()
/*    */   {
/* 64 */     return this.hospitalScope;
/*    */   }
/*    */   
/*    */   public Integer getCooperationState() {
/* 68 */     return this.cooperationState;
/*    */   }
/*    */   
/*    */   public String getHospitalHeadPortrait() {
/* 72 */     return this.hospitalHeadPortrait;
/*    */   }
/*    */   
/*    */   public String getHospitalIntroduction() {
/* 76 */     return this.hospitalIntroduction;
/*    */   }
/*    */   
/*    */   public String getScopeProtection() {
/* 80 */     return this.scopeProtection;
/*    */   }
/*    */   
/*    */   public Date getCreateDate()
/*    */   {
/* 85 */     return this.createDate;
/*    */   }
/*    */   
/*    */   public Date getUpdateDate() {
/* 89 */     return this.updateDate;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospital.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */