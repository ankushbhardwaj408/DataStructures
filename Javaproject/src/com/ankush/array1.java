package com.ankush;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        System.out.print("enter the no of elements:");
        Scanner n=new Scanner(System.in);
        int y=n.nextInt();
        int [] x=new int[y];

        for(int i=0;i<y;i++)
        {
            System.out.print("enter the"+" "+(i+1)+" "+"elemnet:");
            x[i]=n.nextInt();
        }
        System.out.println("the array is:");
        System.out.println(Arrays.toString(x));
    }
}
