package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetHospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetHospitalRepository
  extends JpaRepository<PetHospital, Integer>, JpaSpecificationExecutor<PetHospital>
{
  public abstract PetHospital findByHospitalId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetHospitalRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */