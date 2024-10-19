package com.spring_prep.learning.dsa.leetcode.practise.window;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(input));
    }

    //[0,0,1,1,1,2,2,3,3,4]
    public static int removeDuplicates(int[] nums) {

        int l = 0;
        int pre = nums[0];
        for (int r = 1; r < nums.length; r++) {
            int current = nums[r];
            if(pre != current){
                l++;
                nums[l] = nums[r];
            }
            pre = nums[r];
        }
        return l + 1;
    }
}
