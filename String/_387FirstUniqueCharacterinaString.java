package String;

public class _387FirstUniqueCharacterinaString {
    class Solution {
        public int firstUniqChar(String s) {
            for (int i = 0; i < s.length(); i++) {
                if ((s.lastIndexOf(s.charAt(i)) == i) && (s.indexOf(s.charAt(i)) == i))
                    return i;
            }
            return -1;
        }
    }
}
