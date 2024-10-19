package com.spring_prep.learning.dsa.kunal.vedios.binarysearch2DArray16;

// this is strictly sorted
public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 7, 19},
                {20, 21, 30, 32},
                {35, 40, 43, 46},
                {47, 49, 70, 71}
        };
        int target = 71;
        int floor = getFloorOfNo(arr, target);
        int column = binarySearchInRow(arr, target, floor);
        System.out.println("Row --->" + floor);
        System.out.println("Column --->" + column);

    }

    public static int binarySearchInRow(int[][] arr, int target, int row){
        int start = 0;
        int end = arr[row].length -1;
        while(start <= end){
            int mid = start + (end -start)/2;

            if(target> arr[row][mid]){
                start = mid +1;
            } else if(target < arr[row][mid]){
                end = mid -1;
            }
            if(target == arr[row][mid]){
                return mid;
            }
        }
        return -1;
    }

    public static int getFloorOfNo(int[][] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;
        while(start <= end){
            int mid = start + (end -start)/2;

            if(target> arr[mid][0]){
                start = mid +1;
            } else if(target < arr[mid][0]){
                end = mid -1;
            }
            if(target == arr[mid][0]){
                return mid;
            }
        }
        return end;
    }
}
