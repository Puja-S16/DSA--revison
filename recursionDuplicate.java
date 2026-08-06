//removing duplicates from a string.
public class recursionDuplicate {
  public static String duplicate(boolean arr[],String str, StringBuilder sb, int i) {
    if(i==str.length()){
      return sb.toString();
    }
    if(!arr[str.charAt(i)-'a']){
      arr[str.charAt(i)-'a']=true;
      sb.append(str.charAt(i));
    }

    return duplicate(arr,str, sb, i+1);
  }
  public static void main(String[] args) {
    String str="hellothere";
    StringBuilder sb=new StringBuilder("");
    System.out.println(duplicate(new boolean[26],str, sb, 0));
  }
}
