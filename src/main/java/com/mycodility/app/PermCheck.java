package com.mycodility.app;
import java.util.HashMap;
import java.util.Map;

public class PermCheck {
    public static void main( String[] args )
    {
        int a[] = {4, 1,2, 3};
        System.out.println( solution(a));

    }
    public  static  int solution(int A[])
    {
        int result=0;
        Map<Integer,Boolean> hits=new HashMap<>();
        if (A.length  == 0)
          return  0;
        for (int elem:A) {
            if (hits.keySet().size() >0) {
                if (hits.containsKey(elem)) {

                    return 0;
                }
            }
            hits.put(elem,true);

        }
        if (hits.size() != A.length)
            return 0;

        for(int i=1 ; i <= A.length;i++)
        {
            if (!hits.containsKey(i)) {
                return 0;
            }
        }
      return  1;
    }

}
