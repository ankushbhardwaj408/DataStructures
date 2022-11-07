package com.ankush;

import java.util.Scanner;

public class loop8 {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner s=new Scanner(System.in);
        String x=s.nextLine();
        int i;
        char y;
        for(i=0;i<x.length();i++)
        {
            y=x.charAt(i);
            System.out.print(y+" ");
        }
    }
}
