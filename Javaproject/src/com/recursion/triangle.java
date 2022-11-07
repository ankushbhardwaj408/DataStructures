package com.recursion;

public class triangle {
    public static void main(String[] args) {
        fun2(3,0) ;

    }
    static void fun(int r,int c){
      if(r==0) return;
      if(c<r)
      {
          System.out.print("+");
          fun(r,c+1);
      }else{
          System.out.println();
          fun(r-1,0);
      }



    }
    static void fun2(int r,int c){
        if(r==0) return;
        if(c<r)
        {

            fun2(r,c+1);
            System.out.print("+");
        }else{

            fun2(r-1,0);
            System.out.println();
        }



    }
}
