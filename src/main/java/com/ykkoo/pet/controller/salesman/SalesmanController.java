package com.ykkoo.pet.controller.salesman;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.SalesmanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class SalesmanController {

    private SalesmanService salesmanService;


    @ApiOperation("销售员登录")
    @GetMapping({"signIn"})
    public ServerResponse signIn(@ApiParam @RequestParam String name, @ApiParam @RequestParam String password) {
        KVResult result = salesmanService.signIn(name, password);
        return ServerResponse.createMessage(result);
    }


}
