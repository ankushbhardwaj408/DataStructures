package com.ankush;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        System.out.println("enter the integer");
        Scanner s=new Scanner(System.in);
        int i,x,y=0;
        x =s.nextInt();
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                y=y+i;

            }


        }

    }
}
