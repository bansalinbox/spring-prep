package com.spring_prep.learning.dsa.adityaverma.binarysearch;

import java.util.Arrays;

public class BSINDecendingArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int target = 1;
        Arrays.stream(searchRange(arr, target)).forEach(x -> System.out.println(x));
        System.out.println();
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int index = search(nums, target);
        if(index == -1){
            return ans;
        } else{
            int first = index;
            for(int i = index -1; i >= 0; i--){
                if(nums[i] != nums[i+1]){
                    break;
                }
                first = i;
            }
            ans[0] = first;

            int second = index;
            for(int i = index + 1 ; i < nums.length; i++){
                if(nums[i -1 ] != nums[i]){
                    break;
                }
                second = i;
            }
            ans[1] = second;
        }
        return ans;
    }

    public static int search(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
