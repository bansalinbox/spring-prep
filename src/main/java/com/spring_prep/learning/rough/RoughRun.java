package com.spring_prep.learning.rough;

import java.util.HashMap;

public class RoughRun {

    public static void main(String[] args) {
        HashMap<Cat, String> hh = new HashMap<>();
        Cat c1 = new Cat("person1", 22);
        Cat c2 = new Cat("person2", 22);
        hh.put(c1, "person1");
        hh.put(c2, "person2");

        System.out.println(hh.get(c1));
        System.out.println(hh.get(c2));

    }
}
