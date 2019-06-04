package com.ykkoo.pet.service;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.pojo.PetInsuranceEvaluation;

public abstract interface InsuranceEvaluationService
{
  public abstract PetInsuranceEvaluation findMaxStarClassByInsuranceId(Integer paramInteger);
  
  public abstract KVResult getEvaluationByInsuranceId(Integer paramInteger);
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/service/InsuranceEvaluationService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */