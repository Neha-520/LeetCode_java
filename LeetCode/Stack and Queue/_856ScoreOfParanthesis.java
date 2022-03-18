public class _856ScoreOfParanthesis {
    class Solution {
        public int scoreOfParentheses(String s) {
            Stack<Integer> st = new Stack<>();
            int score = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    st.push(score);
                    score = 0;
                } else {
                    score = st.pop() + Math.max(2 * score, 1);
                }
            }
            return score;
        }
    }

    class Solution {
        public int scoreOfParentheses(String S) {
            int ans = 0, bal = 0;
            for (int i = 0; i < S.length(); ++i) {
                if (S.charAt(i) == '(')
                    bal++;
                else {
                    bal--;
                    if (S.charAt(i - 1) == '(')
                        ans += 1 << bal;
                }
            }
            return ans;
        }
    }
}
