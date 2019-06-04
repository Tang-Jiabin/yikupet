/*    */ package com.ykkoo.pet.common.http;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import org.springframework.http.HttpStatus;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KVResult<T>
/*    */   implements Serializable
/*    */ {
/*    */   private Integer key;
/*    */   private T val;
/*    */   
/* 16 */   public void setKey(Integer key) { this.key = key; } public void setVal(T val) { this.val = val; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof KVResult)) return false; KVResult<?> other = (KVResult)o; if (!other.canEqual(this)) return false; Object this$key = getKey();Object other$key = other.getKey(); if (this$key == null ? other$key != null : !this$key.equals(other$key)) return false; Object this$val = getVal();Object other$val = other.getVal();return this$val == null ? other$val == null : this$val.equals(other$val); } protected boolean canEqual(Object other) { return other instanceof KVResult; } public int hashCode() { int PRIME = 59;int result = 1;Object $key = getKey();result = result * 59 + ($key == null ? 43 : $key.hashCode());Object $val = getVal();result = result * 59 + ($val == null ? 43 : $val.hashCode());return result; } public String toString() { return "KVResult(key=" + getKey() + ", val=" + getVal() + ")"; }
/*    */   
/*    */ 
/* 19 */   public Integer getKey() { return this.key; }
/*    */   
/* 21 */   public T getVal() { return (T)this.val; }
/*    */   
/*    */   public static <T> KVResult<T> put(Integer key, T val) {
/* 24 */     KVResult result = new KVResult();
/* 25 */     result.setKey(key);
/* 26 */     result.setVal(val);
/* 27 */     return result;
/*    */   }
/*    */   
/*    */   public static <T> KVResult<T> put(HttpStatus status, T val) {
/* 31 */     KVResult result = new KVResult();
/* 32 */     result.setKey(Integer.valueOf(status.value()));
/* 33 */     result.setVal(val);
/* 34 */     return result;
/*    */   }
/*    */   
/*    */   public static <T> KVResult<T> put(T val) {
/* 38 */     KVResult result = new KVResult();
/* 39 */     result.setKey(Integer.valueOf(200));
/* 40 */     result.setVal(val);
/* 41 */     return result;
/*    */   }
/*    */   
/*    */   public static <T> KVResult<T> put(HttpStatus status) {
/* 45 */     KVResult result = new KVResult();
/* 46 */     result.setKey(Integer.valueOf(status.value()));
/* 47 */     result.setVal(status.getReasonPhrase());
/* 48 */     return result;
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/common/http/KVResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */