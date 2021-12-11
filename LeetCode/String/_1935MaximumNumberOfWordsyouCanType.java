public class _1935MaximumNumberOfWordsyouCanType {
    class Solution {
        public int canBeTypedWords(String text, String brokenLetters) {
            String[] a = text.split(" ");
            int c = 0;
            for (String s : a) {
                boolean flag = true;
                for (int i = 0; i < brokenLetters.length(); i++) {
                    if (s.contains(String.valueOf(brokenLetters.charAt(i)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    c++;
            }
            return c;
        }
    }
}
