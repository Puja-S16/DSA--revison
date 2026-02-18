public class StringCompress {
  public static String compress(String str) {
    if(str==null||str.isEmpty()){
      return "";
    }
    StringBuilder str2=new StringBuilder("");
    
    for(int i=0;i<str.length();i++){
      str2.append(str.charAt(i));
      int count=1;
      while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        count++;
        i++;
      }
      if(count>1){
        str2.append(count);
      }
    }

    return str2.length()<str.length()?str2.toString():str;
  }
  public static void main(String[] args) {
    String str="aaabbccccdd"; // sol: "a3b2c4d2"
    System.out.println(compress(str));
  }
}
