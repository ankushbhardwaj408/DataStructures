package com.recursion;

public class NKnights {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
       int x= knight(board,0,0,n);
        System.out.println(x);
    }
    static int knight(boolean[][] board,int r,int c,int k)
    {

        if(k==0)
        {
            display(board);
            System.out.println();
            return 1;
        }
        if(r== board.length-1 && c==board.length)
        {
           return 0;
        }
int l=0;
        if(c== board.length)
        {
           l=l+ knight(board,r+1,0,k);
            return l;
        }
        if(safe(board, r, c)){
            board[r][c]=true;
         l=l+ knight(board,r,c+1,k-1);
            board[r][c]=false;

    }
     l=l+  knight(board,r,c+1,k);

return l;
    }
    static boolean safe(boolean[][] board,int r,int c) {

        if (isValid( board, r-1, c-2))
        {
            if(board[r-1][c-2])
            {
                return false;
            }
        }

        if (isValid( board, r-1, c+2))
        {
            if(board[r-1][c+2])
            {
                return false;
            }
        }
        if (isValid( board, r-2, c-1))
        {
            if(board[r-2][c-1])
            {
                return false;
            }
        }
        if (isValid( board, r-2, c+1))
        {
            if(board[r-2][c+1])
            {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board,int r,int c)
    {
        if(r>=0 && r<board.length && c>=0 && c<board.length){
            return true;
        }
        return false;
    }


    private static void display(boolean[][] board) {
        for(boolean[] x:board)
        {
            for(boolean num:x)
            {
                if(num)
                {
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }


            }
            System.out.println();
        }
    }

}
