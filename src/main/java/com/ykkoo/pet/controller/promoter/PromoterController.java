package com.ykkoo.pet.controller.promoter;

import com.ykkoo.pet.common.annotation.AdminAuthorization;
import com.ykkoo.pet.common.annotation.HospitalAuthorization;
import com.ykkoo.pet.common.annotation.PromoterAuthorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.PromoterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * 推广员
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/13
 * @email : seven_tjb@163.com
 **/

@Api(value = "Z推广【推广】", description = "promoter")
@RestController
@RequestMapping({"/promoter/user"})
@AdminAuthorization
@AllArgsConstructor
public class PromoterController {

    private PromoterService promoterService;

    @ApiOperation("推广员登录")
    @GetMapping({"signIn"})
    public ServerResponse signIn(@ApiParam @RequestParam String name, @ApiParam @RequestParam String password) {
        KVResult result = promoterService.signIn(name, password);
        return ServerResponse.createMessage(result);
    }


    @PromoterAuthorization
    @ApiOperation("获取账户详情")
    @GetMapping({"/getAccountInfo"})
    public ServerResponse getAccountInfo(@ApiParam("提现状态 1-未提现 2-提现中 3-已提现") @RequestParam(required = false, defaultValue = "1") Integer state, @ApiIgnore @RequestAttribute Integer promoterId) {
        KVResult result = promoterService.getAccountInfo(state, promoterId);
        return ServerResponse.createMessage(result);
    }


    @PromoterAuthorization
    @ApiOperation("提现")
    @PostMapping({"/cashWithdrawal"})
    public ServerResponse cashWithdrawal(@ApiParam("提现金额") @RequestParam Double amount, @ApiParam("银行卡号") @RequestParam String cardNumber, @ApiParam("开户行") @RequestParam String cardBank, @ApiParam("真实姓名") @RequestParam String name, @ApiParam("资金id集合") @RequestParam List<Integer> accountIdList, @ApiIgnore @RequestAttribute Integer promoterId) {
        KVResult result = promoterService.cashWithdrawal(amount, cardNumber, cardBank, name, accountIdList, promoterId);
        return ServerResponse.createMessage(result);
    }


    @PromoterAuthorization
    @ApiOperation("获取提现详情")
    @GetMapping({"/getWithdrawalInfo"})
    public ServerResponse getWithdrawalInfo(@ApiParam("提现状态 0-全部 1-提现中 2-已提现") @RequestParam(required = false, defaultValue = "0") Integer state, @ApiIgnore @RequestAttribute Integer promoterId) {
        KVResult result = promoterService.getWithdrawalInfo(state, promoterId);
        return ServerResponse.createMessage(result);
    }

}
