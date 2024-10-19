package com.spring_prep.learning.dsa.kunal.vedios.recursion32;

public class RemoveChar {
    static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {

        String input = "gourav";
        char target = 'a';
        //System.out.println(removeChar(input, target));
        removeCharRecursion(input, target, 0);
        //System.out.println(output.toString());
        //System.out.println(removeCharRecursion2(input, target, 0, ""));
        //System.out.println(removeCharRecursion3(input, target, 0));
        //System.out.println(skip("", input, 'a'));
        //System.out.println(skip2(input, 'a'));
        System.out.println(skipApple("", "gourapplev", "apple"));
    }

    public static String skipApple(String p, String up, String skip){
        if(up == ""){
            return p;
        }
        if(up.startsWith(skip)){
            return skipApple(p, up.substring(5), skip);
        }else{
            return skipApple(p + up.charAt(0), up.substring(1), skip);
        }
    }

    public static String skip(String p, String up, char c){
        if(up == ""){
            return p;
        }
        if(c != up.charAt(0)){
            return skip(p + up.charAt(0), up.substring(1), c);
        }else{
            return skip(p, up.substring(1), c);
        }
    }

    public static String skip2(String up, char c){
        if(up == ""){
            return "";
        }
        if(c != up.charAt(0)){
            return up.charAt(0) + skip2(up.substring(1), c);
        }else{
            return skip2( up.substring(1), c);
        }
    }

    public static String removeChar(String input, char target){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != target){
                output.append(input.charAt(i));
            }
        }
        return output.toString();
    }


    // case 1 : When output is outside
    public static void removeCharRecursion(String input, char target, int start){
        if(start <= input.length()-1){
            char temp = input.charAt(start);
            if(temp != target){
                output.append(temp);
            }
            removeCharRecursion(input, target, start + 1);
        }
    }

    // case 1 : When output is an argument
    public static String removeCharRecursion2(String input, char target, int start, String output1){
        if(start <= input.length()-1){
            char temp = input.charAt(start);
            if(temp != target){
                output1 = output1  + Character.toString(temp);
            }
            return removeCharRecursion2(input, target, start + 1, output1);
        }
        else{
            return output1;
        }
    }

    // case 1 : When output is created in function body itself
    public static String removeCharRecursion3(String input, char target, int start){
        String output1 = "";
        if(!output1.equals("")){
            output1 = output1;
        }
        if(start <= input.length()-1){
            char temp = input.charAt(start);
            if(temp != target){
                output1 = Character.toString(temp);
            }
            return output1 + removeCharRecursion3(input, target, start + 1);
        }
        return output1;
    }
}
