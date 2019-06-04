package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.vo.HomePageVO;

public abstract interface HomePageService
{
  public abstract KVResult<HomePageVO> getV1();
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/HomePageService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */