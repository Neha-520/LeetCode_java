public class _2200FindAllKDistinctIndicesInArray {
    class Solution {
        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
            List<Integer> ans = new ArrayList<Integer>();
            List<Integer> list = new ArrayList<Integer>();
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] == key)
                    list.add(i);
            }
            for (int i = 0; i < n; i++) {
                for (Integer j : list) {
                    if (Math.abs(i - j) <= k) {
                        ans.add(i);
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
