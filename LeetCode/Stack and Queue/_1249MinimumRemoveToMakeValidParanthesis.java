public class _1249MinimumRemoveToMakeValidParanthesis {
    class Solution {
        public String minRemoveToMakeValid(String s) {
            if (s.length() == 0 || s == null)
                return "";
            Stack<Integer> st = new Stack<>();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isAlphabetic(c))
                    continue;
                if (!st.isEmpty()) {
                    if (s.charAt(st.peek()) == '(' && c == ')')
                        st.pop();
                    else
                        st.push(i);
                } else
                    st.push(i);
            }
            while (st.size() > 0) {
                sb.deleteCharAt(st.pop());
            }
            return sb.toString();
        }
    }
}
