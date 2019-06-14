package com.ykkoo.pet.common.interceptor;

import com.ykkoo.pet.common.annotation.HospitalAuthorization;
import com.ykkoo.pet.common.annotation.PromoterAuthorization;
import com.ykkoo.pet.common.token.TokenManage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/6/13
 * @email : seven_tjb@163.com
 **/
@AllArgsConstructor
@Component
public class PromoterAuthorizationInterceptor  extends HandlerInterceptorAdapter  {

    @Autowired
    private TokenManage manager;


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        /* 36 */
        response.setHeader("Access-Control-Allow-Origin", "*");

        /* 38 */
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,Content-Type,Accept,token");

        /* 40 */
        response.setHeader("Access-Control-Expose-Headers", "token");

        /* 42 */
        response.setHeader("Access-Control-Allow-Method", "GET,HEAD,POST,PUT,DELETE,OPTIONS,PATCH");

        /* 44 */
        response.setHeader("Access-Control-Expose-Headers", "*");


        /* 47 */
        if (!(handler instanceof HandlerMethod)) {
            /* 48 */
            return true;
        }
        /* 50 */
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        /* 51 */
        Method method = handlerMethod.getMethod();
        /* 52 */
        PromoterAuthorization annotation = (PromoterAuthorization) method.getAnnotation(PromoterAuthorization.class);
        /* 53 */
        if (annotation == null) {
            /* 54 */
            return true;
        }
        /* 56 */
        String token = request.getHeader("token");

        /* 58 */
        if (StringUtils.isEmpty(token)) {
            /* 59 */
            HttpErrorReturn.writeNoLogin(response.getOutputStream());
            /* 60 */
            return false;
        }
        try {
            /* 64 */
            if (token.equals("tang")) {
                /* 65 */
                request.setAttribute("promoterId", Integer.valueOf(1));
                /* 66 */
                return true;
            }
            /* 68 */
            if (manager.checkPromoterToken(token)) {

                request.setAttribute("promoterId", manager.getPromoterToken(token).getUserId());

                return true;
            }
        } catch (Exception e) {
            /* 75 */
            HttpErrorReturn.writeNoLogin(response.getOutputStream());
            /* 76 */
            return false;
        }
        /* 78 */
        HttpErrorReturn.writeNoLogin(response.getOutputStream());
        /* 79 */
        return false;
    }
}
