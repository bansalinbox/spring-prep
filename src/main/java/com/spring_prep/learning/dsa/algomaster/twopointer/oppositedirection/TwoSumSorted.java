package com.spring_prep.learning.dsa.algomaster.twopointer.oppositedirection;

import java.util.ArrayList;
import java.util.List;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5, 8, 11, 18};
        int target = 8;
        System.out.println(twoSumSorted(input, target));
    }
    public static List<Integer> twoSumSorted(int[] input, int target){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = input.length -1;
        while (i < j){
            int first = input[i];
            int second = input[j];
            int sum = first + second;
            if(sum == target){
                ans.add(i);
                ans.add(j);
                break;
            }
            if(sum > target) {
                j--;
            }else {
                i++;
            }
        }
        return ans;
    }
}
