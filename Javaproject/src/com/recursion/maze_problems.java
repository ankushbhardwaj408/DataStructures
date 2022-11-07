package com.recursion;

import java.util.Arrays;

public class maze_problems {
    public static void main(String[] args) {
       // System.out.println(count(3,3));
      //  pd("",3,3);
//        boolean[][] ans={
//                {true,true,true},
//                {true,false,true},
//                {true,true,true},
//        };
//        obs(ans,"",0,0);

        boolean[][] ans={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[] [] a=new int[ans.length][ans[0].length];
        prmx(ans,a,"",0,0,1);
    }
    static int count(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static void pp(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1) {
            pp(p+'D',r - 1, c);
        }
        if(c>1) {
            pp(p+'R',r, c - 1);
        }

    }
    static void pd(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1 && c>1)
        {
            pd(p+'D',r-1,c-1);
        }
        if(r>1) {
            pd(p+'V',r - 1, c);
        }
        if(c>1) {
            pd(p+'H',r, c - 1);
        }

    }
    static void obs(boolean[][] ans,String p,int r,int c)
    {
        if(r==ans.length-1 && c==ans[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!ans[r][c])
        {
            return;
        }

        if(r< ans.length-1) {
            obs(ans,p+'D',r + 1, c);
        }
        if(c< ans[0].length-1) {
            obs(ans,p+'R',r, c + 1);
        }

    }
    static void oll(boolean[][] ans,String p,int r,int c)
    {
        if(r==ans.length-1 && c==ans[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!ans[r][c])
        {
            return;
        }
ans[r][c]=false;
        if(r< ans.length-1) {
            oll(ans,p+'D',r + 1, c);
        }
        if(c< ans[0].length-1) {
            oll(ans,p+'R',r, c + 1);
        }
        if(r>0) {
            oll(ans,p+'U',r -1, c);
        }
        if(c>0) {
            oll(ans,p+'L',r, c - 1);
        }
        ans[r][c]=true;
    }
    static void prmx(boolean[][] ans,int[][] max,String p,int r,int c,int step)
    {

        if(r==ans.length-1 && c==ans[0].length-1)
        {
            max[r][c]=step;
            for(int[] q:max)
            {
                System.out.println(Arrays.toString(q));
            }

            System.out.println(p);
            return;
        }
        if(!ans[r][c])
        {
            return;
        }
        max[r][c]=step;
        ans[r][c]=false;
        if(r< ans.length-1) {
            prmx(ans,max,p+'D',r + 1, c,step+1);
        }
        if(c< ans[0].length-1) {
            prmx(ans,max,p+'R',r, c + 1,step+1);
        }
        if(r>0) {
            prmx(ans,max,p+'U',r -1, c,step+1);
        }
        if(c>0) {
            prmx(ans,max,p+'L',r, c - 1,step+1);
        }
        max[r][c]=0;
        ans[r][c]=true;
    }
}
