// MAXIMUM SUM of subarray
//TC : O(n*n*n)
// no of subarray : (sum of n nos ) --> n*(n+1)/2
class array_maxSumSubarray{
  public static void main(String[] args) {
    int count=0;
    int sum=0;
    int max=Integer.MIN_VALUE;
    int arr[]={1,-2,6,-1,3};
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        for(int k=i;k<=j;k++){
          sum+=arr[k];
        }
        count++;
        if(sum>max){
          max=sum;
        }
        sum=0;
      }
    }
    System.out.println("MAX sum of subarray : "+max);
    System.out.println("no of subarray : "+count);
  }
}