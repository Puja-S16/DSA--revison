// stack using 2 queue
import java.util.Queue;
import java.util.LinkedList;

public class Queue_7twoqueue2 {
  static class Stack{
    private Queue<Integer> q1=new LinkedList<>();
    private Queue<Integer> q2=new LinkedList<>();

    // two ways :
      // 1. push->O(n), pop and peek-->O(1)
      // 2. push->O(1), pop and peek-->O(n)

    // method 2

    // isEmpty
    public boolean isEmpty(){
      return q1.isEmpty() && q2.isEmpty();
    }

    // add
    public void push(int data){
      // dono mein se jo bhi queue mein elem ho waha daal do.
      // agar dono khali h toh kahi bhi daalo
      if(!q1.isEmpty()){
        q1.add(data);
      }else{
        q2.add(data);
      }
    }

    // remove
    public int pop(){
      if(isEmpty()){
        return -1;
      }
      // jismein bhi elem hai...transfer to another, except last one. no need to tranfer back.
      int top=-1;
      if(!q1.isEmpty()){
        while(!q1.isEmpty()){
          top=q1.remove();
          if(q1.isEmpty()) break;
          q2.add(top);
        }
      }else{
        while(!q2.isEmpty()){
          top=q2.remove();
          if(q2.isEmpty()) break;
          q1.add(top);
        }
      }
      return top;
    }

    // peek
    public int peek(){
      if(isEmpty()){
        return -1;
      }
      // jismein bhi elem hai...transfer to another. no need to tranfer back.
      int top=-1;
      if(!q1.isEmpty()){
        while(!q1.isEmpty()){
          top=q1.remove();
          q2.add(top);
        }
      }else{
        while(!q2.isEmpty()){
          top=q2.remove();
          q1.add(top);
        }
      }
      return top;
    }

  }
}
