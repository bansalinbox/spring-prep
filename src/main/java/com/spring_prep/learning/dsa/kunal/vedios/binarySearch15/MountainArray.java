package com.spring_prep.learning.dsa.kunal.vedios.binarySearch15;

public class MountainArray {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5, 6, 8, 9, 10, 7, 5, 3};
        System.out.println(search(input));
    }

    public static int search(int[] input){
        int start = 0;
        int end = input.length - 1;
        int mid = -1;
        while (start <= end){
            mid = start + (end - start)/2;
            if(input[mid] > input[mid +1] && input[mid]> input[mid -1]){
                return mid;
            }
            if(input[mid] < input[mid + 1]){
                start = mid + 1;
            }
            if(input[mid] > input[mid + 1]){
                end = mid;
            }
        }
      return mid;
    }
}
