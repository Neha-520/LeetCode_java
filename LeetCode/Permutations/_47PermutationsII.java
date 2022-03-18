public class _47PermutationsII {
    class Solution {
        boolean visited[] = null;

        public List<List<Integer>> permuteUnique(int[] nums) {
            HashSet<List<Integer>> hs = new HashSet<>();
            visited = new boolean[nums.length];
            helper(nums, hs, new ArrayList<>());
            return new ArrayList<>(hs);
        }

        void helper(int[] nums, HashSet<List<Integer>> hs, List<Integer> curr) {
            if (curr.size() == nums.length) {
                hs.add(new ArrayList<>(curr));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!visited[i]) {
                    curr.add(nums[i]);
                    visited[i] = true;
                    helper(nums, hs, curr);
                    curr.remove(curr.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}
