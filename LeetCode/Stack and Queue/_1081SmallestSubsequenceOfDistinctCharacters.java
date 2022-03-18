public class _1081SmallestSubsequenceOfDistinctCharacters {
    class Solution {
        public String smallestSubsequence(String s) {
            Stack<Integer> st = new Stack<>();
            int lastPos[] = new int[26];
            boolean[] vis = new boolean[26];
            for (int i = 0; i < s.length(); i++) {
                lastPos[s.charAt(i) - 'a'] = i;
            }

            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i) - 'a';
                if (vis[c])
                    continue;
                while (!st.isEmpty() && st.peek() > c && i < lastPos[st.peek()]) {
                    vis[st.pop()] = false;
                }
                st.push(c);
                vis[c] = true;
            }
            StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()) {
                sb.append((char) (st.pop() + 'a'));
            }
            return sb.reverse().toString();
        }
    }
}
