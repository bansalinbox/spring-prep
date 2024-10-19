package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class BasewithPOW {

    public static void main(String[] args) {
        int base = 2;
        int pow = 5;
        int output = 1;
        while(pow > 0){
            output = base * output;
            pow--;
        }
        System.out.println(output);

        int x = 1 << 5;
        System.out.println(x);
        System.out.println(x << 1);

    }
}
