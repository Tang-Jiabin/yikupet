/*    */ package com.ykkoo.pet.dto;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FileUploadDTO
/*    */ {
/*    */   private List<FileDTO> fileDTOList;
/*    */   
/* 15 */   public String toString() { return "FileUploadDTO(fileDTOList=" + getFileDTOList() + ")"; } public int hashCode() { int PRIME = 59;int result = 1;Object $fileDTOList = getFileDTOList();result = result * 59 + ($fileDTOList == null ? 43 : $fileDTOList.hashCode());return result; } protected boolean canEqual(Object other) { return other instanceof FileUploadDTO; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof FileUploadDTO)) return false; FileUploadDTO other = (FileUploadDTO)o; if (!other.canEqual(this)) return false; Object this$fileDTOList = getFileDTOList();Object other$fileDTOList = other.getFileDTOList();return this$fileDTOList == null ? other$fileDTOList == null : this$fileDTOList.equals(other$fileDTOList); } public void setFileDTOList(List<FileDTO> fileDTOList) { this.fileDTOList = fileDTOList; }
/*    */   
/*    */   public List<FileDTO> getFileDTOList() {
/* 18 */     return this.fileDTOList;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/dto/FileUploadDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */