package com.spring_prep.learning.dsa.kunal.DP.array.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowtop = 0;
        int rowbottom = matrix.length -1;
        int coltop = 0;
        int colbottom = matrix[0].length -1;
        while( rowtop <= rowbottom && coltop <= colbottom){
            for(int i = coltop; i <= colbottom; i++){
                ans.add(matrix[rowtop][i]);
            }
            rowtop++;
            for (int i = rowtop; i <= rowbottom; i++) {
                ans.add(matrix[i][colbottom]);
            }
            colbottom--;
            if(rowtop<=rowbottom){
                for (int i = colbottom; i >= coltop ; i--) {
                    ans.add(matrix[rowbottom][i]);
                }
                rowbottom--;
            }

            if(coltop<=colbottom){
                for (int i = rowbottom; i >= rowtop; i--) {
                    ans.add(matrix[i][coltop]);
                }
                coltop++;
            }
        }
        return ans;
    }
}
