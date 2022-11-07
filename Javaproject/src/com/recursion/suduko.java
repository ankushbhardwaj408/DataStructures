package com.recursion;

public class suduko {
    public static void main(String[] args) {
        int[][] ans = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (suko(ans)) {
            display(ans);
        } else {
            System.out.println("Cannot solve");
        }
    }
    static boolean suko(int[][] board)
    {
        int n= board.length;
        int r=-1;
        int c=-1;
        boolean x=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==0){
                    r=i;
                    c=j;
                    x=false;
                    break;
                }
            }

            if(x==false)
            {
                break;
            }
        }
        if(x==true)
        {
            return true;
        }



        for(int num=1;num<=9;num++)
        {
            if(afe(board,r, c, num))
            {
                board[r][c]=num;
                if(suko(board))
                {



                    return true;
                }else{
                   board[r][c]=0;
                }
            }
        }

        return false;
    }

    private static void display(int[][] board) {
        for(int[] x:board)
        {
            for(int num:x)
            {
                System.out.print(num+" ");


            }
            System.out.println();
        }
    }
    private static boolean  afe(int[][] board,int r,int c,int number) {
        for(int i=0;i<board.length;i++)
        {
            if(board[r][i]==number)
            {
                return false;
            }

        }

        for(int[] num:board)
        {
            if(num[c]==number)

            {
                return false;
            }
        }
        int x=(int)Math.sqrt(board.length);
int startr=r-r%x;
        int startc=c-c%x;
        for(int i=startr;i<startr+x;i++)
        {
            for(int j=startc;j<startc+x;j++)
            {
                if(board[i][j]==number)
                {
                    return false;
                }
            }
        }



        return true;

    }
}
