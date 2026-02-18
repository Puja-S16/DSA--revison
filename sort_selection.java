//Worst case -->O(n*n)
//best case --> O(n*n)
public class sort_selection {
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};

    for(int i=0;i<arr.length;i++){
      int currMin=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[currMin]){
          currMin=j;
        }
      }
      if(currMin!=i){
        int temp=arr[i];
        arr[i]=arr[currMin];
        arr[currMin]=temp;
      }
    }

    System.out.println("the sorted array is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
