package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class NthMagicNo9 {
    public static void main(String[] args) {
        int nth = 6;
        calculate(nth);
        calculateBetter(nth);
    }

    public static void calculate(int no){
        int temp = no;
        int[] binaryRes = new int[32];
        int index = 0;
        int total = 0;
        while(no != 0){
            int bit = no & 1;
            binaryRes[binaryRes.length -1 - index] = bit;
            no = no >> 1;
            index++;
        }

        int indexbit = binaryRes.length -1 -1;
        for (int i = binaryRes.length -1; i >=0 ; i--) {
            total += binaryRes[i] * Math.pow(5, binaryRes.length -1 - indexbit);
            indexbit--;
        }
        System.out.println(temp + " nth magic no is --->" + total);
    }

    public static void calculateBetter(int no){
        int temp = no;
        int index = 1;
        int total = 0;
        while(no != 0){
            int bit = no & 1;
            total += bit * Math.pow(5, index);
            no = no >> 1;
            index++;
        }
        System.out.println(temp + " nth magic no is --->" + total);
    }
}
