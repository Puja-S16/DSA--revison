//Problem 13: Friends Pairing ProblemDescription:Given $n$ friends, each one can either remain single or can be paired up with some other friend. Each friend can be paired only once. Your goal is to find out the total number of ways in which friends can remain single or be paired up.
public class recursionPairing {
  //O(n)
  public static int friends(int n, int memo[]) {
    if(n==1 ||n==2){
      return n;
    }
    if(memo[n]!=0){
      return memo[n];
    }
    int a= friends(n-1, memo);
    // You have (n-1) choices for a partner, then solve for the remaining (n-2)
    int b= friends(n-2, memo)*(n-1);
    memo[n]=a+b;
    return memo[n];
  }

  // O(2^n)?
  public static int friends2(int n) {
    if(n==1 ||n==2){
      return n;
    }
    
    int a= friends2(n-1);
    // You have (n-1) choices for a partner, then solve for the remaining (n-2)
    int b= friends2(n-2)*(n-1);
    
    return a+b;
  }
  public static void main(String[] args) {
    System.out.println(friends(5, new int[5+1]));
    System.out.println(friends2(5));
  }
}
