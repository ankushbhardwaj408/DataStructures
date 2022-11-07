package com.customll;

public class DLL {
    private Node head;



    public void insertFirst(int data)
    {
        Node node=new Node(data);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int data)
    {
        Node temp=head;
        Node node=new Node(data);
       if(head==null){
           head=node;
           node.next=null;
           node.prev=null;
           return;
       }
       while(temp.next!=null)
       {
           temp=temp.next;

       }
       node.next=null;
       node.prev=temp;
       temp.next=node;
    }
    public void after(int after,int data)
    {
        Node temp=find(after);
        Node node=new Node(data);
        if(temp==null)
        {
            System.out.println("not found");
            return;
        }
        if (temp.next == null)
        {
            temp.next=node;
            node.prev=temp;
            node.next=null;
            return;
        }
node.prev=temp;
        node.next=temp.next;
        temp.next=node;
        node.next.prev=node;
    }


    private Node find(int data)
    {
        Node node=head;
        while(node!=null){
            if(node.data==data)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }
public void display(){
        Node node =head;
        Node tail=head;
        while(node!=null)
        {

            System.out.print(node.data+"->");
            tail=node;
            node=node.next;



        }
    System.out.println("END");

//        while(tail!=null)
//        {
//            System.out.print(tail.data+"->");
//            tail=tail.prev;
//
//        }
//    System.out.println("START");
}


    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
