package Recursion;

public class _344ReverseString {
    class Solution {
        public void reverseString(char[] s) {
            helper(s, 0, s.length - 1);
        }

        public void helper(char[] s, int i, int l) {
            if (i >= l)
                return;
            char temp = s[i];
            s[i] = s[l];
            s[l] = temp;
            helper(s, i + 1, l - 1);
        }
    }
}
