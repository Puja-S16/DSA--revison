//bubble sort in decending order.
public class sort_decBubble {
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};

    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]<arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("the sorted array (in decreasing order) is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
