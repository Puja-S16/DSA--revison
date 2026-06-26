public class DoublyLL_reverse{
  public class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
      this.data=data;
      this.prev=null;
      this.next=null;
    }
  }
  public Node reverse(Node head){
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