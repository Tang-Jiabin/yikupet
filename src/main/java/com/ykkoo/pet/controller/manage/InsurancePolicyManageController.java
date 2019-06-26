package com.ykkoo.pet.controller.manage;

import com.ykkoo.pet.common.annotation.AdminAuthorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.InsurancePolicyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "Z管理【保单】", description = "insurancePolicy")
@RestController
@RequestMapping({"/manage/insurancePolicy"})
@AdminAuthorization
public class InsurancePolicyManageController {
    private InsurancePolicyService insurancePolicyService;

    public InsurancePolicyManageController(InsurancePolicyService insurancePolicyService) {
        this.insurancePolicyService = insurancePolicyService;
    }


    @AdminAuthorization
    @ApiOperation("保单分页")
    @RequestMapping(value = {"getInsurancePolicyPage"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getInsurancePolicyPage(@ApiParam("页码 (从0开始)") @RequestParam(required = false, defaultValue = "0") Integer page,
                                                 @ApiParam("保险状态 1-审核未通过 2-未生效 3-保障中 4-已过期") @RequestParam(required = false, defaultValue = "0") Integer insuranceStatus,
                                                 @ApiParam("保险类型 1-汪保 2-喵保") @RequestParam(required = false, defaultValue = "0") Integer insuranceType,
                                                 @ApiParam("宠物Id") @RequestParam(required = false, defaultValue = "0") Integer animalId,
                                                 @ApiIgnore @RequestAttribute Integer adminId) {
        KVResult result = this.insurancePolicyService.getInsurancePolicyPage(page, insuranceStatus, insuranceType, 0, animalId, 0);
        return ServerResponse.createMessage(result);
    }

    @AdminAuthorization
    @ApiOperation("保单详情")
    @RequestMapping(value = {"getInsurancePolicyDetails"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getInsurancePolicyDetails(@RequestParam Integer insurancePolicyId, @ApiIgnore @RequestAttribute Integer adminId) {
        KVResult result = this.insurancePolicyService.getInsurancePolicyDetails(insurancePolicyId, null, adminId);
        return ServerResponse.createMessage(result);
    }


    @AdminAuthorization
    @ApiOperation("理赔分页")
    @GetMapping({"/getCompensatePage"})
    public ServerResponse getCompensatePage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page, @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size, @ApiParam("理赔状态 1-未申请 2-待提交 3-审核中 4-理赔中 5-已结案") @RequestParam(required = false, defaultValue = "0") Integer claimStatus, @ApiParam("用户手机号") @RequestParam(required = false, defaultValue = "") String phone, @ApiParam("用户手机号") @RequestParam(required = false, defaultValue = "0") Integer userId, @ApiIgnore @RequestAttribute Integer adminId) {
        /* 64 */
        KVResult result = this.insurancePolicyService.getCompensatePage(page, size,0, claimStatus, phone, userId, adminId);
        /* 65 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @AdminAuthorization
    @ApiOperation("更新理赔")
    @PostMapping({"/updateCompensateInfo"})
    public ServerResponse updateCompensateInfo(@ApiParam("理赔ID") @RequestParam(required = true) Integer compensateId, @ApiParam("理赔状态 1-未申请 2-待提交 3-审核中 4-理赔中 5-已结案") @RequestParam(required = true) Integer claimStatus, @ApiParam("审核状态 1-未审核 2-审核通过 3-审核未通过") @RequestParam(required = false, defaultValue = "1") Integer auditStatus, @ApiParam("审核说明") @RequestParam(required = false, defaultValue = "未审核") String auditExplain, @ApiIgnore @RequestAttribute Integer adminId) {
        /* 77 */
        KVResult result = this.insurancePolicyService.updateCompensateInfo(compensateId, claimStatus, auditStatus, auditExplain, adminId);
        /* 78 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }
}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/manage/InsurancePolicyManageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */