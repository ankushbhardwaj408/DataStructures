package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
     fun("","abc");
       // System.out.println(ans);
    }
    static void fun(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        int x=p.length();
        for(int i=0;i<=x;i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            fun(f+ch+l,up.substring(1));
        }
    }
    static List<String> fun2(String p,String up)
    {
        List<String> ans=new ArrayList<>();
        if(up.isEmpty())
        {

            List<String > list=new ArrayList<>();
           list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        int x=p.length();
        for(int i=0;i<=x;i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            List<String> a=fun2(f+ch+l,up.substring(1));
            ans.addAll(a);

        }
        return ans;
    }
    static int fun3(String p,String up)
    {

        if(up.isEmpty())
        {
           // System.out.println(p);
            return 1;
        }
        int ans=0;
        char ch=up.charAt(0);
        int x=p.length();
        for(int i=0;i<=x;i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
          ans= ans+  fun3(f+ch+l,up.substring(1));
        }
        return ans;
    }
}
