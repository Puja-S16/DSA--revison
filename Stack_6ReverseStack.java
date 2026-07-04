import java.util.Stack;
public class Stack_6ReverseStack {
  // reverse stack;
  // TC:O(n^2)    
  // SC:O(n) the space complexity is still O(n) because recursive function calls use the call stack
  public static void reverse(Stack<Integer> s) {
    if(s.isEmpty()){
      return;
    }
    int n=s.pop();
    reverse(s);
    pushBottom(s, n);
  }
  public static void pushBottom(Stack<Integer> s, int x) {
    if(s.isEmpty()){
      s.push(x);
      return;
    }
    int n=s.pop();
    pushBottom(s,x);
    s.push(n);
  }

  // Time: O(n) Space: O(n)----> make an extra Stack
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    s1.push(10);
    s1.push(20);
    s1.push(30);
    s1.push(40);

    System.out.println(s1);

    reverse(s1);
    System.out.println(s1);

  }
}