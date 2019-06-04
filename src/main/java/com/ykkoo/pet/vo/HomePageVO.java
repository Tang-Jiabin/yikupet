/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HomePageVO
/*    */ {
/*    */   private List<RotationChartVO> rotationChartVOList;
/*    */   private List<InsuranceBriefVO> insuranceBriefVOList;
/*    */   private Integer members;
/*    */   private Integer cost;
/*    */   private Integer show;
/*    */   
/* 16 */   public void setRotationChartVOList(List<RotationChartVO> rotationChartVOList) { this.rotationChartVOList = rotationChartVOList; } public void setInsuranceBriefVOList(List<InsuranceBriefVO> insuranceBriefVOList) { this.insuranceBriefVOList = insuranceBriefVOList; } public void setMembers(Integer members) { this.members = members; } public void setCost(Integer cost) { this.cost = cost; } public void setShow(Integer show) { this.show = show; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof HomePageVO)) return false; HomePageVO other = (HomePageVO)o; if (!other.canEqual(this)) return false; Object this$rotationChartVOList = getRotationChartVOList();Object other$rotationChartVOList = other.getRotationChartVOList(); if (this$rotationChartVOList == null ? other$rotationChartVOList != null : !this$rotationChartVOList.equals(other$rotationChartVOList)) return false; Object this$insuranceBriefVOList = getInsuranceBriefVOList();Object other$insuranceBriefVOList = other.getInsuranceBriefVOList(); if (this$insuranceBriefVOList == null ? other$insuranceBriefVOList != null : !this$insuranceBriefVOList.equals(other$insuranceBriefVOList)) return false; Object this$members = getMembers();Object other$members = other.getMembers(); if (this$members == null ? other$members != null : !this$members.equals(other$members)) return false; Object this$cost = getCost();Object other$cost = other.getCost(); if (this$cost == null ? other$cost != null : !this$cost.equals(other$cost)) return false; Object this$show = getShow();Object other$show = other.getShow();return this$show == null ? other$show == null : this$show.equals(other$show); } protected boolean canEqual(Object other) { return other instanceof HomePageVO; } public int hashCode() { int PRIME = 59;int result = 1;Object $rotationChartVOList = getRotationChartVOList();result = result * 59 + ($rotationChartVOList == null ? 43 : $rotationChartVOList.hashCode());Object $insuranceBriefVOList = getInsuranceBriefVOList();result = result * 59 + ($insuranceBriefVOList == null ? 43 : $insuranceBriefVOList.hashCode());Object $members = getMembers();result = result * 59 + ($members == null ? 43 : $members.hashCode());Object $cost = getCost();result = result * 59 + ($cost == null ? 43 : $cost.hashCode());Object $show = getShow();result = result * 59 + ($show == null ? 43 : $show.hashCode());return result; } public String toString() { return "HomePageVO(rotationChartVOList=" + getRotationChartVOList() + ", insuranceBriefVOList=" + getInsuranceBriefVOList() + ", members=" + getMembers() + ", cost=" + getCost() + ", show=" + getShow() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */   public List<RotationChartVO> getRotationChartVOList()
/*    */   {
/* 22 */     return this.rotationChartVOList;
/*    */   }
/*    */   
/*    */   public List<InsuranceBriefVO> getInsuranceBriefVOList()
/*    */   {
/* 27 */     return this.insuranceBriefVOList;
/*    */   }
/*    */   
/*    */   public Integer getMembers()
/*    */   {
/* 32 */     return this.members;
/*    */   }
/*    */   
/*    */   public Integer getCost()
/*    */   {
/* 37 */     return this.cost;
/*    */   }
/*    */   
/*    */   public Integer getShow()
/*    */   {
/* 42 */     return this.show;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/HomePageVO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */