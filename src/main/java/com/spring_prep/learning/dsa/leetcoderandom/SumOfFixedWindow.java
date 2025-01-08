package com.spring_prep.learning.dsa.leetcoderandom;

import java.util.ArrayList;
import java.util.List;

// Given an array arr[] and an integer K, the task is to calculate the sum of all subarrays of size K.
public class SumOfFixedWindow {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println(find(input, 3));
    }

    public static int[] find(int[] input, int size){
        List<Integer> ans = new ArrayList<>();
        int sum = 0;

        int low = 0;
        int high = 0;
        while(high < input.length){
            if(high - low + 1 < size){
                sum = sum + input[high];
                high++;
            }else{
                sum = sum + input[high];
                ans.add(sum);
                sum = sum - input[low];
                high++;
                low++;
            }
        }
        ans.stream().forEach(x -> System.out.println(x));
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
