// Determine if 2 Strings are anagrams of each other.
// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a study, or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.
// small letters and no fancy chars
public class StringAnagrams {
  public static boolean annagram(String a, String b) {

    if(a.length()!=b.length()) return false;
    
    int freq[]=new int[26];
    for(int i=0;i<a.length();i++){
      freq[a.charAt(i)-'a']++;
      freq[b.charAt(i)-'a']--;
    }
    for(int i=0;i<freq.length;i++){
      if(freq[i]!=0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String str1="caat";
    String str2="taca";
    System.out.println(annagram(str1,str2));
  }
}
