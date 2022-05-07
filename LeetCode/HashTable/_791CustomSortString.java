public class _791CustomSortString {
    class Solution {
        public String customSortString(String order, String s) {
            Map<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < order.length(); i++) {
                char c = order.charAt(i);
                if (hm.containsKey(c)) {
                    int x = hm.get(c);
                    while (x-- > 0) {
                        sb.append(c);
                    }
                    hm.remove(c);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (hm.containsKey(s.charAt(i)))
                    sb.append(s.charAt(i));
            }
            return sb.toString();
        }
    }
}
