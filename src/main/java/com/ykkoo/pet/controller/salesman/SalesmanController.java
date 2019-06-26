package com.ykkoo.pet.controller.salesman;

import com.ykkoo.pet.common.annotation.AdminAuthorization;
import com.ykkoo.pet.common.annotation.PromoterAuthorization;
import com.ykkoo.pet.common.annotation.SalesmanAuthorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.dto.HospitalDTO;
import com.ykkoo.pet.dto.PromoterDTO;
import com.ykkoo.pet.pojo.PetHospital;
import com.ykkoo.pet.service.HospitalService;
import com.ykkoo.pet.service.SalesmanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 销售人员
 *
 * @author J.Tang
 * @version V1.0
 * @email seven_tjb@163.com
 * @date 2019-06-23
 */
@Api(value = "Z销售员【销售】", description = "/salesman")
@RestController
@RequestMapping({"/salesman/user"})
@AllArgsConstructor
public class SalesmanController {

    private SalesmanService salesmanService;
    private HospitalService hospitalService;


    @ApiOperation("销售员登录")
    @GetMapping({"signIn"})
    public ServerResponse signIn(@ApiParam @RequestParam String name, @ApiParam @RequestParam String password) {
        KVResult result = salesmanService.signIn(name, password);
        return ServerResponse.createMessage(result);
    }

    @SalesmanAuthorization
    @ApiOperation("添加推广员")
    @PostMapping({"/addPromoter"})
    public ServerResponse addPromoter(PromoterDTO promoterDTO, @ApiIgnore @RequestAttribute Integer salesmanId) {

        KVResult result = hospitalService.addPromoter(promoterDTO, salesmanId);

        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @SalesmanAuthorization
    @ApiOperation("推广员分页")
    @GetMapping({"/getPromoterPage"})
    public ServerResponse getPromoterPage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page,
                                          @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size,
                                          @ApiParam("范围 0-全部 1-狗医院 2-猫医院") @RequestParam(required = false, defaultValue = "0") Integer state,
                                          @ApiIgnore @RequestAttribute Integer salesmanId) {

        KVResult result = this.hospitalService.getPromoterPage(page, size, state, salesmanId);

        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @SalesmanAuthorization
    @ApiOperation("添加医院")
    @PostMapping({"/addHospital"})
//    @RequestBody 添加这个能看到格式
    public ServerResponse addHospital(HospitalDTO hospitalDTO, @ApiIgnore @RequestAttribute Integer salesmanId) {
        /* 38 */
        KVResult result = this.hospitalService.addHospital(hospitalDTO, salesmanId);
        /* 39 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @SalesmanAuthorization
    @ApiOperation("医院分页")
    @GetMapping({"/getHospitalPage"})
    public ServerResponse getHospitalPage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page,
                                          @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size,
                                          @ApiParam("范围 0-全部 1-狗医院 2-猫医院") @RequestParam(required = false, defaultValue = "0") Integer scope,
                                          @ApiParam("类型 0-全部  1-芯片注射 2-定点就诊") @RequestParam(required = false, defaultValue = "0") Integer type,
                                          @ApiParam("合作状态 0-全部 1-合作中 2-已解约") @RequestParam(required = false, defaultValue = "0") Integer cooperationState,
                                          @ApiParam("医院名称") @RequestParam(required = false, defaultValue = "") String hospitalName,
                                          @ApiParam("联系人") @RequestParam(required = false, defaultValue = "") String contacts,
                                          @ApiIgnore @RequestAttribute Integer salesmanId) {
        /* 53 */
        KVResult result = this.hospitalService.getHospitalPage(page, size, scope, type, cooperationState, hospitalName, contacts, salesmanId);
        /* 54 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @SalesmanAuthorization
    @ApiOperation("获取账户详情")
    @GetMapping({"/getAccountInfo"})
    public ServerResponse getAccountInfo(@ApiParam("开始日期 2019-01-01 00:00:00") @RequestParam String startDate,
                                         @ApiParam("结束日期 2019-01-01 00:00:00") @RequestParam String endDate,
                                         @ApiIgnore @RequestAttribute Integer salesmanId) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = null;
        Date end = null;
        try {
            start = sdf.parse(startDate);

            end = sdf.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return ServerResponse.createMessage(KVResult.put(433, "日期错误"));
        }

        KVResult result = salesmanService.getAccountInfo(start, end, salesmanId);
        return ServerResponse.createMessage(result);
    }
}
