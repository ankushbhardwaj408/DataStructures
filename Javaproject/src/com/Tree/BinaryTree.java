package com.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Scanner s =new Scanner(System.in);
    public static void main(String[] args) {
        BinaryTree s=new BinaryTree();
       Node node= s.create();
    s.inorder(node);
        System.out.println();
        s.preorder(node);
        System.out.println();
        s.postorder(node);
    }
    public Node create()
    {
        Node root=null;
        System.out.print("Enter data:");
        int data=s.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter left for"+data);
        root.left=create();
        System.out.println("Enter right for"+data);
        root.right=create();
        return root;
    }
    public int height(Node root)
    {
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;

    }
    public int size(Node root)
    {
        if(root==null) return 0;
        return size(root.left)+size(root.right)+1;

    }
    // level order traversal o(n^2)
    public void levelordertraversal(Node root,int level)
    {
        if(root==null) return;
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        if(level>1)
        {
            levelordertraversal(root.left,level-1);
            levelordertraversal(root.right,level-1);
        }
    }
//level order traversal o(n)
    public void levelordertraversallink(Node root)
    {

        Queue<Node> ans=new LinkedList<>();
        ans.add(root);
        ans.add(null);
        while (!ans.isEmpty())
        {
            Node node =ans.poll();
            if(node==null)
            {
                System.out.println();
                if(ans.isEmpty()) return;
                ans.add(null);
                continue;
            }
            System.out.print(node.data+" ");
            if(node.left!=null)
            {
                ans.add(node.left);
            }
            if(node.right!=null)
            {
                ans.add(node.right);
            }
        }
    }
    public void leftview(Node root, int[] list,int level)
    {
        if(root==null) return;;
        if(list[level]==0)
        {
            list[level]= root.data;
        }
        leftview(root.left,list,level+1);
        leftview(root.right,list,level+1);
    }
    public void printleftview(Node root)
    {
        int size=height(root);
        int[] arr=new int[size];


        leftview(root,arr,0);
       for(int x:arr)
       {
           System.out.print(x+" ");
       }
    }
    public void rightview(Node root, int[] list,int level)
    {
        if(root==null) return;;

            list[level]= root.data;



        rightview(root.left,list,level+1);
        rightview(root.right,list,level+1);
    }
    public void printrightview(Node root)
    {
        int size=height(root);
        int[] arr=new int[size];

        rightview(root,arr,0);
        for(int c:arr)
        {
            System.out.print(c+" ");
        }
    }
    public int maximum(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
    }
    public int minimum(Node root)
    {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right)));
    }
    public int diameter(Node root)
    {
        if(root==null) return 0;
        int left=diameter(root.left);
        int right=diameter(root.right);
        int node=1+height(root.left)+height(root.right);
        return Math.max(node,Math.max(left,right));
    }
    int ans=0;
    public int diameterwithheight(Node root)
    {
        if(root==null) return 0;
        int left=diameterwithheight(root.left);
        int right=diameterwithheight(root.right);
        ans=Math.max(ans,1+height(root.left)+height(root.right));
        return 1+Math.max(left,right);


    }

    public void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);

        preorder(root.right);
    }
    public void postorder(Node root)
    {
        if(root==null) return;
        postorder(root.left);

        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public  class Node{
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data=data;
        }
    }
}
