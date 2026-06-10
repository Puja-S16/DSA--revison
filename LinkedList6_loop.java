//Floyd's cycle finnding algorithm
public class LinkedList6_loop {
  public static boolean loop(ListNode head) {
    ListNode slow=head;    
    ListNode fast=head;    
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(fast==slow){
        return true;
      }
    }
    return false;
  }
}
