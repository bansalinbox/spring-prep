package com.spring_prep.learning.javapractise.conceptAndCoding.spring.vedios18_interceptor.after_controller_class;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyCustomInterceptor {

    @Around("@annotation(com.spring_prep.learning.javapractise.conceptAndCoding.spring.vedios18_interceptor.after_controller_class.MyCustomAnnotation)")
    public void invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("do something before the actual method call");
        String name = joinPoint.getSignature().getName();
        System.out.println("name --->" + name);
        joinPoint.proceed();
        System.out.println("do something after the actual method call");

    }
}
