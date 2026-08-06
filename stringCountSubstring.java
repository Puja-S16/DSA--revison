
//// We are given a string S, we need to find the count of all contiguous substrings
// starting and ending with the same character.
// Sample Input 1 : S = "abcab"
// Sample Output 1 : 7
// There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
// Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
// contiguous substrings start and end with the same character.
// Sample Input 2 : S = "aba"
// Sample Output 2 : 4
// The substrings are a, b, a and aba.

public class stringCountSubstring {

// O(n)
// for "abcab"
// Apply k(k+1)/2 formula
// a → 2 → 3
// b → 2 → 3
// c → 1 → 1
// Total = 7

public static int countSubstrings3(String str) {

        int[] freq = new int[256];   // supports all ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int total = 0;

        // Apply k(k+1)/2 formula
        for (int i = 0; i < 256; i++) {
            int k = freq[i];
            if (k > 0) {
                total += (k * (k + 1)) / 2;
            }
        }

        return total;
    }


  public static void main(String[] args) {
    String str ="abcab";
    System.out.println(countSubstrings3(str));
  }
}
