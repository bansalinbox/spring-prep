package com.spring_prep.learning.dsa.kunal.vedios.binarySearch15;

public class CelingOfANo1 {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 8, 9 , 14, 16, 18, 22, 30};
        int target = 15;
        int potentialAns = celingOfANo(input, target);
        System.out.println("potentialAns --->" + potentialAns);

    }
    public static int celingOfANo(int[] input, int target){
        int start = 0;
        int end = input.length -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(input[mid] == target){
                return mid;
            }
            if(target < input[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
