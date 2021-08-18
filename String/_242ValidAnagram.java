package String;

import java.util.Arrays;

public class _242ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char x[] = s.toCharArray();
            char y[] = t.toCharArray();
            int n = s.length();
            int m = t.length();
            if (n != m)
                return false;
            Arrays.sort(x);
            Arrays.sort(y);
            for (int i = 0; i < n; i++) {
                if (x[i] != y[i])
                    return false;
            }
            return true;
        }
    }
}
