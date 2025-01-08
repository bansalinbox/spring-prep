package com.spring_prep.learning.dsa.adityaverma.binarysearch;

public class CelingOfChar {

    public static void main(String[] args) {
        char[] input = {'c', 'f', 'j'};
        char target = 'c';
        char ans = nextGreatestLetter(input, target);
        System.out.println(ans);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        char ans = letters[0];
        if(target > letters[end]){
            return ans;
        }
        if(target < letters[0]){
            return letters[0];
        }
        while(start <= end){
            int mid = start + (end -start)/2;
            if(letters[mid] == target){
                return letters[mid+1];
            }
            if(target > letters[mid]){
                start = mid + 1;
            }
            if (target < letters[mid]){
                ans = letters[mid];
                end = mid -1 ;
            }
        }
        return ans;
    }
}
