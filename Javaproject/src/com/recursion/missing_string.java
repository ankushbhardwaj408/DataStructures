package com.recursion;

public class missing_string {
    public static void main(String[] args) {
//String ans=skipastring("","baeecahad");
        String ans=skip_not_string("","baeeapplcahad");
        System.out.println(ans);

    }
    static String skipastring(String p,String up)
    {
        if(up.isEmpty())
        {
            return p;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
           return skipastring(p,up.substring(1));
        }else
        {
            return skipastring(p+ch,up.substring(1));
        }
    }
    static String skip_a_string(String p,String up)
    {
        if(up.isEmpty())
        {
            return p;
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple"))
        {
            return skip_a_string(p,up.substring(5));
        }else
        {
            return skip_a_string(p+ch,up.substring(1));
        }
    }
    static String skip_not_string(String p,String up)
    {
        if(up.isEmpty())
        {
            return p;
        }
        char ch=up.charAt(0);
        if(!up.startsWith("apple") && up.startsWith("app"))
        {
            return skip_not_string(p,up.substring(3));
        }else
        {
            return skip_not_string(p+ch,up.substring(1));
        }
    }
}
