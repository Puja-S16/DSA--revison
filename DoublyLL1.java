public class DoublyLL1 {
  public static class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public static Node head = null;
  public static Node tail = null;
  public int size = 0;

  // note

  // OOPs wali baat short mein:

  // * `static head` aur `static tail` ka matlab: sabhi objects ek hi list share
  // karenge.

  // * Agar `static` hata do:

  // * har `DoublyLL1` object ki apni alag linked list hogi.

  // * `private` lagane se:

  // * variables ko class ke bahar directly change nahi kar sakte.
  // * data safer rehta hai.

  // * `static class Node`:

  // * Node ko outer class ke object ki zaroorat nahi hoti.
  // * Ye sirf ek helper class hai.

  // * OOPs mein generally:

  // * `head`, `tail`, `size` → private instance variables
  // * `Node` → static nested class rakhte hain.

  public static void main(String[] args) {
    // DoublyLL1 ll = new DoublyLL1();
  }
}