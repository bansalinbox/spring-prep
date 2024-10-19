package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class DuplicateExceptOne2 {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 3, 2};
        System.out.println(findNo(input));
        System.out.println(findNo2(input));
    }
    // imp to note we need to init with first value of the array
    public static int findNo(int[] input){
        int no = input[0];
        for (int i = 1; i < input.length; i++) {
            no = no ^ input[i];
        }
        return no;
    }

    public static int findNo2(int[] input){
        int no = 0;
        for (int i = 0; i < input.length; i++) {
            no = no ^ input[i];
        }
        return no;
    }
}
