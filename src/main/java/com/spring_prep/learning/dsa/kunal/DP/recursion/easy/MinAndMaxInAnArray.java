package com.spring_prep.learning.dsa.kunal.DP.recursion.easy;

public class MinAndMaxInAnArray {
    public static void main(String[] args) {
        int[] input = {1, -9 , 2, 13, 4, 15, -20};
        System.out.println(min(input, 0));
        System.out.println(minBetter(input, 0));
    }




    public static int min(int[] input, int index){
        int output = Integer.MAX_VALUE;
        if(index > input.length -1){
            return output;
        }
        if(input[index] < output){
            output = input[index];
        }
        int temp = min(input, index + 1);
        if(temp < output){
            output = temp;
        }
        return output;
    }

    public static int minBetter(int[] input, int index){
        if(index == input.length -1){
            return input[index];
        }
        return Math.min(input[index], minBetter(input, index+1));
    }
}
