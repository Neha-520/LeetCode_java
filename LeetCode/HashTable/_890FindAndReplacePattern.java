public class _890FindAndReplacePattern {
    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> res = new ArrayList<>();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (char p : pattern.toCharArray()) {
                hm.put(p, hm.getOrDefault(p, 0) + 1);
            }
            HashMap<Character, Integer> temp = new HashMap<>();
            HashMap<Character, Character> z = new HashMap<>();
            for (String w : words) {
                if (w.length() != pattern.length())
                    continue;
                for (char c : w.toCharArray()) {
                    temp.put(c, temp.getOrDefault(c, 0) + 1);
                }
                boolean f = true;
                for (int i = 0; i < w.length(); i++) {
                    char x = w.charAt(i);
                    char y = pattern.charAt(i);
                    if (z.containsKey(x)) {
                        if (z.get(x) != y) {
                            f = false;
                            break;
                        }
                    } else
                        z.put(x, y);
                    if (hm.get(y) != temp.get(x)) {
                        f = false;
                        break;
                    }
                }
                if (f)
                    res.add(w);
                temp.clear();
                z.clear();
            }
            return res;
        }
    }
}
