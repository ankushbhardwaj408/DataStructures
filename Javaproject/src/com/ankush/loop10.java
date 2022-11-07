package com.ankush;

import java.util.Scanner;

public class loop10 {
    public static void main(String[] args) {
        System.out.print("enter the string:");
        Scanner s = new Scanner(System.in);
        String x = s.next();
       boolean y=false;
        for (int j=0, i = x.length()-1; j<i; i--,j++)
            {
                if (x.charAt(j) == x.charAt(i)) {
                    y = true;
                    continue;
                } else {
                    y = false;
                    break;
                }
            }
        System.out.println(y);
    }
}
