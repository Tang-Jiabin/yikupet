package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import java.util.List;

public abstract interface AccountMerchantService
{
  public abstract KVResult getAccountInfo(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult cashWithdrawal(Double paramDouble, String paramString1, String paramString2, String paramString3, List<Integer> paramList, Integer paramInteger);
  
  public abstract KVResult getWithdrawalInfo(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult getWithdrawalPage(Integer paramInteger1, Integer paramInteger2, String paramString, Integer paramInteger3, Integer paramInteger4);
  
  public abstract KVResult updateWithdrawal(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/AccountMerchantService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */