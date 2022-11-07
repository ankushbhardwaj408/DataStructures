package com.ankushbhardwaj;

public class ceilingofno {
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3,14,16,17,18,19,20,22};
        int t=25;
        System.out.println("nfjf");
        System.out.println(ceiling(a,t));

    }
    public static int ceiling(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target){
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        return s;
    }
}
