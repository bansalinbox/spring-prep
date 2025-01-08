package com.spring_prep.learning.dsa.adityaverma.binarysearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        char aa = 'a';
        char dd = 'd';

        if(aa > dd){
            System.out.println("grater" + aa);
        }else{
            System.out.println("less" + aa);
        }


        //System.out.println(searchInsert(nums, target));
    }

    static int findFloor(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid] < k ){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                start = mid;
            }else{
                end = mid -1;
            }
        }
        return start;
    }
}
