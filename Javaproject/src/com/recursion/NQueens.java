package com.recursion;

public class NQueens {
    public static void main(String[] args) {
int n=3;
boolean[][] board=new boolean[n][n];
int x=queens(board,0);
        System.out.println(x);
    }
    static int queens(boolean[][] board,int r)
    {
        if(r==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int c=0;c< board.length;c++)
        {
           if(isSafe(board,r,c))
           {
               board[r][c]=true;
               count=count+queens(board,r+1);
               board[r][c]=false;

           }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board,int r,int c) {
        for(int i=0;i<r;i++)
        {
            if(board[i][c])
            {
                return false;
            }
        }
        int left=Math.min(r,c);
        for(int i=1;i<=left;i++)
        {
            if(board[r-i][c-i])
            {
                return false;

            }
        }
        int right=Math.min(r,c-board.length-1);
        for(int i=1;i<=right;i++)
        {
            if(board[r-i][c-i])
            {
                return false;

            }
        }
return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] x:board)
        {
            for(boolean num:x)
            {
                if(num)
                {
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }


            }
            System.out.println();
        }
    }
}
