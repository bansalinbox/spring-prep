package com.spring_prep.learning.dsa.adityaverma.binarysearch;

public class AlmostSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;
        System.out.println(findTarget(arr, target));
    }
    public static int findTarget(int arr[], int target) {
        int ans = -1;
        if(arr.length == 1 && arr[0] == target){
            return 0;
        }else if(arr.length == 1 && arr[0] != target){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(mid > 0 && target == arr[mid - 1]){
                return mid -1;
            }

            if( mid < end && target == arr[mid + 1]){
                return mid + 1;
            }

        }
        return ans;
    }
}
