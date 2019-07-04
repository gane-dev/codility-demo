package com.mycodility.app;

import java.util.Arrays;

public class TapeEquilibrium
{
    public static void main( String[] args )
    {
        int a[] = {3, 1, 2, 4, 3};
        System.out.println( solution(a));

    }
    public  static  int solution(int A[])
    {
        int best=9999999;
        int before=0;
        int after=0;
        int difference=0;
        if (A.length < 2)
            return -1;
        after = Arrays.stream(A).sum();
        for(int i:A)
        {
            before += i;
            after -= i;
            difference = Math.abs(before-after);
            if (difference < best)
                best = difference;
        }
        return best;
    }
}
