package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class dice_throw {
    public static void main(String[] args) {
        fun("",4);
    }
    static void fun(String p,int t)
    {
        if(t==0)
        {
            System.out.println(p);
            return;
        }

       for(int i=1;i<=6 && i<=t;i++)
       {
           fun(p+i,t-i);
       }

    }
    static List fun2(String p,int t)
    {

        List<String> ans=new ArrayList<>();
        if(t==0)
        {

            List<String > list=new ArrayList<>();
            list.add(p);
            return list;
        }

        for(int i=1;i<=6 && i<=t;i++)
        {
            ans.addAll(fun2(p+i,t-i));

        }
        return ans;
    }
}
