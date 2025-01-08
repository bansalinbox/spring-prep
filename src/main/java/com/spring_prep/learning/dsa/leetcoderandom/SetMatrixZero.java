package com.spring_prep.learning.dsa.leetcoderandom;

import com.spring_prep.learning.dsa.Utils;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
        Utils.printMatrix(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int r =0; r < matrix.length; r++){
            for(int c =0; c < matrix[r].length; c++){
                if(matrix[r][c] == 0){
                    if(!row.contains(r)){
                        int cc = 0;
                        while(cc < matrix[r].length){
                            matrix[r][cc] = 0;
                            cc++;
                        }
                        row.add(r);
                    }
                    if(!col.contains(c)){
                        int rr = 0;
                        while(rr < matrix.length){
                            matrix[rr][c] = 0;
                            rr++;
                        }
                        col.add(c);
                    }
                }
            }
        }

    }
}
