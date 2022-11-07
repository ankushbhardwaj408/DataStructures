package com.ankush;

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        System.out.println("enter no:");
        Scanner s=new Scanner(System.in);
        int i,x,min,y,max;
        x=s.nextInt();
        min=x;
        max=x;
        while(x>=0)
        {


            if(min>x)
            {
                min=x;
            }
          if(max<x)
          {
              max=x;
          }

            x=s.nextInt();
        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);
    }
}
