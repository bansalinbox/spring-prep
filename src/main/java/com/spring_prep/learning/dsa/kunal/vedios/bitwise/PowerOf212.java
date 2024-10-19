package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

// find out if the no is in the power of 2 or not
public class PowerOf212 {
    public static void main(String[] args) {
        int no = 127;
        System.out.println(find(no));
    }

    public static boolean find(int x){
        int count = 0;
        while (x != 0){
            count++;
            x = x & (x -1);
        }
        System.out.println("count --->" + count);
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }

    public static boolean find2(int x){
        // if x == 0 need to handle as retrun false;
        boolean ans = (x & (x-1)) == 0;
        return ans;
    }
}
