package com.ankush;

import java.util.Scanner;

public class loop11 {
    public static void main(String[] args) {
        System.out.println("enter the positive integer:");
        Scanner s = new Scanner(System.in);
        int x, j, i, y;
        x = s.nextInt();
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println("");

        }
    }
}
