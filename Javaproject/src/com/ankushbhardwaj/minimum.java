package com.ankushbhardwaj;

public class minimum {
    public static void main(String[] args) {
        int x=minimumMoves(4,7);
        System.out.println(x);
    }
    static int minimumMoves(int a,int b)
    {
        int c=0;
        int m=a*b;
        int x=Math.min(a,b);
        while(x>0)

        {
        while(x*x<=m)
        {
            m=m-x*x;
            c++;
        }

        x--;
        }
        return c;
    }
}
