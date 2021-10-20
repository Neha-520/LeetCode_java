import java.util.HashSet;
import java.util.Set;

public class _139WordBreak {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            if (s == null || s.length() == 0)
                return false;
            Set<String> set = new HashSet<>();
            for (String i : wordDict)
                set.add(i);

            boolean dp[] = new boolean[s.length()];
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j <= i; j++) {
                    String temp = s.substring(j, i + 1);
                    if (set.contains(temp)) {
                        if (j > 0)
                            dp[i] = dp[j - 1] || dp[i];
                        else
                            dp[i] = true;
                    }
                }
            }
            return dp[s.length() - 1];
        }
    }
}
