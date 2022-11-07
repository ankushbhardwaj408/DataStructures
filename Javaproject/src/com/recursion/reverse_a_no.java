package com.recursion;

public class reverse_a_no {
    public static void main(String[] args) {
        int n=12345;
        int base=(int)Math.log10(n)+1;
        System.out.println(fun2(n,base-1)) ;

    }
    static int sum=0;
    static int fun(int n){
        if(n==0) return sum;
        int r=n%10;
        sum=sum*10+r;
        return   fun(n/10);


    }
    static int fun2(int n,int base) {
        if (n % 10 == n) return n;
        int r = n % 10;

        return (r * (int) Math.pow(10, base)) + fun2(n / 10,base-1);
    }

    }
