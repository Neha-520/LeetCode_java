public class _90SubsetsII {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            HashSet<ArrayList<Integer>> hs = new HashSet<>();
            helper(nums, hs, new ArrayList<>(), 0);
            List<List<Integer>> l = new ArrayList<>();
            l.add(new ArrayList<>());
            for (ArrayList<Integer> x : hs) {
                l.add(x);
            }
            return l;
        }

        void helper(int[] nums, HashSet<ArrayList<Integer>> hs, ArrayList<Integer> curr, int idx) {
            if (idx >= nums.length) {
                return;
            } else {
                for (int i = idx; i < nums.length; i++) {
                    curr.add(nums[i]);
                    hs.add(new ArrayList<>(curr));
                    helper(nums, hs, curr, i + 1);
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }
}
