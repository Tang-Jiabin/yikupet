package com.ykkoo.pet.controller.manage;

import com.ykkoo.pet.common.annotation.AdminAuthorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.dto.HospitalDTO;
import com.ykkoo.pet.dto.PromoterDTO;
import com.ykkoo.pet.service.HospitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "Z管理【医院】", description = "hospital")
@RestController
@org.springframework.web.bind.annotation.RequestMapping({"/manage/hospital"})
@AdminAuthorization
public class HospitalManageController {
    private HospitalService hospitalService;

    public HospitalManageController(HospitalService hospitalService) {
        /* 28 */
        this.hospitalService = hospitalService;
    }


    @AdminAuthorization
    @ApiOperation("添加医院")
    @PostMapping({"/addHospital"})
    public ServerResponse addHospital(HospitalDTO hospitalDTO, @ApiIgnore @RequestAttribute Integer adminId) {
        /* 38 */
        KVResult result = this.hospitalService.addHospital(hospitalDTO, adminId);
        /* 39 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @AdminAuthorization
    @ApiOperation("医院分页")
    @GetMapping({"/getHospitalPage"})
    public ServerResponse getHospitalPage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page, @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size, @ApiParam("范围 0-全部 1-狗医院 2-猫医院") @RequestParam(required = false, defaultValue = "0") Integer scope, @ApiParam("类型 0-全部  1-芯片注射 2-定点就诊") @RequestParam(required = false, defaultValue = "0") Integer type, @ApiParam("合作状态 0-全部 1-合作中 2-已解约") @RequestParam(required = false, defaultValue = "0") Integer cooperationState, @ApiParam("医院名称") @RequestParam(required = false, defaultValue = "") String hospitalName, @ApiParam("联系人") @RequestParam(required = false, defaultValue = "") String contacts, @ApiIgnore @RequestAttribute Integer adminId) {
        /* 53 */
        KVResult result = this.hospitalService.getHospitalPage(page, size, scope, type, cooperationState, hospitalName, contacts, adminId);
        /* 54 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @AdminAuthorization
    @ApiOperation("添加推广员")
    @PostMapping({"/addPromoter"})
    public ServerResponse addPromoter(PromoterDTO promoterDTO, @ApiIgnore @RequestAttribute Integer adminId) {

        KVResult result = this.hospitalService.addPromoter(promoterDTO, adminId);

        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @AdminAuthorization
    @ApiOperation("推广员分页")
    @GetMapping({"/getPromoterPage"})
    public ServerResponse getPromoterPage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page,
                                          @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size,
                                          @ApiParam("范围 0-全部 1-狗医院 2-猫医院") @RequestParam(required = false, defaultValue = "0") Integer state,
                                          @ApiIgnore @RequestAttribute Integer adminId) {

        KVResult result = this.hospitalService.getPromoterPage(page, size, state, adminId);

        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @AdminAuthorization
    @ApiOperation("添加销售员")
    @PostMapping({"/addSalesman"})
    public ServerResponse addSalesman(@RequestParam Integer salesmanId,
                                      @RequestParam String name,
                                      @RequestParam String account,
                                      @RequestParam String password,
                                      @RequestParam String phone,
                                      @RequestParam String region,
                                      @RequestParam Integer state,
                                      @ApiIgnore @RequestAttribute Integer adminId) {

        KVResult result = hospitalService.addSalesman(salesmanId,name, account, password,phone,region,state, adminId);

        return ServerResponse.createMessage(result);
    }

    @AdminAuthorization
    @ApiOperation("销售员分页")
    @GetMapping({"/getSalesmanPage"})
    public ServerResponse getSalesmanPage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page,
                                          @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size,
                                          @ApiParam("状态 1-启用 2-禁用") @RequestParam(required = false, defaultValue = "0") Integer state,
                                          @ApiIgnore @RequestAttribute Integer adminId) {

        KVResult result = hospitalService.getSalesmanPage(page, size, state, adminId);

        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

}


