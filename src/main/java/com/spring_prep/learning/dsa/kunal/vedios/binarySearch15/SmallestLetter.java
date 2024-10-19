package com.spring_prep.learning.dsa.kunal.vedios.binarySearch15;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] input2 = {'c', 'g', 'm', 'v'};
        char[] input1 = {'c', 'f', 'j'};
        char[] input = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char target = 'e';
        System.out.println(search(input, target));

    }

    public static char search(char[] input, char target){
        int start = 0;
        int end = input.length -1;

        if(target + 0 >= input[end] + 0){
            return input[0];
        }

        while(start < end){
            int mid = start + (end -start)/2;
//            if(input[mid]+0 == target+0){
//                return input[mid+1];
//            }
            if(target+0 < input[mid] + 0){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return input[start];
    }
}
