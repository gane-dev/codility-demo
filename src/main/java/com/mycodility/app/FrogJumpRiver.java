package com.mycodility.app;
import java.util.HashMap;
import java.util.Map;
public class FrogJumpRiver {
    public static void  main(String[] args)
    {
        int x=5;
        int a[] ={1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(a,x));
    }
    public static int solution(int a[],int x)
    {
        int result=-1;
        int pos =-1;
        Map<Integer,Boolean> hits = new HashMap<>();
        for(int elem:a)
        {
            pos++;
                if (!hits.containsKey(elem)) {
                    hits.put(elem, true);
                }
                    if (hits.size() == x)
                        return pos;

        }
        return -1;
    }
}
