/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ClaimsVoucherDTO
/*    */ {
/*    */   private Integer compensateId;
/*    */   private List<FileDTO> claimInvoiceList;
/*    */   private List<FileDTO> claimDiagnosisList;
/*    */   
/* 15 */   public void setCompensateId(Integer compensateId) { this.compensateId = compensateId; } public void setClaimInvoiceList(List<FileDTO> claimInvoiceList) { this.claimInvoiceList = claimInvoiceList; } public void setClaimDiagnosisList(List<FileDTO> claimDiagnosisList) { this.claimDiagnosisList = claimDiagnosisList; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof ClaimsVoucherDTO)) return false; ClaimsVoucherDTO other = (ClaimsVoucherDTO)o; if (!other.canEqual(this)) return false; Object this$compensateId = getCompensateId();Object other$compensateId = other.getCompensateId(); if (this$compensateId == null ? other$compensateId != null : !this$compensateId.equals(other$compensateId)) return false; Object this$claimInvoiceList = getClaimInvoiceList();Object other$claimInvoiceList = other.getClaimInvoiceList(); if (this$claimInvoiceList == null ? other$claimInvoiceList != null : !this$claimInvoiceList.equals(other$claimInvoiceList)) return false; Object this$claimDiagnosisList = getClaimDiagnosisList();Object other$claimDiagnosisList = other.getClaimDiagnosisList();return this$claimDiagnosisList == null ? other$claimDiagnosisList == null : this$claimDiagnosisList.equals(other$claimDiagnosisList); } protected boolean canEqual(Object other) { return other instanceof ClaimsVoucherDTO; } public int hashCode() { int PRIME = 59;int result = 1;Object $compensateId = getCompensateId();result = result * 59 + ($compensateId == null ? 43 : $compensateId.hashCode());Object $claimInvoiceList = getClaimInvoiceList();result = result * 59 + ($claimInvoiceList == null ? 43 : $claimInvoiceList.hashCode());Object $claimDiagnosisList = getClaimDiagnosisList();result = result * 59 + ($claimDiagnosisList == null ? 43 : $claimDiagnosisList.hashCode());return result; } public String toString() { return "ClaimsVoucherDTO(compensateId=" + getCompensateId() + ", claimInvoiceList=" + getClaimInvoiceList() + ", claimDiagnosisList=" + getClaimDiagnosisList() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public Integer getCompensateId()
/*    */   {
/* 21 */     return this.compensateId;
/*    */   }
/*    */   
/*    */   public List<FileDTO> getClaimInvoiceList() {
/* 25 */     return this.claimInvoiceList;
/*    */   }
/*    */   
/*    */   public List<FileDTO> getClaimDiagnosisList() {
/* 29 */     return this.claimDiagnosisList;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/ClaimsVoucherDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */