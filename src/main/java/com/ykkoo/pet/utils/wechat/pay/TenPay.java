package com.ykkoo.pet.utils.wechat.pay;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.ykkoo.pet.utils.wechat.pay.utls.WxPayDTO;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.ykkoo.pet.utils.wechat.WeChatConfig.APP_ID;
import static com.ykkoo.pet.utils.wechat.WeChatConfig.MCH_ID;
import static com.ykkoo.pet.utils.wechat.WeChatConfig.NOTIFY_URL;

public class TenPay
{
    private static final Logger log = LoggerFactory.getLogger(TenPay.class);

    public static String pay(String body, String attach, String out_trade_no, Integer total_fee, String spbill_create_ip, String opendId)
    {
        OkHttpClient client = new OkHttpClient();

        WxPayDTO wxPayDTO = new WxPayDTO(APP_ID, MCH_ID, body, attach, out_trade_no, total_fee, spbill_create_ip, NOTIFY_URL, "JSAPI", opendId);

        String xmlString = wxPayDTO.toXmlString();

        RequestBody requestBody = RequestBody.create(MediaType.parse("XML"), xmlString);

        Request request = new Request.Builder().url("https://api.mch.weixin.qq.com/pay/unifiedorder").post(requestBody).build();

        Response response = null;
        try
        {
            response = client.newCall(request).execute();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String payUrl = "";
        try
        {
            payUrl = response.body().string();
            log.info(payUrl);

            String nonceStr = payUrl.substring(payUrl.indexOf("<nonce_str><![CDATA[") + 20, payUrl.indexOf("]]></nonce_str>"));
            String packageStr = payUrl.substring(payUrl.indexOf("<prepay_id><![CDATA[") + 20, payUrl.indexOf("]]></prepay_id>"));
            String paySign = payUrl.substring(payUrl.indexOf("<sign><![CDATA[") + 15, payUrl.indexOf("]]></sign>"));

            Map<String, String> map = Maps.newHashMap();
            map.put("timeStamp", String.valueOf(System.currentTimeMillis()));
            map.put("nonceStr", nonceStr);
            map.put("package", packageStr);
            map.put("signType", "MD5");
            map.put("paySign", paySign);
            payUrl = new Gson().toJson(map);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return payUrl;
    }
}
