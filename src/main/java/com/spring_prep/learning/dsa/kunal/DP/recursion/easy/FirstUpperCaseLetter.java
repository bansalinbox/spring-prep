package com.spring_prep.learning.dsa.kunal.DP.recursion.easy;

public class FirstUpperCaseLetter {
    public static void main(String[] args) {

        System.out.println((5 & 1) == 1);
//        String input = "gees";
//        System.out.println(find(input, 0));
    }
    public static char find(String input, int index){

        if(index > input.length() -1){
            return 0;
        }
        if(Character.isUpperCase(input.charAt(index))){
            return input.charAt(index);
        }
        return find(input, index+1);

    }
}
