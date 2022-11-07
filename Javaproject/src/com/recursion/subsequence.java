package com.recursion;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {

        fun("","abc");
    }
    static void fun(String p,String s)
    {
        if(s.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=s.charAt(0);
        fun(p,s.substring(1));
        fun(p+ch,s.substring(1));


    }
    static ArrayList fun2(String p, String s)
    {
        if(s.isEmpty())
        {
ArrayList<String> list=new ArrayList<>();
list.add(p);
            return list;
        }

        char ch=s.charAt(0);
        ArrayList<String > l=  fun2(p+ch,s.substring(1));
       ArrayList<String > f=fun2(p,s.substring(1));
       ArrayList<String> a=fun2(p+(ch+0),s.substring(1));// for ascii

f.addAll(l);
f.addAll(a);//this ascii

return f;

    }
}
