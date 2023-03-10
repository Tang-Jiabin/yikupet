package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.dto.InsuranceDTO;
import com.ykkoo.pet.pojo.PetInsurance;
import com.ykkoo.pet.vo.InsuranceVO;

import java.util.List;

public abstract interface InsuranceService {
    KVResult findInsuranceByType(Integer paramInteger);

    KVResult addInsurance(InsuranceDTO paramInsuranceDTO, Integer paramInteger);

    PetInsurance findByInsuranceId(Integer paramInteger);

    List<PetInsurance> findAllByInsuranceIdIn(List<Integer> paramList);

    KVResult getInsurancePage(Integer page, Integer size, String insuranceName, Integer insuranceType, Integer insuranceState, Integer adminId);

    KVResult addDiseaseType(Integer typeId, String typeName, Integer adminId);

    KVResult deleteDiseaseType(Integer typeId);

    KVResult getDiseaseType();

    KVResult<List<InsuranceVO>> findInsuranceByState(Integer state);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/InsuranceService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */