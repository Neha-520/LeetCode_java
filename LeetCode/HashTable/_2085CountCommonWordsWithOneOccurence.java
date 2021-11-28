public class _2085CountCommonWordsWithOneOccurence {
    class Solution {
        public int countWords(String[] words1, String[] words2) {
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();
            for (String word : words1)
                map1.put(word, map1.getOrDefault(word, 0) + 1);

            for (String word : words2) {
                if (map1.containsKey(word) && map1.get(word) == 1)
                    map2.put(word, map2.getOrDefault(word, 0) + 1);
            }
            int c = 0;
            for (String word : map2.keySet()) {
                if (map2.get(word) == 1)
                    c++;
            }
            return c;
        }
    }
}
