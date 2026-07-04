public class Stack_2LinkedList {
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  static class Stack {
    private Node head;

    public boolean isEmpty() {
      return head == null;
    }

    public void push(int data) {
      Node newNode =new Node(data);
      if(head==null){
        head=newNode;
        return;
      }
      newNode.next=head;
      head=newNode;
    }

    public int pop() {
      if (head == null) {
        System.out.println("empty stack");
        return -1;
      }
      int n = head.data;
      head=head.next;
      return n;
    }

    public int peek() {
      if (head == null) {
        System.out.println("empty stack");
        return -1;
      }
      return head.data;
    }

  }

  public static void main(String[] args) {
    Stack s1 = new Stack();
    System.out.println(s1.isEmpty());// true
    s1.push(80);
    System.out.println(s1.peek());// 80
    System.out.println(s1.isEmpty());// false
    System.out.println(s1.pop());// 80
  }

}