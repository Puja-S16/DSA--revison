  // palindrome

public class LinkedList5 {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  // palindrome
  public static boolean palindrome(){
    if(head==null||head.next==null){
      return true;
    }
    // two pointer : slow and fast.... 2x--> fast
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast =fast.next.next;
    }

    // reverse the latter half
    Node prev=null;
    Node curr=slow;
    Node next;

    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }

    Node left=head;
    Node right=prev;

    while(right!=null){
      if(left.data!=right.data){
        return false;
      }
      left=left.next;
      right=right.next;
    }
    return true;
  }
}
