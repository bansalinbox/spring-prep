package com.spring_prep.learning.dsa.algomaster.twopointer.samedirection;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {0, 0, 1, 1, 1, 2, 2};
        remove(input);
    }
    public static void remove(int[] input){
        if(input.length == 1){
            return;
        }
        int i = 0;
        int j =1;
        while (j < input.length) {
            if(input[i] == input[j]){
                j++;
            }else{
                i++;
                input[i] = input[j];
                j++;
            }
        }
        System.out.println("total distinct = " + i);
        System.out.println(Arrays.toString(input));
    }
}
