package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.type.FileType;
import com.ykkoo.pet.dto.FileDTO;
import com.ykkoo.pet.dto.FileUpdateDTO;
import com.ykkoo.pet.dto.FileUploadDTO;
import com.ykkoo.pet.pojo.PetFile;
import java.util.List;
import java.util.Map;

public abstract interface FileService
{
  public abstract KVResult<Map<String, Object>> upload(FileUploadDTO paramFileUploadDTO, Integer paramInteger);
  
  public abstract PetFile upload(FileDTO paramFileDTO, Integer paramInteger);
  
  public abstract List<PetFile> findAllByTypeAndState(FileType paramFileType, int paramInt);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndInsuranceId(FileType paramFileType, int paramInt, Integer paramInteger);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndHospitalIdIn(FileType paramFileType, int paramInt, List<Integer> paramList);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndCompensateId(FileType paramFileType, int paramInt, Integer paramInteger);

  public abstract List<PetFile> findAllByFileTypeAndStateAndPromoterIdIn(FileType paramFileType, int paramInt,  List<Integer> paramInteger);

  public abstract List<PetFile> findAllByFileTypeAndStateAndInsuranceIdIn(FileType paramFileType, int paramInt, List<Integer> paramList);
  
  public abstract KVResult update(FileUpdateDTO paramFileUpdateDTO, Integer paramInteger);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndHospitalId(FileType paramFileType, int paramInt, Integer paramInteger);
  
  public abstract List<PetFile> save(List<PetFile> paramList);
  
  public abstract List<PetFile> findAllByFileTypeAndStateAndReservationId(FileType paramFileType, int paramInt, Integer paramInteger);
  
  public abstract KVResult getFilePage(Integer paramInteger1, Integer paramInteger2, FileType paramFileType, Integer paramInteger3, Integer paramInteger4);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/FileService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */