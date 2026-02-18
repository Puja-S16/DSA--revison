public class StringUpperCase {
  public static void main(String[] args) {
    String str="i am a book! a";
    if (str == null || str.length() == 0) {
      System.out.println("");
      return;
    }
    StringBuilder str2=new StringBuilder("");
    str2.append(Character.toUpperCase(str.charAt(0)));
    for(int i=1;i<str.length();i++){
      str2.append(str.charAt(i));
      if(str.charAt(i)==' ' && i!=str.length()-1){
        str2.append(Character.toUpperCase(str.charAt(i+1)));
        i++;
      }
    }
    System.out.println(str2);
  }
}
