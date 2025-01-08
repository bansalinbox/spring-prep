package com.spring_prep.learning.dsa.adityaverma.slidingwindow;

public class LargestSubArraySumK {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 5, 7};
        //int[] arr = {6, 1, 1, 8 , 1, 1, 9, 3, 4, 7, 2 };
        int k = 5;
        System.out.println(largestSubArray(arr, k));

    }

    public static int largestSubArray(int[] arr, int k){
        int max = 0;
        int i = 0;
        int j = 0;
        long sum = 0;
        while (j < arr.length){
            sum = sum + arr[j];
            if(sum < k){
                j++;
            }else if (sum == k){
                max = Math.max(max, j - i + 1);
                j++;
            } else if (sum > k){
                while(sum > k){
                    sum = sum - arr[i];
                    i++;
                    if(sum == k){
                        max = Math.max(max, j - i + 1);
                    }
                }
                j++;
            }
        }

        return max;
    }
}
