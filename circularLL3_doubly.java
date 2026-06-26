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

  public void addF(int data) {
    if (head == null) {
      Node newNode = new Node(data);
      head =tail= newNode;
      head.next = head;
      head.prev = head;
      size++;
      return;
    }
    Node newNode = new Node(data);
    newNode.next=head;
    newNode.prev=tail;
    head.prev=newNode;
    tail.next=newNode;
    head=newNode;
    size++;
  }

  public void addR(int data) {
    if (head == null) {
      Node newNode = new Node(data);
      head =tail= newNode;
      head.next = head;
      head.prev = head;
      size++;
      return;
    }
    Node newNode = new Node(data);
    newNode.next=head;
    newNode.prev=tail;
    head.prev=newNode;
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
      head= tail = null;
      size--;
      return;
    }
    System.out.println("deleting : " + head.data);
    head = head.next;
    head.prev=tail;
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
    tail=tail.prev;
    tail.next=head;
    head.prev=tail;
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
