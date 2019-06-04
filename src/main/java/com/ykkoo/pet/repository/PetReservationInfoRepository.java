package com.ykkoo.pet.repository;

import com.ykkoo.pet.pojo.PetReservationInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetReservationInfoRepository
  extends JpaRepository<PetReservationInfo, Integer>, JpaSpecificationExecutor<PetReservationInfo>
{
  public abstract PetReservationInfo findAllByUserIdAndReservationStatus(Integer paramInteger, int paramInt);
  
  public abstract List<PetReservationInfo> findAllByInsurancePolicyId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetReservationInfoRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */