package com.ykkoo.pet.utils.wechat.pay.utls;

public class PayCommonUtil {
	public static String setXML(String return_code,String return_msg){
		return "<xml><return_code><![CDATA["+return_code+"]]></return_code><return_msg><![CDATA["+return_msg+"]]></return_msg></xml>";
	}
}
