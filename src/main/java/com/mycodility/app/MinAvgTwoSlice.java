package com.mycodility.app;

public class MinAvgTwoSlice {
    public static void  main(String[] args)
    {
        int a[] ={4, 2, 2, 5, 1, 5, 8};
        System.out.println(solution(a));
    }
    public static int solution(int a[]) {
        double lowest_avg = 10000;
        int lowest_idx = 0;
        int second_last;
        int last;
        int current;
        double three_avg;
        double two_avg;
        int i;
        for (i = 2; i < a.length; i++) {


            if (a.length > 2) {
                second_last = a[i - 2];
                last = a[i - 1];
                current = a[i];
                three_avg = (second_last + last + current) / 3.0;
                if (three_avg < lowest_avg) {
                    lowest_avg = three_avg;
                    lowest_idx = i - 2;
                }
                two_avg = (last + current) / 2.0;
                if (two_avg < lowest_avg) {
                    lowest_avg = two_avg;
                    lowest_idx = i - 1;
                }

            }
        }
        return  lowest_idx;

    }
}
