package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import java.util.List;

public abstract interface AccountMerchantService
{
  public abstract KVResult getAccountInfo(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult cashWithdrawal(Double amount, String cardNumber, String cardBank,String name, List<Integer> accountIdList, Integer hospitalInfoId);
  
  public abstract KVResult getWithdrawalInfo(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult getWithdrawalPage(Integer page, Integer size,String  name, Integer type ,Integer state,Integer adminId);
  
  public abstract KVResult updateWithdrawal(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/AccountMerchantService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */