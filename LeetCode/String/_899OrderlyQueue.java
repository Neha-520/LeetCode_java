package String;

import java.util.Arrays;

public class _899OrderlyQueue {
    class Solution {
        public String orderlyQueue(String s, int k) {
            if (k == 1) {
                String x = s + s;
                for (int i = 1; i < s.length(); i++) {
                    String t = x.substring(i, s.length() + i);
                    if (s.compareTo(t) > 0)
                        s = t;
                }
                return s;
            } else {
                char[] c = s.toCharArray();
                Arrays.sort(c);
                return new String(c);
            }

        }
    }
}
