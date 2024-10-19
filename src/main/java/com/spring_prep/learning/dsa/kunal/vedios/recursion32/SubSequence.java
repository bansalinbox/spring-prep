package com.spring_prep.learning.dsa.kunal.vedios.recursion32;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String input = "abc";
        //subsequence("", "abc");
        //System.out.println(subsequenceArgument("", "abc", new ArrayList<>()));
        System.out.println(subsequenceInFunction("", "abc"));
        //System.out.println(subsequenceInFunctionAscii("", "abc"));

    }

    public static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char current  = up.charAt(0);
        subsequence(p + current, up.substring(1));
        subsequence(p, up.substring(1));
    }

    public static ArrayList<String>  subsequenceArgument(String p, String up, ArrayList<String> output){
        if(up.isEmpty()){
            output.add(p);
            return output;
        }
        String current  = up.charAt(0) + "";
        subsequenceArgument(p + current, up.substring(1), output);
        subsequenceArgument(p, up.substring(1), output);
        return output;
    }

    public static ArrayList<String>  subsequenceInFunction(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> output = new ArrayList<>();
            output.add(p);
            return output;
        }
        String current  = up.charAt(0) + "";
        ArrayList<String> first = subsequenceInFunction(p + current, up.substring(1));
        ArrayList<String> second = subsequenceInFunction(p, up.substring(1));
        first.addAll(second);
        return first;
    }

    public static ArrayList<String>  subsequenceInFunctionAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> output = new ArrayList<>();
            output.add(p);
            return output;
        }
        char current  = up.charAt(0);
        ArrayList<String> first = subsequenceInFunctionAscii(p + current, up.substring(1));
        ArrayList<String> second = subsequenceInFunctionAscii(p, up.substring(1));
        ArrayList<String> third = subsequenceInFunctionAscii(p + (current + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
