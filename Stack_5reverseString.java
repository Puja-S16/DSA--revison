import java.util.Stack;

public class Stack_5reverseString {
  class Solution {
    public String reverse(String s) {
      // code here
      // You are given a string s , the task is to reverse the string using stack.

      // O(n) and O(n)
      StringBuilder reversed = new StringBuilder();

      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
        stack.push(s.charAt(i));
      }
      while (!stack.isEmpty()) {
        reversed.append(stack.pop());
      }

      return reversed.toString();
    }
  }
}
