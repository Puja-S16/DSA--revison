// Circular-Doubly LL
public class circularLL3_doubly {
  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  private Node head;
  private Node tail;
  private int size;
}
