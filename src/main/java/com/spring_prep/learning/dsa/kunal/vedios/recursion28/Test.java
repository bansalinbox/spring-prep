package com.spring_prep.learning.dsa.kunal.vedios.recursion28;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] input = {88, 4, 8, 7, 8, 8};
        int target = 8;
        System.out.println(search(input, 8, 0, new ArrayList<>()));
        System.out.println(search2(input, 8, 0));
    }

    public static List<Integer>  search(int[] input, int target, int index, List<Integer> output){
        if(index > input.length -1){
            return output;
        }
        if(input[index] == target) {
            output.add(index);
        }
        return search(input, target, index + 1, output);
    }

    public static List<Integer> search2(int[] input, int target, int index){
        List<Integer> output = new ArrayList<>();
        if(index > input.length -1){
            return output;
        }
        if(input[index] == target) {
            output.add(index);
        }
        output.addAll(search2(input, target, index + 1));
        return output;
    }
}
