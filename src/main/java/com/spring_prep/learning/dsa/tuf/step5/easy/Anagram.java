package com.spring_prep.learning.dsa.tuf.step5.easy;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        System.out.println(isAnagram(s, t));

        char a = 'a';
        char z = 'z';

        int aindex = Integer.valueOf(a);
        int zindex = Integer.valueOf(z);
        System.out.println(aindex + " " + zindex);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        boolean anagram = true;
        char a = 'a';
        char z = 'z';

        int aindex = Integer.valueOf(a);
        int zindex = Integer.valueOf(z);
        int[] ans = new int[zindex + 1];
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            int tempIndex = Integer.valueOf(temp);
            int value = ans[tempIndex];
            ans[tempIndex] = value + 1;
        }
        for(int i = 0; i < t.length(); i++){
            char temp = t.charAt(i);
            int tempIndex = Integer.valueOf(temp);
            int value = ans[tempIndex];
            ans[tempIndex] = value -1;
        }
        for(int i = aindex; i <= zindex; i++){
            int value = ans[i];
            if(value != 0){
                anagram = false;
                break;
            }
        }
        return anagram;
    }
}
