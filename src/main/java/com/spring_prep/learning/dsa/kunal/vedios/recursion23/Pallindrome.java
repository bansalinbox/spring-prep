package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class Pallindrome {
    static int sum = 0;
    public static void main(String[] args) {
        int n = 121;
        isPallindrome(n);
    }

    public static boolean isPallindrome(int n){
        int ans = rev(n);
        System.out.println(ans);
        if(n == ans){
            return true;
        }else{
            return false;
        }
    }

    public static int rev(int n){
        if(n == 0){
            return n;
        }
        sum = (sum * 10) + n % 10;
        rev(n/10);
        return sum;
    }




}
