package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetInsuranceDisease;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetInsuranceDiseaseRepository
  extends JpaRepository<PetInsuranceDisease, Integer>
{
  public abstract List<PetInsuranceDisease> findAllByInsurancePolicyId(Integer paramInteger);
  
  public abstract List<PetInsuranceDisease> findAllByReservationId(Integer paramInteger);
  
  public abstract List<PetInsuranceDisease> findAllByInsuranceDiseaseIdIn(List<Long> paramList);
  
  public abstract List<PetInsuranceDisease> findAllByInsurancePolicyIdIn(List<Integer> paramList);
  
  public abstract PetInsuranceDisease findByInsuranceDiseaseId(Long paramLong);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetInsuranceDiseaseRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */