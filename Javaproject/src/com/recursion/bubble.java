package com.recursion;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] a=new int[]{5,4,3,2,1};
        bubble(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    static void bubble(int[] a,int r,int c)
    {
        if(r==0) return;
        if(c<r) {
            if (a[c] > a[c + 1]) {
                int temp = a[c];
                a[c] = a[c + 1];
                a[c + 1] = temp;
                bubble(a, r, c + 1);
            }
        }else{
            bubble(a,r-1,0);
        }
    }
}
