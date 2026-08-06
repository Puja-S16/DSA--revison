// Queue using 2 stacks
import java.util.Stack;
public class Queue_4twoStack {
  static class Queue{
    private Stack<Integer> s1=new Stack<>();
    private Stack<Integer> s2=new Stack<>();

    // two ways :
      // 1. add->O(n), remove and peek-->O(1)
      // 1. add->O(1), remove and peek-->O(n)

    // method 1

    // isEmpty
    public boolean isEmpty(){
      return s1.isEmpty();
    }

    // add
    public void enqueue(int data){
      if(s1.isEmpty()){
        s1.push(data);
        return;
      }
      // s1 se transfer to s2, then add data and then from s2 to s1.
      while(!s1.isEmpty()){
        s2.push(s1.pop());
      }
      s1.push(data);
      while(!s2.isEmpty()){
        s1.push(s2.pop());
      }
    }

    // remove
    public int dequeue(){
      if(s1.isEmpty()){
        return -1;
      }
      return s1.pop();
    }

    // peek
    public int peek(){
      if(s1.isEmpty()){
        return -1;
      }
      return s1.peek();
    }

  }
}
