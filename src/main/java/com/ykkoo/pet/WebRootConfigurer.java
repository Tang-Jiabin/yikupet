package com.ykkoo.pet;

import com.ykkoo.pet.common.annotation.HospitalAuthorization;
import com.ykkoo.pet.common.annotation.SalesmanAuthorization;
import com.ykkoo.pet.common.interceptor.*;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author J.Tang
 */
@Configuration
@AllArgsConstructor
public class WebRootConfigurer extends WebMvcConfigurerAdapter {

    private AuthorizationInterceptor authorizationInterceptor;

    private AdminAuthorizationInterceptor adminAuthorizationInterceptor;

    private HospitalAuthorizationInterceptor hospitalAuthorizationInterceptor;

    private PromoterAuthorizationInterceptor promoterAuthorizationInterceptor;
    private SalesmanAuthorizationInterceptor salesmanAuthorizationInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(authorizationInterceptor).addPathPatterns("/**");
        registry.addInterceptor(adminAuthorizationInterceptor).addPathPatterns("/manage/**");
        registry.addInterceptor(hospitalAuthorizationInterceptor).addPathPatterns("/merchant/**");
        registry.addInterceptor(promoterAuthorizationInterceptor).addPathPatterns("/promoter/**");
        registry.addInterceptor(salesmanAuthorizationInterceptor).addPathPatterns("/salesman/**");
        super.addInterceptors(registry);
    }


}