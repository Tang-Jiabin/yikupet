/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import javax.persistence.GeneratedValue;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_animal")
/*    */ public class PetAnimal {
/*    */   @javax.persistence.Id
/*    */   @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer animalId;
/*    */   private String animalName;
/*    */   private String animalAge;
/*    */   
/* 15 */   public void setAnimalId(Integer animalId) { this.animalId = animalId; } public void setAnimalName(String animalName) { this.animalName = animalName; } public void setAnimalAge(String animalAge) { this.animalAge = animalAge; } public void setAnimalPhoto(String animalPhoto) { this.animalPhoto = animalPhoto; } public void setAnimalSpecies(Integer animalSpecies) { this.animalSpecies = animalSpecies; } public void setAnimalSex(Integer animalSex) { this.animalSex = animalSex; } public void setAnimalBreeds(String animalBreeds) { this.animalBreeds = animalBreeds; } public void setCertificatesType(String certificatesType) { this.certificatesType = certificatesType; } public void setCertificatesNo(String certificatesNo) { this.certificatesNo = certificatesNo; } public void setElectronicCard(String electronicCard) { this.electronicCard = electronicCard; } public void setSource(String source) { this.source = source; } public void setUserId(Integer userId) { this.userId = userId; } public void setInsuranceStatus(Integer insuranceStatus) { this.insuranceStatus = insuranceStatus; } public void setClaimsNumber(Integer claimsNumber) { this.claimsNumber = claimsNumber; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetAnimal)) return false; PetAnimal other = (PetAnimal)o; if (!other.canEqual(this)) return false; Object this$animalId = getAnimalId();Object other$animalId = other.getAnimalId(); if (this$animalId == null ? other$animalId != null : !this$animalId.equals(other$animalId)) return false; Object this$animalName = getAnimalName();Object other$animalName = other.getAnimalName(); if (this$animalName == null ? other$animalName != null : !this$animalName.equals(other$animalName)) return false; Object this$animalAge = getAnimalAge();Object other$animalAge = other.getAnimalAge(); if (this$animalAge == null ? other$animalAge != null : !this$animalAge.equals(other$animalAge)) return false; Object this$animalPhoto = getAnimalPhoto();Object other$animalPhoto = other.getAnimalPhoto(); if (this$animalPhoto == null ? other$animalPhoto != null : !this$animalPhoto.equals(other$animalPhoto)) return false; Object this$animalSpecies = getAnimalSpecies();Object other$animalSpecies = other.getAnimalSpecies(); if (this$animalSpecies == null ? other$animalSpecies != null : !this$animalSpecies.equals(other$animalSpecies)) return false; Object this$animalSex = getAnimalSex();Object other$animalSex = other.getAnimalSex(); if (this$animalSex == null ? other$animalSex != null : !this$animalSex.equals(other$animalSex)) return false; Object this$animalBreeds = getAnimalBreeds();Object other$animalBreeds = other.getAnimalBreeds(); if (this$animalBreeds == null ? other$animalBreeds != null : !this$animalBreeds.equals(other$animalBreeds)) return false; Object this$certificatesType = getCertificatesType();Object other$certificatesType = other.getCertificatesType(); if (this$certificatesType == null ? other$certificatesType != null : !this$certificatesType.equals(other$certificatesType)) return false; Object this$certificatesNo = getCertificatesNo();Object other$certificatesNo = other.getCertificatesNo(); if (this$certificatesNo == null ? other$certificatesNo != null : !this$certificatesNo.equals(other$certificatesNo)) return false; Object this$electronicCard = getElectronicCard();Object other$electronicCard = other.getElectronicCard(); if (this$electronicCard == null ? other$electronicCard != null : !this$electronicCard.equals(other$electronicCard)) return false; Object this$source = getSource();Object other$source = other.getSource(); if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false; Object this$userId = getUserId();Object other$userId = other.getUserId(); if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false; Object this$insuranceStatus = getInsuranceStatus();Object other$insuranceStatus = other.getInsuranceStatus(); if (this$insuranceStatus == null ? other$insuranceStatus != null : !this$insuranceStatus.equals(other$insuranceStatus)) return false; Object this$claimsNumber = getClaimsNumber();Object other$claimsNumber = other.getClaimsNumber();return this$claimsNumber == null ? other$claimsNumber == null : this$claimsNumber.equals(other$claimsNumber); } protected boolean canEqual(Object other) { return other instanceof PetAnimal; } public int hashCode() { int PRIME = 59;int result = 1;Object $animalId = getAnimalId();result = result * 59 + ($animalId == null ? 43 : $animalId.hashCode());Object $animalName = getAnimalName();result = result * 59 + ($animalName == null ? 43 : $animalName.hashCode());Object $animalAge = getAnimalAge();result = result * 59 + ($animalAge == null ? 43 : $animalAge.hashCode());Object $animalPhoto = getAnimalPhoto();result = result * 59 + ($animalPhoto == null ? 43 : $animalPhoto.hashCode());Object $animalSpecies = getAnimalSpecies();result = result * 59 + ($animalSpecies == null ? 43 : $animalSpecies.hashCode());Object $animalSex = getAnimalSex();result = result * 59 + ($animalSex == null ? 43 : $animalSex.hashCode());Object $animalBreeds = getAnimalBreeds();result = result * 59 + ($animalBreeds == null ? 43 : $animalBreeds.hashCode());Object $certificatesType = getCertificatesType();result = result * 59 + ($certificatesType == null ? 43 : $certificatesType.hashCode());Object $certificatesNo = getCertificatesNo();result = result * 59 + ($certificatesNo == null ? 43 : $certificatesNo.hashCode());Object $electronicCard = getElectronicCard();result = result * 59 + ($electronicCard == null ? 43 : $electronicCard.hashCode());Object $source = getSource();result = result * 59 + ($source == null ? 43 : $source.hashCode());Object $userId = getUserId();result = result * 59 + ($userId == null ? 43 : $userId.hashCode());Object $insuranceStatus = getInsuranceStatus();result = result * 59 + ($insuranceStatus == null ? 43 : $insuranceStatus.hashCode());Object $claimsNumber = getClaimsNumber();result = result * 59 + ($claimsNumber == null ? 43 : $claimsNumber.hashCode());return result; } public String toString() { return "PetAnimal(animalId=" + getAnimalId() + ", animalName=" + getAnimalName() + ", animalAge=" + getAnimalAge() + ", animalPhoto=" + getAnimalPhoto() + ", animalSpecies=" + getAnimalSpecies() + ", animalSex=" + getAnimalSex() + ", animalBreeds=" + getAnimalBreeds() + ", certificatesType=" + getCertificatesType() + ", certificatesNo=" + getCertificatesNo() + ", electronicCard=" + getElectronicCard() + ", source=" + getSource() + ", userId=" + getUserId() + ", insuranceStatus=" + getInsuranceStatus() + ", claimsNumber=" + getClaimsNumber() + ")"; }
/*    */   
/*    */ 
/*    */   private String animalPhoto;
/*    */   private Integer animalSpecies;
/*    */   private Integer animalSex;
/*    */   
/* 22 */   public Integer getAnimalId() { return this.animalId; }
/*    */   
/*    */   private String animalBreeds;
/*    */   private String certificatesType;
/*    */   
/* 27 */   public String getAnimalName() { return this.animalName; }
/*    */   
/*    */ 
/*    */   private String certificatesNo;
/*    */   
/* 32 */   public String getAnimalAge() { return this.animalAge; }
/*    */   
/*    */   private String electronicCard;
/*    */   private String source;
/*    */   
/* 37 */   public String getAnimalPhoto() { return this.animalPhoto; }
/*    */   
/*    */   private Integer userId;
/*    */   private Integer insuranceStatus;
/*    */   private Integer claimsNumber;
/* 42 */   public Integer getAnimalSpecies() { return this.animalSpecies; }
/*    */   
/*    */ 
/*    */   public Integer getAnimalSex()
/*    */   {
/* 47 */     return this.animalSex;
/*    */   }
/*    */   
/*    */   public String getAnimalBreeds()
/*    */   {
/* 52 */     return this.animalBreeds;
/*    */   }
/*    */   
/*    */   public String getCertificatesType()
/*    */   {
/* 57 */     return this.certificatesType;
/*    */   }
/*    */   
/*    */   public String getCertificatesNo() {
/* 61 */     return this.certificatesNo;
/*    */   }
/*    */   
/*    */   public String getElectronicCard() {
/* 65 */     return this.electronicCard;
/*    */   }
/*    */   
/*    */   public String getSource() {
/* 69 */     return this.source;
/*    */   }
/*    */   
/*    */   public Integer getUserId()
/*    */   {
/* 74 */     return this.userId;
/*    */   }
/*    */   
/*    */   public Integer getInsuranceStatus()
/*    */   {
/* 79 */     return this.insuranceStatus;
/*    */   }
/*    */   
/*    */   public Integer getClaimsNumber()
/*    */   {
/* 84 */     return this.claimsNumber;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetAnimal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */