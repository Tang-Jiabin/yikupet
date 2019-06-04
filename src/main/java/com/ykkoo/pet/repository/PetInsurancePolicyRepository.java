package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetInsurancePolicy;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetInsurancePolicyRepository
  extends JpaRepository<PetInsurancePolicy, Integer>, JpaSpecificationExecutor<PetInsurancePolicy>
{
  public abstract List<PetInsurancePolicy> findByUserId(Integer paramInteger);
  
  public abstract PetInsurancePolicy findByInsurancePolicyId(Integer paramInteger);
  
  public abstract List<PetInsurancePolicy> findByUserIdAndInsuranceStatus(Integer paramInteger, int paramInt);
  
  @Modifying
  public abstract Page<PetInsurancePolicy> findAll(Pageable paramPageable);
  
  public abstract List<PetInsurancePolicy> findByInsuranceStatus(int paramInt);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetInsurancePolicyRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */