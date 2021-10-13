public class _290WordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String a[] = s.split(" ");
            if (pattern.length() != a.length || s.isEmpty())
                return false;
            HashMap<Character, String> hs = new HashMap<>();
            for (int i = 0; i < a.length; i++) {
                if (!hs.containsKey(pattern.charAt(i)) && !hs.containsValue(a[i])) {
                    hs.put(pattern.charAt(i), a[i]);
                } else if ((!hs.containsKey(pattern.charAt(i)) && hs.containsValue(a[i]))
                        || !hs.get(pattern.charAt(i)).equals(a[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
