public class _1814CountNicePairsInArray {
    class Solution {
        public int countNicePairs(int[] nums) {
            HashMap<Long, Long> hm = new HashMap<>();
            int mod = (int) Math.pow(10, 9) + 7;
            long count = 0;
            for (int i = 0; i < nums.length; i++) {
                long key = nums[i] - helper(nums[i]);
                if (!hm.containsKey(key))
                    count = 1;
                else {
                    count = hm.get(key);
                    count++;
                }
                hm.put(key, count % mod);
            }
            long result = 0;
            for (long i : hm.values()) {
                result += (((i - 1) * i) / 2);
            }
            return (int) (result % mod);
        }

        public int helper(int n) {
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            sb = sb.reverse();
            return Integer.parseInt(sb.toString());
        }
    }
}
