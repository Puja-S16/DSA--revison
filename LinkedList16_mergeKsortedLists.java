// Question 5
// Merge k Sorted Lists
// We have K sorted linked lists of size N each, merge them and print the sorted output.
// Sample Input 1 : k = 2, n = 2
// l1 = 1->3->NULL
// l2 = 6->8->NULL
// l3 = 9->10->NULL
// Sample Output 1 : 1>3->6->8->9->10->NULL

public class LinkedList16_mergeKsortedLists {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public static Node mergeKlists(int k, int n, Node head1,Node head2,Node head3) {
    return head1;
  }
}
