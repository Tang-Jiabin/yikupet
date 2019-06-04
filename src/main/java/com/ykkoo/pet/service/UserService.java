package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.UserInfoDTO;
import com.ykkoo.pet.pojo.PetUserInfo;
import java.util.List;

public abstract interface UserService
{
  public abstract KVResult smallLogin(String paramString);
  
  public abstract KVResult setUserInfo(UserInfoDTO paramUserInfoDTO, Integer paramInteger);
  
  public abstract PetUserInfo findByUserId(Integer paramInteger);
  
  public abstract PetUserInfo save(PetUserInfo paramPetUserInfo);
  
  public abstract KVResult getUserInfo(Integer paramInteger);
  
  public abstract PetUserInfo findByPhone(String paramString);
  
  public abstract KVResult getUserPage(Integer paramInteger1, Integer paramInteger2, String paramString1, String paramString2, String paramString3, String paramString4, Integer paramInteger3, Integer paramInteger4);
  
  public abstract List<PetUserInfo> findAllByUserIdIn(List<Integer> paramList);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/UserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */