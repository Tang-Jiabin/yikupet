package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;

public abstract interface TimerService
{
  public abstract KVResult update1h();
  
  public abstract KVResult update1d();
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/TimerService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */