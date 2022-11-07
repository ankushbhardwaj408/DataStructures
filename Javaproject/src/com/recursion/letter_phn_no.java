package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class letter_phn_no {
    public static void main(String[] args) {
        System.out.println(fun2("","1676"));
    }
    static void fun(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int d=up.charAt(0)-'0';
        for(int i=(d-1)*3;i<d*3;i++)
        {
            fun(p+(char)('a'+i),up.substring(1));
        }
    }
    static List fun2(String p,String up)
    {
        List<String> ans=new ArrayList<>();
        if(up.isEmpty())
        {

            List<String > list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int d=up.charAt(0)-'0';
        for(int i=(d-1)*3;i<d*3;i++)
        {
           ans.addAll( fun2(p+(char)('a'+i),up.substring(1)));
        }
        return ans;
    }
}
