// parameter : ArrayList<Integer> list
// sorting collections.sort
// decendinf order : collections.sort(list, collections.reverseOrder())
import java.util.ArrayList;

public class ArrayList_1swap {
  public static void swap(ArrayList<Integer> list,int i,int j ) {
    int temp=list.get(i);
    list.set(i, list.get(j));
    list.set(j,temp);
  }
  public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>();
    list.add(23);
    list.add(3);
    list.add(2);
    list.add(21);
    list.add(31);
    list.add(4);
    list.add(7);

    System.out.println("Array list:");
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }

    int i=2;
    int j=4;
    swap(list,i,j);

    System.out.println("\nArray list:");
    for(i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
  }
}
