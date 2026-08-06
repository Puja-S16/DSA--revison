// reverse a linked list

public class LinkedList3 {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  // reverse a linked list
  public static Node reverse(){
    if(head==null||head.next==null){
      return head;
    }
    Node prev=null;
    Node curr=head;
    Node next=null;
    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
    return head;
  }
}
