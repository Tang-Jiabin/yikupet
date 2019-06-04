package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetCompensateDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetCompensateDetailsRepository
  extends JpaRepository<PetCompensateDetails, Integer>, JpaSpecificationExecutor<PetCompensateDetails>
{
  public abstract PetCompensateDetails findByInsurancePolicyIdAndClaimStatus(Integer paramInteger, int paramInt);
  
  public abstract PetCompensateDetails findByCompensateId(Integer paramInteger);

    PetCompensateDetails findByInsurancePolicyIdAndCompensateStatus(Integer insurancePolicyId, int i);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetCompensateDetailsRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */