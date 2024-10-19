package com.spring_prep.learning.dsa.kunal.assignment.array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNo {

    public static void main(String[] args) {
        int[][] input = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(input).toString());
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int row = 0; row < matrix.length; row++){
            int colIndex = -1;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] < min){
                    min =  matrix[row][col];
                    colIndex = col;
                }
            }
            int highestLocal = matrix[row][colIndex];
            boolean found = true;
            for(int row1 = 0; row1 < matrix.length ; row1++){
                int temp = matrix[row1][colIndex];
                if(row1 != row && temp > highestLocal){
                    found = false;
                    break;
                }
            }
            if(found){
                ans.add(highestLocal);
            }
        }
        return ans;
    }
}
