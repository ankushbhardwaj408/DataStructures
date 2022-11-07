package com.ankush;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.print("enter the 4 digit of:");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int x1,x2,x3,x4;
        x1=x%10;
        x=x/10;
        x2=x%10;
        x=x/10;
        x3=x%10;
        x=x/10;
        x4=x%10;
        if((x1+x2)==(x3+x4))
        {
            System.out.println("it is a lucky no");
        }
        else
        {
            System.out.println("it is not a 546lucky no");
        }

     //   System.out.println("Hello world");
    }
}
