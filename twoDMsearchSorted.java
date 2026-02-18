

public class twoDMsearchSorted {
  public static void search(int mat[][], int key) {
    int n=mat.length;
    int m=mat[0].length;
    // taking top right corner cell
      int i=0;
      int j=m-1;

      while(i<=n-1 && j>=0){
        if(key==mat[i][j]){
          System.out.println("found at : ["+i+", "+j+"]");
          return;
        }
        else if(key>mat[i][j] ){
          i++;
        }else{
          j--;
        }
      }
    // OR //
    //taking bottom left corner cell
      int a=n-1;
      int b=0;

      while(a>=0 && b<=m-1){
        if(key==mat[a][b]){
          System.out.println("found at : ["+a+", "+b+"]");
          return;
        }
        else if(key>mat[a][b] ){
          b++;
        }else{
          a--;
        }
      }

  }
  public static void main(String[] args) {
    int[][] nums = { 
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
    search(nums, 37);
  }
  
}
