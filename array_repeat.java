//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.HashSet;

public class array_repeat {
  public static boolean repeat(int arr[]) {
    
    //O(n^2)
        // for(int i=0;i<arr.length;i++){
        //   for(int j=i+1;j<arr.length;j++){
        //     if(arr[i]==arr[j]){
        //       return true;
        //     }
        //   }
        // }

    // using hashSets O(n)
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
      if(set.contains(arr[i])){
        return true;
      }else{
        set.add(arr[i]);
      }
    }

    return false;
  }
  public static void main(String[] args) {
    int arr[]={1, 3, 4, 2, 9, 5};

    System.out.println(repeat(arr));
  }
}
