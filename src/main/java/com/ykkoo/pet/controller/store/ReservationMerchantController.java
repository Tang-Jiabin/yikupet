package com.ykkoo.pet.controller.store;

import com.ykkoo.pet.common.annotation.HospitalAuthorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.dto.DiagnosticDTO;
import com.ykkoo.pet.service.HospitalService;
import com.ykkoo.pet.service.InsurancePolicyService;
import com.ykkoo.pet.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "Z商户【预约就诊】", description = "/merchant/reservation")
@RestController
@RequestMapping({"/merchant/reservation"})
public class ReservationMerchantController {
    private HospitalService hospitalService;
    private InsurancePolicyService insurancePolicyService;
    private UserService userService;

    public ReservationMerchantController(HospitalService hospitalService, InsurancePolicyService insurancePolicyService, UserService userService) {
        this.hospitalService = hospitalService;
        this.insurancePolicyService = insurancePolicyService;
        this.userService = userService;
    }



    @HospitalAuthorization
    @ApiOperation("绑定电子卡号")
    @GetMapping({"/bindingElectronicCard"})
    public ServerResponse bindingElectronicCard(@ApiParam("保单ID") @RequestParam(required = false, defaultValue = "0") Integer insurancePolicyId, @ApiParam("审核状态 2-审核通过 5-审核未通过") @RequestParam(required = false, defaultValue = "2") Integer insuranceStatus, @ApiParam("电子卡号") @RequestParam(required = false, defaultValue = "") String electronicCard, @ApiIgnore @RequestAttribute Integer hospitalInfoId) {
        KVResult result = this.hospitalService.bindingElectronicCard(insurancePolicyId, insuranceStatus, electronicCard, hospitalInfoId);
        return ServerResponse.createMessage(result);
    }

    @HospitalAuthorization
    @ApiOperation("获取保单详情")
    @GetMapping({"/getInsurancePolicyDetails"})
    public ServerResponse getInsurancePolicyDetails(@ApiParam("投保人手机号") @RequestParam(required = false, defaultValue = "") String phone,@RequestParam(required = false, defaultValue = "") String cardNum, @ApiIgnore @RequestAttribute Integer hospitalInfoId) {
        KVResult result = this.hospitalService.getInsurancePolicyDetails(phone,cardNum, hospitalInfoId);
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }



    @HospitalAuthorization
    @ApiOperation("添加诊断信息")
    @PostMapping({"/addDiagnosticInfo"})
    public ServerResponse addDiagnosticInfo(@RequestBody DiagnosticDTO diagnosticDTO, @ApiIgnore @RequestAttribute Integer hospitalInfoId) {
        KVResult result = this.hospitalService.addDiagnosticInfo(diagnosticDTO, hospitalInfoId);
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }
}


