public class Queue_3LinkedList {
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {
    Node front, rear;

    // Enqueue operation
    public void enqueue(int data) {
      Node newNode = new Node(data);

      if (rear == null) {
        front = rear = newNode;
        return;
      }

      rear.next = newNode;
      rear = newNode;
    }

    // Dequeue operation
    public int dequeue() {
      if (front == null) {
        System.out.println("Queue Underflow");
        return -1;
      }

      int value = front.data;
      front = front.next;

      // in case of 1 node
      if (front == null) {
        rear = null;
      }

      return value;
    }

    // Peek operation
    public int peek() {
      if (front == null) {
        System.out.println("Queue is Empty");
        return -1;
      }
      return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
      return front == null;
    }

    // Display queue
    public void display() {
      if (front == null) {
        System.out.println("Queue is Empty");
        return;
      }

      Node temp = front;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public class Main {
    public static void main(String[] args) {
      Queue q = new Queue();

      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);

      System.out.println("Queue:");
      q.display();

      System.out.println("Dequeued Element: " + q.dequeue());

      System.out.println("Queue after Dequeue:");
      q.display();

      System.out.println("Front Element: " + q.peek());
    }
  }
}
