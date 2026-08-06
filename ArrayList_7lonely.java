// Lonely Numbers in ArrayList (MEDIUM)
// You are given an integer arraylist nums. A number x is lonely when it appears only once, and
// no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
// Return all lonely numbers in nums. You may return the answer in any order.
// Sample Input 1 : nums = [10,6,5,8]
// Sample Output 1 : [10,8]


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_7lonely {
  
  public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
    Collections.sort(list);
    ArrayList<Integer> result=new ArrayList<>();
    for(int i=list.size()-1;i>=0;i--){
      int num=list.get(i);
      boolean lonely=true;
      if(i>0 && list.get(i)==list.get(i-1) || i<list.size()-1 && list.get(i)==list.get(i+1)){
        lonely=false;
      }
      if(i>0 && list.get(i)-1==list.get(i-1) || i<list.size()-1 && list.get(i)+1==list.get(i+1)){
        lonely=false;
      }
      if(lonely){
        result.add(num);
      }
    }
    return result;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>();
    list.add(10);
    list.add(6);
    list.add(5);
    list.add(8);

    
    System.out.println(lonely(list));
  }
}
