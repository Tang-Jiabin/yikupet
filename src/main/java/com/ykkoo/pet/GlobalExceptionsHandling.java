package com.ykkoo.pet;

import com.ykkoo.pet.common.http.ServerResponse;
import com.ykkoo.pet.utils.MailUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 全局异常处理
 *
 * @author J.Tang
 * @version V1.0
 * @email seven_tjb@163.com
 * @date 2018-11-14
 */
@ControllerAdvice
public class GlobalExceptionsHandling {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ServerResponse exceptionsHandle(Exception e) {

        StringBuilder sb = new StringBuilder();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        sb.append("宠物:");
        sb.append(sdf.format(new Date()));
        sb.append("<br/> \n ");
        sb.append(e.getMessage());
        sb.append("<br/> \n ");

        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("<br/> \n ");
        }

        String email = "seven_tjb@163.com";
        String sub = e.getMessage();
        String content = sb.toString();

        try {
            MailUtil.sendMail(email, sub, content, null);
        } catch (Exception e1) {
            e.printStackTrace();
        }
        e.printStackTrace();

        return ServerResponse.createMessage(500, "系统错误");
    }


}
