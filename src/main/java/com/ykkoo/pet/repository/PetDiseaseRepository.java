package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetDisease;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetDiseaseRepository
  extends JpaRepository<PetDisease, Integer>
{
  public abstract List<PetDisease> findAllByDiseaseIdIn(List<Integer> paramList);
  
  public abstract List<PetDisease> findAllByInsuranceIdIn(List<Integer> paramList);
  
  public abstract List<PetDisease> findAllByDiseaseStateAndInsuranceIdIn(int paramInt, List<Integer> paramList);
  
  public abstract List<PetDisease> findAllByDiseaseStateAndInsuranceId(Integer paramInteger1, Integer paramInteger2);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetDiseaseRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */