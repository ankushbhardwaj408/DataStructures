package com.recursion;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] a=new int[]{5,45,3,2,1};
        int m;
        s(a,a.length-1,0,0);
        System.out.println(Arrays.toString(a));
    }
    static void s(int[] a,int r,int c,int m)
    {
        if(r==0) return;
        if(c<=r) {
            if (a[c] > a[m]) {
               m=c;
                s(a, r, c + 1,m);
            }else{
                s(a, r, c + 1,m);
            }
        }else{
            int temp = a[m];
            a[m] = a[c - 1];
            a[c - 1] = temp;
            s(a,r-1,0,0);
        }
    }
}


//
