package java17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaUpgrade17 {

    public static void main(String[] args) {
        Map<String, String> test = new HashMap<>();

        var test2 = new HashMap<String, Integer>();
        test2.put("name", 1);
        Integer value = test2.get("name");

        Employee emp = new Employee("Gourav", "1260");
        Employee emp2 = new Employee("Gourav", "1260");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp2);

//        Employee xx = employeeList.stream()
//                .filter(employee -> employee.name().equals("Gourav"))
//                .findFirst().orElseThrow( new Exx());
//        System.out.println(xx);

//        System.out.println(emp.equals(emp2));
//
//        System.out.println(Employee.combine("test"));
//


    }


}
