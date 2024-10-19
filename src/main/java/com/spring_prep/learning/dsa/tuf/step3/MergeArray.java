package com.spring_prep.learning.dsa.tuf.step3;

import java.util.ArrayList;

public class MergeArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {2,3, 4, 6};
        System.out.println(findUnion(arr1, arr2, 3, 4));
    }


    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> output = new ArrayList<>();
        int a = 0;
        int b = 0;
        int c = n -1;
        int d = m -1;
        int count = 0;
        int min = Math.min(n,m) -1;
        n = n-1;
        m = m -1;
        while(count <= min){
            int tempa = arr1[count];
            int tempb = arr2[count];

            if(tempa < tempb){
                output.add(tempa);
                n--;
                a++;
            }else if(tempa > tempb){
                output.add(tempb);
                m--;
                b++;
            } else if(tempa == tempb){
                output.add(tempa);
                n--;
                m--;
                a++;
                b++;
            }
            count++;

        }
        int lastindex = output.size() -1;
        int value = output.get(lastindex);
        for(int i = a; i <= c ; i++){
            int current = arr1[i];
            if(current != value){
                output.add(current);
                value = current;
            }
        }

        for(int i = b; i <= d ; i++){
            int current = arr1[i];
            if(current != value){
                output.add(current);
                value = current;
            }
        }

        return output;

    }
}
