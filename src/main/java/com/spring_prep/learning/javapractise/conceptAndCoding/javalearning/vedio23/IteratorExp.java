package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio23;

import java.util.*;

public class IteratorExp {

    public static void main(String[] args) {
        List<Integer> aa = new ArrayList<>();
        aa.add(1);
        aa.add(2);
        aa.add(3);

        Iterator<Integer> itr = aa.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        aa.forEach(x -> System.out.println(x));

        int[] input = {13, 4, 17, 8};
        Arrays.sort(input);

    }
}

class Temp implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}