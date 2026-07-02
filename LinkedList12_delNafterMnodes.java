// Question 2
// Delete N Nodes After M Nodes of a Linked List

// We have a linked list and two integers M and N.

// Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list.
// Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8
// Sample Output 1 : 1->2->5->6

// Sample Input 2 : M=3 N=2 LL: 1->2->3->4->5->6->7->8->9->10
// Sample Output 2 : 1->2->3->6->7->8

public class LinkedList12_delNafterMnodes {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void delete(Node temp) {
    if (temp.next == null || temp.next.next == null) {
      temp.next = null;
    } else {
      temp.next = temp.next.next;
    }
  }

  public static Node del(int m, int n, Node head) {
    if(head==null) return null;
    if(m==0) return null;
    if(n==0) return head;
    Node curr=head;
    while(curr!=null){
      for(int i=1;i<m && curr!=null;i++){
        curr=curr.next;
      }
      if(curr==null) break;
      Node temp=curr.next;
      for(int i=0;i<n && temp!=null;i++){
        temp=temp.next;
      }
      curr.next=temp;
      curr=curr.next;
    }
    return head;
  }
}