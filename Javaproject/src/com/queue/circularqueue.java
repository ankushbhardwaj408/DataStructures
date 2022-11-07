package com.queue;

public class circularqueue {
    protected int[] data;
    private static final int Deafut_Size=10;
    protected int front=0;
    protected int end=0;
    protected int size=0;

    public circularqueue (){
        this.data=new int[Deafut_Size];
    }
    public circularqueue (int size) {
        this.data = new int[size];
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        end%=data.length;
        size++;
        return true;
    }
public int remove() throws  Exception{
        if(isEmpty()) {
            throw new Exception("stack is empty");
        }
        int removed=data[front++];
        front%=data.length;
        size--;
        return removed;


}
public void display(){
        if(size==0) return;
        int i=front;
        do{
            System.out.print(data[i++]+"<-");
            i%= data.length;

        }while (i!=end);
    System.out.println("END");



}
    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");

        }
        return data[front];
    }

    public boolean isEmpty()
    {
        return (size==0);
    }
    public boolean isFull()
    {
        return (size==data.length);
    }

}
