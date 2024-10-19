package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class SetithBit5 {

    public static void main(String[] args) {
        int no = 182; // 10110110
        int bit = 4;
        System.out.println(setIthBit(no, bit -1 ));
    }

    public static int setIthBit(int no, int bit){
        return no | (1<<bit);
    }
}
