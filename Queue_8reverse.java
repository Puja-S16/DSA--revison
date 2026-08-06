// reversing queue
  // Time Complexity
    // Moving Queue → Stack: O(n)
    // Moving Stack → Queue: O(n)
    // Overall: O(n)
  // Space Complexity : O(n)
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_8reverse {
  public static void reverse(Queue<Integer> q) {
    Stack<Integer> s=new Stack<>();
    while(!q.isEmpty()){
      s.push(q.remove());
    }
    while (!s.isEmpty()) {
      q.add(s.pop());
    }
  }
  public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
    reverse(q);
  }
}
