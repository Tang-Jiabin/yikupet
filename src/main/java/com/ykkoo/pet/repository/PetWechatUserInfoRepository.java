package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetWechatUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetWechatUserInfoRepository
  extends JpaRepository<PetWechatUserInfo, Integer>
{
  public abstract PetWechatUserInfo findByOpenid(String paramString);
  
  public abstract PetWechatUserInfo findByUserInfoId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetWechatUserInfoRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */