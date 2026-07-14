// queue using double ended queue
import java.util.Deque;
import java.util.LinkedList;

public class Deque_3Queue {
  static class Queue{
    private Deque<Integer> q=new LinkedList<>();

    // add
    public void add(int data){
      q.addLast(data);
      return;
    }
    // remove
    public int remove(){
      if(!isEmpty())
        return q.removeFirst();
      else return -1;
    }
    // peek
    public int peek(){
      if(!isEmpty())
        return q.getFirst();
      else return -1;
    }
    // isEmpty
    public boolean isEmpty(){
      return q.isEmpty();
    }

  }
}
