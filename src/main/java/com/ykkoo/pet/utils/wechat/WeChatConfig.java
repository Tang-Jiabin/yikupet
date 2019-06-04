package com.ykkoo.pet.utils.wechat;

import lombok.Data;

/**
 * 微信配置文件
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/13
 * @email : seven_tjb@163.com
 **/
@Data
public class WeChatConfig {

    /**
     * APPID
     */
    public static final String APP_ID = "";
    /**
     * APP secret
     */
    public static final String APP_SECRET = "";

    /**
     * 登录凭证校验
     */
    public static final String CODE_SESSION_URL = "https://api.weixin.qq.com/sns/jscode2session";
}
