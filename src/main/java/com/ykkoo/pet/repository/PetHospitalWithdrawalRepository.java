package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetHospitalWithdrawal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetHospitalWithdrawalRepository
  extends JpaRepository<PetHospitalWithdrawal, Integer>, JpaSpecificationExecutor<PetHospitalWithdrawal>
{
  public abstract List<PetHospitalWithdrawal> findAllByHospitalId(Integer paramInteger);
  
  public abstract List<PetHospitalWithdrawal> findAllByHospitalIdAndState(Integer paramInteger1, Integer paramInteger2);
  
  public abstract PetHospitalWithdrawal findByWithdrawalId(Integer paramInteger);

    List<PetHospitalWithdrawal> findAllByPromoterId(Integer promoterId);

  List<PetHospitalWithdrawal> findAllByPromoterIdAndState(Integer promoterId, Integer state);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetHospitalWithdrawalRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */