package com.ykkoo.pet.controller.client;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.InsuranceEvaluationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "评价", description = "evaluation")
@RestController
@RequestMapping({"/evaluation"})
public class EvaluationController {
    private InsuranceEvaluationService evaluationService;

    public EvaluationController(InsuranceEvaluationService evaluationService) {
        /* 29 */
        this.evaluationService = evaluationService;
    }


    @ApiOperation("根据保险ID查询评价")
    @RequestMapping(value = {"getEvaluationByInsuranceId"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getEvaluationByInsuranceId(@RequestParam Integer insuranceId) {
        /* 37 */
        KVResult result = this.evaluationService.getEvaluationByInsuranceId(insuranceId);
        /* 38 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/EvaluationController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */