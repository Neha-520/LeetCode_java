package String;

public class _58LengthofLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            return s.substring(s.lastIndexOf(" ") + 1).length();
        }
    }
}
