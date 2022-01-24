public class _520DetectCaptial {
    class Solution {
        public boolean detectCapitalUse(String word) {
            if (word.length() == 1)
                return true;
            if (word.toUpperCase() == word)
                return true;
            if (word.toLowerCase() == word)
                return true;
            if ((word.charAt(0) >= 65 && word.charAt(0) <= 90)
                    && (word.substring(1).toLowerCase().equals(word.substring(1))))
                return true;
            return false;
        }
    }

    class Solution2 {
        public boolean detectCapitalUse(String word) {
            return word.matches("[A-Z]*|.[a-z]*");
        }
    }
}
