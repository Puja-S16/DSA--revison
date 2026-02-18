//Counting sort in decending order. Non-negative integers only
public class sort_decCounting {
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};

    int max=0;
    for(int nums:arr){
      max=Math.max(max, nums);
    }

    int count[]=new int[max+1];

    for(int nums:arr){
      count[nums]++;
    }
    int index=0;
    for(int i=count.length-1;i>=0;i--){
      while(count[i]>0){
        arr[index++]=i;
        count[i]--;
      }
    }
    System.out.println("the sorted array (in decreasing order) is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
