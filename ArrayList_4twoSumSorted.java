// if any pair gives a target sum in a sorted array
import java.util.ArrayList;

public class ArrayList_4twoSumSorted {
  public static boolean twoSumSorted(ArrayList<Integer> list,int t){
    // two pointer
    int i=0;
    int j=list.size()-1;
    while(i<j){
      int sum=list.get(i)+list.get(j);
      if(sum==t){
        return true;
      }else if(sum>t){
        j--;
      }else{
        i++;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(20);
    list.add(21);
    list.add(31);
    list.add(41);
    list.add(70);

    System.out.println(twoSumSorted(list,23));
  }
}
