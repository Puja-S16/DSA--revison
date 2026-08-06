public class DoublyLL2 {

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

  // add front
  public void addF(int data) {
    // empty list
    if (head == null) {
      Node temp = new Node(data);
      head = tail = temp;
      size++;
      return;
    }
    Node temp = new Node(data);
    temp.next = head;
    head.prev = temp;
    head = temp;
    size++;
  }

  // add rear
  public void addR(int data) {
    // empty list
    if (head == null) {
      Node temp = new Node(data);
      head = tail = temp;
      size++;
      return;
    }
    Node temp = new Node(data);
    temp.prev = tail;
    tail.next = temp;
    tail = temp;
    size++;
  }

  // print
  public void p() {
    if (size == 0) {
      System.out.println("[null]");
      return;
    }
    Node curr = head;
    while (curr != null) {
      System.out.print("[" + curr.data + "]-->");
      curr = curr.next;
    }
    System.out.print("[null]");
    System.out.println();
    return;
  }
  // print- REVERSED
  public void pR() {
    if (size == 0) {
      System.out.println("[null]");
      return;
    }
    Node curr = tail;
    while (curr != null) {
      System.out.print("[" + curr.data + "]-->");
      curr = curr.prev;
    }
    System.out.print("[null]");
    System.out.println();
    return;
  }

  // del front
  public void delF() {
    if (head == null) {
      System.out.println("Empty list. Can't delete.");
      return;
    }
    if (size == 1) {
      System.out.println("deleting : [" + head.data + "]");
      head = tail = null;
      size--;
      return;
    }
    System.out.println("deleting : [" + head.data + "]");
    head = head.next;
    head.prev = null;
    size--;
  }

  // del rear
  public void delR() {
    if (size == 0) {
      System.out.println("Empty list. Can't delete.");
      return;
    }
    if (size == 1) {
      System.out.println("deleting : [" + tail.data + "]");
      head = tail = null;
      size--;
      return;
    }
    System.out.println("deleting : [" + tail.data + "]");
    tail = tail.prev;
    tail.next = null;
    size--;
  }

  public static void main(String[] args) {
    DoublyLL2 ll = new DoublyLL2();
    ll.addF(20);
    ll.p();
    ll.pR();
    ll.addF(10);
    ll.p();
    ll.pR();
    ll.addR(30);
    ll.p();
    ll.pR();
    ll.addR(40);
    ll.p();
    ll.pR();
    ll.delF();
    ll.p();
    ll.pR();
    ll.delR();
    ll.p();
    ll.pR();
  }
}