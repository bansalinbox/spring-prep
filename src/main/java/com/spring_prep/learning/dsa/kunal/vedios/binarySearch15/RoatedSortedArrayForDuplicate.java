package com.spring_prep.learning.dsa.kunal.vedios.binarySearch15;

public class RoatedSortedArrayForDuplicate {
    public static void main(String[] args) {
        int[] input = { 9, 10, 10, 10, 5, 5, 5, 7, 6, 8, 8};
        search(input, 9);
    }

    public static void search(int[] input, int target){
        int peak = findRotatedPeak(input);
        System.out.println(peak);
    }

    public static int findRotatedPeak(int[] input){
        int start = 0;
        int end = input.length -1;
        int mid = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(input[mid] == input[mid+1]){
                mid = mid+1;
            }

            if(end > mid && input[mid] > input[mid + 1]){
                return mid;
            }
            if(mid > start && input[mid] < input[mid-1]){
                end = mid;
            }
            if(input[mid] > input[mid -1] && input[mid -1] > input[0]){
                start = mid;
            } else if(input[mid] > input[mid -1] && input[mid -1] < input[0]){
                end = mid -1;
            }
        }
        return mid;
    }
}
