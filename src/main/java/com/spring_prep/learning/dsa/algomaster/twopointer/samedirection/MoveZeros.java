package com.spring_prep.learning.dsa.algomaster.twopointer.samedirection;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] input = {1, 0, 0, 2, 0, 0, 7};
        move(input);
    }

    public static void move(int[] input){
        int i = 0;
        for (int j = 0; j < input.length; j++) {
            if(input[j] != 0){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(input));
    }
}
