package com.spring_prep.learning.javapractise.conceptAndCoding.spring.transaction;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class User {

    @Transactional
    public void updateUser(){
        System.out.println("Update query to update user db value");
    }
}
