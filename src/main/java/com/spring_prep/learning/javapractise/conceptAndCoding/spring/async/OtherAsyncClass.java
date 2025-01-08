package com.spring_prep.learning.javapractise.conceptAndCoding.spring.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class OtherAsyncClass {

    @Async
    public void async() throws InterruptedException {
        System.out.println("Inside async method " + Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}
