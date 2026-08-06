import java.util.Stack;

public class Stack_3Collections {
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    System.out.println(s1.isEmpty());// true
    s1.push(80);
    System.out.println(s1.peek());// 80
    System.out.println(s1.isEmpty());// false
    System.out.println(s1.pop());// 80
  }
}
