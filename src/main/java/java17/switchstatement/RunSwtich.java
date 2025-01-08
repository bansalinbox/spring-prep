package java17.switchstatement;

import java17.Employee;

public class RunSwtich {
    public static void main(String[] args) {
        System.out.println(checkType(7));
    }

    public static String checkType(Object obj){
        return switch (obj){
            case Integer i -> "it is an integer";
            //case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case Employee employee && employee.name().equals("test") -> "";
            case null -> "it is a null object";
            default -> "it is of unknown data type";
        };
    }
}
