package com.spring_prep.learning.javapractise.conceptAndCoding.spring.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@EnableAsync
public class UserAPI {

    @Autowired
    public OtherAsyncClass otherAsyncClass;


    @GetMapping(path = "/getuser")
    public String getUserMethod() throws InterruptedException {
        System.out.println("Inside end point " + Thread.currentThread().getName());
        otherAsyncClass.async();
        return "I am done";
    }

}
