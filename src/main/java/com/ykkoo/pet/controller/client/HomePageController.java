package com.ykkoo.pet.controller.client;

import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.service.HomePageService;
import com.ykkoo.pet.vo.HomePageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@Api(value = "首页", description = "homePage")
@RestController
@RequestMapping({"/homePage"})
public class HomePageController {
    private HomePageService homePageService;

    private static Map<String, String> map = new HashMap<>();

    public HomePageController(HomePageService homePageService) {
        /* 24 */
        this.homePageService = homePageService;
    }


    /* 29 */   private static Integer show = Integer.valueOf(1);

    @ApiOperation("首页1.0")
    @RequestMapping(value = {"getV1"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getV1() {
        /* 35 */
        KVResult<HomePageVO> result = this.homePageService.getV1();
        /* 37 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }

    @ApiOperation("首页2.0")
    @RequestMapping(value = {"getV2"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getV2() {
        /* 35 */
        KVResult<HomePageVO> result = this.homePageService.getV2();
        /* 37 */
        return ServerResponse.createMessage(result.getKey().intValue(), result.getVal());
    }


    @ApiOperation("getShow")
    @RequestMapping(value = {"getShow"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getShow(@RequestParam Integer set) {

        if ((set.intValue() == 1) || (set.intValue() == 2)) {

            show = set;
        }

        KVResult result = KVResult.put(HttpStatus.OK, show);

        return ServerResponse.createMessage(result);
    }

    @ApiOperation("getDate")
    @RequestMapping(value = {"getDate"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ServerResponse getDate(@RequestParam(required = false, defaultValue = "") String key, @RequestParam(required = false, defaultValue = "") String val, @RequestParam(required = false, defaultValue = "1") Integer type) {
        Map<String, String> result = new HashMap<>();
        if (type == 1) {
            map.put(key, val);
        } else if (type == 2) {
            if (StringUtils.isEmpty(key)) {
                result = map;
            } else {
                String a = map.get(key);
                result.put(key, a);
            }
        } else {
            map.remove(key);
        }

        return ServerResponse.createMessage(KVResult.put(result));
    }


}


/* Location:              /Users/edz/Desktop/pet.war!/WEB-INF/classes/com/ykkoo/pet/controller/client/HomePageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */