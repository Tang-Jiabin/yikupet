package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetHospitalAccount;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetHospitalAccountRepository extends JpaRepository<PetHospitalAccount, Integer> {
    List<PetHospitalAccount> findAllByHospitalIdAndState(Integer paramInteger1, Integer paramInteger2);

    List<PetHospitalAccount> findAllByAccountIdIn(List<Integer> paramList);

    List<PetHospitalAccount> findAllByAccountIdInAndState(List<Integer> paramList, int paramInt);

    List<PetHospitalAccount> findAllByWithdrawalIdAndState(Integer paramInteger, int paramInt);

    List<PetHospitalAccount> findAllByHospitalId(Integer paramInteger);

    List<PetHospitalAccount> findAllByPromoterId(Integer promoterId);

    List<PetHospitalAccount> findAllByPromoterIdAndState(Integer promoterId, Integer state);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetHospitalAccountRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */