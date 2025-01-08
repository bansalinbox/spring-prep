package com.spring_prep.learning.springcc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("args(String, int)")
    public void beforeMehod(){
        System.out.println("AOP before method get triggered");
    }
}
