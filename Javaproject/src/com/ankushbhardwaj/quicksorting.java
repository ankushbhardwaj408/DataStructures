package com.ankushbhardwaj;
//nlog n
//0(1)
import java.util.Arrays;
import java.util.Scanner;

public class quicksorting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] a={3,5,2,1,4};

         sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
    static void sort(int[] num,int low,int hi){
       if(low>=hi){
           return;
       }
        int m=low+(hi-low)/2;
        int s=low;
        int e=hi;
        int p=num[m];
        while(s<=e){
            while(num[s]<p){
                s++;
            }
            while(num[e]>p)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=num[s];
                num[s]=num[e];
                num[e]=temp;
                s++;
                e--;
            }
        }
        sort(num,low,e);
        sort(num,s,hi);
    }
}
