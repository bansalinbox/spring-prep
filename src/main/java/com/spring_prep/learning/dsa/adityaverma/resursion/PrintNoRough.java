package com.spring_prep.learning.dsa.adityaverma.resursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Substring, Subsequence, Powerset, subset
 * substring is different in above
 */
public class PrintNoRough {
    static List<String> out = new ArrayList<>();

    public static void main(String[] args) {
        //System.out.println(print(5));
        int[] input = {2, 9, 8, 21, 1};
        int[] input2 = {1, 2, 3, 4, 5};
//        int[] output = new int[input.length];
//        Arrays.stream(sort(input, 0, output)).forEach(x -> System.out.println(x));

//        Stack<Integer> stack = new Stack<>();
//        Arrays.stream(input2).forEach(x -> stack.push(x));
//        stack.stream().forEach(x -> System.out.println(x));
//        System.out.println("============");
//        //sortStack(stack);
//        //deleteMiddle(stack, 3);
//        reverseStack(stack);
//        stack.stream().forEach(x -> System.out.println(x));

        //System.out.println(generate(30, 434991989));
//        allSubset("", "abc");
//        out.stream().forEach(x -> System.out.println(x));

//        String input5 = "abc";
//        if(input5.length() == 1){
//            out.add(input5);
//            return;
//        }
//        allSubsetWithSpace(""+input5.charAt(0), input5.substring(1));
//        out.stream().forEach(x -> System.out.println(x));

//        String input6 = "ab";
//        permutationwithCaseChange("", input6);
//        out.stream().forEach(x -> System.out.println(x));

//        String input7 = "a1B2";
//        letterCasePermutation("", input7);
//        out.stream().forEach(x -> System.out.println(x));

        int n = 3;
        int o = n;
        int c = n;
        generateAllParentheses("", o, c);
        out.stream().forEach(x -> System.out.println(x));
    }

    public static void generateAllParentheses(String output, int o, int c){

        if(o == 0){
            while(c > 0){
                output += ")";
                c--;
            }
            out.add(output);
            return;
        }
        if(o == c){
            generateAllParentheses(output + "(", o - 1, c );
        }else{
            generateAllParentheses(output + "(", o - 1, c );
            generateAllParentheses(output + ")", o , c - 1 );
        }
    }

    public static void letterCasePermutation(String output, String input) {
        if (input.length() == 0) {
            out.add(output);
            return;
        }
        if(Character.isLetter(input.charAt(0))){
            letterCasePermutation(output + Character.toUpperCase(input.charAt(0)), input.substring(1));
            letterCasePermutation(output + Character.toLowerCase(input.charAt(0)), input.substring(1));
        }else {
            letterCasePermutation(output + input.charAt(0), input.substring(1));
        }
    }

//    public static void permutationwithCaseChange(String output, String input){
//        if(input.length() == 0){
//            out.add(output);
//            return;
//        }
//        permutationwithCaseChange(output + Character.toUpperCase(input.charAt(0)), input.substring(1));
//        permutationwithCaseChange(output + input.charAt(0), input.substring(1));
//    }

    public static void allSubsetWithSpace(String output, String input) {
        if (input.length() == 0) {
            out.add(output);
            return;
        }
        // consider
        allSubsetWithSpace(output + "_" + input.charAt(0), input.substring(1));
        allSubsetWithSpace(output + input.charAt(0), input.substring(1));
    }

    public static void allSubset(String output, String input) {
        if (input.length() == 0) {
            out.add(output);
            return;
        }
        allSubset(output + input.charAt(0) + "", input.substring(1));
        allSubset(output, input.substring(1));
    }

    public static int generate(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        while (n > 1) {
            StringBuilder temp = new StringBuilder("");
            for (int i = 0; i < sb.length(); i++) {
                char current = sb.charAt(i);
                if (current == '0') {
                    temp.append("01");
                } else {
                    temp.append("10");
                }
            }
            sb = temp;
            n--;
        }
        return Character.getNumericValue(sb.charAt(k - 1));
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.size() == 0 || stack.size() == 1) {
            return;
        }
        int curr = stack.pop(); // 5 4 3 2 1
        reverseStack(stack);
        reverseStackPush(stack, curr);
    }

    public static void reverseStackPush(Stack<Integer> stack, int element) {
        if (stack.size() == 0) {
            stack.push(element);
            return;
        }
        int curr = stack.pop();
        reverseStackPush(stack, element);
        stack.push(curr);
    }


    public static void deleteMiddle(Stack<Integer> stack, int middle) {
        if (stack.size() == 0 || middle == 0) {
            return;
        }
        int curr = stack.pop();
        deleteMiddle(stack, middle = middle - 1);
        if (middle != 0) {
            stack.push(curr);
        }
    }


    public static void sortStack(Stack<Integer> stack) {
        if (stack.size() == 0 || stack.size() == 1) {
            return;
        }
        int element = stack.pop();
        sortStack(stack);
        putElement(stack, element);

    }

    public static void putElement(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() < element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        putElement(stack, element);
        stack.push(top);
    }


    public static int[] sort(int[] input, int i, int[] output) {
        if (i > input.length - 1) {
            return output;
        }
        int curr = input[i];
        int j = i;
        if (j - 1 >= 0 && curr < input[j - 1]) {
            output[j] = curr;
            while (j - 1 >= 0 && output[j] < output[j - 1]) {
                int temp = output[j - 1];
                output[j - 1] = output[j];
                output[j] = temp;
                j = j - 1;
            }
        } else {
            output[j] = curr;
        }
        sort(input, i + 1, output);
        return output;
    }


    public static int print(int n) {

        if (n == 1) {
            System.out.println(n);
            return 1;
        }
        System.out.println(n);
        int x = print(n - 1);
        return n + x;
    }
}
