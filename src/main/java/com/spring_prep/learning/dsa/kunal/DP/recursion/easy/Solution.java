package com.spring_prep.learning.dsa.kunal.DP.recursion.easy;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(numberOfSteps(14));
//        String input = "hellMo";
//        char[] input2 = input.toCharArray();
//        reverseString(input2);
//        System.out.println(input2);

        //2. https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
//        String input2 = "gourav";
//        firstUpperCaseInString(input2);

        //3. https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
//        int[] input = {1, 4, 3, -5, -4, 8, 6};
//        findMinAndMax(input);

//        printNos(10);
        int[][] sample = new int[3][5];
        System.out.println(sample[2][2]);
    }


    public static void printNos(int n) {
        // Your code here
        if(n < 1){
            return;
        }
        printNos(n-1);
        System.out.print(n + " ");
    }
    public static void findMinAndMax(int[] input){
        System.out.println(findMinAndMaxHelper(input, 0, Integer.MAX_VALUE));
    }


    public static int findMinAndMaxHelper(int[] input, int index, int min){
        if(index >= input.length){ // 6  7
           return min;
        }
        min = Math.min(input[index], min);
        return findMinAndMaxHelper(input, index +1, min);
    }


    public static void firstUpperCaseInString(String input){
        if(input.length() == 0){
            return ;
        }
        if(Character.isUpperCase(input.charAt(0))){
            System.out.println(input.charAt(0));
            return;
        }
        firstUpperCaseInString(input.substring(1));
    }

    static int i = -1;
    static int y = 0;
    public static void reverseString(char[] s) {
        i = i+1;
        if(i >= s.length){
            return;
        }
        char current = s[i];
        reverseString(s);
        s[y] = current;
        y++;
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int num, int count){

        if(num == 0){
            return count;
        }
        count = count +1;
        if( (num & 1) == 0){
            return helper(num/2, count);
        }else{
            return helper(num -1, count);
        }
    }
}
