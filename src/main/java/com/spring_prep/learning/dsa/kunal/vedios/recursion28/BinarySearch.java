package com.spring_prep.learning.dsa.kunal.vedios.recursion28;

public class BinarySearch {
    public static void main(String[] args) {
        int[] rotatedInput = {3, 4, 5, 6, 7, 1, 2};
        int[] input = {3, 4, 5, 6, 7};
        int target = 7;
        //System.out.println(search(input, target, 0, input.length-1));
        //System.out.println(rotatedHelper(rotatedInput, 0, rotatedInput.length-1));
        System.out.println(searchRecursion(input, 4, 0, input.length-1));
        //System.out.println(BTRotatedArray1(rotatedInput, 41, 0, rotatedInput.length-1));


    }

    public static int rotatedHelper(int[] input, int start, int end){
        int pivot = -1;
        int target = 4;
        int ans = -1;
            if(input.length > 1) {
                // it means it is rotated
                if (input[end] < input[start]) {
                    System.out.println("it is a rotated array");
                    pivot = findPivotRecursion(input, start, input.length - 1);
                    System.out.println("pivot index ---> "+ pivot);
                    ans = search(input, target, start, pivot - 1);
                    if (ans == -1) {
                        ans = search(input, target, pivot, end);
                    }
                }else{
                    // if not rotated then simple search
                    System.out.println("it is a non rotated array");
                    ans = search(input, target, 0, end);
                }

            }
        return ans;
    }

    public static int findPivot(int[] input, int start, int end){
        int mid = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(input[mid] < input[mid -1]){
                return mid;
            }
            if(input[mid] > input[end]){
                start = mid + 1;
            }else{
                end  = mid -1;
            }
        }
        return mid;
    }

    public static int search(int[] input, int target, int start, int end){
        int mid = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(input[mid] == target){
                return mid;
            }
            if(target > input[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return mid;
    }

    public static int findPivotRecursion(int[] input, int start, int end){
        int mid = -1;
        if(start <= end){
            mid = start + (end - start)/2;
            if(input[mid] < input[mid -1]){
                return mid;
            }
            if(input[mid] > input[end]){
                start = mid + 1;
            }else{
                end  = mid -1;
            }
            return findPivotRecursion(input, start, end);
        }
        return mid;
    }

    public static int searchRecursion(int[] input, int target, int start, int end){
        if(start <= end){
            int mid = start + (end - start)/2;
            if(input[mid] == target){
                return mid;
            }
            if(target > input[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
            return searchRecursion(input, target, start, end);
        }else{
            return -1;
        }
    }

    //{3, 4, 5, 6, 7, 1, 2};
    public static int BTRotatedArray1(int[] input, int target, int start, int end){
       int mid = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target == input[mid]){
                return mid;
            }
            if(input[start] > input[mid] && target <= input[end]){
               start = mid + 1;
            }else{
                end = mid -1;
            }

            if(input[start] < input[mid] && target < input[mid]){
                end = mid -1;
            }
        }
        return mid;
    }
}
