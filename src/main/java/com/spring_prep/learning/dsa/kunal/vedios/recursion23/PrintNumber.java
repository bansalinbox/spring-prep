package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class PrintNumber {

    public static void main(String[] args) {
        printNo(1);
    }
    public static void printNo(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        printNo(n + 1);
    }
}
