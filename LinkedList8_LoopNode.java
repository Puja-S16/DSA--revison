// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
public class LinkedList8_LoopNode {
  public static class Node {
    int data;
    Node next;

    // constructor
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public Node loopNode(Node head) {
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        slow=head;
        while(fast!=slow){
          slow=slow.next;
          fast=fast.next;
        }
        return slow;
      }
    }
    return null;
  }
}
