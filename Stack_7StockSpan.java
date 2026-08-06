// Stock Span Problem
// Suppose stock prices hain:

// Day     0   1   2   3   4   5   6
// Price 100  80  60  70  60  85 100

// Hume har din ka span nikalna hai.

// Span matlab:

// Aaj se peeche jao jab tak price aaj ke price se chhota ya equal ho. Kitne consecutive din milte hain? return max no of such days

// Maximum number of consecutive days for which price ≤ today's price.
import java.util.Stack;

// public class Stack_7StockSpan {
  public static int StockSpan(Stack<Integer> s) {
    int days=1;
    int maxDays=days;
    int price=s.pop();
    while(!s.isEmpty()){
      int n=s.pop();
      if(price>=n){
        days++;
      }else{
        price=n;
        days=0;
      }
      if(days>maxDays){
        maxDays=days;
      }
    }
    return maxDays;
  }
}
