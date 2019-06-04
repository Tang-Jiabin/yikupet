/*    */ package com.ykkoo.pet.vo;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class PageVo<T> {
/*    */   private List<T> content;
/*    */   @com.fasterxml.jackson.annotation.JsonFormat(shape=com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
/*    */   private Long totalElements;
/*    */   private Integer totalPages;
/*    */   private Boolean last;
/*    */   private Integer size;
/*    */   private Integer number;
/*    */   private Integer numberOfElements;
/*    */   private Boolean first;
/*    */   
/* 16 */   public void setContent(List<T> content) { this.content = content; } public void setTotalElements(Long totalElements) { this.totalElements = totalElements; } public void setTotalPages(Integer totalPages) { this.totalPages = totalPages; } public void setLast(Boolean last) { this.last = last; } public void setSize(Integer size) { this.size = size; } public void setNumber(Integer number) { this.number = number; } public void setNumberOfElements(Integer numberOfElements) { this.numberOfElements = numberOfElements; } public void setFirst(Boolean first) { this.first = first; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PageVo)) return false; PageVo<?> other = (PageVo)o; if (!other.canEqual(this)) return false; Object this$content = getContent();Object other$content = other.getContent(); if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false; Object this$totalElements = getTotalElements();Object other$totalElements = other.getTotalElements(); if (this$totalElements == null ? other$totalElements != null : !this$totalElements.equals(other$totalElements)) return false; Object this$totalPages = getTotalPages();Object other$totalPages = other.getTotalPages(); if (this$totalPages == null ? other$totalPages != null : !this$totalPages.equals(other$totalPages)) return false; Object this$last = getLast();Object other$last = other.getLast(); if (this$last == null ? other$last != null : !this$last.equals(other$last)) return false; Object this$size = getSize();Object other$size = other.getSize(); if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false; Object this$number = getNumber();Object other$number = other.getNumber(); if (this$number == null ? other$number != null : !this$number.equals(other$number)) return false; Object this$numberOfElements = getNumberOfElements();Object other$numberOfElements = other.getNumberOfElements(); if (this$numberOfElements == null ? other$numberOfElements != null : !this$numberOfElements.equals(other$numberOfElements)) return false; Object this$first = getFirst();Object other$first = other.getFirst();return this$first == null ? other$first == null : this$first.equals(other$first); } protected boolean canEqual(Object other) { return other instanceof PageVo; } public int hashCode() { int PRIME = 59;int result = 1;Object $content = getContent();result = result * 59 + ($content == null ? 43 : $content.hashCode());Object $totalElements = getTotalElements();result = result * 59 + ($totalElements == null ? 43 : $totalElements.hashCode());Object $totalPages = getTotalPages();result = result * 59 + ($totalPages == null ? 43 : $totalPages.hashCode());Object $last = getLast();result = result * 59 + ($last == null ? 43 : $last.hashCode());Object $size = getSize();result = result * 59 + ($size == null ? 43 : $size.hashCode());Object $number = getNumber();result = result * 59 + ($number == null ? 43 : $number.hashCode());Object $numberOfElements = getNumberOfElements();result = result * 59 + ($numberOfElements == null ? 43 : $numberOfElements.hashCode());Object $first = getFirst();result = result * 59 + ($first == null ? 43 : $first.hashCode());return result; } public String toString() { return "PageVo(content=" + getContent() + ", totalElements=" + getTotalElements() + ", totalPages=" + getTotalPages() + ", last=" + getLast() + ", size=" + getSize() + ", number=" + getNumber() + ", numberOfElements=" + getNumberOfElements() + ", first=" + getFirst() + ")"; }
/*    */   
/*    */   public List<T> getContent() {
/* 19 */     return this.content;
/*    */   }
/*    */   
/* 22 */   public Long getTotalElements() { return this.totalElements; }
/*    */   
/* 24 */   public Integer getTotalPages() { return this.totalPages; }
/*    */   
/* 26 */   public Boolean getLast() { return this.last; }
/*    */   
/* 28 */   public Integer getSize() { return this.size; }
/*    */   
/* 30 */   public Integer getNumber() { return this.number; }
/*    */   
/* 32 */   public Integer getNumberOfElements() { return this.numberOfElements; }
/*    */   
/* 34 */   public Boolean getFirst() { return this.first; }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/vo/PageVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */