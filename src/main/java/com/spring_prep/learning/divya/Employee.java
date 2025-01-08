package com.spring_prep.learning.divya;

import java.util.List;

public class Employee {
    public int id;
    String firstName;
    String middleName;
    String lastName;
    int age;

    public static String name(String fname, String mName, String lName){
        String name = fname + " " + mName + " " +  lName;
        return name;
    }

    public static void hh(List<Employee> ll){
        for(Employee emp : ll){
            System.out.println(emp.age);
        }
    }
}
