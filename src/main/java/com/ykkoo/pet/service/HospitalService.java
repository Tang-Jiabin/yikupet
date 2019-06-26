package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.DiagnosticDTO;
import com.ykkoo.pet.dto.HospitalDTO;
import com.ykkoo.pet.dto.PromoterDTO;
import com.ykkoo.pet.pojo.PetHospitalInfo;
import com.ykkoo.pet.pojo.PetReservationInfo;
import java.util.Date;
import java.util.List;

public abstract interface HospitalService
{
  public abstract KVResult addHospital(HospitalDTO paramHospitalDTO, Integer salesmanId);
  
  public abstract KVResult getHospitalPage(Integer page, Integer size, Integer scope, Integer type, Integer cooperationState, String hospitalName, String contacts, Integer salesmanId);
  
  public abstract KVResult medicalAppointments(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult getReservationPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString1, String paramString2, Date paramDate1, Date paramDate2, Integer paramInteger4);
  
  public abstract List<PetReservationInfo> findReservationInfoByInsurancePolicyId(Integer paramInteger);
  
  public abstract PetHospitalInfo findByHospitalInfoId(Integer paramInteger);
  
  public abstract KVResult bindingElectronicCard(Integer insurancePolicyId,Integer insuranceStatus,String electronicCard, Integer hospitalInfoId);
  

  public abstract KVResult addDiagnosticInfo(DiagnosticDTO paramDiagnosticDTO, Integer paramInteger);

  KVResult addPromoter(PromoterDTO promoterDTO, Integer salesmanId);

  KVResult getPromoterPage(Integer page, Integer size, Integer state, Integer salesmanId);

    KVResult getInsurancePolicyDetails(String phone,String cardNum, Integer hospitalInfoId);

    KVResult addSalesman(Integer salesmanId,String name, String account, String password,String phone,String region,Integer state, Integer adminId);

    KVResult getSalesmanPage(Integer page, Integer size, Integer state, Integer adminId);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/HospitalService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */