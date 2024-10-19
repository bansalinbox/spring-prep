package com.spring_prep.learning.dsa.kunal.vedios.recursion28;

public class ArraySortedORNot {

    public static void main(String[] args) {
        int[] input = {1, 3, 6, 18, 11, 19, 33, 44};
        // System.out.println(check(input));
        System.out.println(check2(input));
        // System.out.println(checkWithRecursion(input));
        //System.out.println(checkWithRecursionBetter(input));

    }


    public static boolean check(int[] input){
        if(input.length == 1){
            return true;
        }
        int i = 0;
        for (int j = 1; j < input.length; j++) {
            if(input[i] > input[j]){
                return false;
            }
            i = j;
        }
        return true;
    }

    public static boolean check2(int[] input){
        if(input.length == 1){
            return true;
        }
        for (int i = 1; i < input.length; i++) {
            if(input[i-1] > input[i]){
                return false;
            }
        }
        return true;
    }


    public static boolean checkWithRecursion(int[] input){
        if(input.length == 1){
            return true;
        }
        return helper(input, 0, 1);
    }

    public static boolean helper(int[] input, int start, int end){
        if(end > input.length -1){
            return true;
        }
        if(input[start] > input[end]){
            return false;
        }
        return helper(input, start+1, end+1);
    }

    public static boolean checkWithRecursionBetter(int[] input){
        if(input.length == 1){
            return true;
        }
        return helperBetter(input, 0);
    }

    public static boolean helperBetter(int[] input, int index){
        if(index+1 > input.length -1){
            return true;
        }
        if(input[index] > input[index+1]){
            return false;
        }
        return helperBetter(input, index + 1);
    }
}
