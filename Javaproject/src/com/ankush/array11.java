package com.ankush;

public class array11 {
    public static void main(String[] args) {
        int [][] x={
                {1,2,3,9},
            {2,2,8,7},
            {2,8,7,6}
        };

        for(int i=0;i<3;i++)
        {
            int sum=0;
            for(int j=0;j<4;j++)
            {
                sum+=x[i][j];


            }
            System.out.println("the sum "+(i+1)+"row is "+sum);
        }
    }
}
