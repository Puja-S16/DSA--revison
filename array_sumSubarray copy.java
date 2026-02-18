// SUM of subarray
//TC : O(n*n*n)
// no of subarray : (sum of n nos ) --> n*(n+1)/2
class array_sumSubarray{
  public static void main(String[] args) {
    int count=0;
    int sum=0;
    int arr[]={2,4,6,8,10};
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        for(int k=i;k<=j;k++){
          sum+=arr[k];
        }
        count++;
        System.out.print(sum+ " ");
        sum=0;
      }
      System.out.println();
    }
    System.out.println("no of subarray : "+count);
  }
}