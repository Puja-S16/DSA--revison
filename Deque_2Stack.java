// stack using Deque
import java.util.Deque;
import java.util.LinkedList;

public class Deque_2Stack {
  static class Stack{
    private Deque<Integer> s=new LinkedList<>();

    // push
    public void push(int data){
      s.addLast(data);
      return;
    }
    // pop
    public int pop(){
      if(!isEmpty())
        return s.removeLast();
      else return -1;
    }
    // peek
    public int peek(){
      if(!isEmpty())
        return s.getLast();
      else return -1;
    }
    // isEmpty
    public boolean isEmpty(){
      return s.isEmpty();
    }

  }
}
