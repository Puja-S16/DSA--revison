//Write a program to Find Transpose of a Matrix.
// if n*m matrix : new transpose matrix will have to be created
// if square matreic n*n => no extraspace


public class twoDMtranspose {
  //for square matric
  public static void transpose1(int nums[][]) {
    int n=nums.length;

    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        int temp=nums[i][j];
        nums[i][j]=nums[j][i];
        nums[j][i]=temp;
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(nums[i][j]+" ");
      }
      System.out.println();
    }
  }
  //non square matrix
  public static void transpose2(int nums[][]) {
    int n=nums.length;
    int m=nums[0].length;

    int t[][]=new int[m][n]; //****** m*n not n*m since transpose.

    for(int i=0;i<t.length;i++){
      for(int j=0;j<t[0].length;j++){
        t[i][j]=nums[j][i];
      }
    }

    for(int i=0;i<t.length;i++){
      for(int j=0;j<t[0].length;j++){
        System.out.print(t[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int[][] nums = { 
      {10, 20, 30, 40},
      {15, 25, 35, 45},
      {27, 29, 37, 48},
      {32, 33, 39, 50}
    };
    if(nums.length==nums[0].length){
      transpose1(nums);
    }else{
      transpose2(nums);
    }
  }
}
