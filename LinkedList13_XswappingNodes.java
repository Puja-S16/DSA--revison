// Question 3 :
// Swapping Nodes in a Linked List
// We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be swapped by changing links. Swapping data of nodes may be expensive in many situations when data contains many fields. It may be assumed that all  keys in the linked list are distinct.
// Sample Input 1 : 1->2->3->4, x = 2, y = 4
// Sample Output 1 : 1->4->3->2

public class LinkedList13_XswappingNodes {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // chat gpt :

  public static Node swapping2(Node head, int x, int y) {

    if (x == y)
      return head;

    Node currX = head;
    Node prevX = null;
    while (currX != null && currX.data != x) {
      prevX = currX;
      currX = currX.next;
    }

    Node currY = head;
    Node prevY = null;
    while (currY != null && currY.data != y) {
      prevY = currY;
      currY = currY.next;
    }

    if (currX == null || currY == null)
      return head;

    if (prevX != null)
      prevX.next = currY;
    else //matlab currX-->head
      head = currY;

    if (prevY != null)
      prevY.next = currX;
    else //matlab currY-->head
      head = currX;

    // swapped noted ke next ko bhi thik se point kro
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;

    return head;
  }
}
