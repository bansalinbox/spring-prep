package com.spring_prep.learning.dsa.kunal.vedios.recursion32;

import java.util.ArrayList;
import java.util.Arrays;

// subset in iterative way
public class SubSet {
    public static void main(String[] args) {
        int[] input = {1, 2, 2 };
        System.out.println(subset(input));
    }

    public static ArrayList<ArrayList<Integer>> subset(int[] input){
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < input.length; i++) {
            if(output.isEmpty()){
                output.add(new ArrayList<Integer>());
                output.add(new ArrayList<Integer>(Arrays.asList(input[i])));
            }else {
                int current = output.size();
                for (int j = 0; j < current; j++) {
                    ArrayList<Integer> temp = output.get(j);
                    ArrayList<Integer> copy = new ArrayList<>(temp);
                    copy.add(input[i]);
                    output.add(copy);
                }
            }
        }
        return output;
    }
}
