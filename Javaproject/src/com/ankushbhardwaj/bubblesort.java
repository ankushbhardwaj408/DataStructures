package com.ankushbhardwaj;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {


    // best case=n worst case =n2
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] a={2,5,4,3,20,2,41,-1};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            boolean sort=true;
            for(int j=1;j<n-i;j++)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                    sort=false;
                }

            }
            if(sort) break;
        }
//        for(int e: a){
//            System.out.print(e+" ");
//        }
        System.out.print(Arrays.toString(a));

    }
}
