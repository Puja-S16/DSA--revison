import java.util.ArrayList;

public class ArrayList_2matrix {
  
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list =new ArrayList<>();
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>();
    ArrayList<Integer> l3=new ArrayList<>();

    for(int i=1;i<11;i++){
      l1.add(i-1,1*i);
      l2.add(i-1,2*i);
      l3.add(i-1,3*i);
    }
    list.add(l1);
    list.add(l2);
    list.add(l3);

    System.out.println("\nArray list:");
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
    System.out.println();
    System.out.println(list);
  }
}
