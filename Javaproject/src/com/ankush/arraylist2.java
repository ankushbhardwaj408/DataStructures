package com.ankush;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args) {

        int x=0;
        Scanner s=new Scanner(System.in);

        ArrayList<Integer> arr=new ArrayList<>();

boolean b=true;
        while(b)
        {
            System.out.println("1.Add ");
            System.out.println("2.Remove ");
            System.out.println("3.Print ");
            System.out.println("4.Exit ");
            System.out.print("enter choice:");
            x=s.nextInt();
            switch(x)
            {
                case 1:
                    System.out.println("enter element:");
                    int y=s.nextInt();
                    arr.add(y);
                    break;
                case 2:System.out.println("enter element:");
                    int z=s.nextInt();
                    if(arr.contains(z)) {
                        arr.remove(new Integer(z));
                    }
                    else
                        System.out.println("not found");
                    break;
                case 3:
                    System.out.println("your list:"+  arr.toString());

                    break;
                case 4:b=false;
                    break;

            }


        }
    }
}
