package com.ankush;

import java.util.Scanner;

public class loop6 {
    public static void main(String[] args) {
        System.out.println("enter the integer");
        Scanner s=new Scanner(System.in);
        int x,sum=0;
        x=s.nextInt();
        while(x>0)
        {
            sum+= x%10;
            x/=10;


        }
        System.out.println("the sum of the digit of thi integer:"+sum);
    }
}


