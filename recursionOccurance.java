//return the index of the 1st occuranxe of an element in an array.
public class recursionOccurance{
  public static int occurance(int arr[],int key, int i) {
    if(i==arr.length){
      return -1;
    }
    if(arr[i]==key){
      return i;
    }
    return occurance(arr,key,i+1);
  }
  public static void main(String[] args) {
    int arr[]={2,3,5,7,9,10};
    System.out.println(occurance(arr,5,0));
  }
}
