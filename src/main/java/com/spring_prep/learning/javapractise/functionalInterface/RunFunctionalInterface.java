package com.spring_prep.learning.javapractise.functionalInterface;

public class RunFunctionalInterface {

    public static void main(String[] args) {
        // 1.1 1st way, but little longer
        Converter<String, Integer> obj = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };

        int output1 = obj.convert("40");
        System.out.println(output1);

        //1.2 Another way
        Converter<String, Integer> obj2 = (String a) -> Integer.valueOf(a);
        int output2 = obj2.convert("90");
        System.out.println(output2);

        //1.3 Short Further
        Converter<String, Integer> obj3 = Integer::valueOf;
        int output3 = obj3.convert("100");
        System.out.println(output3);

        // 2. If there are multiple parameter, let see how 1.3 will work
        Converter2<String, Integer, Integer> obj4 = (a, b) -> Integer.valueOf(a) + b;
        int output4 = obj4.convert("5", 9);
        System.out.println(output4);

        //2.2 not possible
        // Converter2<String, Integer, Integer> obj5 = (a, b) -> Integer::valueOf + b;


    }
}
