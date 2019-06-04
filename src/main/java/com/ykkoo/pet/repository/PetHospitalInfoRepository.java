package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetHospitalInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetHospitalInfoRepository
  extends JpaRepository<PetHospitalInfo, Integer>
{
  public abstract PetHospitalInfo findByHospitalId(Integer paramInteger);
  
  public abstract List<PetHospitalInfo> findAllByHospitalIdIn(List<Integer> paramList);
  
  public abstract PetHospitalInfo findByHospitalAccountAndHospitalPassword(String paramString1, String paramString2);
  
  public abstract PetHospitalInfo findByHospitalInfoId(int paramInt);
  
  public abstract PetHospitalInfo findByInvitationCode(String paramString);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetHospitalInfoRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */