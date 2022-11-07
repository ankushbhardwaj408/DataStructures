package com.ankush;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        System.out.println("enter a positive integer:");
        Scanner s = new Scanner(System.in);
        int i, x, y;
        x = s.nextInt();
        boolean is=true;
        for (i = 2; i <=x/2; i++) {
            if (x % i == 0) {
               is=false;
                break;
            }


        }
        System.out.println(is? "prime no":"not a prime no");
    }
}
