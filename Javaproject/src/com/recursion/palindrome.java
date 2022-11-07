package com.recursion;

public class palindrome {
//    static int fun2(int n,int base) {
//        if (n % 10 == n) return n;
//        int r = n % 10;
//
//        return (r * (int) Math.pow(10, base)) + fun2(n / 10,base-1);
//    }
    public static void main(String[] args) {
        int n=121;
        int base=(int)Math.log10(n)+1;
        System.out.println(n==reverse_a_no.fun(n)) ;

    }
}
