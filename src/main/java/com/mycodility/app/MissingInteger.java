package com.mycodility.app;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {
    public static void  main(String[] args)
    {
        int a[] ={1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(a));
    }
    public static int solution(int a[]) {
        Map<Integer, Boolean> hits = new HashMap();
        int largest = 0;
        for (int elem : a) {
            hits.put(elem, true);
            if (elem > largest)
                largest = elem;
        }
        int i=1;
        for (i=1;i <= largest; i++) {
            if (!hits.containsKey(i))
                break;
        }
        return i;
    }

}

