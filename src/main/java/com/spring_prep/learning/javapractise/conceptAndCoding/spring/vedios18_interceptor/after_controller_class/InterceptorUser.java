package com.spring_prep.learning.javapractise.conceptAndCoding.spring.vedios18_interceptor.after_controller_class;


import org.springframework.stereotype.Component;

@Component
public class InterceptorUser {

    @MyCustomAnnotation(name = "updateUser333")
    public void updateUser(){
        System.out.println("Since this method is called, mean it get intercepted after the controller");
    }

    @MyCustomAnnotation(name = "updateUser222")
    public void updateUser2(){
        System.out.println("Since this method is called, mean it get intercepted after the controller222");
    }
}
