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

    public static final String APP_ID = "wx0ba8bd8b4ff6901c";
    public static final String APP_SECRET = "9c92803f65f1bc093610be06b92dab0c";
    public static final String CODE_SESSION_URL = "https://api.weixin.qq.com/sns/jscode2session";
    public static final String MCH_ID = "1536362081";
    public static final String API_KEY = "UDkqMRSAMz4HIws3Ll7T9PVcktX9xD0g";
    public static final String NOTIFY_URL = "https://wechat.ykkoo.com/pet/pay/tenCallback";
    public static final String DEFAULT_CHARSET = "UTF-8";
}
