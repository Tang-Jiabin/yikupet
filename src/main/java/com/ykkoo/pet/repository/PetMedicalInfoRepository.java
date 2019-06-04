package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetMedicalInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetMedicalInfoRepository
  extends JpaRepository<PetMedicalInfo, Integer>
{
  public abstract List<PetMedicalInfo> findAllByInsurancePolicyId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetMedicalInfoRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */