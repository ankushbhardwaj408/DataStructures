package com.queue;

public class customQueue {
    private int[] data;
    private static final int Deafut_Size=10;
    private int end=0;

    public customQueue(){
        this.data=new int[Deafut_Size];
    }
    public customQueue(int size) {
        this.data = new int[size];
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            System.out.println("stack is full");
            return false;
        }
        data[end++]=item;
        return true;

    }
    public int delete() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Stack is empty");

        }
        int removed=data[0];
        for(int i=1;i<end;i++)
        {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public void display()
    {
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }
    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");

        }
        return data[0];
    }
    public boolean isEmpty()
    {
        return (end==0);
    }
    public boolean isFull()
    {
        return (end==data.length);
    }
}
