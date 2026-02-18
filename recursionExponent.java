// expo but with O(log n)
public class recursionExponent {
  public static int expo(int x, int n) {
    if(n%2==0){
      if(n==0){
        return 1;
      }
      int a=expo(x,n/2); // isko direct neeche nhi likh sakte hain kyunki By calling the function twice, you create 2{log n} calls, which simplifies back to O(n).
      return a*a;
    }
    else{
      if(n==0){
        return 1;
      }
      int a=expo(x,n/2);
      return x*a*a;
    }
  }
  public static void main(String[] args) {
    System.out.println(expo(2, 10));
  }
}
