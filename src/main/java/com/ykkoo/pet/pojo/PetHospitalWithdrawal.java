/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_hospital_withdrawal")
/*    */ public class PetHospitalWithdrawal
/*    */ {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer withdrawalId;
/*    */   private Integer hospitalId;
/*    */   private Double amount;
/*    */   private String cardNumber;
/*    */   
/* 17 */   public void setWithdrawalId(Integer withdrawalId) { this.withdrawalId = withdrawalId; } public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setAmount(Double amount) { this.amount = amount; } public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; } public void setCardBank(String cardBank) { this.cardBank = cardBank; } public void setName(String name) { this.name = name; } public void setApplyDate(Date applyDate) { this.applyDate = applyDate; } public void setState(Integer state) { this.state = state; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetHospitalWithdrawal)) return false; PetHospitalWithdrawal other = (PetHospitalWithdrawal)o; if (!other.canEqual(this)) return false; Object this$withdrawalId = getWithdrawalId();Object other$withdrawalId = other.getWithdrawalId(); if (this$withdrawalId == null ? other$withdrawalId != null : !this$withdrawalId.equals(other$withdrawalId)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$amount = getAmount();Object other$amount = other.getAmount(); if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false; Object this$cardNumber = getCardNumber();Object other$cardNumber = other.getCardNumber(); if (this$cardNumber == null ? other$cardNumber != null : !this$cardNumber.equals(other$cardNumber)) return false; Object this$cardBank = getCardBank();Object other$cardBank = other.getCardBank(); if (this$cardBank == null ? other$cardBank != null : !this$cardBank.equals(other$cardBank)) return false; Object this$name = getName();Object other$name = other.getName(); if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false; Object this$applyDate = getApplyDate();Object other$applyDate = other.getApplyDate(); if (this$applyDate == null ? other$applyDate != null : !this$applyDate.equals(other$applyDate)) return false; Object this$state = getState();Object other$state = other.getState();return this$state == null ? other$state == null : this$state.equals(other$state); } protected boolean canEqual(Object other) { return other instanceof PetHospitalWithdrawal; } public int hashCode() { int PRIME = 59;int result = 1;Object $withdrawalId = getWithdrawalId();result = result * 59 + ($withdrawalId == null ? 43 : $withdrawalId.hashCode());Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $amount = getAmount();result = result * 59 + ($amount == null ? 43 : $amount.hashCode());Object $cardNumber = getCardNumber();result = result * 59 + ($cardNumber == null ? 43 : $cardNumber.hashCode());Object $cardBank = getCardBank();result = result * 59 + ($cardBank == null ? 43 : $cardBank.hashCode());Object $name = getName();result = result * 59 + ($name == null ? 43 : $name.hashCode());Object $applyDate = getApplyDate();result = result * 59 + ($applyDate == null ? 43 : $applyDate.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());return result; } public String toString() { return "PetHospitalWithdrawal(withdrawalId=" + getWithdrawalId() + ", hospitalId=" + getHospitalId() + ", amount=" + getAmount() + ", cardNumber=" + getCardNumber() + ", cardBank=" + getCardBank() + ", name=" + getName() + ", applyDate=" + getApplyDate() + ", state=" + getState() + ")"; }
/*    */   
/*    */   private String cardBank;
/*    */   private String name;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
/*    */   private Date applyDate;
/*    */   private Integer state;
/* 24 */   public Integer getWithdrawalId() { return this.withdrawalId; }
/*    */   
/*    */ 
/*    */   public Integer getHospitalId()
/*    */   {
/* 29 */     return this.hospitalId;
/*    */   }
/*    */   
/*    */   public Double getAmount()
/*    */   {
/* 34 */     return this.amount;
/*    */   }
/*    */   
/*    */   public String getCardNumber() {
/* 38 */     return this.cardNumber;
/*    */   }
/*    */   
/*    */   public String getCardBank() {
/* 42 */     return this.cardBank;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 46 */     return this.name;
/*    */   }
/*    */   
/*    */   public Date getApplyDate()
/*    */   {
/* 51 */     return this.applyDate;
/*    */   }
/*    */   
/*    */   public Integer getState()
/*    */   {
/* 56 */     return this.state;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospitalWithdrawal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */