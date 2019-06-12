package com.ykkoo.pet.controller.manage;

import com.ykkoo.pet.common.annotation.AdminAuthorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.dto.InsuranceDTO;
import com.ykkoo.pet.service.InsuranceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "Z管理【保险】", description = "insurance")
@RestController
@org.springframework.web.bind.annotation.RequestMapping({"/manage/insurance"})
@AdminAuthorization
public class InsuranceManageController {
    private InsuranceService insuranceService;

    public InsuranceManageController(InsuranceService insuranceService) {
        /* 27 */
        this.insuranceService = insuranceService;
    }


    @AdminAuthorization
    @ApiOperation("添加保险")
    @PostMapping({"/addInsurance"})
    public ServerResponse addInsurance(InsuranceDTO insuranceDTO, @ApiIgnore @RequestAttribute Integer adminId) {
        /* 37 */
        KVResult result = this.insuranceService.addInsurance(insuranceDTO, adminId);
        /* 38 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @AdminAuthorization
    @ApiOperation("获取疾病分类")
    @GetMapping({"/getDiseaseType"})
    public ServerResponse getDiseaseType( @ApiIgnore @RequestAttribute Integer adminId) {
        /* 37 */
        KVResult result = insuranceService.getDiseaseType();
        /* 38 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @AdminAuthorization
    @ApiOperation("添加疾病分类")
    @PostMapping({"/addDiseaseType"})
    public ServerResponse addDiseaseType(@RequestParam Integer typeId, @RequestParam String typeName, @ApiIgnore @RequestAttribute Integer adminId) {
        /* 37 */
        KVResult result = insuranceService.addDiseaseType(typeId,typeName, adminId);
        /* 38 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @AdminAuthorization
    @ApiOperation("删除疾病分类")
    @PostMapping({"/deleteDiseaseType"})
    public ServerResponse deleteDiseaseType(@RequestParam Integer typeId, @ApiIgnore @RequestAttribute Integer adminId) {
        /* 37 */
        KVResult result = insuranceService.deleteDiseaseType(typeId);
        /* 38 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @AdminAuthorization
    @ApiOperation("保险分页")
    @org.springframework.web.bind.annotation.GetMapping({"/getInsurancePage"})
    public ServerResponse getInsurancePage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page,
                                           @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size,
                                           @ApiParam("保险名称") @RequestParam(required = false, defaultValue = "") String insuranceName,
                                           @ApiParam("保险类型 0-全部 1-汪保 2-喵保") @RequestParam(required = false, defaultValue = "0") Integer insuranceType,
                                           @ApiParam("保险状态 0-全部 1-上架 2-下架") @RequestParam(required = false, defaultValue = "0") Integer insuranceState,
                                           @ApiIgnore @RequestAttribute Integer adminId) {
        /* 51 */
        KVResult result = this.insuranceService.getInsurancePage(page, size, insuranceName, insuranceType, insuranceState, adminId);
        /* 52 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }
}

