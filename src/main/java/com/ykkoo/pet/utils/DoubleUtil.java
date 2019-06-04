/*    */ package com.ykkoo.pet.utils;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DoubleUtil
/*    */ {
/*    */   public static double toDouble(Double d)
/*    */   {
/* 23 */     BigDecimal bd = new BigDecimal(Double.toString(d.doubleValue()));
/* 24 */     return bd.setScale(2, 4).doubleValue();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static double sum(double d1, double d2)
/*    */   {
/* 34 */     BigDecimal bd1 = new BigDecimal(Double.toString(d1));
/* 35 */     BigDecimal bd2 = new BigDecimal(Double.toString(d2));
/* 36 */     return bd1.add(bd2).setScale(2, 4).doubleValue();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static double sub(double d1, double d2)
/*    */   {
/* 47 */     BigDecimal bd1 = new BigDecimal(Double.toString(d1));
/* 48 */     BigDecimal bd2 = new BigDecimal(Double.toString(d2));
/* 49 */     return bd1.subtract(bd2).setScale(2, 4).doubleValue();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static Double mul(Double v1, Double v2)
/*    */   {
/* 59 */     BigDecimal b1 = new BigDecimal(v1.toString());
/* 60 */     BigDecimal b2 = new BigDecimal(v2.toString());
/* 61 */     return Double.valueOf(b1.multiply(b2).setScale(2, 4).doubleValue());
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static Double div(Double v1, Double v2)
/*    */   {
/* 71 */     BigDecimal b1 = new BigDecimal(v1.toString());
/* 72 */     BigDecimal b2 = new BigDecimal(v2.toString());
/* 73 */     return Double.valueOf(b1.divide(b2).setScale(2, 4).doubleValue());
/*    */   }
/*    */ }


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/utils/DoubleUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */