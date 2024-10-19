package com.spring_prep.learning.dsa.tuf.step3.medium;

import java.util.Arrays;

public class DutchFlagProblem {
    public static void main(String[] args) {
        int[] input = {0, 2, 1, 2, 2, 0, 1, 2};
        System.out.println(Arrays.toString(group(input)));
    }

    public static int[] group(int[] input){
        int low = 0;
        int mid = 0;
        int high = input.length -1;

        while(mid <= high){
            if(input[mid] == 0){
                int temp = input[low];
                input[low] = input[mid];
                input[mid] = temp;
                low++;
                mid++;
            }

            if(input[mid] == 1){
                mid++;
            }

            if(input[mid] == 2){
                int temp = input[mid];
                input[mid] = input[high];
                input[high] = temp;
                high--;
            }
        }
        return input;
    }
}
