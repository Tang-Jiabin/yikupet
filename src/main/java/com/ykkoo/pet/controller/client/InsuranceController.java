package com.ykkoo.pet.controller.client;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.InsuranceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "保险", description = "insurance")
@RestController
@RequestMapping({"/insurance"})
public class InsuranceController {
    private InsuranceService insuranceService;

    public InsuranceController(InsuranceService insuranceService) {
        /* 26 */
        this.insuranceService = insuranceService;
    }


    @ApiOperation("根据类别获取保险")
    @RequestMapping(value = {"getInsuranceByType"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getInsuranceByType(@ApiParam("1-汪保 2-喵保") @RequestParam(required = false, defaultValue = "1") Integer type) {
        /* 35 */
        KVResult result = this.insuranceService.findInsuranceByType(type);
        /* 36 */
        return ServerResponse.createMessage(result);
    }
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/InsuranceController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */