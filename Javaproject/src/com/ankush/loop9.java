package com.ankush;

import java.util.Scanner;

public class loop9 {
    public static void main(String[] args) {
        System.out.print("enter the string:");
        Scanner s=new Scanner(System.in);
        String x=s.nextLine();
        int i;
        char y;
        for(i=x.length()-1;i>=0;i--)
        {
            y=x.charAt(i);
            System.out.print(y);
        }
    }
}
