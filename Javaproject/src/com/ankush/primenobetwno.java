package com.ankush;

import java.util.Scanner;

public class primenobetwno {
    public static void main(String[] args) {
        System.out.println("enter the interval:");
        int x,y;
       // ex4 d=new ex4();
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        priprino(x,y);

    }

   static boolean isprime(int x) {
        int i;
        boolean y = true;
        for (i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                y = false;
            }


        }
        if(x==1)
            y=false;


        return y;
    }
    static void priprino(int x, int y)
    {
        for(int i=x+1;i<y;i++)
        {
            if(isprime(i)==true)
            {
                System.out.print(i+" ");
            }
        }
    }
}



