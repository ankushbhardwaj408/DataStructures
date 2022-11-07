package com.ankush;

import java.util.Scanner;

public class loop13 {
    public static void main(String[] args) {
        System.out.println("enter the positive integer:");
        Scanner s = new Scanner(System.in);
        int x, j, i, y,z;
        x = s.nextInt();
        z=x;
        for (i = 1; i <= x; i++)
        {


            for (y =1;y<=z-1;y++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2*i-1; j++) {
                if(i==x) {
                    System.out.print("*");
                }
                else if(j==1 || j==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }




            z--;

            System.out.println("");
        }
    }


}
