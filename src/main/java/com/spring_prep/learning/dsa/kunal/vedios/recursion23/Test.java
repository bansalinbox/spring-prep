package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class Test {
    public static void main(String[] args) {
        int n = 14896;
        int noOfDigit = (int)Math.log10(n)+1;
        System.out.println(noOfDigit);

        System.out.println(Math.pow(10, 5));
        System.out.println(sumOfDigit(n));
    }

    public static int sumOfDigit(int n){
        if(n/10 == 0){
            return n;
        }

        return n%10 + sumOfDigit(n/10);
    }
}
