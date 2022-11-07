package com.customll;

public class CLL {
    private Node head;
    private Node tail;
    public CLL()
    {
        this.head=null;
        this.tail=null;
    }
    public void insert(int data)
    {
        Node node =new Node(data);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        tail.next=node;
        head=node;
    }

    public void delete(int data)
    {
        Node node=head;
        if(node.data==data)
        {
            tail.next=head.next;
            head=head.next;
            return;
        }

        do{
            Node n=node.next;
            if(n.data==data)
            {

                node.next=n.next;
//
               break;
            }
           node=node.next;
        }while(node!=head);

    }
public void display(){
        Node node=head;
        if(head==null)
        {
            System.out.println("not found");
            return;
        }
   do
     {
         System.out.print(node.data+"->");
         node=node.next;
     }  while(node!=head);
    System.out.println();
}

    private class Node{

        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
        public Node(int data, Node next)
        {
            this.data=data;
            this.next=next;
        }

    }
}
