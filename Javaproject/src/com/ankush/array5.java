package com.ankush;

import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        System.out.println("the array is:");
        int[] arr={1,13,9,20,7,8,6,4,-2};
        int[] num=new int[arr.length];
        int i,j=0,k=arr.length-1;
       for(i=0;i<arr.length;i++)
       {
           if(arr[i]%2==0)
           {
               num[k--]=arr[i];

           }
           else
           {
               num[j++]=arr[i];
           }
        }
        System.out.println(Arrays.toString(num));
    }
}
