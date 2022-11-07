package com.ankush;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.print("enter an no between 1 and 10:");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        while(x<=1 || x>=10)
        {
            System.out.print(x+" "+"is not between 1 and 10:Try again:");
            x=s.nextInt();
        }
        System.out.println(x+" "+"is between 1 and 10.Thanks");
    }
}
