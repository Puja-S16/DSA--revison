// Queue using array
// remove TC : O(n) [better approach is of circular queue using array]
public class Queue_1Array {
  static class Queue {
    private int[] arr;
    private int size;
    private int rear;

    public Queue(int n) {
      this.arr = new int[n];
      this.size = n;
      this.rear = -1;
    }

    public boolean isEmpty() {
      return rear == -1;
    }

    public void add(int data) {
      // full queue cuz array implementation
      if (rear == size - 1) {
        System.out.println("queue full!");
        return;
      }
      rear++;
      arr[rear] = data;
    }

    public int remove() { // O(n)
      if (isEmpty()) {
        System.out.println("empty queue to delete");
        return -1;
      }
      int front = arr[0];
      for (int i = 0; i < rear; i++) {
        arr[i] = arr[i + 1];
      }
      arr[rear] = -1;
      rear--;
      return front;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("empty queue to delete");
        return -1;
      }
      return arr[0];
    }

  }

  public static void main(String[] args) {
    Queue q = new Queue(5);

    q.add(10);
    q.add(20);
    q.add(30);

    System.out.println("Front element: " + q.peek());//Front element: 10

    System.out.println("Removed: " + q.remove());//Removed: 10

    System.out.println("Front element after remove: " + q.peek());  //Front element after remove: 20

    q.add(40);
    q.add(50);

    System.out.println();

    while (!q.isEmpty()) {
      System.out.print(q.remove()+" "); //20 30 40 50
    }

    System.out.println();

    // Empty queue check
    System.out.println( q.remove()); //empty queue to delete   -1
  }
}