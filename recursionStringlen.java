// Write a program to find Length of a String using Recursion.
public class recursionStringlen {
  public static int len(String str) {
    if(str==""){
      return 0;
    }
    return 1+len(str.substring(1));
  }
  public static void main(String[] args) {
    System.out.println(len("hello there"));

  }
}
