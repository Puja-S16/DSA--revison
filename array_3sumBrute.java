import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class array_3sumBrute {
  public static void main(String[] args) {
    int arr[]={-1, 0, 1, 2, -1, -4};

    HashSet<List<Integer>> result=new HashSet <List<Integer>>();

    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        for(int k=j+1;k<arr.length;k++){
          if(arr[i]+arr[j]+arr[k]==0){
            List<Integer> triplets=new ArrayList<>();
            triplets.add(arr[i]);
            triplets.add(arr[j]);
            triplets.add(arr[k]);

            Collections.sort(triplets); // so that no duplicates.

            result.add(triplets);
          }
        }
      }
    }
    System.out.println(result);
  }
}
