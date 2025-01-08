package com.spring_prep.learning.springcc.aop;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class EmployeUtil {

    public void empployeeHelper(String name, int age){
        System.out.println("Employee helper method has been called");
    }
}
