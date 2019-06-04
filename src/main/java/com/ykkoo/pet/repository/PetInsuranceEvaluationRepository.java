package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetInsuranceEvaluation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetInsuranceEvaluationRepository
  extends JpaRepository<PetInsuranceEvaluation, Long>
{
  public abstract List<PetInsuranceEvaluation> findAllByInsuranceId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetInsuranceEvaluationRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */