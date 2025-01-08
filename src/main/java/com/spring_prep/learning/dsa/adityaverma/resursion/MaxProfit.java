package com.spring_prep.learning.dsa.adityaverma.resursion;

//https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
public class MaxProfit {
    public static void main(String[] args) {
        int n = 3;
        int w = 5;
        int[] profit = {1, 7, 11};
        int[] weight ={1, 2, 3};

        int[][] memo = new int[n+1][w+1];
        for(int i = 0; i < n + 1; i++){
            for (int j = 0; j < w + 1; j++) {
                if(i == 0){
                    memo[i][j] = -1;
                }
                if(j == 0){
                    memo[i][j] = -1;
                }
                memo[i][j] = -1;
            }
        }
        int ans = profit(weight, profit, w, n, memo);
        System.out.println(ans);

    }

    public static int profit(int[] weight, int[] profit, int w, int n, int[][] memo){
        if(w == 0 || n == 0){
            return 0;
        }

        if(memo[n][w] != -1){
            return memo[n][w];
        }

        if(weight[n-1] <= w){
            memo[n][w] = Math.max(profit[n-1] + profit(weight, profit, w - weight[n-1], n-1, memo)
                    , profit(weight, profit, w, n-1, memo)
            );
        }else{
            memo[n][w] = profit(weight, profit, w, n-1, memo);
        }
        return memo[n][w];
    }
}
