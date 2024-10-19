package com.spring_prep.learning.dsa.kunal.assignment.array;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(input));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] track = new int[nums.length];
        int maxindex = -1;
        int minindex = -1;


        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max){
                maxindex = i;
                max = sum;
            }
            if(sum < min){
                minindex = i;
                min = sum;
            }
            track[i] = sum;
        }

        System.out.println(Arrays.toString(track));
        System.out.println(maxindex + " " + minindex);
        return track[maxindex] - track[minindex];
    }
}
