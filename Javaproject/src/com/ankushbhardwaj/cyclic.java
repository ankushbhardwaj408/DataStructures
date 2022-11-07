package com.ankushbhardwaj;

import java.util.Scanner;
// worst case=n
public class cyclic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={3,5,2,1,4};
        int n=a.length;
        int i=0;
        while(i<n)
        {

          if(a[i]==(a[a[i]-1])){
             i++;
          }else{
              int temp=a[i];
              a[i]=a[temp-1];
              a[temp-1]=temp;
          }




        }
        for(int e: a){
            System.out.print(e+" ");
        }

    }
}
