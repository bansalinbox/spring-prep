package com.spring_prep.learning.dsa.kunal.vedios.recursion32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println( subsequence2("", "abc"));
    }

    public static void subsequence(String p, String up){
       if(up.isEmpty()){
           System.out.println(p);
           return;
       }
        subsequence(p + up.charAt(0), up.substring(1));
        subsequence(p, up.substring(1));
    }

    public static ArrayList<String> subsequence2(String p, String up){
        ArrayList<String> output = new ArrayList<>();
        if(up.isEmpty()){
            output.add(p);
           return output;
        }
        ArrayList<String> left = subsequence2(p + up.charAt(0), up.substring(1));
        output.addAll(left);
        ArrayList<String> right = subsequence2(p, up.substring(1));
        output.addAll(right);
        return output;
    }
}
