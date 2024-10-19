package com.spring_prep.learning.dsa.tuf.step3;

import java.util.ArrayList;

public class FindUnion {
    public static void main(String[] args) {
        int[] arr1 = {-8 ,-3 ,-3 ,-2 ,0 ,1 ,2 ,2 ,6};
        int[] arr2 = {-9 ,-9 ,0};
        System.out.println(findUnion(arr1, arr2, 9, 3));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        if(arr1.length == 0 && arr2.length == 0){
            return new ArrayList<Integer>();
        }


        ArrayList<Integer> ans = new ArrayList<>();

        int min = Math.min(n, m);
        int na = 0;
        int nb = 0;
        int previous = -1;

        while(na < n && nb < m){
            int a = arr1[na];
            int b = arr2[nb];
            int current = -1;

            if(a == b){
                current = a;
                na++;
                nb++;
            } else if(a < b){
                current = a;
                na++;
            }else if(a > b){
                current = b;
                nb++;
            }
            if(current != previous){
                ans.add(current);
            }
            previous = current;
        }

        while(na < n){
            int pre = ans.get(ans.size() -1 );
            int a = arr1[na];
            if(pre != a){
                ans.add(a);
            }
            na++;
        }

        while(nb < m){
            int pre = ans.get(ans.size() -1 );
            int b = arr2[nb];
            if(pre != b){
                ans.add(b);
            }
            nb++;
        }
        return ans;
    }
}
