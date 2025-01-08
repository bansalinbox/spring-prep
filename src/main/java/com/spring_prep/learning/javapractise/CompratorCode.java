package com.spring_prep.learning.javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompratorCode {

    public static void main(String[] args) {
        Employee e1 = new Employee("gourav", 30, 40000.0);
        Employee e2 = new Employee("ankit", 34, 40001.0);
        Employee e3 = new Employee("zolo", 29, 40002.0);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);


//        Employee[] employees = new Employee[3];
//        employees[0] = e1;
//        employees[1] = e2;
//        employees[2] = e3;
//
//        Arrays.sort(employees, (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));
//
//        for (Employee ee : employees){
//            System.out.println(ee.getName());
//        }

        employees.forEach(System.out::println);
        Collections.sort(employees);
        System.out.println("=====================");
//        employees.forEach(System.out::println);

        System.out.println("=====================");
        employees.sort(new EmployeeComparator());
        employees.forEach(System.out::println);

        Collections.sort(employees, new EmployeeComparator());

        List<Employee> bb = employees.stream().sorted().collect(Collectors.toList());
        bb.forEach(System.out::println);


    }
}
