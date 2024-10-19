package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class SumOfDigits {
    static int sum = 0;
    public static void main(String[] args) {
        System.out.println(sum(1239));
    }

    public static int sum(int n){
        if(n == 0){
            return n;
        }
        return (n % 10) + sum(n / 10);
    }
}
