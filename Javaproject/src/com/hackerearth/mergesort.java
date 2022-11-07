package com.hackerearth;

public class mergesort {


    public static void main(String[] args) {
        int a[]={2,3,4,5,6};

      int x=  sort(a,0,a.length-1);
      //  for(int i=0;i<a.length;i++){
            System.out.print(x+" ");
        //}


    }
    static int sort(int[] a ,int l,int h){
     int count=0;
        if (l<h){
            int mid=(l+h)/2;
       count+=   sort(a,l,mid);
          count+=sort(a,mid+1,h);
       count+=    merge(a,l,mid,h);
        }
return count;
    }
    static int merge(int[] a,int l,int mid,int h){
        int[] b=new int[h-l+1];
        int c=0;
       int k=0;
        int i=l;
        int j=mid+1;
        while(i<=mid && j<=h){
            if(a[i]<=a[j]){
                b[k]=a[i];
                i++;
                k++;
            }
            else{
                b[k]=a[j];
                c=+(mid-i);
                j++;
                k++;

            }

        }

        while(i<=mid){
            b[k]=a[i];
            i++;
            k++;
        }
        while(j<=h){
            b[k]=a[j];
            k++;
            j++;
        }
        for(int p=l;p<=h;p++){
            a[p]=b[p-l];

        }
return c;
}
 /*static void merge(int Arr[], int start, int mid, int end) {

      // create a temp array
      int temp[] = new int[end - start + 1];

      // crawlers for both intervals and for temp
      int i = start, j = mid+1, k = 0;

      // traverse both arrays and in each iteration add smaller of both elements in temp
      while(i <= mid && j <= end) {
          if(Arr[i] <= Arr[j]) {
              temp[k] = Arr[i];
              k += 1; i += 1;
          }
          else {
              temp[k] = Arr[j];
              k += 1; j += 1;
          }
      }

      // add elements left in the first interval
      while(i <= mid) {
          temp[k] = Arr[i];
          k += 1; i += 1;
      }

      // add elements left in the second interval
      while(j <= end) {
          temp[k] = Arr[j];
          k += 1; j += 1;
      }

      // copy temp to original interval
      for(i = start; i <= end; i += 1) {
          Arr[i] = temp[i - start];
      }
  }*/

// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr

 /*  static void mergeSort(int Arr[], int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid+1, end);
            merge(Arr, start, mid, end);
        }
    }*/
}

