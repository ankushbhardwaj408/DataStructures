package com.ankushbhardwaj;

import java.util.Arrays;
import java.util.Scanner;

public class mergeinplace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] a={3,2,1};

         sort(a,0,a.length);
        System.out.println(Arrays.toString(a));

    }
    static void sort(int[] num,int s,int e)
    {
        if(e-s==1)
        {
            return;
        }
int mid=(s+e)/2;

        sort(num,s,mid);
        sort(num,mid,e);          //1-2   2-3
          merge(num,s,mid,e);
    }
    static void merge(int[] num,int s,int m,int e){
        int i=s;
        int j=m;
        int k=0;
        int[] ans=new int[e-s];
        while(i<m && j<e){
            if(num[i]<num[j]){
                ans[k]=num[i];
                i++;

            }else{
                ans[k]=num[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            ans[k]=num[i];
            i++;
            k++;
        }

        while(j<e)
        {
            ans[k]=num[j];
            j++;
            k++;   //ans={1 2} 1=0 2=1
        }
//num   s=1 +0=1 s+1=2
         for(int g=0;g<ans.length;g++)
         {
             num[s+g]=ans[g];
         }

    }
}
