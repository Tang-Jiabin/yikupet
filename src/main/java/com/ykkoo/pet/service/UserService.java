package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.UserInfoDTO;
import com.ykkoo.pet.pojo.PetUserInfo;
import com.ykkoo.pet.vo.UserVO;

import java.util.List;

public abstract interface UserService
{
  public abstract KVResult smallLogin(String paramString);
  
  public abstract KVResult setUserInfo(UserInfoDTO paramUserInfoDTO, Integer paramInteger);
  
  public abstract PetUserInfo findByUserId(Integer paramInteger);
  
  public abstract PetUserInfo save(PetUserInfo paramPetUserInfo);
  
  public abstract KVResult<UserVO> getUserInfo(Integer paramInteger);
  
  public abstract PetUserInfo findByPhone(String paramString);
  
  public abstract KVResult getUserPage(Integer page, Integer size, String phone,String nickName, String realName, String cardNumber, Integer adminId);
  
  public abstract List<PetUserInfo> findAllByUserIdIn(List<Integer> paramList);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/UserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */