public class _2190MostFrequentNumberFollowingKeyInArray {
    class Solution {
        public int mostFrequent(int[] nums, int key) {
            Map<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == key && i != nums.length - 1) {
                    hm.put(nums[i + 1], hm.getOrDefault(nums[i + 1], 0) + 1);
                }
            }
            int c = 0, k = 0;
            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                if (e.getValue() > c) {
                    c = e.getValue();
                    k = e.getKey();
                }
            }
            return k;
        }
    }
}
