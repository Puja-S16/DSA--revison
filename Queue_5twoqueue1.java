// stack using 2 queue
import java.util.Queue;
import java.util.LinkedList;

public class Queue_5twoqueue1 {
  static class Stack{
    private Queue<Integer> q1=new LinkedList<>();
    private Queue<Integer> q2=new LinkedList<>();

    // two ways :
      // 1. push->O(n), pop and peek-->O(1)
      // 2. push->O(1), pop and peek-->O(n)

    // method 1

    // isEmpty
    public boolean isEmpty(){
      return q1.isEmpty() && q2.isEmpty();
    }

    // add
    public void push(int data){
      // dono mein se jo bhi queue mein elem ho-->transfer to other, add elem then pull back elems
      // agar dono khali h toh kahi bhi daalo
      if(!q1.isEmpty()){
        while (!q1.isEmpty()) {
          q2.add(q1.remove());
        }
        q1.add(data);
        while(!q2.isEmpty()){
          q1.add(q2.remove());
        }
      }else{
        while (!q2.isEmpty()) {
          q1.add(q2.remove());
        }
        q2.add(data);
        while(!q1.isEmpty()){
          q2.add(q1.remove());
        }
      }
    }

    // remove
    public int pop(){
      if(isEmpty()){
        return -1;
      }
      // jismein bhi elem hai...remove the 1st elem.
      int top=-1;
      if(!q1.isEmpty()){
        top=q1.remove();
      }else{
        top=q2.remove();
      }
      return top;
    }

    // peek
    public int peek(){
      if(isEmpty()){
        return -1;
      }
      // jismein bhi elem hai...return the 1st elem.
      int top=-1;
      if(!q1.isEmpty()){
        top=q1.peek();
      }else{
        top=q2.peek();
      }
      return top;
    }
  }
}
