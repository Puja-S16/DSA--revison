// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.
// Sample Input : 1947
// Sample Output : “one nine four seven”
public class recursionEnglish {
  public static void eng(int num, String e[]) {
    if(num<=0){
      return;
    }
    eng(num/10, e);
    System.out.print((e[num%10])+" ");
  }
  public static void main(String[] args) {
    String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    eng(0, arr);
  }
}
