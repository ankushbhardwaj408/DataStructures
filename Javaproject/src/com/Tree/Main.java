package com.Tree;

import com.customll.DLL;

public class Main {
    public static void main(String[] args) {
        BinaryTree s=new BinaryTree();
        BinaryTree.Node node= s.create();
//        s.inorder(node);
//        System.out.println();
//        s.preorder(node);
//        System.out.println();
//        s.postorder(node);
//        System.out.println();
//        System.out.println(s.height(node));
//     int size=s.size(node);
//        System.out.println(s.maximum(node));
//        System.out.println(s.minimum(node));
//for(int i=1;i<=size;i++)
//{
//    s.levelordertraversal(node,i);
//}
//        System.out.println();
//s.levelordertraversallink(node);
//        System.out.println();
//        s.printleftview(node);
//        System.out.println();
//   s.printrightview(node);
        System.out.println(s.diameter(node));
        s.diameterwithheight(node);
        System.out.println(s.ans);
        DLL d=new DLL();

    }

}
