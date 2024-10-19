package com.spring_prep.learning.dsa.kunal.vedios.math;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(42));
        System.out.println(primeList(42));
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        int c = 2;
        while(c * c <= 36){
            if(n % c == 0){
                isPrime = false;
            }else {
                c++;
            }
        }
        return isPrime;
    }


    public static ArrayList primeList(int n){
        boolean isPrime = true;
        ArrayList<Integer> onlyPrime = new ArrayList<>();
        int c = 2;
        while(c * c <= 36){
            if(n % c != 0){
                onlyPrime.add(c);
            }
            c++;
        }
        return onlyPrime;
    }
}
