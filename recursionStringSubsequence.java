// str subsequence print
// str subsequence count

// str unique subsequence using recursion print
// str unique subsequence using recursion count

import java.util.HashSet;

public class recursionStringSubsequence {
  public static void subsequence(String str,int i,String x) {
    if(i==str.length()){
      System.out.print(x+" ");
      return;
    }
    //to be
    subsequence(str, i+1, x+str.charAt(i));
    //not to be
    subsequence(str, i+1, x);

  }


  public static int countsubsequence(String str,int i) {
    if(i==str.length()){
      return 1;
    }
    //to be + not to be
    return 2 * countsubsequence(str, i+1);

  }


  public static void Usubsequence(String str,int i,String x, HashSet set) {
    if(i==str.length()){
      if(!set.contains(x)){
        System.out.print(x+" ");
        set.add(x);
      }
      return;
    }
    //to be
    Usubsequence(str, i+1, x+str.charAt(i),set);
    //not to be
    Usubsequence(str, i+1, x,set);

  }


  public static int Ucountsubsequence(String str,int i,String x, HashSet set) {
    if(i==str.length()){
      if(!set.contains(x)){
        set.add(x);
        return 1;
      }
      else return 0;
    }
    //to be+not to be
    return Ucountsubsequence(str, i+1, x+str.charAt(i),set)+ Ucountsubsequence(str, i+1, x,set);

  }


  public static void main(String[] args) {
    String str="aaa";
    subsequence(str, 0, "");
    
    System.out.println(countsubsequence(str, 0)-1);// answer is one extra as there is a empty subsequence ""

    //unique:
    HashSet<String> set=new HashSet<>();
    Usubsequence(str, 0, "",set);
    HashSet<String> set2=new HashSet<>();
    System.out.println(Ucountsubsequence(str, 0,"",set2)-1);// answer is one extra as there is a empty subsequence ""
  }
}
