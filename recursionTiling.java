// Problem: Tiling ProblemDescription: Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 times 1 tiles. A tile can either be placed horizontally or vertically.
public class recursionTiling {
  //O(2^n)
  public static int Tiling(int n) {
    if(n==0||n==1){
      return 1;
    }
    return Tiling(n-1)+Tiling(n-2);
  }

  //O(n)
  public static int Tiling2(int n, int arr[]) {
    if(n==0||n==1){
      return 1;
    }
    if(arr[n]!=0){
      return arr[n];
    }
    int a=Tiling2(n-1,arr);
    int b=Tiling2(n-2,arr);

    arr[n]=a+b;

    return arr[n]; 

  }

  public static void main(String[] args) {
    System.out.println(Tiling(4));
    System.out.println(Tiling2(4, new int[4+1]));
  }
}
