package String;

import java.util.regex.*;

class Solution {
    public boolean isMatch(String s, String r) {
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        if (m.find() && m.group().equals(s))
            return true;
        return false;
    }

    // 2nd method
    public boolean isMatch2(String s, String r) {
        return s.matches(r);
    }
}