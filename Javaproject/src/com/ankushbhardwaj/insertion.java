package com.ankushbhardwaj;

import java.util.Scanner;

public class insertion {
    // best case=n worst case =n2

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={5,4,3,2,1};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {

            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }else{
                    break;
                }


            }




        }
        for(int e: a){
            System.out.print(e+" ");
        }



    }
}
