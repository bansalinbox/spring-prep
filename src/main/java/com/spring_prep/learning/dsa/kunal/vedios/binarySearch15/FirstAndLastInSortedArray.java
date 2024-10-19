package com.spring_prep.learning.dsa.kunal.vedios.binarySearch15;

public class FirstAndLastInSortedArray {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 4, 5, 6, 6, 6 ,6 ,6, 8, 8, 8, 8, 9, 10};
        int target = 8;
        int first = search(input, target, true);
        int last = search(input, target, false);
        System.out.println(first + "<---->" + last);
    }
    public static int search(int[] input, int target, boolean findFirstOccruance){
        int ans = -1;
        int start = 0;
        int end = input.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < input[mid]){
                end = mid - 1;
            }else if(target > input[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(findFirstOccruance){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
}
