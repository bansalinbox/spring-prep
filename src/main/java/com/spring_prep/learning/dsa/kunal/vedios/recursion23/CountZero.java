package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class CountZero {

    static int count = 0;
    public static void main(String[] args) {
//        count(1020909);
//        System.out.println(count);

//        System.out.println(count2(10203, 0));
    }

    public static void count(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        if(rem == 0){
            count++;
        }
        count(n/10);
    }

    public static int count2(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return count2(n/10, ++count);
        }else{
            return count2(n/10, count);
        }
    }
}
