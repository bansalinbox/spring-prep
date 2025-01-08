package com.spring_prep.learning.javapractise.conceptAndCoding.spring.vedios18_interceptor.before_reaching_to_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    CustomInterceptor customInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor)
                .addPathPatterns("/interceptor/*")
                .excludePathPatterns("/interceptor/delete");
    }
}
