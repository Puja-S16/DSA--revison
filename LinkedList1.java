  // add first
  // add last
  // add middle (index,data)
  // remove first
  // remove last
  // remove middle (index)
  // size
  // print
  
public class LinkedList1 {
  public static class Node{
    int data;
    Node next;
    // constructor
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;



// add first
  public static void addf(int data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    newnode.next=head;
    head=newnode;
  }



// add rear
public static void addr(int data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    Node curr=head;
    while(curr.next!=null){
      curr=curr.next;
    }
    curr.next=newnode;
  }



// add middle (index,data) **************
public static void addm(int i,int data){
  Node newnode=new Node(data);
    if(i==0){
      newnode.next=head;
      head=newnode;
      return;
    }
    Node curr=head;
    for(int j=0;j<i-1;j++){
      if(curr==null){
        System.out.println("invalid index");
        return;
      }
      curr=curr.next;
    }
    if(curr==null){
      System.out.println("invalid index");
      return;
    }
    newnode.next=curr.next;
    curr.next=newnode;
  }





// remove first
public static void removef(){
  if(head==null){
    System.out.println("ll already empty!");
    return;
  }
  System.out.println("deleting "+head.data);
  head=head.next;
}





// remove rear *****
public static void remover(){
  if(head==null){
    System.out.println("ll already empty!");
    return;
  }
  if(head.next==null){
    System.out.println("deleting "+head.data);
    head=null;
    return;
  }
  Node curr=head;
  Node prev=head;
  while(curr.next!=null){
    prev=curr;
    curr=curr.next;
  }
  System.out.println("deleting "+curr.data);
  prev.next=null;
}





// remove middle (index)
public static void removem(int i){
  if(head==null){
    System.out.println("ll empty");
    return;
  }
  if(i==0){
    System.out.println("deleting "+head.data);
    head=head.next;
    return;
  }
  Node curr=head;
  Node prev=head;
  for(int j=0;j<i;j++){
    if(curr==null){
      System.out.println("invalid index");
      return;
    }
    prev=curr;
    curr=curr.next;
  }
  if(curr==null){
    System.out.println("invalid index");
    return;
  }
  System.out.println("deleting "+curr.data);
  prev.next=curr.next;
}






// size
public static int size(){
  if(head==null){
    return 0;
  }
  int count=0;
  Node curr=head;
  while(curr!=null){
    count++;
    curr=curr.next;
  }
  return count;
}





// print
public static void print(){
  if(head==null){
     System.out.println("null");
     return;
  }
  Node curr=head;
  while(curr!=null){
    System.out.print(curr.data+" --> ");
    curr=curr.next;
  }
  System.out.println("null.");
}





  public static void main(String[] args) {
    LinkedList1 ll=new LinkedList1();
  }
}
