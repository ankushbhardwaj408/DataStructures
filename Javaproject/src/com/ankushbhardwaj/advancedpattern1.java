package com.ankushbhardwaj;

import java.util.Scanner;

public class advancedpattern1 {
    public static void main(String[] args) {
        System.out.println("enter the integer");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
         int i,j,k,y;
int z=x;
         for(i=1;i<=x;i++)
         {
             for(y=z-1;y>0 ;y--)
             {
                 System.out.print("  ");

             }
             for(k=1;k<=i;k++)
             {
                 System.out.print("x  ");
             }
             System.out.print("\n");
             z--;
         }
    }
}
