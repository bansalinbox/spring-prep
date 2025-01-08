package com.spring_prep.learning.rough;

import java.util.HashMap;
import java.util.Map;

public class SymmetricTree {

    public static void main(String[] args) {
//        System.out.println((int)'a');
//        int[] input = {57, 38, 91, 10, 38, 28, 79, 41};
//        inversionCount(input);
//        System.out.println(getSmallestString("45320"));
//        System.out.println(digitCount("1210"));
//        String input = "1210";
//        char sample = 'Z';
//        int i = 0;
//        String out = "";
//        while(i < input.length()){
//            out += input.charAt(i);
//            i++;
//        }
//        System.out.println(Integer.valueOf(out));
//


//        char a = input.charAt(0);
//        System.out.println((int)'1');
//        System.out.println(Character.getNumericValue(sample));
//        System.out.println(Integer.valueOf('1'));
//
        System.out.println(validWordAbbreviation("internationalization", "i12iz4n"));

    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        boolean isValid = true;
        int i = 0;
        int abbrLength = abbr.length();
        int k =0;
        while(i < abbrLength){
            char temp = abbr.charAt(i);
            if(Character.isDigit(temp)){
                String digit = temp + "";
                int j = i + 1;
                while(j < abbrLength){
                    char temp2= abbr.charAt(j);
                    if(Character.isDigit(temp2)){
                        digit += temp2;
                        i++;
                        j = i +1;
                    }else{
                        k += Integer.valueOf(digit);
                        break;
                    }
                }
            }else{
                if(temp != word.charAt(i)){
                    isValid = false;
                }
                i++;
                k++;
            }
        }
        if(k + 1 != word.length()){
            return false;
        }
        return isValid;
    }

    public static boolean digitCount(String num) {
        boolean result = true;
        if(num == null){
            return true;
        }
        Map<Character, Integer> track = new HashMap<>();

        for(int i = 0; i < num.length(); i++){
            char curr =  num.charAt(i);
            int count = track.getOrDefault(curr, 0);
            track.put(curr, count+1);
        }
        for(int i = 0; i < num.length(); i++){
            char curr = (char)(i+ '0');
            if(track.containsKey(curr)){
                if(track.get(curr) != Character.getNumericValue(num.charAt(i))){
                    result = false;
                    break;
                }
            }else{
                result = false;
                break;
            }
        }
        return result;
    }

    public static String getSmallestString(String s) {
        if(s.length() <= 1){
            return s;
        }

        int first = 0;
        int second = 0;
        boolean found = false;
        for(int i = 1; i < s.length(); i++){
            first = Character.getNumericValue(s.charAt(i-1));
            second = Character.getNumericValue(s.charAt(i));
            if(!found){
                if(first % 2 == 0){
                    if(second % 2 == 0 && second < first){
                        found = true;
                    }
                }else{
                    if(second % 2 != 0 && second < first ){
                        found = true;
                    }
                }
            }
            if(found){
                s = s.substring(0, i-1) + (char)s.charAt(i) + (char)s.charAt(i-1) + s.substring(i+1);
                break;
            }
        }
        return s;
    }

    static int inversionCount(int arr[]) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < arr.length; i++){
            int temp = arr[i];

            for(int key : map.keySet()){
                if(temp < key){
                    ans++;
                    System.out.println(key + " --->" + temp);
                }
            }
            map.put(temp, 0);
        }
        return ans;
    }
}
