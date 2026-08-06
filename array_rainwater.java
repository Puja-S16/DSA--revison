// O(n) TC
// but SC =O(n)
public class array_rainwater {
  public static void main(String[] args) {
    int arr[]={4,2,0,6,3,2,5};
    int n=arr.length;
    int maxL[]=new int[n];
    int maxR[]=new int[n];

    maxL[0]=arr[0];
    maxR[n-1]=arr[n-1];
    for(int i=1;i<n;i++){
      maxL[i]=Math.max(maxL[i-1], arr[i]);
    }
    for(int i=n-2;i>=0;i--){
      maxR[i]=Math.max(maxR[i+1], arr[i]);
    }
    int water=0;
    int totalWater=0;
    for(int i=0;i<n;i++){
      water=Math.min(maxL[i],maxR[i])-arr[i];
      System.out.println("water at "+i+"th index is : "+water);
      totalWater+=water;
    }

    System.out.println("total water trapped : "+totalWater);
  }
}


// most optimal solution (no extra array)
// SC=O(1)
// TC=O(n)

// public class array_rainwater {
//   public static void main(String[] args) {
//     int arr[]={5,4,3,6,1,4};
//     int n=arr.length;
//     int left=0;
//     int right=n-1;
//     int maxL=0;
//     int maxR=0;
//     int totalWater=0;

//     while(left<=right){

//       if(arr[left]<=arr[right])
//       {
//         if(maxL<=arr[left]){ // can't store water as it's tallest one on the left side yet
//           maxL=arr[left];
//         }
//         else{
//           totalWater+=maxL-arr[left];
//         }
//         left++;
//       }
//       else{
//         if(maxR<=arr[right]){
//           maxR=arr[right];
//         }
//         else{
//           totalWater+=maxR-arr[right];
//         }
//         right--;
//       }

//     }

//     System.out.println("total water trapped : "+totalWater+" units");
//   }
// }



//or 


          // public int trap(int[] height) {
          //         int left=1;
          //         int right=height.length-2;

          //         int maxL=height[0];
          //         int maxR=height[height.length-1];

          //         int water=0;

          //         while(left<=right){
          //             if(maxL<=maxR){
          //                 if(height[left]<=maxL){
          //                     water+=maxL-height[left];
          //                 }else{
          //                     maxL=height[left];
          //                 }
          //                 left++;
          //             }else{
          //                 if(height[right]<=maxR){
          //                     water+=maxR-height[right];
          //                 }else{
          //                     maxR=height[right];
          //                 }
          //                 right--;
          //             }
          //         }
          //         return water;
          //     }















// // explanation of the optimized version :

// The "Aha!" Moment: Discovering the Two-Pointer Trick
// The key insight is this: You don't always need to know both the max_left and max_right for a given bar.

// You only need to know the min of the two.

// Let's set up two pointers, left at the start and right at the end. We also track leftMax (the tallest wall seen from the left so far) and rightMax (the tallest wall seen from the right so far).

// Now, we compare the height of the bars at the pointers: arr[left] and arr[right].

// Case 1: arr[left] is SHORTER than arr[right] (arr[left] <= arr[right])

// This is the crucial part. Because arr[right] is taller, we have a guarantee.

// We know that the true max_right_wall for the left pointer is at least as tall as arr[right].

// We also know the leftMax (the tallest wall to the left of our left pointer).

// Since arr[left] <= arr[right], it's highly likely that our leftMax is also less than or equal to the true max_right_wall.

// Therefore, the leftMax is the bottleneck. The min(leftMax, true_max_right) will always be leftMax.

// This means we can confidently calculate the water trapped at the left pointer's position only using leftMax.

// Case 2: arr[right] is SHORTER than arr[left] (arr[right] < arr[left])

// This is the perfect mirror image.

// We know the true max_left_wall for the right pointer is at least as tall as arr[left].

// We also know the rightMax.

// Since arr[right] < arr[left], our rightMax is guaranteed to be the bottleneck.

// The min(true_max_left, rightMax) will always be rightMax.

// This means we can confidently calculate the water trapped at the right pointer's position only using rightMax.

// In short, by comparing the two outermost walls (arr[left] and arr[right]), we instantly know which side (leftMax or rightMax) is the guaranteed limiting factor for trapping water. We then process that side and move its pointer inward.