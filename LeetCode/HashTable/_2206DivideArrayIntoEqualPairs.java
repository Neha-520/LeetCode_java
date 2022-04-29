public class _2206DivideArrayIntoEqualPairs {
    class Solution {
        public boolean divideArray(int[] nums) {
            Map<Integer, Integer> hm = new HashMap<>();
            for (int n : nums) {
                hm.put(n, hm.getOrDefault(n, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
                if (x.getValue() % 2 == 0)
                    continue;
                else
                    return false;
            }
            return true;
        }
    }
}
