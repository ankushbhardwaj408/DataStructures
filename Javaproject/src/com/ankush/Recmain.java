package com.ankush;

import java.util.Scanner;

public class Recmain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Rectangle rec=new Rectangle(25.1,32.1);
      /*  int i;
        for(i=0;i<rec.length;i++) {


            System.out.println("you want to enter width and height:(y/n");
            char x = s.next().charAt(0);
            if (x == 'y') {
                rec[i] = new Rectangle(s.nextDouble(), s.nextDouble());
            } else {
                rec[i] = new Rectangle();
            }*/
            System.out.println("the area is"+rec.getArea()+"the perimeter is:"+rec.getPerimeter());
        }

    }

