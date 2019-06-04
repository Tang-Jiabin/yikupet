/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class PetAnimalVO
/*    */ {
/*    */   private Integer animalId;
/*    */   private String animalName;
/*    */   private String animalAge;
/*    */   private String animalPhoto;
/*    */   private Integer animalSpecies;
/*    */   private String electronicCard;
/*    */   private List<InsurancePolicyVO> insurancePolicyList;
/*    */   
/* 16 */   public void setAnimalId(Integer animalId) { this.animalId = animalId; } public void setAnimalName(String animalName) { this.animalName = animalName; } public void setAnimalAge(String animalAge) { this.animalAge = animalAge; } public void setAnimalPhoto(String animalPhoto) { this.animalPhoto = animalPhoto; } public void setAnimalSpecies(Integer animalSpecies) { this.animalSpecies = animalSpecies; } public void setElectronicCard(String electronicCard) { this.electronicCard = electronicCard; } public void setInsurancePolicyList(List<InsurancePolicyVO> insurancePolicyList) { this.insurancePolicyList = insurancePolicyList; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetAnimalVO)) return false; PetAnimalVO other = (PetAnimalVO)o; if (!other.canEqual(this)) return false; Object this$animalId = getAnimalId();Object other$animalId = other.getAnimalId(); if (this$animalId == null ? other$animalId != null : !this$animalId.equals(other$animalId)) return false; Object this$animalName = getAnimalName();Object other$animalName = other.getAnimalName(); if (this$animalName == null ? other$animalName != null : !this$animalName.equals(other$animalName)) return false; Object this$animalAge = getAnimalAge();Object other$animalAge = other.getAnimalAge(); if (this$animalAge == null ? other$animalAge != null : !this$animalAge.equals(other$animalAge)) return false; Object this$animalPhoto = getAnimalPhoto();Object other$animalPhoto = other.getAnimalPhoto(); if (this$animalPhoto == null ? other$animalPhoto != null : !this$animalPhoto.equals(other$animalPhoto)) return false; Object this$animalSpecies = getAnimalSpecies();Object other$animalSpecies = other.getAnimalSpecies(); if (this$animalSpecies == null ? other$animalSpecies != null : !this$animalSpecies.equals(other$animalSpecies)) return false; Object this$electronicCard = getElectronicCard();Object other$electronicCard = other.getElectronicCard(); if (this$electronicCard == null ? other$electronicCard != null : !this$electronicCard.equals(other$electronicCard)) return false; Object this$insurancePolicyList = getInsurancePolicyList();Object other$insurancePolicyList = other.getInsurancePolicyList();return this$insurancePolicyList == null ? other$insurancePolicyList == null : this$insurancePolicyList.equals(other$insurancePolicyList); } protected boolean canEqual(Object other) { return other instanceof PetAnimalVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $animalId = getAnimalId();result = result * 59 + ($animalId == null ? 43 : $animalId.hashCode());Object $animalName = getAnimalName();result = result * 59 + ($animalName == null ? 43 : $animalName.hashCode());Object $animalAge = getAnimalAge();result = result * 59 + ($animalAge == null ? 43 : $animalAge.hashCode());Object $animalPhoto = getAnimalPhoto();result = result * 59 + ($animalPhoto == null ? 43 : $animalPhoto.hashCode());Object $animalSpecies = getAnimalSpecies();result = result * 59 + ($animalSpecies == null ? 43 : $animalSpecies.hashCode());Object $electronicCard = getElectronicCard();result = result * 59 + ($electronicCard == null ? 43 : $electronicCard.hashCode());Object $insurancePolicyList = getInsurancePolicyList();result = result * 59 + ($insurancePolicyList == null ? 43 : $insurancePolicyList.hashCode());return result; } public String toString() { return "PetAnimalVO(animalId=" + getAnimalId() + ", animalName=" + getAnimalName() + ", animalAge=" + getAnimalAge() + ", animalPhoto=" + getAnimalPhoto() + ", animalSpecies=" + getAnimalSpecies() + ", electronicCard=" + getElectronicCard() + ", insurancePolicyList=" + getInsurancePolicyList() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public Integer getAnimalId()
/*    */   {
/* 22 */     return this.animalId;
/*    */   }
/*    */   
/*    */   public String getAnimalName() {
/* 26 */     return this.animalName;
/*    */   }
/*    */   
/*    */   public String getAnimalAge()
/*    */   {
/* 31 */     return this.animalAge;
/*    */   }
/*    */   
/*    */   public String getAnimalPhoto()
/*    */   {
/* 36 */     return this.animalPhoto;
/*    */   }
/*    */   
/*    */   public Integer getAnimalSpecies()
/*    */   {
/* 41 */     return this.animalSpecies;
/*    */   }
/*    */   
/*    */   public String getElectronicCard() {
/* 45 */     return this.electronicCard;
/*    */   }
/*    */   
/*    */   public List<InsurancePolicyVO> getInsurancePolicyList()
/*    */   {
/* 50 */     return this.insurancePolicyList;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/PetAnimalVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */