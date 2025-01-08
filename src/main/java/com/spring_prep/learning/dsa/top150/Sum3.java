package com.spring_prep.learning.dsa.top150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum3 {
    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(input));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        Map<Integer, Integer> track = new HashMap<>();
        for(int l = 0; l < nums.length; l++){
            track.put(l, nums[l]);
        }
        while(i < j){
            int rem = 0 - nums[i] - nums[j];
            if(track.containsValue(rem)){
                List<Integer> local = new ArrayList<>();
                local.add(nums[i]);
                local.add(nums[j]);
                local.add(rem);
                ans.add(local);
                break;
            }
            j--;
        }
        return ans;
    }
}
