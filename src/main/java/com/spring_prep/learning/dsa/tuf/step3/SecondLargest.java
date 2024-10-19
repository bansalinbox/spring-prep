package com.spring_prep.learning.dsa.tuf.step3;

//Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
public class SecondLargest {

    public static void main(String[] args) {
        int[] input = {20, 3, 4, 2, 8, 7, 9, 11};
        int largestOrder = 2;
        System.out.println(secondLargestElement1(input));
    }

    /**
     * this is not dynamic if I need to find 5the then not possible to create so many variables
     * @param input
     * @return
     */
    public static int secondLargestElement1(int[] input){
        int first = input[0];
        int second = input[1];

        if(first < second){
            int temp = second;
            second = first;
            first = temp;
        }
        for (int i = 2; i < input.length; i++) {
            int current = input[i];
            if(current  > first){
                int temp = first;
                first = current;
                second = temp;
            }else if(current > second){
                second = current;
            }
        }

        return second;
    }
}
