package com.spring_prep.learning.dsa.kunal.vedios.recursion35;

import java.util.ArrayList;
import java.util.List;

public class MazePath {
    public static void main(String[] args) {
        int n = 3;
//        System.out.println(countPath(3, 3));
//        System.out.println(path);
        System.out.println(printPath("", 3, 3));
    }
    static String path = "";
    public static int countPath(int row, int col){
        int count = 0;
        if(row == 1 || col == 1){
            return 1;
        }
        count = count + countPath( row -1, col);
        count = count + countPath( row, col -1);
        return count;
    }
    public static List<String> printPath(String path, int row, int col){
        List<String> output = new ArrayList<String>();
        if(row == 1 && col == 1){
            output.add(path);
            return output;
        }
        if(row > 1){
            output.addAll(printPath(path + "D", row -1, col));
        }
        if(col > 1){
            output.addAll(printPath(path + "R", row, col -1));
        }
        if(col > 1 && row > 1){
            output.addAll(printPath(path + "K", row -1 , col -1));
        }
        return output;
    }
}
