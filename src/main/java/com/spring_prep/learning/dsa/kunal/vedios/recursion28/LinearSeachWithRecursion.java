package com.spring_prep.learning.dsa.kunal.vedios.recursion28;

public class LinearSeachWithRecursion {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 5, 6, 11, 10};
        System.out.println(search(input, 10));
    }

    public static int search(int[] input, int target){
        return helper(input, 0, target);
    }

    public static int helper(int[] input, int index, int target){
        if(index > input.length-1){
            return -1;
        }
        if(input[index] == target){
            return index;
        }
        return helper(input, index + 1, target);
    }
}
