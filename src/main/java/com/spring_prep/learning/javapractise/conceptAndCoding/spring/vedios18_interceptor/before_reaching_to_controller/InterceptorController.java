package com.spring_prep.learning.javapractise.conceptAndCoding.spring.vedios18_interceptor.before_reaching_to_controller;

import com.spring_prep.learning.javapractise.conceptAndCoding.spring.vedios18_interceptor.after_controller_class.InterceptorUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/interceptor/")
public class InterceptorController {

    @Autowired
    InterceptorUser interceptorUser;


    @GetMapping(path = "/test")
    public void test(){

        System.out.println("contoller has been called");
        interceptorUser.updateUser();
        interceptorUser.updateUser2();
    }
}
