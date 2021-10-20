package String;

public class _557ReverseWordsinStringIII {
    class Solution {
        public String reverseWords(String s) {
            String[] a = s.split(" ");
            String x = "";
            for (String w : a) {
                StringBuilder sb = new StringBuilder(w);
                x += sb.reverse().toString() + " ";
            }
            return x.trim();
        }
    }
}
