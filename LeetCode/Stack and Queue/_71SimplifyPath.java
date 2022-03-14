public class _71SimplifyPath {

    class Solution {
        public String simplifyPath(String path) {
            String[] dirs = path.split("/");
            Deque<String> stack = new ArrayDeque<>();
            for (String s : dirs) {
                if (s.equals(""))
                    continue;
                if (s.equals("."))
                    continue;
                if (s.equals(".."))
                    stack.pollLast();
                else
                    stack.add(s);
            }
            return "/" + String.join("/", stack);
        }
    }

    class Solution {
        public String simplifyPath(String path) {
            Stack<String> st = new Stack<>();
            String[] pathList = path.split("\\/");
            for (String p : pathList) {
                if (p.length() == 0 || p.equals("."))
                    continue;
                else if (p.equals("..")) {
                    if (!st.empty())
                        st.pop();
                } else
                    st.push(p);
            }
            String ans = "";
            while (!st.empty())
                ans = st.pop() + "/" + ans;
            if (ans.length() == 0)
                return "/";
            else
                return "/" + ans.substring(0, ans.length() - 1);
        }
    }
}
