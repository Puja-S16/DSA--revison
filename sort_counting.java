//Worst case -->O(n+k)
//Space comp --> O(k)
public class sort_counting {
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};
    int max=arr[0];
    for(int num:arr){
      max=Math.max(max, num);
    }

    int count[]=new int[max+1];
    for(int num:arr){
      count[num]++;
    }
    int index=0;
    for(int i =0;i<count.length;i++){
      while(count[i]>0){
        arr[index++]=i;
        count[i]--;
      }
    }
    System.out.println("the sorted array is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
