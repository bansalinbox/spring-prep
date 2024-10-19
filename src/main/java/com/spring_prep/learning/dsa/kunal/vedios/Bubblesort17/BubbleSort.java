package com.spring_prep.learning.dsa.kunal.vedios.Bubblesort17;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] input = {30, 0, 1, 3, 4, 5, 6, 11, 10, 4, 8, 8, 8};
        int[] input = {3, 4, 5, 1, 2, 3};
//        int[] input = {1, 2, 5, 7, 9};
        System.out.println(Arrays.toString(sort(input)));
    }

    static int[] sort(int[] input){
        for (int i = 0; i < input.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < input.length - i; j++) {
                if(input[j -1 ] > input[j]){
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                    isSwapped = true;
                }
            }
            System.out.println("i -->" + i);
            if(!isSwapped){
                break;
            }
        }
        return input;
    }
}
