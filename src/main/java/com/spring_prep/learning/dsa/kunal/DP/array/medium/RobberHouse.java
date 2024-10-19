package com.spring_prep.learning.dsa.kunal.DP.array.medium;

public class RobberHouse {

    static int maxLootRec(int[] hval, int n) {

        if(n < 0){
            return 0;
        }

        if(n == 0){
            return hval[0];
        }

        // either pick or not pick
        int pick = hval[n] + maxLootRec(hval, n -2);
        int notpick = maxLootRec(hval, n -1);
        return Math.max(pick, notpick);

    }

    // Function to calculate the maximum stolen value
    static int maxLoot(int[] hval) {
        int n = hval.length;

        // Call the recursive function for n houses
        return maxLootRec(hval, n -1);
    }

    public static void main(String[] args) {
        int[] hval = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(maxLoot(hval));
    }
}
