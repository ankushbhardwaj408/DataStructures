package com.stack;

public class customStack {
   protected int[] data;
    private static final int Deafut_Size=3;
    private int ptr=-1;
    public customStack() {
        this.data=new int[Deafut_Size];
    }
    public customStack(int size) {
        this.data=new int[size];
    }
    public boolean push(int item) throws Exception
    {
      if(isFull()){
          throw new Exception("stack is full");
      }

ptr++;
      data[ptr]=item;
      return true;

    }
public int pop() throws Exception
{
    if(isEmpty())
    {
        throw new Exception("stack is empty");
    }
    return data[ptr--];
}

public int peek() throws Exception
{
    if(isEmpty())
    {
        throw new Exception("stack is empty");
    }
    return data[ptr];
}
    public boolean isEmpty()
    {
        return (ptr==-1);
    }
    public boolean isFull()
    {
        return (ptr==data.length-1);
    }
}
