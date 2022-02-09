public class _532KdiffPairsInArray {
    class Solution {
        public int findPairs(int[] nums, int k) {
            if (k == 0) {
                HashMap<Integer, Integer> hm = new HashMap<>();
                for (int i : nums)
                    hm.put(i, hm.getOrDefault(i, 0) + 1);
                int c = 0;
                for (int i : hm.keySet()) {
                    if (hm.get(i) > 1)
                        c++;
                }
                return c;
            }
            HashSet<Integer> hs = new HashSet<>();
            for (int i : nums)
                hs.add(i);
            int c = 0;
            for (int i : hs) {
                if (hs.contains(i + k))
                    c++;
            }
            return c;
        }
    }
}
