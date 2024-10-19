package com.spring_prep.learning.dsa.kunal.DP.recursion.easy;

public class PowerOf2 {
    public static void main(String[] args) {
        int input = 8;
    }

    public static boolean isPower(int n){
        if(n == 1){
            return true;
        }
        return isPower(n/2);
    }
}
