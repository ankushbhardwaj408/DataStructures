package com.customll;

public class mergersort {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=middleNode(head);

        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return mergeTwoLists(left,right);

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node=new ListNode();
        ListNode tail=node;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }

        }

        tail.next=(list1!=null)?list1:list2;
        return node.next;

    }
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode midprev=null;
        while(temp!=null && temp.next!=null)
        {
            midprev=(midprev==null)?temp:midprev.next;
            temp=temp.next.next;

        }
        ListNode mid=midprev.next;
        midprev.next=null;
        return mid;

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}