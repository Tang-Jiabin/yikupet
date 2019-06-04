package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.ClaimsVoucherDTO;
import com.ykkoo.pet.dto.InsurancePolicyDTO;
import com.ykkoo.pet.pojo.PetInsurancePolicy;
import com.ykkoo.pet.vo.InsuranceDiseaseVO;
import java.util.List;

public abstract interface InsurancePolicyService
{
  public abstract KVResult createInsurancePolicy(InsurancePolicyDTO paramInsurancePolicyDTO, Integer paramInteger);
  
  public abstract List<PetInsurancePolicy> findByUserId(Integer paramInteger);
  
  public abstract KVResult getInsurancePolicyPage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4, Integer paramInteger5, Integer paramInteger6);
  
  public abstract KVResult getInsurancePolicyDetails(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);
  
  public abstract KVResult getCompensateDetails(Integer paramInteger1, Integer paramInteger2);
  
  public abstract List<PetInsurancePolicy> findByUserIdAndInsuranceStatus(Integer paramInteger, int paramInt);
  
  public abstract KVResult applyClaims(Integer paramInteger1, Integer paramInteger2);
  
  public abstract KVResult uploadClaimsVoucher(ClaimsVoucherDTO paramClaimsVoucherDTO, Integer paramInteger);
  
  public abstract List<InsuranceDiseaseVO> findAllInsuranceDiseaseByReservationId(Integer paramInteger);
  
  public abstract KVResult getCompensatePage(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString, Integer paramInteger4, Integer paramInteger5);
  
  public abstract KVResult updateCompensateInfo(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString, Integer paramInteger4);
  
  public abstract KVResult updateCompensateInfo(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);
  
  public abstract PetInsurancePolicy findByInsurancePolicyId(Integer paramInteger);
  
  public abstract PetInsurancePolicy save(PetInsurancePolicy paramPetInsurancePolicy);
  
  public abstract KVResult getInsurancePolicyPage(Integer paramInteger1, String paramString1, String paramString2, Integer paramInteger2);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/InsurancePolicyService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */