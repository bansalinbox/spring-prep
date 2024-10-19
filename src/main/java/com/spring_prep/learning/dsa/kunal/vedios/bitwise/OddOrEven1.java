package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class OddOrEven1 {
    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println(isEven(1));
    }
    public static boolean isEven(int n){
        return (n & 1) == 0;
    }
}
