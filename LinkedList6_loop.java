//Floyd's cycle finnding algorithm
public class LinkedList6_loop {
  public static class Node {
    int data;
    Node next;

    // constructor
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public static boolean loop(Node head) {
    Node slow=head;    
    Node fast=head;    
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(fast==slow){
        return true;
      }
    }
    return false;
  }
}
