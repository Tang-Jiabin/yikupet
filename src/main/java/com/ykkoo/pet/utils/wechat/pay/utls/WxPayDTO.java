package com.ykkoo.pet.utils.wechat.pay.utls;

import lombok.Data;

import java.util.Map;
import java.util.TreeMap;

import static com.ykkoo.pet.utils.wechat.pay.TenPayConfig.API_KEY;
import static com.ykkoo.pet.utils.wechat.pay.TenPayConfig.DEFAULT_CHARSET;
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

    public WxPayDTO(String appid, String mch_id, String body, String attach, String out_trade_no, Integer total_fee, String spbill_create_ip, String notify_url,String trade_type) {
        this.appid = appid;
        this.mch_id = mch_id;
        this.body = body;
        this.attach = attach;
        this.out_trade_no = out_trade_no;
        this.total_fee = total_fee;
        this.spbill_create_ip = spbill_create_ip;
        this.notify_url = notify_url;
        this.trade_type = trade_type;
    }


    public String toXmlString() {

        String currTime = TenpayUtil.getCurrTime();
        String strTime = currTime.substring(8, currTime.length());
        String strRandom = String.valueOf(TenpayUtil.buildRandom(4));
        String strReq = strTime + strRandom;

        Map<Object, Object> params = new TreeMap<>();
        //应用ID
        params.put("appid", appid);
        //自定义数据包
        params.put("attach", attach);
        //商品描述
        params.put("body", body);
        //商户ID
        params.put("mch_id", mch_id);
        //随机字符串
        params.put("nonce_str", strReq);
        //通知地址
        params.put("notify_url", nonce_str);
        //商户订单号
        params.put("out_trade_no", this.out_trade_no);
        //终端IP
        params.put("spbill_create_ip", this.spbill_create_ip);
        //总金额
        params.put("total_fee", this.total_fee);
        //交易类型
        params.put("trade_type", trade_type);

        params.put("sign", createSign(DEFAULT_CHARSET, params, API_KEY));


        return getRequestXml(params);

    }
}
