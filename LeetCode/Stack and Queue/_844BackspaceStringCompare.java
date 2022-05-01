class Solution {
    public boolean backspaceCompare(String s, String t) {
        if (!s.contains("#") && (!t.contains("#")))
            return s.equals(t);
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x != '#')
                s1.push(x);
            else if (!s1.isEmpty())
                s1.pop();
        }
        for (char x : t.toCharArray()) {
            if (x != '#')
                s2.push(x);
            else if (!s2.isEmpty())
                s2.pop();
        }
        if (s1.size() != s2.size())
            return false;
        for (int i = 0; i < s1.size(); i++) {
            if (s1.pop() == s2.pop())
                continue;
            return false;
        }
        return true;
    }
}