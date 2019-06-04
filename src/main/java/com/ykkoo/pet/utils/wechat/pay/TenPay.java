package com.ykkoo.pet.utils.wechat.pay;

import com.ykkoo.pet.utils.wechat.pay.utls.WxPayDTO;
import okhttp3.*;

import java.io.IOException;

import static com.ykkoo.pet.utils.wechat.pay.TenPayConfig.APP_ID;
import static com.ykkoo.pet.utils.wechat.pay.TenPayConfig.MCH_ID;
import static com.ykkoo.pet.utils.wechat.pay.TenPayConfig.NOTIFY_URL;


/**
 * 微信WEB支付
 *
 * @author : J.Tang
 * @version : v1.0
 * @email : seven_tjb@163.com
 * @date : 2018-10-25
 **/

public class TenPay {


    /**
     * 腾讯支付
     *
     * @param body             商品描述
     * @param attach           附加数据
     * @param out_trade_no     商户订单号
     * @param total_fee        总金额
     * @param spbill_create_ip 终端IP
     * @return 支付链接
     */
    public static String pay(String body, String attach, String out_trade_no, Integer total_fee, String spbill_create_ip) {

        OkHttpClient client = new OkHttpClient();

        WxPayDTO wxPayDTO = new WxPayDTO(APP_ID, MCH_ID, body, attach, out_trade_no, total_fee, spbill_create_ip, NOTIFY_URL,"JSAPI");

        RequestBody requestBody = RequestBody.create(MediaType.parse("XML"), wxPayDTO.toXmlString());

        Request request = new Request.Builder().url("https://api.mch.weixin.qq.com/pay/unifiedorder").post(requestBody).build();

        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String payUrl = "";

        try {
            payUrl = response.body().string();
            payUrl = payUrl.split("<mweb_url>")[1].replace("<![CDATA[", "");
            payUrl = payUrl.replace("]]></mweb_url>\n</xml>", "");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return payUrl;
    }


}
