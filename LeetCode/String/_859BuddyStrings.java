public class _859BuddyStrings {
    class Solution {
        public boolean buddyStrings(String s, String goal) {
            if (s.length() != goal.length())
                return false;
            if (s.equals(goal)) {
                int[] count = new int[26];
                for (int i = 0; i < s.length(); ++i)
                    count[s.charAt(i) - 'a']++;
                for (int c : count)
                    if (c > 1)
                        return true;
                return false;
            }
            int c = 0;
            char a1 = 0, b1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    c++;
                    if (c == 1) {
                        a1 = s.charAt(i);
                        b1 = goal.charAt(i);
                    }
                    if (c == 2 && (s.charAt(i) != b1 || goal.charAt(i) != a1)) {
                        return false;
                    }
                    if (c > 2)
                        return false;
                }
            }
            return c == 2;
        }
    }
}
