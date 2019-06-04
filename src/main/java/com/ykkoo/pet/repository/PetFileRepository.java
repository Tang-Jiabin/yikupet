package com.ykkoo.pet.repository;

import com.ykkoo.pet.common.type.FileType;
import com.ykkoo.pet.pojo.PetFile;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PetFileRepository
  extends JpaRepository<PetFile, Long>, JpaSpecificationExecutor<PetFile>
{
  public abstract List<PetFile> findAllByFileTypeAndState(FileType paramFileType, Integer paramInteger);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndInsuranceId(FileType paramFileType, int paramInt, Integer paramInteger);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndHospitalIdIn(FileType paramFileType, int paramInt, List<Integer> paramList);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndCompensateId(FileType paramFileType, int paramInt, Integer paramInteger);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndInsuranceIdIn(FileType paramFileType, int paramInt, List<Integer> paramList);
  
  public abstract PetFile findByFileId(Long paramLong);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndHospitalId(FileType paramFileType, int paramInt, Integer paramInteger);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndReservationId(FileType paramFileType, int paramInt, Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/repository/PetFileRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */