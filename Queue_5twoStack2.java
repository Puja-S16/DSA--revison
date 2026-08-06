// Queue using 2 stacks
import java.util.Stack;
public class Queue_5twoStack2 {
  static class Queue{
    private Stack<Integer> s1=new Stack<>();
    private Stack<Integer> s2=new Stack<>();

    // two ways :
      // 1. add->O(n), remove and peek-->O(1)
      // 1. add->O(1), remove and peek-->O(n)

    // method 2

    // isEmpty
    public boolean isEmpty(){
      return s1.isEmpty();
    }

    // add
    public void enqueue(int data){
      s1.push(data);
    }

    // remove
    public int dequeue(){
      if(s1.isEmpty()){
        return -1;
      }
      // s1-->s2 until only one elem remains.... return that....s2-->s1
      int data=-1;
      while(!s1.isEmpty()){
        data=s1.pop();
        if(s1.isEmpty()){
          break;
        }
        s2.push(data);
      }
      while(!s2.isEmpty()){
        s1.push(s2.pop());
      }
      return data;
    }

    // peek
    public int peek(){
      if(s1.isEmpty()){
        return -1;
      }
      // s1-->s2 until only one elem remains.... return that....s2-->s1
      int data=-1;
      while(!s1.isEmpty()){
        data=s1.pop();
        s2.push(data);
      }
      while(!s2.isEmpty()){
        s1.push(s2.pop());
      }
      return data;
    }

  }
}
