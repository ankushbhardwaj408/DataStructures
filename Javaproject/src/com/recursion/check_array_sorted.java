package com.recursion;

public class check_array_sorted {
    public static void main(String[] args) {
        System.out.println(fun(new int[]{1,20,3,4,5},0));
    }
    static boolean fun(int[] n,int i) {
        if (i == n.length-1) return true;
        return n[i]<n[i+1] && fun(n, i + 1);
    }
}
