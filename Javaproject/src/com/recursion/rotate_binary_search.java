package com.recursion;

public class rotate_binary_search {
    public static void main(String[] args) {
        int[] a=new int[] {1,2,3,4,5};
        System.out.println(fun(a,3,0,a.length-1));
    }
    static int fun(int[] n,int t,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(n[m]==t)
        {
            return m;
        }
        if(n[s]<n[m])
        {
            if(t>n[s] && t<n[m])
            {
                return fun(n,t,s,m-1);
            }else{
                return fun(n,t,m+1,e);
            }
        }else{
            if(t>n[m] && t<n[s])
            {
                return fun(n,t,m+1,e);
            }else{
                return fun(n,t,s,m-1);
            }
        }
    }
}
