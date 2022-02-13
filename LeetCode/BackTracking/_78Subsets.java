public class _78Subsets {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            if (nums.length == 0)
                return ans;
            ans.add(new ArrayList<Integer>());
            helper(nums, ans, new ArrayList<>(), 0);
            return ans;
        }

        void helper(int[] nums, List<List<Integer>> ans, List<Integer> currList, int index) {
            if (index >= nums.length)
                return;
            else {
                for (int i = index; i < nums.length; i++) {
                    currList.add(nums[i]);
                    ans.add(new ArrayList<>(currList));
                    helper(nums, ans, currList, i + 1);
                    currList.remove(currList.size() - 1);
                }
            }
        }
    }
}
