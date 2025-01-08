package com.spring_prep.learning.springcc.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/aop")
public class Employee {


    @Autowired
    EmployeUtil employeUtil;


    @GetMapping(path = "/fetchemployee")
    public String fetchEmployee(){
        employeUtil.empployeeHelper("gourav", 25);
        return "item fetched";
    }
}
