package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio29stream;

import com.spring_prep.learning.javainterview.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // BY anonomus class
        Comparator<Student> compById = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getId() - o1.getId();
            }
        };

        Collections.sort(studentList, compById);
        //studentList.forEach(x -> System.out.println(x));

        // by lambda implementation
//        Collections.sort(studentList, (Student o1, Student o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
//        studentList.forEach(x -> System.out.println(x));

        // for comparing string there is only 1 option either use compareTo from comparable
        List<Student> newList = studentList.stream().sorted((Student o1, Student o2) -> o1.getFirstName().compareTo(o2.getFirstName())).collect(Collectors.toList());
        //newList.forEach(x -> System.out.println(x));

        // list of student whose rank is between 50 to 100
        //studentList.stream().filter(student -> student.getRank() >= 50 && student.getRank() <= 100).collect(Collectors.toList()).forEach(System.out::println);


        //Find the 2nd highest rank
        Optional<Student> aa = studentList.stream().sorted((s1, s2) -> s2.getRank() - s1.getRank()).skip(1).findFirst();
        if(!aa.isEmpty()){
            System.out.println(aa.get());
        }

        // 8. Find the highest rank in each department
//        Map<String, Optional<Student>> ff = studentList.stream().collect(Collectors.groupingBy((Student s) -> s.getDept(), Collectors.minBy(Comparator.comparing(Student::getRank))));
//        for(String student : ff.keySet()){
//            System.out.println(student + " has " + ff.get(student));
//        }

        //// 3. Find all the distinct department name
        //studentList.stream().map((s) -> s.getDept()).distinct().collect(Collectors.toList()).forEach(x -> System.out.println(x));
//        studentList.stream().map(s -> s.getDept()).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

        // 4. Find all the contact No
        //studentList.stream().flatMap((x) -> x.getContacts().stream()).collect(Collectors.toList()).forEach(System.out::println);

        // 5. Group the student by Department
//        Map<String, List<Student>> output = studentList.stream().collect(Collectors.groupingBy(x -> x.getDept()));
//        for(Map.Entry<String, List<Student>> key : output.entrySet()){
//            List<Student> values = output.get(key);
//            System.out.println("key : " + key + " has values : " + values);
//        }

        Map<String, Long> output2 = studentList.stream().collect(Collectors.groupingBy(x -> x.getDept(), Collectors.counting()));
        System.out.println(output2);
    }
}
