package com.ankush;

import java.util.Scanner;

public class arrray3 {
    public static void main(String[] args) {
        System.out.println("Enter the no you want to search:");
        Scanner s=new Scanner(System.in);
        int y=0;
        int x=s.nextInt();
        int [] arr={1,2,3,45,65,34,2,12,3,45,34};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                y++;
            }

        }
        if(y==0)
        {
            System.out.println("not found");
        }
        else {System.out.println(x+"occurs"+y+"times");
        }
    }
}
