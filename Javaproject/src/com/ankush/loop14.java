package com.ankush;

import java.util.Scanner;

public class loop14 {
    public static void main(String[] args) {
        System.out.println("enter the positive integer:");
        Scanner s = new Scanner(System.in);
        int x, j, i, y;
        x = s.nextInt();
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
