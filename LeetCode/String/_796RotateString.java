public class _796RotateString {
    class Solution {
        public boolean rotateString(String s, String goal) {
            if (s.length() != goal.length())
                return false;
            s = s.concat(s);
            if (!s.contains(goal))
                return false;
            return true;
        }
    }

    // soln2
    class Solution2 {
        public boolean rotateString(String s, String goal) {
            if (s.length() != goal.length())
                return false;
            int r = s.length() - 1;
            StringBuilder sb = new StringBuilder(s);
            while (r-- > 0) {
                char x = sb.charAt(0);
                for (int i = 0; i < s.length() - 1; i++) {
                    sb.setCharAt(i, sb.charAt(i + 1));
                }
                sb.setCharAt(s.length() - 1, x);
                if (sb.toString().equals(goal))
                    return true;
            }
            return false;
        }
    }

    class Solution3 {
        public boolean rotateString(String s, String goal) {
            if (s.length() == goal.length() && ((s + s).indexOf(goal) >= 0))
                return true;
            else
                return false;
        }
    }
}
