package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

// find the sum till the nth row
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 4;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int temp = (1 << i);
            sum = sum + temp;
        }
        System.out.println(sum);
    }
}
