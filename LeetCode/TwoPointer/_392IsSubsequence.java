package TwoPointer;

public class _392IsSubsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() == 0)
                return true;
            int j = 0;
            for (int i = 0; i < t.length() && j < s.length(); i++) {
                if (t.charAt(i) == s.charAt(j))
                    j++;
            }
            return j == s.length();
        }
    }
}
