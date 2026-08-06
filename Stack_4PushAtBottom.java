import java.util.Stack;
public class Stack_4PushAtBottom {
  // push such that top ki jagah bottom mein jaaye and rest elems wahin rahe

  // O(n) and O(1) SC

  public static void pushAtBottom(Stack<Integer> s1, int x) {
    if(s1.size()==0){
      s1.push(x);
      return;
    }
    int n=s1.pop();
    pushAtBottom(s1, x);;
    s1.push(n);
  }
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    s1.push(10);
    s1.push(20);
    s1.push(30);
    s1.push(40);

    pushAtBottom(s1, 999);
    System.out.println(s1);

  }
}
