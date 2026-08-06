// delete nth node from end
public class LinkedList4 {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
// delete nth node from end
public static void delete(int n){
  if(head==null){
    System.out.println("nothing to delete!");
    return;
  }
  // // two pointer : slow and fast.... 
  Node slow=head;
  Node fast=head;

  for(int i=0;i<n;i++){
    if(fast==null){
      System.out.println("invalid n");
      return;
    }
    fast=fast.next;
  }
  // head ko remove
  if(fast==null){
    System.out.println("deleting "+head.data);
    head=head.next;
    return;
  }
  while (fast.next!=null) {
    slow=slow.next;
    fast=fast.next;
  }
  System.out.println("deleting "+slow.next.data);
  slow.next=slow.next.next; //not slow.next=fast
}
}
