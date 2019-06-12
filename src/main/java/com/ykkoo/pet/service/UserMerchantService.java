package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;

public abstract interface UserMerchantService
{
  public abstract KVResult signIn(String paramString1, String paramString2);
}

