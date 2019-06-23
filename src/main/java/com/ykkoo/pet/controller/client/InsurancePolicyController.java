package com.ykkoo.pet.controller.client;

import com.ykkoo.pet.common.annotation.Authorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.dto.ClaimsVoucherDTO;
import com.ykkoo.pet.dto.FileUpdateDTO;
import com.ykkoo.pet.dto.InsurancePolicyDTO;
import com.ykkoo.pet.service.FileService;
import com.ykkoo.pet.service.InsurancePolicyService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@io.swagger.annotations.Api(value = "保单", description = "insurancePolicy")
@org.springframework.web.bind.annotation.RestController
@RequestMapping({"/insurancePolicy"})
public class InsurancePolicyController {
    private InsurancePolicyService insurancePolicyService;
    @Autowired(required = false)
    private HttpServletRequest request;
    private FileService fileService;

    public InsurancePolicyController(InsurancePolicyService insurancePolicyService, HttpServletRequest request, FileService fileService) {
        /*  34 */
        this.insurancePolicyService = insurancePolicyService;
        this.request = request;
        this.fileService = fileService;
    }


    @Authorization
    @ApiOperation("创建保单")
    @RequestMapping(value = {"createInsurancePolicy"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    public ServerResponse createInsurancePolicy(@RequestBody InsurancePolicyDTO insurancePolicy, @ApiIgnore @RequestAttribute Integer userId) {
        /*  47 */
        String ip = com.ykkoo.pet.utils.IPUtil.getIp(this.request);
        /*  48 */
        insurancePolicy.setIp(ip);
        /*  49 */
        KVResult result = this.insurancePolicyService.createInsurancePolicy(insurancePolicy, userId);
        /*  50 */
        return ServerResponse.createMessage(result);
    }


    @Authorization
    @ApiOperation("保单分页")
    @RequestMapping(value = {"getInsurancePolicyPage"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getInsurancePolicyPage(@ApiParam("页码 (从0开始)") @RequestParam(required = false, defaultValue = "0") Integer page,
                                                 @ApiParam("保险状态 1-没有卡 2-未生效 3-保障中 4-已过期") @RequestParam(required = false, defaultValue = "0") Integer insuranceStatus,
                                                 @ApiParam("保险类型 1-汪保 2-喵保") @RequestParam(required = false, defaultValue = "0") Integer insuranceType,
                                                 @ApiParam("宠物Id") @RequestParam(required = false, defaultValue = "0") Integer animalId,
                                                 @ApiIgnore @RequestAttribute Integer userId) {
        /*  61 */
        KVResult result = this.insurancePolicyService.getInsurancePolicyPage(page, insuranceStatus, insuranceType, 0, animalId, userId);
        /*  62 */
        return ServerResponse.createMessage(result);
    }

    @Authorization
    @ApiOperation("保单详情")
    @RequestMapping(value = {"getInsurancePolicyDetails"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getInsurancePolicyDetails(@RequestParam Integer insurancePolicyId, @ApiIgnore @RequestAttribute Integer userId) {
        /*  69 */
        KVResult result = this.insurancePolicyService.getInsurancePolicyDetails(insurancePolicyId, userId, null);
        /*  70 */
        return ServerResponse.createMessage(result);
    }

    @Authorization
    @ApiOperation("申请理赔")
    @RequestMapping(value = {"applyClaims"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse applyClaims(@RequestParam Integer insurancePolicyId,
                                      @RequestParam List<Long> insuranceDiseaseIdList,
                                      @RequestParam Double totalAmount,
                                      @RequestParam Double claimsAmount,
                                      @RequestParam String alipay,
                                      @RequestParam String realName,
                                      @ApiIgnore @RequestAttribute Integer userId) {
        /*  77 */
        KVResult result = this.insurancePolicyService.applyClaims(insurancePolicyId,insuranceDiseaseIdList,totalAmount,claimsAmount,alipay,realName, userId);
        /*  78 */
        return ServerResponse.createMessage(result);
    }

    @Authorization
    @ApiOperation("理赔详情")
    @RequestMapping(value = {"getCompensateDetails"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getCompensateDetails(@RequestParam Integer compensateId, @ApiIgnore @RequestAttribute Integer userId) {
        /*  85 */
        KVResult result = this.insurancePolicyService.getCompensateDetails(compensateId, userId);
        /*  86 */
        return ServerResponse.createMessage(result);
    }

    @Authorization
    @ApiOperation("上传理赔凭证")
    @RequestMapping(value = {"uploadClaimsVoucher"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    public ServerResponse uploadClaimsVoucher(ClaimsVoucherDTO claimsVoucherDTO, @ApiIgnore @RequestAttribute Integer userId) {
        /*  93 */
        KVResult result = this.insurancePolicyService.uploadClaimsVoucher(claimsVoucherDTO, userId);
        /*  94 */
        return ServerResponse.createMessage(result);
    }


    @Authorization
    @ApiOperation("理赔分页")
    @org.springframework.web.bind.annotation.GetMapping({"/getCompensatePage"})
    public ServerResponse getCompensatePage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page,
                                            @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size,
                                            @ApiParam("理赔状态 1-未申请 2-待提交 3-审核中 4-理赔中 5-已结案 ") @RequestParam(required = false, defaultValue = "0") Integer claimStatus,
                                            @ApiIgnore @RequestAttribute Integer userId) {
        /* 105 */
        KVResult result = this.insurancePolicyService.getCompensatePage(page, size, claimStatus, "", userId, null);
        /* 106 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @Authorization
    @ApiOperation("更新理赔")
    @PostMapping({"/updateCompensateInfo"})
    public ServerResponse updateCompensateInfo(@ApiParam("理赔ID") @RequestParam(required = true) Integer compensateId, @ApiParam("理赔状态 1-未申请 2-待提交 3-审核中 4-理赔中 5-已结案 6-删除") @RequestParam(required = true) Integer claimStatus, @ApiIgnore @RequestAttribute Integer userId) {
        /* 116 */
        KVResult result = this.insurancePolicyService.updateCompensateInfo(compensateId, claimStatus, userId);
        /* 117 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @Authorization
    @ApiOperation("更新")
    @PostMapping({"/update"})
    public ServerResponse update(@RequestBody FileUpdateDTO fileUpdateDTO, @ApiIgnore @RequestAttribute Integer userId) {
        /* 124 */
        KVResult result = this.fileService.update(fileUpdateDTO, userId);
        /* 125 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/InsurancePolicyController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */