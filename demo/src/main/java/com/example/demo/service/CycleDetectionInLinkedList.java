package com.example.demo.service;



public class CycleDetectionInLinkedList {
    public static void main(String[] args) {
       ListNode listNode= new ListNode(1);
         listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(4);
        listNode.next.next.next=listNode.next;
        System.out.println(isCycleInLinkedList(listNode));
        System.out.println(getStatingPonintOfCycleInLinkedList(listNode).value);
    }

    private static ListNode getStatingPonintOfCycleInLinkedList(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        if(head==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast){
                 ListNode ptr1=head;
                 ListNode ptr2=slow;
                 while(ptr2!=ptr1){
                     ptr1=ptr1.next;
                     ptr2=ptr2.next;
                 }
                 return ptr1;
            }
        }

      return null;
    }

    private static boolean isCycleInLinkedList(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        if(head==null){
            return false;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
class ListNode{
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
