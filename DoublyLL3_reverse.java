// algorithm runs in O(n) time and uses O(1) extra space
public class DoublyLL3_reverse{
  public static class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
      this.data=data;
      this.prev=null;
      this.next=null;
    }
  }
  public static Node reverse(Node head){
    Node curr=head;
    Node prev=null;
    Node next;
    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      curr.prev=next;
      prev=curr;
      curr=next;
    }
    return prev;
  }
}