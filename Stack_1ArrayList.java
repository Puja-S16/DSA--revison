import java.util.ArrayList;

public class Stack_1ArrayList {
  static class Stack {
    private ArrayList<Integer> s = new ArrayList<>();

    public boolean isEmpty() {
      return s.size() == 0;
    }

    public void push(int data) {
      s.add(data);
    }

    public int pop() {
      if (s.size() == 0) {
        System.out.println("empty stack");
        return -1;
      }
      int n = s.get(s.size() - 1);
      s.remove(s.size() - 1);
      return n;
    }

    public int peek() {
      if (s.size() == 0) {
        System.out.println("empty stack");
        return -1;
      }
      return s.get(s.size() - 1);
    }

  }

  public static void main(String[] args) {
    Stack s1 = new Stack();
    System.out.println(s1.isEmpty());// true
    s1.push(80);
    System.out.println(s1.peek());// 80
    System.out.println(s1.isEmpty());// false
    System.out.println(s1.pop());// 80
  }

}