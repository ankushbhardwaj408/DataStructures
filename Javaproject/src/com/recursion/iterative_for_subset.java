package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class iterative_for_subset {
    public static void main(String[] args) {
        int[] arr= {1,2,2};

List<List<Integer>> ans=duplicate(arr);
for(List<Integer> x:ans)
{
    System.out.println(x);
}
    }
    static List<List<Integer>> fun(int[] a)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:a)
        {
           int n=outer.size();
            for(int i=0;i<n;i++) {
                List<Integer> ans = new ArrayList<>(outer.get(i));
                ans.add(num);
                outer.add(ans);
            }
        }
        return outer;
    }
    static List<List<Integer>> duplicate(int[] a)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
int s=0;
int e=0;


        for(int i=0;i<a.length;i++)
        {
            s=0;
            if(i>0 && a[i]==a[i-1]){
                s=e+1;

            }
            int n=outer.size();
            e= outer.size()-1;
            for(int j=s;j<n;j++) {
                List<Integer> ans = new ArrayList<>(outer.get(j));
                ans.add(a[i]);
                outer.add(ans);
            }
        }
        return outer;
    }
}
