package com.spring_prep.learning.dsa.kunal.vedios.recursion23;

public class ReverseANumber {
    public static void main(String[] args) {
        //System.out.println(reverse(1489));
        //revserse2Helper(1489);
        System.out.println(reverseDigit(1234, 4));
    }

   static int sum = 0;
    public static int reverse(int n){
        if(n == 0){
            return n;
        }
        sum = sum * 10 + (n % 10);
        reverse(n/10);
        return sum;
    }

    public static void revserse2Helper(int n){
        int noOfDigit = (int)Math.log10(n)+1;
        int ans = reverse2(n, noOfDigit);
        System.out.println(ans);
    }

    public static int reverse2(int n, int noOfDigit){
        if(n == 0){
            return n;
        }
        int base = 1;
        int temp = noOfDigit;
        while(temp > 1){
            base = base * 10;
            temp--;
        }
        // or
        return (n % 10) * base + reverse2(n/10, noOfDigit-1);

        //return (int)Math.pow(10, noOfDigit -1) * (n % 10) + reverse2(n/10, noOfDigit-1);
    }

    public static int reverseDigit(int n, int NoOfdigit){
        if(n/10 == 0){
            return n;
        }
        return n%10 * (int)Math.pow(10, NoOfdigit-1) + reverseDigit(n/10, NoOfdigit-1);
    }
}
