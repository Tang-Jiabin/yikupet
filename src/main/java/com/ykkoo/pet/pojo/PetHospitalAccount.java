/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_hospital_account")
/*    */ public class PetHospitalAccount {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer accountId;
/*    */   private Integer hospitalId;
/*    */   private Double money;
/*    */   private Integer type;
/*    */   
/* 16 */   public void setAccountId(Integer accountId) { this.accountId = accountId; } public void setHospitalId(Integer hospitalId) { this.hospitalId = hospitalId; } public void setMoney(Double money) { this.money = money; } public void setType(Integer type) { this.type = type; } public void setDate(Date date) { this.date = date; } public void setSource(String source) { this.source = source; } public void setRatio(Integer ratio) { this.ratio = ratio; } public void setState(Integer state) { this.state = state; } public void setWithdrawalId(Integer withdrawalId) { this.withdrawalId = withdrawalId; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetHospitalAccount)) return false; PetHospitalAccount other = (PetHospitalAccount)o; if (!other.canEqual(this)) return false; Object this$accountId = getAccountId();Object other$accountId = other.getAccountId(); if (this$accountId == null ? other$accountId != null : !this$accountId.equals(other$accountId)) return false; Object this$hospitalId = getHospitalId();Object other$hospitalId = other.getHospitalId(); if (this$hospitalId == null ? other$hospitalId != null : !this$hospitalId.equals(other$hospitalId)) return false; Object this$money = getMoney();Object other$money = other.getMoney(); if (this$money == null ? other$money != null : !this$money.equals(other$money)) return false; Object this$type = getType();Object other$type = other.getType(); if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false; Object this$date = getDate();Object other$date = other.getDate(); if (this$date == null ? other$date != null : !this$date.equals(other$date)) return false; Object this$source = getSource();Object other$source = other.getSource(); if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false; Object this$ratio = getRatio();Object other$ratio = other.getRatio(); if (this$ratio == null ? other$ratio != null : !this$ratio.equals(other$ratio)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$withdrawalId = getWithdrawalId();Object other$withdrawalId = other.getWithdrawalId();return this$withdrawalId == null ? other$withdrawalId == null : this$withdrawalId.equals(other$withdrawalId); } protected boolean canEqual(Object other) { return other instanceof PetHospitalAccount; } public int hashCode() { int PRIME = 59;int result = 1;Object $accountId = getAccountId();result = result * 59 + ($accountId == null ? 43 : $accountId.hashCode());Object $hospitalId = getHospitalId();result = result * 59 + ($hospitalId == null ? 43 : $hospitalId.hashCode());Object $money = getMoney();result = result * 59 + ($money == null ? 43 : $money.hashCode());Object $type = getType();result = result * 59 + ($type == null ? 43 : $type.hashCode());Object $date = getDate();result = result * 59 + ($date == null ? 43 : $date.hashCode());Object $source = getSource();result = result * 59 + ($source == null ? 43 : $source.hashCode());Object $ratio = getRatio();result = result * 59 + ($ratio == null ? 43 : $ratio.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $withdrawalId = getWithdrawalId();result = result * 59 + ($withdrawalId == null ? 43 : $withdrawalId.hashCode());return result; } public String toString() { return "PetHospitalAccount(accountId=" + getAccountId() + ", hospitalId=" + getHospitalId() + ", money=" + getMoney() + ", type=" + getType() + ", date=" + getDate() + ", source=" + getSource() + ", ratio=" + getRatio() + ", state=" + getState() + ", withdrawalId=" + getWithdrawalId() + ")"; }
/*    */   
/*    */   private Date date;
/*    */   private String source;
/*    */   private Integer ratio;
/*    */   private Integer state;
/*    */   private Integer withdrawalId;
/* 23 */   public Integer getAccountId() { return this.accountId; }
/*    */   
/*    */ 
/*    */   public Integer getHospitalId()
/*    */   {
/* 28 */     return this.hospitalId;
/*    */   }
/*    */   
/*    */   public Double getMoney()
/*    */   {
/* 33 */     return this.money;
/*    */   }
/*    */   
/*    */   public Integer getType()
/*    */   {
/* 38 */     return this.type;
/*    */   }
/*    */   
/*    */   public Date getDate()
/*    */   {
/* 43 */     return this.date;
/*    */   }
/*    */   
/*    */   public String getSource()
/*    */   {
/* 48 */     return this.source;
/*    */   }
/*    */   
/*    */   public Integer getRatio()
/*    */   {
/* 53 */     return this.ratio;
/*    */   }
/*    */   
/*    */   public Integer getState()
/*    */   {
/* 58 */     return this.state;
/*    */   }
/*    */   
/*    */   public Integer getWithdrawalId()
/*    */   {
/* 63 */     return this.withdrawalId;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetHospitalAccount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */