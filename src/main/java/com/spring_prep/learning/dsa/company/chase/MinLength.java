package com.spring_prep.learning.dsa.company.chase;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinLength {
    public static void main(String[] args) {
//        char a = 'a';
//        String num = "";
//        System.out.println((int)a);
//        Map<Integer, Integer> map = new HashMap<>();
//        int current = (int)num.charAt(0);
//        int count = map.getOrDefault(current, 0);
////        Stack<Character> stack = new Stack<>();
////        stack.peek();
////        System.out.println(minLength("ABFCACDB"));
        digitCount("1210");
    }

    public static boolean digitCount(String num) {
        if(num == null){
            return true;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length(); i++){
            int current = (int)num.charAt(i);
            int count = map.getOrDefault(current, 0);
            map.put(current, count+1);
        }
        for(int i = 0; i < num.length(); i++){
            if(map.get(i) != (int)num.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static int minLength(String s) {
        while(s.contains("AB") || s.contains("CD")){
            s = helper(s);
        }
        return s.length();
    }

    public static String helper(String s){
        if(s.contains("AB")){
            String[] split = s.split("AB");
            return concat(split);
        }else if(s.contains("CD")){
            String[] split = s.split("CD");
            return concat(split);
        }
        return "";
    }
    public static String concat(String[] split){
        String ans = "";
        for(String x : split){
            ans += x;
        }
        return ans;
    }
}
