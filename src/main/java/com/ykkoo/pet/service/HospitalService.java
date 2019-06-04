package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.DiagnosticDTO;
import com.ykkoo.pet.dto.HospitalDTO;
import com.ykkoo.pet.pojo.PetHospitalInfo;
import com.ykkoo.pet.pojo.PetReservationInfo;
import java.util.Date;
import java.util.List;

public abstract interface HospitalService
{
  public abstract KVResult addHospital(HospitalDTO paramHospitalDTO, Integer paramInteger);
  
  public abstract KVResult getHospitalPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4, Integer paramInteger5, String paramString1, String paramString2, Integer paramInteger6);
  
  public abstract KVResult medicalAppointments(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult getReservationPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString1, String paramString2, Date paramDate1, Date paramDate2, Integer paramInteger4);
  
  public abstract List<PetReservationInfo> findReservationInfoByInsurancePolicyId(Integer paramInteger);
  
  public abstract PetHospitalInfo findByHospitalInfoId(Integer paramInteger);
  
  public abstract KVResult bindingElectronicCard(Integer paramInteger1, Integer paramInteger2, String paramString, Integer paramInteger3);
  
  public abstract KVResult getInsurancePolicyDetails(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult addDiagnosticInfo(DiagnosticDTO paramDiagnosticDTO, Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/HospitalService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */