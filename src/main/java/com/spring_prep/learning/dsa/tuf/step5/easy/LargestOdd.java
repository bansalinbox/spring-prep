package com.spring_prep.learning.dsa.tuf.step5.easy;

public class LargestOdd {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("4602"));
        char x = 'z';
        int v = Integer.valueOf(x);
        System.out.println(v);
    }

    public static String largestOddNumber(String num) {
        String ans = "";
        int count = 0;
        boolean found = false;
        for (int i = num.length() -1; i >=0; i--) {
            char temp = num.charAt(i);
            if((Integer.valueOf(temp) & 1) == 1){
                count = i;
                found = true;
                break;
            }
        }
        if(found){
            ans = num.substring(0,count + 1);
        }
        return ans;
    }
}
