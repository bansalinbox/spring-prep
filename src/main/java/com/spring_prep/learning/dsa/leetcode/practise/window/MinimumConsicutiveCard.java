package com.spring_prep.learning.dsa.leetcode.practise.window;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/description/
public class MinimumConsicutiveCard {

    public static void main(String[] args) {

        int[] input = {1,0,5,3};
        System.out.println(minimumCardPickup(input));
    }

    // Brute force [3,4,2,3,4,7], accepted
    public static int minimumCardPickup(int[] cards) {
        int minLength = Integer.MAX_VALUE;
        Map<Integer, Integer> track = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            int value = cards[i];
            if(track.containsKey(value)){
                int lastPosition = track.get(value);
                int diff = i - lastPosition + 1;
                minLength = Math.min(diff, minLength);
                track.put(value, i);
            }else{
                track.put(value, i);
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return -1;
        }
        return minLength;
    }
}
