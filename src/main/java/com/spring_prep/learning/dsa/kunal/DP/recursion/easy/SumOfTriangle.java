package com.spring_prep.learning.dsa.kunal.DP.recursion.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTriangle {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        sum(input);

    }

    public static void sum(int[] input){
        List<List<Integer>> output = new ArrayList<>();
        int[] temp = input;
        for (int i = 0; i < input.length; i++) {
            temp = helper(temp);
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j]);
            }
            System.out.println();
        }
    }


    public static int[] helper(int[] input){
        int[] out = new int[input.length];
        for (int i = 1; i < input.length; i++) {
            out[i] = input[i-1] + input[i];
        }
        return out;
    }

//    public static List<Integer> sumHelper(int[] input){
//        for (int i = 0; i < input; i++) {
//
//        }
//    }
//
//    public static List<Integer> sum(int[] input){
//        List<Integer> output = null;
//        for (int i = 0; i < input.length -1; i++) {
//            output = new ArrayList<>();
//            output.add(input[i] + input[i+1]);
//        }
//        return output;
//    }
}
