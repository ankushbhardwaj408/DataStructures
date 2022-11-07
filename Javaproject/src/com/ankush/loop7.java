package com.ankush;

import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner s=new Scanner(System.in);
        int i,n1=0,n2=1,n3=1,n;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print(n3+" ");
            n3=n2+n1;
            n1=n2;
            n2=n3;



        }
    }
}
