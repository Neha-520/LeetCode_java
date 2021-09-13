package HashTable;

import java.util.HashMap;

public class _1189MaximumNumberofBalloons {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            HashMap<Character, Integer> hm = new HashMap<>();
            if (text.contains("b") && text.contains("a") && text.contains("l") && text.contains("o")
                    && text.contains("n")) {
                for (int i = 0; i < text.length(); i++) {
                    if (!hm.containsKey(text.charAt(i)))
                        hm.put(text.charAt(i), 1);
                    else
                        hm.put(text.charAt(i), hm.get(text.charAt(i)) + 1);
                }
                hm.put('l', hm.get('l') / 2);
                hm.put('o', hm.get('o') / 2);
                int count = 0;
                while (hm.get('b') != 0 && hm.get('a') != 0 && hm.get('l') != 0 && hm.get('o') != 0
                        && hm.get('n') != 0) {
                    hm.put('b', hm.get('b') - 1);
                    hm.put('a', hm.get('a') - 1);
                    hm.put('l', hm.get('l') - 1);
                    hm.put('o', hm.get('o') - 1);
                    hm.put('n', hm.get('n') - 1);
                    count++;
                }
                return count;
            } else
                return 0;
        }
    }
}
