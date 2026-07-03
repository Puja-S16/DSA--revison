// // Question 5
// // Merge k Sorted Lists
// // We have K sorted linked lists of size N each, merge them and print the sorted output.
// // Sample Input 1 : k = 2, n = 2
// // l1 = 1->3->NULL
// // l2 = 6->8->NULL
// // l3 = 9->10->NULL
// // Sample Output 1 : 1>3->6->8->9->10->NULL

// import java.util.PriorityQueue;

// public class A_NotSolved_LinkedList16_mergeKsortedLists {
//   public static class ListNode {
//     int data;
//     ListNode next;

//     public ListNode(int data) {
//       this.data = data;
//       this.next = null;
//     }
//   }

//   public ListNode mergeKLists(ListNode[] lists) {
//     PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

//     // Insert first node of every list
//     for (ListNode node : lists) {
//       if (node != null)
//         pq.offer(node);
//     }

//     ListNode dummy = new ListNode(-1);
//     ListNode tail = dummy;

//     while (!pq.isEmpty()) {

//       ListNode smallest = pq.poll();

//       tail.next = smallest;
//       tail = tail.next;

//       if (smallest.next != null)
//         pq.offer(smallest.next);
//     }

//     return dummy.next;
//   }
// }

// // Approach 4(Most Asked
// // in Interviews)

// // Min Heap (Priority Queue)
// // Ye LeetCode ka famous solution hai.

// // Example

// // L1

// // 1 4 7

// // L2

// // 2 5 8

// // L3

// // 3 6 9
// // Heap me sirf first node daalo

// // 1
// // 2
// // 3
// // Heap

// //     1
// //    / \
// //   2   3
// // Nikalo

// // 1
// // Output

// // 1
// // Ab

// // 1 ke next

// // 4
// // Heap me daal do

// // Heap

// // 2
// // 3
// // 4
// // Nikalo

// // 2
// // Output

// // 1 2
// // Uska next

// // 5
// // Heap

// // 3 4 5
// // Nikalo

// // 3
// // Output

// // 1 2 3
// // Fir

// // 6
// // Heap

// // 4 5 6
// // Aise hi chalta rahega.

// // Final

// // 1 2 3 4 5 6 7 8 9
// // Complexity
// // Heap size

// // k
// // Har node ek baar insert

// // log k
// // Har node ek baar remove

// // log k
// // Total nodes

// // kn
// // Total

// // O(kn log k)
// // Space

// // O(k)
