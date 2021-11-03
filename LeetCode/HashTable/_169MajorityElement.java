public class _169MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0, k = 0;
            for (int n : nums) {
                if (!map.containsKey(n))
                    map.put(n, 1);
                else
                    map.put(n, map.get(n) + 1);
            }
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (max < m.getValue()) {
                    max = m.getValue();
                    k = m.getKey();
                }
            }
            return k;
        }
    }
}
