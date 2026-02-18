//max sum of a subarray of an array using Kadane's algo
//O(n)
class array_kadane{
  public static void main(String args[]){
    int arr[]={45,-3,-4,-1,-2,-1,-5,-3};
    int sum=0;
    int maxSum=Integer.MIN_VALUE;

    
    //sum of subarrays
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];

      if(sum>maxSum){
        maxSum=sum;
      }
      if(sum<0){
        sum=0;
      }
      
    }
  
    System.out.println("the max sum is :"+maxSum);
  
  }
}