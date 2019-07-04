package com.mycodility.app;

public class MaxCounters {
    public static void main( String[] args )
    {
        int a[] = {3, 4, 4, 6, 1,4,4};
        int x=5;
        int[] result=new int[x+1];
        result =solution(a,x);
        for(int i=1;i<=x;i++)
            System.out.println(result[i] );


    }
    public  static  int[] solution(int A[],int n) {
        int min=0;
        int max=0;
        int counter[] =new int[n+1];
        for(int i=1;i<=n;i++)
            counter[i]=min;
        for(int a:A)
        {
            if (a <= n)
            {

                counter[a]++;
                if (counter[a] > max)
                    max=counter[a];
            }
            else {
               min = max;
               for(int i=1;i<=n;i++)
                   counter[i]=max;
            }

        }
        return counter;
    }
}
