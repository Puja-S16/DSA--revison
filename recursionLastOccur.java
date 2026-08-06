//return the index of the last occurance of an element in an array.
public class recursionLastOccur{
  public static int occurance(int arr[],int key, int i, int j) {
    if(i==arr.length){
      return j;
    }
    if(arr[i]==key){
      j=i;
    }
    return occurance(arr,key,i+1,j);
  }
  //without extra variable 'j'
  public static int occurance2(int arr[],int key, int i) {
    if(i==-1){
      return -1;
    }
    if(arr[i]==key){
      return i;
    }
    return occurance2(arr,key,i-1);
  }
  
  public static void main(String[] args) {
    int arr[]={2,3,5,7,9,10,4,3,5,5,5,9};
    System.out.println(occurance(arr,5,0,-1));
    System.out.println(occurance2(arr,5,arr.length-1));
  }
}
