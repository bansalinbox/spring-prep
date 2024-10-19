package com.spring_prep.learning.dsa.kunal.vedios.binarysearch2DArray16;

import java.util.Arrays;

// This matrix is not strictly sorted
public class MatrixSearch {
    public static void main(String[] args) {
        int[][] input = {
                {10, 17, 40, 50},
                {13, 18, 57, 67},
                {19, 21, 89, 100},
                {47, 67, 99, 103}
        };
        int target = 47;
        System.out.println(Arrays.toString(search(input, target)));
    }

    public static int[] search(int[][] input, int target){
        int row = 0;
        int col = input.length -1;
        while(row < input.length && col >=0){
            if(target == input[row][col]){
                return new int[]{row, col};
            }
            if(target > input[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
