// Intersection of Two Linked Lists
// In a system there are two singly linked list. By some programming error, the end node of one
// of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a
// program to get the point where two linked lists merge.
public class LinkedList11_Intersection {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // O(m*n) , SC : O(1)
  public static Node intersection(Node head1, Node head2) {
    while (head1 != null) {
      Node temp = head2;
      while (temp != null) {
        if (temp == head1) {
          return head1;
        }
        temp = temp.next;
      }
      head1 = head1.next;
    }
    return null;
  }

  // O(m+n) , SC : O(1)
  // two pointers
  // x=x.next for both heads, until they're equal.... when x->null, point x->head2
  public static Node intersection2(Node headA, Node headB) {
    Node x = headA;
    Node y = headB;
    while (x != y) {
      if (x == null) {
        x = headB;
      } else {
        x = x.next;
      }
      if (y == null) {
        y = headA;
      } else {
        y = y.next;
      }
    }
    return x;
  }
}