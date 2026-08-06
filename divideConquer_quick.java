public class divideConquer_quick {
  public static void quick(int arr[], int low, int high) {
    if(low>=high){
      return;
    }
    int pivot=high;
    int i=low;
    int x=low;
    while(i<pivot){
      if(arr[i]<arr[pivot]){
        int temp=arr[i];
        arr[i]=arr[x];
        arr[x]=temp;
        x++;
        i++;
      }else{
        i++;
      }
    }
    int temp=arr[pivot];
    arr[pivot]=arr[x];
    arr[x]=temp;
    quick(arr, low, x-1);
    quick(arr, x+1, high);
  }
  public static void main(String[] args) {
    int arr[]={2,8,5,3,9,4,1};
    quick(arr, 0, arr.length-1);
    System.out.println("the sorted array is :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}


















// public class divideConquer_quick {

//     public static void quick(int arr[], int low, int high) {

//         if (low >= high) {
//             return;
//         }

//         int pivotIndex = partition(arr, low, high);

//         quick(arr, low, pivotIndex - 1);
//         quick(arr, pivotIndex + 1, high);
//     }

//     public static int partition(int arr[], int low, int high) {

//         int pivot = arr[high];
//         int i = low - 1;

//         for (int j = low; j < high; j++) {
//             if (arr[j] <= pivot) {
//                 i++;

//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }

//         // place pivot at correct position
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;

//         return i + 1;
//     }

//     public static void main(String[] args) {

//         int arr[] = {2,8,5,3,9,4,1};

//         quick(arr, 0, arr.length - 1);

//         System.out.println("the sorted array is :");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
