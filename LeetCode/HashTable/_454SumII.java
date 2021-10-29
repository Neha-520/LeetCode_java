public class _454SumII {
    class Solution {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            Map<Integer, Integer> map = new HashMap<>();
            int res = 0;
            for (int itemA : A) {
                for (int itemB : B) {
                    map.put(itemA + itemB, map.getOrDefault(itemA + itemB, 0) + 1);
                }
            }
            for (int itemC : C) {
                for (int itemD : D) {
                    res += map.getOrDefault(-1 * (itemC + itemD), 0);
                }
            }
            return res;
        }
    }
}
