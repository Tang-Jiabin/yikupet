package com.ykkoo.pet.utils.wechat.pay.utls;

import lombok.Data;

import java.util.Map;
import java.util.TreeMap;

import static com.ykkoo.pet.utils.wechat.WeChatConfig.API_KEY;
import static com.ykkoo.pet.utils.wechat.WeChatConfig.DEFAULT_CHARSET;
import static com.ykkoo.pet.utils.wechat.pay.utls.Sign.createSign;
import static com.ykkoo.pet.utils.wechat.pay.utls.XmlUtil.getRequestXml;


/**
 * 微信支付
 *
 * @author : J.Tang
 * @version : v1.0
 * @email : seven_tjb@163.com
 * @date : 2018-10-29
 **/
@Data
public class WxPayDTO {

    /**
     * 公众账号ID
     */
    private String appid;
    /**
     * 商户号
     */
    private String mch_id;

    /**
     * 随机字符串
     */
    private String nonce_str;

    /**
     * 签名
     */
    private String sign;

    /**
     * 商品描述
     */
    private String body;

    /**
     * 附加数据
     */
    private String attach;

    /**
     * 商户订单号
     */
    private String out_trade_no;

    /**
     * 总金额
     */
    private Integer total_fee;

    /**
     * 终端IP
     */
    private String spbill_create_ip;

    /**
     * 通知地址
     */
    private String notify_url;

    /**
     * 交易类型
     */
    private String trade_type;

    /**
     * 场景信息
     */
    private String scene_info;

    private String openid;

    public WxPayDTO(String appid, String mch_id, String body, String attach, String out_trade_no, Integer total_fee, String spbill_create_ip, String notify_url,String trade_type,String openid) {
        this.appid = appid;
        this.mch_id = mch_id;
        this.body = body;
        this.attach = attach;
        this.out_trade_no = out_trade_no;
        this.total_fee = total_fee;
        this.spbill_create_ip = spbill_create_ip;
        this.notify_url = notify_url;
        this.trade_type = trade_type;
        this.openid = openid;
    }


    public String toXmlString() {

        String currTime = TenpayUtil.getCurrTime();
        String strTime = currTime.substring(8, currTime.length());
        String strRandom = String.valueOf(TenpayUtil.buildRandom(4));
        String strReq = strTime + strRandom;

        Map<Object, Object> params = new TreeMap();

        params.put("appid", this.appid);

        params.put("attach", this.attach);

        params.put("body", this.body);

        params.put("mch_id", this.mch_id);

        params.put("nonce_str", strReq);

        params.put("notify_url", this.notify_url);

        params.put("out_trade_no", this.out_trade_no);

        params.put("spbill_create_ip", this.spbill_create_ip);

        params.put("total_fee", this.total_fee);

        params.put("openid", this.openid);

        params.put("trade_type", this.trade_type);
        String sign = Sign.createSign("UTF-8", params, API_KEY);

        params.put("sign", sign);

        return XmlUtil.getRequestXml(params);

    }
}
