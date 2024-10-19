package com.spring_prep.learning.dsa.kunal.vedios.recursion28;

import java.util.ArrayList;
import java.util.List;

public class LinearSeachMultipleOccurance {
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[] input = {8, 1, 3, 4, 5, 6, 11, 10, 4, 8, 8, 8};
//        search(input, 8);
//        System.out.println(ans);

        System.out.println(searchLocalArrayList(input, 8));
    }


    static void search(int[] input, int target){
        helper(input, target, 0);
    }

    static void helper(int[] input, int target, int index){
        if(index == input.length){
            return;
        }
        if(input[index] == target){
            ans.add(index);
        }
        helper(input, target, index+1);
    }

    // with arraylist into the argument

    static List<Integer> searchLocalArrayList(int[] input, int target){
        return helperLocalArrayList(input, target, 0);
    }
    static List<Integer> helperLocalArrayList(int[] input, int target, int index){
        List<Integer> ls = new ArrayList<>();
        if(index == input.length){
            return ls;
        }
        if(input[index] == target){
            ls.add(index);
        }
        List<Integer> ls1 =  helperLocalArrayList(input, target, index+1);
        if(!ls1.isEmpty()){
            ls.addAll(ls1);
        }
        return ls;
    }

}
