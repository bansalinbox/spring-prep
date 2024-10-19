package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

import java.util.Arrays;

public class FindNotRepatingMoreThanLimit8 {
    public static void main(String[] args) {
        int[] input = {9, 2, 4, 2, 2, 4, 9, 4};
        find(input);
    }
    public static int find(int[] input){
        int[] output = new int[8];
        // calculate and add bits
        for (int i = 0; i < input.length; i++) {
            int temp = input[i];
            int index = 0;
            while (temp != 0){
                int bit = temp & 1;
                output[output.length -1 -index] = bit + output[output.length -1 -index];
                temp = temp >> 1;
                index++;
            }
        }

        // calculate mod
        for (int i = 0; i < output.length; i++) {
            int sum = output[i];
            output[i] = sum % 3;
        }
        System.out.println(Arrays.toString(output));
        int base = 2;
        int total = 0;
        int index = output.length -1;
        for (int i = output.length -1 ; i >=0; i--) {
            if(output[i] != 0){
                total +=  Math.pow(2, output.length -1 - index);
            }
            index--;
        }
        System.out.println(total);
        return total;
    }
}
