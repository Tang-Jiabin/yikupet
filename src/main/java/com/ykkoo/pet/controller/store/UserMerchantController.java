package com.ykkoo.pet.controller.store;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.UserMerchantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "Z商户【用户】", description = "/merchant/user")
@RestController
@RequestMapping({"/merchant/user"})
public class UserMerchantController {
    private UserMerchantService userMerchantService;

    public UserMerchantController(UserMerchantService userMerchantService) {
        this.userMerchantService = userMerchantService;
    }


    @ApiOperation("商户登录")
    @GetMapping({"signIn"})
    public ServerResponse signIn(@ApiParam @RequestParam String name, @ApiParam @RequestParam String password) {
        KVResult result = this.userMerchantService.signIn(name, password);

        return ServerResponse.createMessage(result);
    }
}


