package com.ankushbhardwaj;

import java.util.Scanner;

public class anagramusingarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
boolean ana=true;
        int[] al=new int[256];

        for(char x:a.toCharArray())
        {
           int index=(int) x;
           al[index]++;
        }
        for(char x:b.toCharArray())
        {
            int index=(int) x;
            al[index]--;
        }
        for(int i=0;i<256;i++)
        {

            if (al[i]!=0)
            {
               ana=false;
                break;
            }

        }

if(ana)
{
    System.out.println("anagram");

}
else
{
    System.out.println("not anagram");
}
    }
}
