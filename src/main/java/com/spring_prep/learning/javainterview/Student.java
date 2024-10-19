package com.spring_prep.learning.javainterview;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {

    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String dept;
    private String city;
    private int rank;
    private List<String> contacts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (age != student.age) return false;
        if (rank != student.rank) return false;
        if (!firstName.equals(student.firstName)) return false;
        if (!gender.equals(student.gender)) return false;
        if (!dept.equals(student.dept)) return false;
        if (!city.equals(student.city)) return false;
        return contacts.equals(student.contacts);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + age;
        result = 31 * result + gender.hashCode();
        result = 31 * result + dept.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + rank;
        result = 31 * result + contacts.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}
