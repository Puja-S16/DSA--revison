// Most Frequent Number following Key (EASY)
// You are given an integer Arraylist nums. You are also given an integer key, which is present in
// nums.
// For every unique integer target in nums, count the number of times target immediately follows
// an occurrence of key in nums. In other words, count the number of indices i such that:
// 0 <= i <= nums.size() - 2,
// nums.get(i) == key and,
// nums.get(i+1) == target.
// Return the target with the maximum count.
// (Assumption - that the target with maximum count is unique.)
// Sample Input 1 :nums = [1,100,200,1,100], key = 1
// Sample Output 1 : 100
// Explanation :
// For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.
// No other integers follow an occurrence of key, so we return 100.



import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_8freqNoAfterKey {
  
  public static int freqNo(ArrayList<Integer> list, int key) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int count=0;
    int maxCountNo=0;
    int result =-1;
    for(int i=0;i<list.size()-1;i++){
      if(list.get(i)==key){
        map.put(list.get(i+1), map.getOrDefault(list.get(i+1),0)+1);
        count=map.get(list.get(i+1));
        if(count>maxCountNo){
          maxCountNo=count;
          result=list.get(i+1);
        }
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
    list.add(6);
    list.add(5);
    list.add(8);

    
    System.out.println(freqNo(list, 6));
  }
}
