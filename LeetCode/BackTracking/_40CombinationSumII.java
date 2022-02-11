public class _40CombinationSumII {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(candidates);
            helper(candidates, target, 0, res, new ArrayList<Integer>());
            return res;
        }

        void helper(int[] candidates, int target, int index, List<List<Integer>> res, ArrayList<Integer> ds) {
            if (target == 0) {
                res.add(new ArrayList<>(ds));
            }
            for (int i = index; i < candidates.length; i++) {
                if (i > index && candidates[i] == candidates[i - 1])
                    continue;
                if (candidates[i] > target)
                    break;

                ds.add(candidates[i]);
                helper(candidates, target - candidates[i], i + 1, res, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }
}
