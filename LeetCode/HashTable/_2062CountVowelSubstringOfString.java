public class _2062CountVowelSubstringOfString {
    class Solution {
        public int countVowelSubstrings(String word) {
            if (word.length() < 5)
                return 0;
            int i = 0, c = 0;
            Set<Character> set = new HashSet<>();
            while (i < word.length() - 4) {
                set.clear();
                int j = i;
                while (j < word.length()) {
                    char ch = word.charAt(j++);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        set.add(ch);
                        if (set.size() == 5)
                            c++;
                    } else
                        break;
                }
                i++;
            }
            return c;
        }
    }
}
