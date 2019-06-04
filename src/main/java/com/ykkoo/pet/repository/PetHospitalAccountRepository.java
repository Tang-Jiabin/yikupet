package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetHospitalAccount;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetHospitalAccountRepository
  extends JpaRepository<PetHospitalAccount, Integer>
{
  public abstract List<PetHospitalAccount> findAllByHospitalIdAndState(Integer paramInteger1, Integer paramInteger2);
  
  public abstract List<PetHospitalAccount> findAllByAccountIdIn(List<Integer> paramList);
  
  public abstract List<PetHospitalAccount> findAllByAccountIdInAndState(List<Integer> paramList, int paramInt);
  
  public abstract List<PetHospitalAccount> findAllByWithdrawalIdAndState(Integer paramInteger, int paramInt);
  
  public abstract List<PetHospitalAccount> findAllByHospitalId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetHospitalAccountRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */