
// Merge sort on linked list ...return head of sorted LL

public class LinkedList9_MergeSort{
  public static Node merge(Node head){
    if(head==null || head.next==null){
      return head;
    }
    // 1st step is to find middle ...
    // middle is the last elem of the 1st part

    Node slow=head;
    Node fast=head.next; //important ...just like palindrome quest except ".next"
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    //slow --> middle (last elem of the 1st part)

    Node secHead=slow.next; 
    slow.next=null;// to divide the ll into two parts and store the 2nd part's head into "secHead"

    head=merge(head);
    secHead=merge(secHead);

    return mergeSort(head,secHead);
  }
  public static Node mergeSort(Node head, Node secHead) {
    Node x=new Node(100);
    Node y=x;

    while(head!=null && secHead!=null){
      if(head.data<=secHead.data){
        y.next=head;
        head=head.next;
        y=y.next;
      }else{
        y.next=secHead;
        secHead=secHead.next;
        y=y.next;
      }
    }
    while(head!=null ){
      y.next=head;
      head=head.next;
      y=y.next;
    }
    while(secHead!=null){
      y.next=secHead;
      secHead=secHead.next;
      y=y.next;
    }
    return x.next;
  }
}