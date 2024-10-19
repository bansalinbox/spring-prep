package com.spring_prep.learning.dsa.kunal.vedios.recursion33;

import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String input = "abc";
        permu("", input);
    }

    public static void permu(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char var = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String rest = p.substring(i, p.length());
            String finalVal = first + var + rest;
            permu(finalVal, up.substring(1));
        }
    }
}
