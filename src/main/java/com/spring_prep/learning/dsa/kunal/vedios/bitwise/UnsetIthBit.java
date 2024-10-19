package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class UnsetIthBit {
    public static void main(String[] args) {
        int no = 21;
        System.out.println(unset(21, 3));
//        System.out.println(unset(17, 3));
    }
    public static int unset(int no, int bit){

        int temp = ~(1 << 2);
        System.out.println(temp);

        return no & temp;
    }
}
