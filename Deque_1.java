// double ended queue
import java.util.Deque;
import java.util.LinkedList;

public class Deque_1 {
  public static void main(String[] args) {
    Deque<Integer> dq=new LinkedList<>();
    dq.add(23);
    dq.addFirst(223);
    dq.addLast(888);
    dq.remove();
    dq.removeFirst();
    dq.removeLast();
    dq.getFirst();
    dq.getLast();

  }
}
