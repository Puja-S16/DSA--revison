// m==n


public class twoDMdiagonalSum {
  public static int brute(int mat[][]) {
    int sum=0;
    int n=mat.length;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==j){
          sum+=mat[i][j];
        }else if(i+j==n-1){
          sum+=mat[i][j];
        }
      }
    }
    return sum;
  }
  public static int optimal(int mat[][]) {
    int sum=0;
    int n=mat.length;
    for(int i=0;i<n;i++){
      sum+=mat[i][i];
      if(i!=n-i-1){
        sum+=mat[i][n-i-1];
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    int[][] nums = { 
      {10, 20, 30, 40},
      {15, 25, 35, 45},
      {27, 29, 37, 48},
      {32, 33, 39, 50}
    };

    System.out.println(brute(nums));
    System.out.println(optimal(nums));
  }
}
