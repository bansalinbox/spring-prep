package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class ithBitOfANo4 {
    public static void main(String[] args) {
        int no = 182;
        int bit = 4;
        System.out.println(ithBit(no, bit -1 ));
    }

    public static int ithBit(int no, int bit){
        int noitself = no & (1 << bit);
        System.out.println(noitself);
        System.out.println(bit);
        return noitself >> bit;

    }
}
