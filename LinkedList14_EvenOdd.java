// Question 4 :
// Odd Even Linked List
// We have a Linked List of integers, write a function to modify the linked list such that all even numbers appear before all the odd numbers in the modified linked list. Also, keep the order of even and odd numbers same. 
// Sample Input 1 : 8->12->10->5->4->1->6->NULL
// Sample Output 1 : 8->12->10->4->6->5->1->NULL
// Sample Input 2 : 1->3->5->7->NULL
// Sample Output 2 : 1->3->5->7->NULL

public class LinkedList14_EvenOdd {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Time: O(n) — one traversal of the list.
  // Space: O(1) — only a constant number of extra pointers/dummy nodes are used.
  public static Node EvenOdd(Node head) {
    if (head == null) {
      return head;
    }
    Node even = new Node(0);
    Node e = even;
    Node odd = new Node(0);
    Node o = odd;
    Node curr = head;
    while (curr != null) {
      if (curr.data % 2 == 0) {
        e.next = curr;
        curr = curr.next;
        e = e.next;
      } else {
        o.next = curr;
        curr = curr.next;
        o = o.next;
      }
    }
    o.next = null;
    if (even.next == null)
      return odd.next;
    e.next = odd.next;
    return even.next;
  }
}
