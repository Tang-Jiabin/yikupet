package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetInsurance;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetInsuranceRepository
  extends JpaRepository<PetInsurance, Integer>, JpaSpecificationExecutor<PetInsurance>
{
  public abstract List<PetInsurance> findAllByInsuranceType(Integer paramInteger);
  
  public abstract PetInsurance findByInsuranceId(Integer paramInteger);
  
  public abstract List<PetInsurance> findAllByInsuranceIdIn(List<Integer> paramList);
  
  public abstract List<PetInsurance> findAllByInsuranceTypeAndInsuranceState(Integer paramInteger, int paramInt);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetInsuranceRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */