package com.recursion;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

public class n_to_one {
    public static void main(String[] args) {
        fun(5);

    }


    static void fun(int n){
        if(n==0) return;
        fun(n-1);
        System.out.println(n);

    }
}
