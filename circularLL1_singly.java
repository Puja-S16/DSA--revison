// Circular-Singly LL
// O(n)
public class circularLL1_singly {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;
  private int size;

  public void addF(int data) {
    if (head == null) {
      Node newNode = new Node(data);
      head = newNode;
      head.next = head;
      size++;
      return;
    }
    Node newNode = new Node(data);
    Node curr = head;
    while (curr.next != head) {
      curr = curr.next;
    }
    curr.next = newNode;
    newNode.next = head;
    head = newNode;
    size++;
  }

  public void addR(int data) {
    if (head == null) {
      Node newNode = new Node(data);
      head = newNode;
      head.next = head;
      size++;
      return;
    }
    Node newNode = new Node(data);
    Node curr = head;
    while (curr.next != head) {
      curr = curr.next;
    }
    curr.next = newNode;
    newNode.next = head;
    size++;
  }

  public void delF() {
    if (head == null) {
      System.out.println("empty list");
      return;
    }
    if (size == 1) {
      System.out.println("deleting : " + head.data);

      head = null;
      size--;
      return;
    }
    System.out.println("deleting : " + head.data);
    Node curr = head;
    while (curr.next != head) {
      curr = curr.next;
    }
    curr.next = head.next;
    head = head.next;
    size--;
  }

  public void delR() {
    if (head == null) {
      System.out.println("empty list");
      return;
    }
    if (size == 1) {
      System.out.println("deleting : " + head.data);

      head = null;
      size--;
      return;
    }
    Node curr = head;
    while (curr.next.next != head) {
      curr = curr.next;
    }
    System.out.println("deleting :" + curr.next.data);
    curr.next = head;
    size--;
  }

  public void display(){
    if (head == null) {
      System.out.println("empty list");
      return;
    }
    Node curr=head;
    do{
      System.out.print(curr.data+"-->");
      curr=curr.next;
    }while(curr!=head);
    System.out.print("...");
  }

}
