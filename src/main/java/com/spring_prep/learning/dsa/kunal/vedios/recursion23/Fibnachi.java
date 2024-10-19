package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class Fibnachi {
    public static void main(String[] args) {

        System.out.println(fib(9));
        //fib(0, 1, 5);
    }
//    public static void fib(int previous, int current, int nth){
//        if(nth == 2){
//            return;
//        }
//        int sum = current + previous;
//        System.out.println(sum);
//        nth = nth - 1;
//        fib(current, sum, nth);
//    }

    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int temp = fib(n -1) + fib(n -2);
        return temp;
    }
}
