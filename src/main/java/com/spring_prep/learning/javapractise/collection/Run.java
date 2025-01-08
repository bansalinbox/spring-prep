package com.spring_prep.learning.javapractise.collection;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);


        Set<Map.Entry<Integer, Integer>> temp = map.entrySet();
        Set<Integer> temp2 = map.keySet();

        for( Map.Entry<Integer, Integer> temp3 : map.entrySet()){

        }

    }
}
