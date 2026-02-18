public class array_stocks {
  public static void main(String[] args) {
    int arr[]={7,1,5,3,6,4}; //stock price on nth day
    int n=arr.length;

    int buy=Integer.MAX_VALUE;
    int maxProfit=0;

    for(int i=0;i<n;i++){
      if(arr[i]>buy){ //stock becho bc
        int profit=arr[i]-buy;
        maxProfit=Math.max(maxProfit,profit);
      }
      else{ //kareed lo bc
        buy=arr[i];
      }
    }
    System.out.println(maxProfit);
  }
}
