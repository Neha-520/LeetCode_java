public class _1178NumberofValidWordsforEachPuzzle {
    class Solution {
        public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
            HashMap<Character, ArrayList<Integer>> hm = new HashMap<>();

            for (int i = 0; i < 26; i++) {
                hm.put((char) ('a' + i), new ArrayList<>());
            }

            for (String w : words) {
                int mask = 0;
                for (char ch : w.toCharArray()) {
                    int bit = ch - 'a';
                    mask = mask | (1 << bit);
                }
                HashSet<Character> hs = new HashSet<>();
                for (char ch : w.toCharArray()) {
                    if (!hs.contains(ch)) {
                        hs.add(ch);
                        hm.get(ch).add(mask);
                    }
                }
            }

            ArrayList<Integer> res = new ArrayList<>();
            for (String p : puzzles) {
                int pmask = 0;
                for (char ch : p.toCharArray()) {
                    int bit = ch - 'a';
                    pmask = pmask | (1 << bit);
                }
                char fch = p.charAt(0);
                ArrayList<Integer> wordsToCheck = hm.get(fch);
                int count = 0;

                for (int wmask : wordsToCheck) {
                    if ((wmask & pmask) == wmask)
                        count++;
                }
                res.add(count);
            }
            return res;
        }
    }
}
