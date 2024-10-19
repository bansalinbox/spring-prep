package com.spring_prep.learning.dsa.tuf.step3;

import java.util.Arrays;

public class RotateByK {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(input, 3)));
    }

    public static int[] rotate(int[] nums, int k) {
        for(int r = 0; r < k; r++){
            int temp = nums[nums.length-1];
            int j = nums.length -1;
            while(j >= 1){
                nums[j] = nums[j-1];
                j--;
            }
            nums[0] = temp;
        }
        return nums;
    }
}
