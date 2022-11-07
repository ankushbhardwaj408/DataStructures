package com.recursion;

import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        System.out.println(fun(new int[]{1,20,3,4,5},4,0));
        System.out.println(fun2(new int[]{1,20,3,4,5},4,0));
        System.out.println(fun3(new int[]{1,20,3,4,5},4,4));
        System.out.println(fun4(new int[]{1,20,3,4,4,5},4,0));
        System.out.println(fun5(new int[]{1,20,3,4,4,5},4,0,new ArrayList<>()));
        System.out.println(fun6(new int[]{1,20,3,4,4,4,5},4,0));
    }
    static boolean fun(int[] n,int t,int i) {
        if (i == n.length) return false;
        return n[i]==t || fun(n, t,i + 1);
    }
    static int fun2(int[] n,int t,int i) {
        if (i == n.length) return -1;
        if(n[i]==t){
            return i;
        }
       return fun2(n, t,i + 1);
    }
    static int fun3(int[] n,int t,int i) {
        if (i == n.length) return -1;
        if(n[i]==t){
            return i;
        }
        return fun3(n, t,i -1);
    }
   static ArrayList<Integer> ans=new ArrayList<>();
    static ArrayList fun4(int[] n,int t,int i) {
        if (i == n.length)  return ans;
        if(n[i]==t){
            ans.add(i);
        }
        return fun4(n, t,i +1);
    }
    static ArrayList fun5(int[] n,int t,int i,ArrayList<Integer> list) {
        if (i == n.length)  return list;
        if(n[i]==t){
            list.add(i);
        }
        return fun5(n, t,i +1,list);
    }
    static ArrayList fun6(int[] n,int t,int i) {
        ArrayList<Integer> ans=new ArrayList<>();
        if (i == n.length)  return ans;
        if(n[i]==t){
            ans.add(i);
        }
       ArrayList<Integer> m=fun6(n,t,i+1);
        ans.addAll(m);
        return ans;

    }
}
