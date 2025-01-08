package com.spring_prep.learning.javainterview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentRun {
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

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
//                return o1.getFirstName().length() > o2.getFirstName().length() ? 1 : -1;
            }
        };

        Comparator<Student> comparatorById = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
                //return o1.getRank() > o2.getRank() ? 1 : -1;
            }
        };

        // 1. list of student whose rank is between 50 to 100
//        List<Student> filterByRank = studentList.stream().filter(x -> x.getRank() >= 50 && x.getRank() <= 100).collect(Collectors.toList());
//        filterByRank.stream().forEach(System.out::println);

        // 2. Who lives in specific city and sort them by their name
        List<Student> sortedByAge = studentList.stream().filter(student -> student.getCity().equals("Karnataka"))
                .sorted(comparatorById).collect(Collectors.toList());
        sortedByAge.stream().forEach(System.out::println);

        // 3. Find all the distict department name
        List<String> allDistinceDept = studentList.stream().map(Student::getDept).distinct().collect(Collectors.toList());
//        allDistinceDept.stream().forEach(System.out::println);

        Set<String> allDistinceDept2 = studentList.stream().map(Student::getDept).collect(Collectors.toSet());
//        allDistinceDept2.stream().forEach(System.out::println);

        // 4. Find all the contact No
        List<String> studentByContactsFlat = studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());
        studentByContactsFlat.stream().forEach(System.out::println);

        // 5. Group the student by Department
        Map<String, List<Student>> groupByDep = studentList.stream().collect(Collectors.groupingBy(x -> x.getDept()));
       // groupByDep.forEach((x, y) -> System.out.println(x + " have studends " + y.size()));

        Map<String, Long> groupByDep2 = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        //System.out.println(groupByDep2);

        // 6. Find the department who is having maximum no of students.
        Map.Entry<String, Long> result = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        //System.out.println(result);

        // 7. Find the average age of male and female students
        Map<String, Double> groupByGender = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
//        System.out.println(groupByGender);

        // 8. Find the highest rank in each department
        Map<String, Optional<Student>> byRankInEachDepartment = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
        //System.out.println(byRankInEachDepartment);

        // 9. Find the 2nd highest rank
        Student student = studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        //System.out.println(student);
    }
}
