package String;

public class PalindromeGFG {
    class Solution {
    boolean isPalindrome(String s) {
        int l = 0;
        int high = s.length() - 1;

        while (l < high) {
            if (s.charAt(l) != s.charAt(high)) {
                return false;
            }
            l++;
            high--;
        }

        return true;
    }
}
}
