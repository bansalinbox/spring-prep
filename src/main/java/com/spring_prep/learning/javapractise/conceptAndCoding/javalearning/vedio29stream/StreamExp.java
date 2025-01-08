package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio29stream;

import com.spring_prep.learning.javapractise.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExp {

    public static void main(String[] args) {
        Employee e1 = new Employee("gourav", 30, 40000.0);
        Employee e2 = new Employee("ankit", 34, 40001.0);
        Employee e3 = new Employee("zolo", 29, 40002.0);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        //1.
        List<Employee> ans = employees.stream().filter(x -> x.getAge() >= 30).collect(Collectors.toList());

        ans.forEach(x -> System.out.println(x));
    }
}
