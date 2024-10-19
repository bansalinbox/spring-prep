package com.spring_prep.learning.dsa.tuf.step3.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] input = {1, 2, 3 , 4, 1, 2, 9, 5, 2, 5, 1, 2, 3, 4, 5, 6, 5, 7, 7, 5};
        System.out.println(search(input));
    }
    public static int search(int[] input){
        int target = input.length/2;
        Map<Integer, Integer> track = new HashMap<>();
        int maxCount = 0;
        int key = -1;

        for (int i = 0; i < input.length; i++) {
            int count = track.getOrDefault(input[i], 0);
            int tempkey = input[i];
            int tempCount = count + 1;
            if(tempCount > maxCount){
                key = tempkey;
                maxCount = tempCount;
            }
            track.put(input[i], count+1);
        }
        return key;
    }
}
