package com.spring_prep.learning.javapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompratorCode {

    public static void main(String[] args) {
        Employee e1 = new Employee("gourav", 30, 40000.0);
        Employee e2 = new Employee("ankit", 34, 40001.0);
        Employee e3 = new Employee("zolo", 29, 40002.0);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employees.forEach(System.out::println);
        Collections.sort(employees);
        employees.forEach(System.out::println);

//        employees.forEach(System.out::println);
//
//        List<Employee> bb = employees.stream().sorted().collect(Collectors.toList());
//        bb.forEach(System.out::println);


    }
}
