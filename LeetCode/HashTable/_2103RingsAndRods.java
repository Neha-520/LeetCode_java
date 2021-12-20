public class _2103RingsAndRods {
    class Solution {
        public int countPoints(String rings) {
            if (rings.length() == 2 || rings.length() == 4)
                return 0;
            HashMap<Character, String> hm = new HashMap<>();
            for (int i = 0; i < rings.length(); i += 2) {
                char x = rings.charAt(i);
                if (hm.containsKey(x))
                    hm.put(x, hm.get(x) + rings.charAt(i + 1));
                else
                    hm.put(x, String.valueOf(rings.charAt(i + 1)));
            }
            int c = 0;
            if (hm.containsKey('R') && hm.containsKey('G') && hm.containsKey('B')) {
                for (int i = 0; i < 10; i++) {
                    if (hm.get('R').contains(String.valueOf(i)) && hm.get('G').contains(String.valueOf(i))
                            && hm.get('B').contains(String.valueOf(i)))
                        c++;
                }
            }
            return c;
        }
    }
}
