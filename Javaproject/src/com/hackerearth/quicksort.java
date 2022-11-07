package com.hackerearth;

public class quicksort{

    static int partition(int a[],int l,int h)
    {
        int pivot=a[l];
        int i=l;
        int j=h;
        while (i < j)
        {

            do{
                i++;

            }while (a[i]<=pivot);
            do {
                j--;
            }while (a[j]>pivot);
            if(i<j){
                swap(a,i,j);

            }

        }
        swap(a,j,l);



        return j;
    }
    static void swap(int a[],int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
static void sort(int a[],int i,int j)
{
    if (i<j)
    {
        int pivot=partition(a,i,j);
        sort(a,i,pivot);
        sort(a,pivot+1,j);
    }
}
    public static void main(String[] args) {
        int a[]={8,6,2,7,3,1,9};
        int i=0;
        int j=a.length-1;
        sort(a,i,j);
        for(int k=0;k<a.length;k++) {
            System.out.print(a[k]+" ");
        }
    }
}





