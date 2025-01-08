package com.spring_prep.learning.dsa.adityaverma.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array and a positive integer k,
// find the first negative integer for each window(contiguous subarray) of size k.
// If a window does not contain a negative integer, then print 0 for that window.
public class FirstNegativeSizeK {
    public static void main(String[] args) {
        int[] arr = {8, 2, -5, 5, 5, 7, 3, -6, 10};
        int k = 3;
        //ans = -8 0 -6 -6
        System.out.println(search(arr, k));
    }

    public static int[] search(int[] arr, int k) {
        List<Integer> storeNegative = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (j - i + 1 < k) {
                if (arr[j] < 0) {
                    storeNegative.add(arr[j]);
                }
                j++;
            } else if (j - i + 1 == k) {
                if (arr[j] < 0) {
                    storeNegative.add(arr[j]);
                }
                if (storeNegative.isEmpty()) {
                    output.add(0);
                } else {
                    output.add(storeNegative.get(0));
                    // Important remove only if the -ve no is out of the range then only remove from the tracker
                    if(arr[i] == storeNegative.get(0)){
                        storeNegative.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(output);
        return output.stream().mapToInt(x -> Integer.valueOf(x)).toArray();
    }
}
