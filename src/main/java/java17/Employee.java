package java17;

public record Employee(String name, String address) {

    public Employee(String name){
        this(name, "");
    }

    public static String unknown_address = "unknown";

    public static String combine(String name){
        String finalName = name + " Hellow";
        return finalName;
    }

}
