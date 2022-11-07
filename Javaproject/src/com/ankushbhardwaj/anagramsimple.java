package com.ankushbhardwaj;

import java.util.Scanner;

public class anagramsimple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        boolean ana=false;
        boolean[] visited=new boolean[b.length()];
        if (a.length() == b.length())
        {


        for (int i = 0; i < a.length(); i++)
        {
ana =false;
            for (int j = 0; j < b.length(); j++)
            {
                if (a.charAt(i) == b.charAt(j) && !visited[j])
                {
                    ana = true;
                    visited[j]=true;
                }

            }
            if(!ana)
                break;
        }
    }
        if(ana) {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
