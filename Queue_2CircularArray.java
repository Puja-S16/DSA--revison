// circular queue
// remove TC O(1)
// rear increment : rear=(rear+1)%size;
public class Queue_2CircularArray {
  static class Queue {
    private int[] arr;
    private int size;
    private int rear;
    private int front;

    public Queue(int n) {
      this.arr = new int[n];
      this.size = n;
      this.rear = -1;
      this.front = -1;

    }

    public boolean isEmpty() {
      return front == -1; // CONDITIONNNN
    }

    public void add(int data) {
      // full queue cuz array implementation
      if ((rear + 1) % size == front) { // FORMULAAAAA
        System.out.println("queue full!");
        return;
      }
      // IMPORTANT
      if (front == -1) {
        front++;
      }
      rear = (rear + 1) % size;
      arr[rear] = data;
    }

    public int remove() { // O(1)
      if (isEmpty()) {
        System.out.println("empty queue to delete");
        return -1;
      }
      int delData = arr[front];
      arr[front]=-1;
      // if single elem:
      if (front == rear) {
        front = rear = -1;
      } else
        front = (front + 1) % size;
      return delData;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("empty queue to delete");
        return -1;
      }
      return arr[front];
    }

  }

  public static void main(String[] args) {
    Queue q = new Queue(5);

    q.add(10);
    q.add(20);
    q.add(30);

    System.out.println("Front element: " + q.peek());// Front element: 10

    System.out.println("Removed: " + q.remove());// Removed: 10

    System.out.println("Front element after remove: " + q.peek()); // Front element after remove: 20

    q.add(40);
    q.add(50);

    System.out.println();

    while (!q.isEmpty()) {
      System.out.print(q.remove() + " "); // 20 30 40 50
    }
    System.out.println();
    // Empty queue check
    System.out.println(q.remove()); // empty queue to delete -1
  }
}
