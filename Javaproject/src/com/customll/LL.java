package com.customll;

public class LL {
    private Node head;
    private Node tail;
private int size;
public LL(){
    this.size=0;
}
public int getSize(){
    return this.size;
}

public void insertRec(int index,int data)
{
head=rec(index,data,head);
}
private Node rec(int index,int data,Node node)
{
    if(index==0)
    {
        Node temp=new Node(data,node);
        size++;

        return temp;
    }
    node.next=rec(index-1,data,node.next);
    return node;
}
    public void insertFirst(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }

        size+=1;
    }
    public void insert(int data,int index)
    {
        if(index==0)
        {
            insertFirst(data);
            return;
        }
        if(index==size)
        {
            insertLast(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(data,temp.next);
        temp.next=node;

    }
    public void insertLast(int data)
    {
        if(tail==null)
        {
        insertFirst(data);
        return;
        }
        Node node=new Node(data);
        tail.next=node;
        tail=node;

        size+=1;
    }
    public int deletefirst(){
    int val=head.data;
    head=head.next;
    if(head==null)
    {
        tail=null;
    }
    size--;
    return val;
    }


    public int deletelast(){
        int val = tail.data;
    if(tail==head)
    {
      return  deletefirst();

    }
        Node node=get(size-2);
        tail=node;
        tail.next=null;
        size--;
    return val;
    }

    public int delete(int index)
    {
        if(index==0)
        {
            return deletefirst();
        }
            if(index==size-1){
                return deletefirst();
            }

            Node node=get(index-1);
            int val=node.next.data;
            node.next=node.next.next;
            size--;
return val;
    }

    public Node find(int data)
    {

        Node node=head;
        while(node.next!=null)
        {
           if(node.data==data)
               return node;
        }
        return null;
    }

    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }



public void display(){
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("END");
}
public void bubblesort()
{
    sortb(size-1,0);
//    System.out.println(get(2).data);
}


    private void sortb(int row, int col) {
        if (row == 0) return;
        if (col<row) {

            Node first=get(col);
            Node second=get(col+1);
            if(first.data>second.data)
            {
                if(first==head)
                {
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }else if(second==tail)
                {
                    Node prev=get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;

                }else{
                    Node prev=get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }

            }
            sortb(row,col+1);


        } else{
            sortb(row-1, 0);
        }
    }


    public void revrserec()
    {
        rev(head);
    }
private void rev(Node node)
{
    if(node==tail)
    {
        head=tail;
        return;
    }
    rev(node.next);
    tail.next=node;
    tail=node;
    node.next=null;

}
public Node reverse(Node head)
{
    if(head==null) return head;
    Node prev=null;
    Node current=head;
    Node next=head.next;
    while(current!=null)
    {
        current.next=prev;
        prev=current;
        current=next;
        if(next!=null){
            next=next.next;
        }

    }
    return prev;
}

//reorder list
public void reorderList(Node head) {
if(head==null || head.next==null) return;
Node firsthead=head;
Node mid=middle(head);
Node secondhead=reverse(mid);
while(firsthead!=null && secondhead!=null)
{
    Node temp=firsthead.next;
    firsthead.next=secondhead;
    firsthead=temp;
    temp=secondhead.next;
    secondhead.next=firsthead;
    secondhead=temp;
}
if(firsthead!=null)
{
    firsthead.next=null;
}

}

public Node middle(Node head)
{
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

    private class Node {

    private int data;
     private Node next;

     public Node(int data){
         this.data=data;
     }
     public Node(int data,Node next)
     {
         this.data=data;
         this.next=next;
     }

    }

}
