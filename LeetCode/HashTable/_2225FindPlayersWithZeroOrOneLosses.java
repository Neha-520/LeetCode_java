public class _2225FindPlayersWithZeroOrOneLosses {
    class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            HashSet<Integer> w = new HashSet<>();
            HashMap<Integer, Integer> hm = new HashMap<>();
            List<List<Integer>> res = new ArrayList<>();
            for (int[] m : matches) {
                w.add(m[0]);
                hm.put(m[1], hm.getOrDefault(m[1], 0) + 1);
            }
            List<Integer> t = new ArrayList<>();
            for (Integer i : w) {
                if (!hm.containsKey(i))
                    t.add(i);
            }
            Collections.sort(t);
            res.add(t);
            List<Integer> z = new ArrayList<>();
            for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
                if (m.getValue() == 1)
                    z.add(m.getKey());
            }
            Collections.sort(z);
            res.add(z);
            return res;
        }
    }
}
