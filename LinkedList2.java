// iterative and recursive search

public class LinkedList2 {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  // search iterative 
  public static int searchI(int key){
    if(head==null){
      return -1;
    }
    int count=0;
    Node curr=head;
    while(curr!=null){
      if(curr.data==key){
        return count;
      }
      count++;
      curr=curr.next;
    }
    return -1;
  }
  // search recursive
  public static int searchR(Node head,int key,int count){
    if(head==null){
      return -1;
    }
    if(head.data==key){
      return count;
    }
    return searchR(head.next,key,count+1);
  }
}
