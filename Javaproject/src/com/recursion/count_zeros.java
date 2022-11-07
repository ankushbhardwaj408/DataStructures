package com.recursion;

public class count_zeros {
    public static void main(String[] args) {
        System.out.println(fun(1200000035,0)) ;

    }
    static int fun(int n,int base){
        if(n==0) return base;
        if(n%10==0) return fun(n/10,base+1);
     return fun(n/10,base);


    }
}
