
// removing loop/CYCLE
public class LinkedList7_removeLoop {
  public static class Node {
    int data;
    Node next;

    // constructor
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public void removecycle(Node head) {
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        slow=head;
        while(fast!=slow ){
          slow=slow.next;
          fast=fast.next;
        }
        while(fast.next!=slow){
          fast=fast.next;
        }
        fast.next=null;
        System.out.println("cycle removed");
        return;
      }
    }
    return;
  }
}
