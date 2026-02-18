// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.
public class array_search {
  public static int search(int arr[], int target) {
    int i=minSearch(arr);
    // If array is not rotated
    if(i == 0){
      return binarySearch(0, arr.length - 1, arr, target);
    }

    if( target>=arr[0] && target<=arr[i-1]){
      return binarySearch(0,i-1,arr,target);
    }
    else if(i!=arr.length-1 && target>=arr[i] && target<=arr[arr.length-1]){
      return binarySearch(i,arr.length-1,arr,target);
    }
    return -1;
  }

  public static int binarySearch(int low,int high,int arr[], int target) {
    
    while(low<=high){
      int mid=low+(high-low)/2;
      if(target==arr[mid]){
        return mid;
      }
      else if(target>arr[mid]){
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    return -1;
  }

  public static int minSearch(int arr[]) {
    int low=0;
    int high=arr.length-1;
    
    while(low<high){
      int mid=low+(high-low)/2;
      if(arr[mid]>arr[high]){
        low=mid+1;
      }else{
        high=mid;
      }
    }
    return low;
  }

/// another way
  public static int binarySearch2(int low,int high,int arr[], int target) {
    int pivot=minSearch(arr);
    if(pivot==0){
      high=arr.length-1;
      low=0;
    }
    else if(target<=arr[arr.length-1]){
      low=pivot;
      high=arr.length-1;
    }
    else if(target>=arr[0]){
      high=pivot-1;
      low=0;
    }
    //binary logic
    while(low<=high){
      int mid=low+(high-low)/2;
      if(target==arr[mid]){
        return mid;
      }
      else if(target>arr[mid]){
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    return -1;
  }
  
  
  public static void main(String[] args) {
    int arr[]={4, 5, 6, 7, 0, 1, 2};
    int target=0;
    System.out.println(search(arr,target));
    System.out.println();
    System.out.println(binarySearch2(0, 0, arr, target));
  }
}
