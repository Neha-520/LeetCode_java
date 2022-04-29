public class _2244MinimumRoundsToCompleteAllTasks {
    class Solution {
        public int minimumRounds(int[] tasks) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int t : tasks) {
                hm.put(t, hm.getOrDefault(t, 0) + 1);
            }
            int r = 0;
            for (int t : tasks) {
                if (hm.containsKey(t)) {
                    int x = hm.get(t);
                    if (x == 1)
                        return -1;
                    r += x / 3;
                    if (x % 3 != 0)
                        r++;
                }
                hm.remove(t);
            }
            return r;
        }
    }
}
