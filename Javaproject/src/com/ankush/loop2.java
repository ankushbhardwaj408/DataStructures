package com.ankush;

import javax.swing.*;
import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        System.out.println("enter the no:");
        int i,x,y=0;
        Scanner s=new Scanner(System.in);

        while(y<=100)
        {
            x=s.nextInt();
            y=x+y;
        }
        System.out.println("done");
    }
}
