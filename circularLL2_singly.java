// Circular-Singly LL
// using another var : tail
public class circularLL2_singly {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public void addF(int data) {
    if (head == null) {
      Node newNode = new Node(data);
      head =tail= newNode;
      tail.next = head;
      size++;
      return;
    }
    Node newNode = new Node(data);
    newNode.next=head;
    head=newNode;
    tail.next=newNode;
    size++;
  }

  public void addR(int data) {
    if (head == null) {
      Node newNode = new Node(data);
      head =tail= newNode;
      tail.next = head;
      size++;
      return;
    }
    Node newNode = new Node(data);
    newNode.next=head;
    tail.next=newNode;
    tail=newNode;
    size++;
  }

  public void delF() {
    if (head == null) {
      System.out.println("empty list");
      return;
    }
    if (size == 1) {
      System.out.println("deleting : " + head.data);

      head=tail = null;
      size--;
      return;
    }
    System.out.println("deleting : " + head.data);
    head = head.next;
    tail.next=head;
    size--;
  }

  public void delR() {
    if (head == null) {
      System.out.println("empty list");
      return;
    }
    if (size == 1) {
      System.out.println("deleting : " + head.data);
      head =tail= null;
      size--;
      return;
    }
    System.out.println("deleting :" + tail.data);
    Node curr = head;
    while (curr.next != tail) {
      curr = curr.next;
    }
    curr.next=head;
    tail=curr;
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
    System.out.print(head.data+"...");
  }
}
