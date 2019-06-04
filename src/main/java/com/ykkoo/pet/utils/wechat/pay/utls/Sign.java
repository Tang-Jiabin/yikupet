package com.ykkoo.pet.utils.wechat.pay.utls;

import java.util.Map;
import java.util.Set;


/**
 * Created by Smile on 16/8/22.
 */
public class Sign {

    public static String createSign(String characterEncoding, Map<Object, Object> parameters, String key) {
        StringBuilder sb = new StringBuilder();
        Set es = parameters.entrySet();
        for (Object e : es) {
            Map.Entry entry = (Map.Entry) e;
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            if (null != v && !"".equals(v)
                    && !"sign".equals(k) && !"key".equals(k)) {
                sb.append(k).append("=").append(v).append("&");
            }
        }
        sb.append("key=").append(key);
        return MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();
    }
}
