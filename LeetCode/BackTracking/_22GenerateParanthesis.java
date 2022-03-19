public class _22GenerateParanthesis {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            helper(res, new StringBuilder(), 0, 0, n);
            return res;
        }

        void helper(List<String> res, StringBuilder curr, int open, int close, int max) {
            if (curr.length() == max * 2) {
                res.add(curr.toString());
                return;
            }
            if (open < max) {
                curr.append("(");
                helper(res, curr, open + 1, close, max);
                curr.deleteCharAt(curr.length() - 1);
            }
            if (close < open) {
                curr.append(")");
                helper(res, curr, open, close + 1, max);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }
}
