//Worst case -->O(n*n)
//best case --> O(n)
public class sort_insertion {
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};

    // no swappig! just shift the elem
    // for(int i=1;i<arr.length;i++){
    //   int x=i;
    //   int j=i-1;
    //   while(j>=0 && arr[x]<arr[j]){
    //     int temp=arr[j];
    //     arr[j]=arr[x];
    //     arr[x]=temp;
    //     x--;
    //     j--;
    //   }
    // }

    
    for(int i=1;i<arr.length;i++){
      int key=arr[i];
      int j=i-1;
      while(j>=0 && key<arr[j]){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=key;
    }


    System.out.println("the sorted array is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
