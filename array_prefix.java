//max sum of a subarray of an array
//using a prefix array
//O(n*n)
class array_prefix{
  public static void main(String args[]){
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    int sum=0;
    int maxSum=Integer.MIN_VALUE;

    //prefix array
    int prefix[]=new int[arr.length];
       //setting 0th index
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      prefix[i]=prefix[i-1]+arr[i];
    }


    //sum of subarrays
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        sum=i==0?prefix[j] : prefix[j]-prefix[i-1];
        System.out.print(sum+" ");
        if(sum>maxSum){
          maxSum=sum;
        }
        sum=0;
      }
      System.out.println();
    }
  
    System.out.println("the max sum is :"+maxSum);
  
  }
}