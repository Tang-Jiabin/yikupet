package com.ykkoo.pet.service.impl;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.pojo.PetInsuranceEvaluation;
import com.ykkoo.pet.repository.PetInsuranceEvaluationRepository;
import com.ykkoo.pet.service.InsuranceEvaluationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

/**
 * 评价
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/11
 * @email : seven_tjb@163.com
 **/
@Slf4j
@Service
@AllArgsConstructor
public class InsuranceEvaluationServiceImpl implements InsuranceEvaluationService {

    private PetInsuranceEvaluationRepository evaluationRepository;

    @Override
    public PetInsuranceEvaluation findMaxStarClassByInsuranceId(Integer insuranceId) {

        //TODO 取最大值 待优化
        List<PetInsuranceEvaluation> evaluationList = evaluationRepository.findAllByInsuranceId(insuranceId);

        evaluationList.sort(new Comparator<PetInsuranceEvaluation>() {
            @Override
            public int compare(PetInsuranceEvaluation o1, PetInsuranceEvaluation o2) {
                return o2.getStarClass()-o1.getStarClass();
            }
        });
        if(evaluationList.size()>0){
            return evaluationList.get(0);
        }else {
            return null;
        }

    }

    @Override
    public KVResult getEvaluationByInsuranceId(Integer insuranceId) {
        List<PetInsuranceEvaluation> evaluationList = evaluationRepository.findAllByInsuranceId(insuranceId);
        return KVResult.put(evaluationList);
    }
}
