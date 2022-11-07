package com.ankushbhardwaj;

import java.util.Scanner;

public class selectionSort {
    // best case=n2 worst case =n2

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={2,4,335,32,9,2,3,-1};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }


            }
            int temp=a[i];

            a[i]=a[min];
            a[min]=temp;



        }
        for(int e: a){
            System.out.print(e+" ");
        }



    }
}
