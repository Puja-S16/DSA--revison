//Insertion sort in decending order.
public class sort_decInsertion {
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};

    for(int i=1;i<arr.length;i++){
      int j=i-1;
      int key=arr[i];
      while(j>=0 && arr[j]<key){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=key;
    }
    System.out.println("the sorted array (in decreasing order) is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
