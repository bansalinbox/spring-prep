package com.spring_prep.learning.dsa.kunal.vedios.binarysearch2DArray16;

import java.util.ArrayList;
import java.util.List;

public class simpleSearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {18, 9, 12},
                {36, -4, 91, 101},
                {44, 33, 16},
                {25, 45, 99, 100}
        };
        search(arr);

    }

    public static List<Integer> search(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        return new ArrayList<>();
    }
}
