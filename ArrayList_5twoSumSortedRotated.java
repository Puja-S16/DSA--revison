// if any pair gives a target sum in a sorted ROTATED array
import java.util.ArrayList;
public class ArrayList_5twoSumSortedRotated {
  public static boolean twoSumSortedR(ArrayList<Integer> list,int t){
    // two pointer
    int i=pivot(list);
    int j=i==0?list.size()-1:i-1;
    while(i!=j){
      if(i==list.size()){
        i=0;
      }
      if(j==-1){
        j=list.size()-1;
      }
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

  // O(log n)
  public static int pivot(ArrayList<Integer> list) {
    int low=0;
    int high=list.size()-1;
    
    while(low<high){
      int mid=low+((high-low)/2);
      if(list.get(mid)>list.get(high)){
        low=mid+1;
      }else{
        high=mid;
      }
    }
    return low;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);

    System.out.println(twoSumSortedR(list,23));
  }
}
