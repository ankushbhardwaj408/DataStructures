package com.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    public static void main(String[] args) {
        int[][] a  = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(a));
    }

        public static List<Integer> luckyNumbers (int[][] matrix) {
            int min=0;
            int max=999999;
            int r=matrix.length;
            int c=matrix[0].length;
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    min=Math.min(min,matrix[i][j]);
                }
                for(int b=0;b<c;b++)
                {
                    if(matrix[i][b]==min)
                    {
                        int a=0;
                        while(a<r)
                        {
                            max=Math.max(max,matrix[a][b]);
                            a++;
                        }
                        break;
                    }

                }

                if(max==min)
                {
                    ans.add(min);
                }

            }
            return ans;
        }
    }


