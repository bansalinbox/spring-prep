package com.spring_prep.learning.dsa.algomaster.twopointer.oppositedirection;

//Determine whether a string is a palindrome, ignoring non-alphanumeric characters and case.
public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "Do geese saee God";
        System.out.println(isPallindrome(input));
    }

    public static boolean isPallindrome(String input) {
        int i = 0;
        int j = input.length() - 1;
        while (i <= j) {
            while (!Character.isLetterOrDigit(input.charAt(i))) {
                i++;
            }
            while (!Character.isLetterOrDigit(input.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
