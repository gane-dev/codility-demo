package com.mycodility.app;

public class PassingCars {
    public static void  main(String[] args)
    {
        int a[] ={0, 1, 0, 1, 1};
        System.out.println(solution(a));
    }
    public static long solution(int a[]) {
        int max = 100000;
        int east =0;
        long pairs=0;
        double max_pairs = 1e9;
        for(int elem:a)
        {
            if (elem == 0)
                east++;
            else
                pairs += east;
            if (pairs > max_pairs)
                return  -1;

        }
        return  pairs;
    }
}
