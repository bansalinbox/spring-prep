package com.spring_prep.learning.dsa;

public class Utils {

    public static void printMatrix(int[][] matrix){
        for(int r =0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
