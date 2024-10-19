package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class NoOfDigits10 {
    public static void main(String[] args) {
        int n = 325253;
        int base = 10;

        int ans = (int) (Math.log(n) /Math.log(base) ) + 1;
        System.out.println(ans);
    }
}
