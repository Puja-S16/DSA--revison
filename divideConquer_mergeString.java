// O(n log n) TC
// O(n) SC
class divideConquer_mergeString{
  public static void divide(String arr[], int low, int high) {
    if(low>=high){
      return;
    }
    int mid=low+(high-low)/2;
    divide(arr, low, mid);
    divide(arr, mid+1, high);

    merge(arr,low,mid,high);
    return;
  }
  public static void merge(String arr[], int low,int mid,int high) {
    int i=low;
    int j=mid+1;
    int x=0;
    String temp[]=new String[high-low+1];
    
    while(i<=mid && j<=high){
      // ******************************************************** //
      int compare=arr[i].compareTo(arr[j]);
      if(compare<=0){
        temp[x]=arr[i];
        i++;
        x++;
      }else{
        temp[x]=arr[j];
        j++;
        x++;
      }
    }
    //there may still be elements left
    while(i<=mid){
      temp[x++]=arr[i++];
    }
    //or
    while(j<=high){
      temp[x++]=arr[j++];
    }
    i=low;
    for(int k=0;k<temp.length;k++){
      arr[i]=temp[k];
      i++;
    }
    return;
  }
  public static void main(String[] args) {
    String arr[]={ "sun", "earth", "mars", "mercury" };
    divide(arr, 0, arr.length-1);
    System.out.println("the sorted array is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}