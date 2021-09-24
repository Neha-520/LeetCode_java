
import java.util.Stack;

public class _20ValidParantheses {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!st.isEmpty()) {
                    if (c == ')' && st.peek() == '(')
                        st.pop();
                    else if (c == '}' && st.peek() == '{')
                        st.pop();
                    else if (c == ']' && st.peek() == '[')
                        st.pop();
                    else
                        st.push(c);
                    continue;
                }
                st.push(c);
            }
            return st.isEmpty();
        }
    }
}
