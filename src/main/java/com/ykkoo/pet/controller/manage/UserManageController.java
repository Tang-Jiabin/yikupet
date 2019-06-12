package com.ykkoo.pet.controller.manage;

import com.ykkoo.pet.common.annotation.AdminAuthorization;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "Z管理【用户】", description = "user")
@RestController
@RequestMapping({"/manage/user"})
@AdminAuthorization
public class UserManageController {
    private UserService userService;

    public UserManageController(UserService userService) {
        /* 25 */
        this.userService = userService;
    }


    @AdminAuthorization
    @io.swagger.annotations.ApiOperation("用户分页")
    @GetMapping({"/getUserPage"})
    public ServerResponse getUserPage(@ApiParam("页码") @RequestParam(required = false, defaultValue = "0") Integer page,
                                      @ApiParam("条数") @RequestParam(required = false, defaultValue = "10") Integer size,
                                      @ApiParam("用户手机号") @RequestParam(required = false, defaultValue = "") String phone,
                                      @ApiParam("用户昵称") @RequestParam(required = false, defaultValue = "") String nickName,
                                      @ApiParam("真实姓名") @RequestParam(required = false, defaultValue = "") String realName,
                                      @ApiParam("电子卡号") @RequestParam(required = false, defaultValue = "") String cardNumber,
                                      @ApiIgnore @org.springframework.web.bind.annotation.RequestAttribute Integer adminId) {
        /* 42 */
        KVResult result = this.userService.getUserPage(page, size, phone, nickName, realName, cardNumber, adminId);
        /* 43 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }
}

