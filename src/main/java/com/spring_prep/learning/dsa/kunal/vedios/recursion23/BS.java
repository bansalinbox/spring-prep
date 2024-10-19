package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class BS {
    public static void main(String[] args) {
        int[] input = {1, 4, 6, 10, 13, 15 ,19};
        System.out.println(search(0, 6, 1, input));
    }

    public static int search(int start, int end, int target, int[] input){
        if(start <= end){
            int n = (start + end)/2;
            if(input[n] == target){
                return n;
            }
            if(target > input[n]){
                start = n +1;
            }else{
                end = n -1 ;
            }

            return search(start, end, target, input);
        }else {
            return -1;
        }
    }
}
