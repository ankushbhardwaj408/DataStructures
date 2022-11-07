package com.ankush;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        System.out.println("enter the elemnets:");
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> y=new ArrayList<>();
        for( int i=0;i<6;i++)
        {
            int x=s.nextInt();
            if(!y.contains(x))
            {
                y.add(x);
            }
        }
        Collections.sort(y);
        System.out.println("the arraylist is:"+y.toString());

    }
}
