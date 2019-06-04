package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetUserInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetUserInfoRepository
  extends JpaRepository<PetUserInfo, Integer>, JpaSpecificationExecutor<PetUserInfo>
{
  public abstract PetUserInfo findByUserId(Integer paramInteger);
  
  public abstract PetUserInfo findByPhone(String paramString);
  
  public abstract List<PetUserInfo> findAllByUserIdIn(List<Integer> paramList);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetUserInfoRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */