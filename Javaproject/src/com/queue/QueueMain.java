package com.queue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        dyanmicqueue ans=new dyanmicqueue(5);
        ans.insert(87);
ans.insert(64);
        ans.insert(8877);
        ans.insert(6465);
        ans.insert(83217);
        ans.insert(6564);
       ans.display();
       ans.display();
       ans.remove();
        System.out.println(ans.remove());  ;
       ans.display();
        System.out.println(ans.front());
    }
}
