package com.spring_prep.learning.dsa.adityaverma.binarysearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {3, 4, 3, 2, 1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        if(nums.length == 1){
            return 0;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid + 1 <= nums.length -1 && mid -1 >= 0
                    && nums[mid] > nums[mid + 1] && nums[mid] > nums[mid -1]){
                return mid;
            }
            if(mid == nums.length -1 && nums[mid] > nums[mid -1]){
                return mid;
            }
            if(mid == 0 && nums[mid] > nums[mid +1]){
                return mid;
            }

            if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }else{
                end = mid -1;
            }

        }
        return ans;
    }
}
