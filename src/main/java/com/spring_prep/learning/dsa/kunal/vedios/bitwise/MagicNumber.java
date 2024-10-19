package com.spring_prep.learning.dsa.kunal.vedios.bitwise;

public class MagicNumber {

    static int nthMagicNo(int n)
    {
        int pow = 1, answer = 0;

        // Go through every bit of n
        while (n != 0)
        {
            pow = pow*5;

            // If last bit of n is set
            if ((int)(n & 1) == 1)
                answer += pow;

            // proceed to next bit
            // or n = n/2
            n >>= 1;
        }
        return answer;
    }

    // Driver program to test
    // above function
    public static void main(String[] args)
    {
        int n = 5;
        int count = 0;
        int total = 0;
        int base = 5;
        while(n > 0){
            int lastDigit = n & 1;
            total += lastDigit * base;
            base = base * 5;
            n = n >> 1;

        }
        System.out.println(total);
    }
}
