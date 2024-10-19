package com.spring_prep.learning.dsa.kunal.vedios.binarySearch15;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 16, 18, 19, 20};
        int target = 10;
        System.out.println(search(input, target));
    }
    public static int search(int[] input, int target){
        int start = 0;
        int end = 1;
        while (!(target <= input[end])){
            start = end + 1;
            end = end + 2 * (end - start + 1);
        }
        int foundIndex = binarySearch(input, target, start, end);
        return foundIndex;
    }


    public static int binarySearch(int[] input, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < input[mid]){
                end = mid -1;
            } else if(target > input[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
