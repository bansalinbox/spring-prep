package com.spring_prep.learning.dsa.adityaverma.binarysearch;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        List<Integer> input = List.of(16, 18, 22, 23, 24, 36, 43, 1, 2, 3, 4);
        System.out.println(findKRotation(input));
    }

    public static int findKRotation(List<Integer> arr) {
        int ans = -1;
        if(arr == null){
            return 0;
        }

        if(arr.get(0) < arr.get(arr.size() -1)){
            return arr.size();
        }

        // fine peak

        int start = 0;
        int end = arr.size() -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid > 0 && arr.get(mid) < arr.get(mid-1)){
                return mid;
            }
             if( mid + 1 >= 0 && arr.get(mid) > arr.get(mid+1)){
                 return mid+1;
             }

            if(arr.get(mid) < arr.get(mid+1) && arr.get(mid) < arr.get(start)){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
