package com.spring_prep.learning.javapractise;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() > o2.getAge() ? 1 : -1;
    }
}
