package com.hackerearth;

import java.util.Scanner;

public class nondecreasingarray {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
       int r=0;
        int N,g=0;



        for (int i = 0; i < T; i++) {
            N = s.nextInt();
            int sum = 0;
            boolean[] vis=new boolean[N];


            int K = s.nextInt();
          int[]  a = new int[N];

            for (int j = 0; j < N; j++) {
                a[j] = s.nextInt();
            }

            for (int u = 0; u < K; u++) {
r=0; int max = 0;
                for (int d = 0; d < N; d++) {

                    if (a[d] > a[max] && !vis[d]) {
                        max = d;
                        g=d;


                    }


                }
                for(int o=0;o<N;o++)
                {
                    if (a[o] == a[max]) {
                        r++;

                    }

                }

                vis[g]=true;

                sum = sum + (a[max] * r);

            }
            System.out.println(sum);
        }



    }

}






