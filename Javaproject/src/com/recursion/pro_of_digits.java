package com.recursion;

public class pro_of_digits {
    public static void main(String[] args) {
        System.out.println(fun(12035)) ;

    }
    static int fun(int n){
        if(n%10==n) return n;
        return  n%10* fun(n/10);


    }
}
