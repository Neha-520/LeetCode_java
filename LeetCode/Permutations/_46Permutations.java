public class _46Permutations {
    class Solution {
        boolean visited[] = null;

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> l = new ArrayList<>();
            visited = new boolean[nums.length];
            helper(nums, l, new ArrayList<>());
            return l;
        }

        void helper(int[] nums, List<List<Integer>> l, List<Integer> curr) {
            if (curr.size() == nums.length) {
                l.add(new ArrayList<>(curr));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!visited[i]) {
                    curr.add(nums[i]);
                    visited[i] = true;
                    helper(nums, l, curr);
                    curr.remove(curr.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}
