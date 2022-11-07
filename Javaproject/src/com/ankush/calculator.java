package com.ankush;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter no1 operator no2:");
        Scanner in =new Scanner(System.in);
        double x,y;
        char z;
        x=in.nextDouble();
        z=in.next().charAt(0);
        y=in.nextDouble();
        if (z == '+')
        {
            System.out.println(x+y);
        }
else if(z=='-')
        {
            System.out.println(x-y);
        }
        else if(z=='/')
        {
            System.out.println(x/y);
        }
        else if(z=='*')
        {
            System.out.println(x*y);
        }

    }
}
