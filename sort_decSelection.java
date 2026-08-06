//Selection sort in decending order.
public class sort_decSelection {
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};

    for(int i=0;i<arr.length-1;i++){
      int currMin=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]>arr[currMin]){
          currMin=j;
        }
      }
      if(currMin!=i){
        int temp=arr[i];
        arr[i]=arr[currMin];
        arr[currMin]=temp;
      }
    }
    System.out.println("the sorted array (in decreasing order) is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
