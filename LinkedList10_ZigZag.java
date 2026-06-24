//You are given the head of a singly linked-list. The list can be represented as:

// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:

// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

import LinkedList1.Node;

public class LinkedList10_ZigZag {
  public static Node zig(Node head) {
    if(head==null || head.next==null){
      return head;
    }
    // just like palindrome....
    // find middle
    // reverse the 2nd half
    // new Node and keep pointing like in mergeSort function

    // middle and dividing
    Node slow=head;
    Node fast=head.next;

    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    Node curr=slow.next;
    slow.next=null;

    // reversing the 2nd half
    Node prev=null;
    Node next;
    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }

    // now new node
    Node x=new Node(100);
    Node y=x;

    while(head!=null && prev!=null){
      y.next=head;
      head=head.next;
      y=y.next;
      y.next=prev;
      prev=prev.next;
      y=y.next;
    }
    if(head != null){
      y.next = head;
    }
    if(prev!=null){
      y.next=prev;
    }
    return x.next;
  }




  // 
}