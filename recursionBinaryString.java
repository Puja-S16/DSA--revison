// Generate all binary strings of length n without consecutive 1s.
public class recursionBinaryString {
  public static void BS(int n, int lastElem,String str) {
    if(n==0){
      System.out.println(str);
      return;
    }
    BS(n-1, 0, str+"0");
    if(lastElem==0){
      BS(n-1, 1, str+"1");
    }
  }
  public static void main(String[] args) {
    BS(3,0,"");
  }
}
