/*    */ package com.ykkoo.pet.pojo;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ @javax.persistence.Entity
/*    */ @javax.persistence.Table(name="pet_variable")
/*    */ public class PetVariable {
/*    */   @javax.persistence.Id
/*    */   @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
/*    */   private Integer variableId;
/*    */   private com.ykkoo.pet.common.type.VariableType type;
/*    */   private Integer intVar;
/*    */   private String strVar;
/*    */   private Date createDate;
/*    */   private Date updateDate;
/*    */   
/* 17 */   public void setVariableId(Integer variableId) { this.variableId = variableId; } public void setType(com.ykkoo.pet.common.type.VariableType type) { this.type = type; } public void setIntVar(Integer intVar) { this.intVar = intVar; } public void setStrVar(String strVar) { this.strVar = strVar; } public void setCreateDate(Date createDate) { this.createDate = createDate; } public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PetVariable)) return false; PetVariable other = (PetVariable)o; if (!other.canEqual(this)) return false; Object this$variableId = getVariableId();Object other$variableId = other.getVariableId(); if (this$variableId == null ? other$variableId != null : !this$variableId.equals(other$variableId)) return false; Object this$type = getType();Object other$type = other.getType(); if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false; Object this$intVar = getIntVar();Object other$intVar = other.getIntVar(); if (this$intVar == null ? other$intVar != null : !this$intVar.equals(other$intVar)) return false; Object this$strVar = getStrVar();Object other$strVar = other.getStrVar(); if (this$strVar == null ? other$strVar != null : !this$strVar.equals(other$strVar)) return false; Object this$createDate = getCreateDate();Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$updateDate = getUpdateDate();Object other$updateDate = other.getUpdateDate();return this$updateDate == null ? other$updateDate == null : this$updateDate.equals(other$updateDate); } protected boolean canEqual(Object other) { return other instanceof PetVariable; } public int hashCode() { int PRIME = 59;int result = 1;Object $variableId = getVariableId();result = result * 59 + ($variableId == null ? 43 : $variableId.hashCode());Object $type = getType();result = result * 59 + ($type == null ? 43 : $type.hashCode());Object $intVar = getIntVar();result = result * 59 + ($intVar == null ? 43 : $intVar.hashCode());Object $strVar = getStrVar();result = result * 59 + ($strVar == null ? 43 : $strVar.hashCode());Object $createDate = getCreateDate();result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());Object $updateDate = getUpdateDate();result = result * 59 + ($updateDate == null ? 43 : $updateDate.hashCode());return result; } public String toString() { return "PetVariable(variableId=" + getVariableId() + ", type=" + getType() + ", intVar=" + getIntVar() + ", strVar=" + getStrVar() + ", createDate=" + getCreateDate() + ", updateDate=" + getUpdateDate() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 24 */   public Integer getVariableId() { return this.variableId; }
/*    */   
/* 26 */   public com.ykkoo.pet.common.type.VariableType getType() { return this.type; }
/*    */   
/* 28 */   public Integer getIntVar() { return this.intVar; }
/*    */   
/* 30 */   public String getStrVar() { return this.strVar; }
/*    */   
/* 32 */   public Date getCreateDate() { return this.createDate; }
/*    */   
/* 34 */   public Date getUpdateDate() { return this.updateDate; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/pojo/PetVariable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */