package com.spring_prep.learning.dsa.adityaverma.slidingwindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1,3,1,2,0,5};
        int k = 3;
        maxSlidingWindow(nums, k);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1){
            return nums;
        }
        int i = 0;
        int j = 0;
        //1,3,-1,-3,5,3,6,7
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        Deque<Integer> deque = new LinkedList<>();
        while(j < nums.length){

            if(j - i + 1 < k){
                int curr = nums[j];
                if(curr > max){
                    while(!deque.isEmpty()){
                        deque.removeFirst();
                    }
                    max = curr;
                    deque.add(curr);
                }else{
                    deque.addLast(curr);
                }
                j++;
            }else if(j - i + 1 == k){
                int curr = nums[j];
                if(curr > max){
                    while(!deque.isEmpty()){
                        deque.removeFirst();
                    }
                    max = curr;
                    deque.add(curr);
                }else{
                    deque.addLast(curr);
                }
                ans.add(max);
                int curri = nums[i];
                if(curri == max){
                    deque.removeFirst();
                    max = deque.peekFirst();
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
        return ans.stream().mapToInt( x -> x).toArray();
    }
}
