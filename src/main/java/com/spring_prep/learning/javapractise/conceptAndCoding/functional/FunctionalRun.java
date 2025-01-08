package com.spring_prep.learning.javapractise.conceptAndCoding.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalRun {

    public static void main(String[] args) {
        Consumer<Integer> consume = (Integer z) ->{
            System.out.println("I am consumer interface, only consume, no return type");
        };

        consume.accept(10);


        Supplier<String> supplier = ()->{
            return "Supplier does not take anything but return something";
        };
        String aa = supplier.get();
        System.out.println(aa);

        Predicate<Integer> predicate = (Integer input)->{
            return true;
        };
        boolean output = predicate.negate().test(10);
        System.out.println(output);

        Function<Integer, String> function = (Integer input) ->{
            if(input > 10){
                return "one input and one output";
            }else{
                return "so easy";
            }
        };
        String output2 = function.apply(11);
        System.out.println(output2);

    }
}
