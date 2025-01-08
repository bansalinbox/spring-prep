package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.rough;

import com.spring_prep.learning.javainterview.Student;

import java.sql.Struct;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Compare {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Ankit", 24, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());


        Comparator<Student> byAgeDecreasing = (Student s1, Student s2) -> s2.getAge() - s1.getAge() ;

        Comparator<Student> byAge2 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        };

        // 1. list of student whose rank is between 50 to 100
        //List<Student> ans = studentList.stream().filter((x) -> x.getRank() >= 50 && x.getRank() <= 100).collect(Collectors.toList());
        //ans.stream().forEach(x -> System.out.println(x));


        // 2. Who lives in specific city and sort them by their name
//        List<Student> sortByAge = studentList.stream().sorted((Student s1, Student s2) -> {
//            return s1.getAge() - s2.getAge();
//        }).collect(Collectors.toList());
//        sortByAge.stream().forEach(x -> System.out.println(x));

        List<Student> sortByName = studentList.stream().sorted(byAge2.thenComparing(byAgeDecreasing)).collect(Collectors.toList());
        sortByName.stream().forEach(x -> System.out.println(x));


        // 3. Find all the distict department name

        List<String> distinctDept = studentList.stream().map((Student s ) -> s.getDept()).distinct().collect(Collectors.toList());
        distinctDept.stream().forEach(x -> System.out.println(x));

        // 4. Find all the contact No

        List<String> allPhoneNo =  studentList.stream().flatMap(s -> s.getContacts().stream()).collect(Collectors.toList());
        allPhoneNo.stream().forEach(x -> System.out.println(x));

        // 5. Group the student by Department

        Map<String, List<Student>> byDept = studentList.stream().collect(Collectors.groupingBy(x -> x.getDept()));

//        for(Map.Entry<String, List<Student>> temp : byDept.entrySet()){
//            System.out.println("Key -->" + temp.getKey());
//            System.out.println("Value -->" + temp.getValue());
//        }

        // 6. Find the department who is having maximum no of students.
        Map<String, Long> byDeptMaxCount = studentList.stream().collect(Collectors.groupingBy(x -> x.getDept(), Collectors.counting()));
        for(String key : byDeptMaxCount.keySet()){
            System.out.println("Key -->" + key);
            System.out.println("Value -->" + byDeptMaxCount.get(key));
        }
        // 7. Find the average age of male and female students
        Map<String, Double> averageAgeByGender = studentList.stream().collect(Collectors.groupingBy(x -> x.getGender(), Collectors.averagingDouble(x -> x.getAge())));
        for(String key : averageAgeByGender.keySet()){
            System.out.println("Key -->" + key);
            System.out.println("Value -->" + averageAgeByGender.get(key));
        }

        // 8. Find the highest rank in each department
        Map<String, Optional<Student>> highestRankInEachDept = studentList.stream().collect(Collectors.groupingBy(d -> d.getDept(), Collectors.maxBy(Comparator.comparing(x -> x.getRank()))));

        // 9. Find the 2nd highest rank

    }
}

class MyPredicate implements Predicate<Student>{

    @Override
    public boolean test(Student student) {
        return student.getRank() > 50;
    }
}
