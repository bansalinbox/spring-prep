package com.spring_prep.learning.divya;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
//        System.out.println(emp1.firstName);
//        System.out.println(emp1.age);
//        System.out.println(Employee.name("gourav", "H", "bansal"));
        emp1.age = 10;


        Employee emp2 =  new Employee();
        emp2.age = 10;
        emp1.age = 20;
//        System.out.println(emp2.age);
//        System.out.println(emp1.age);

        List<Employee>  employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        Employee.hh(employees);




    }
}
