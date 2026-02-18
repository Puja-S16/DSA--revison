// Count how many times lowercase vowels occurred in a String entered by the user.
public class StringCountVowel {
  public static void main(String[] args) {
    int count=0;
    String str="If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a study, or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        count++;
      }
    }
    System.out.println(count);
  }
}
