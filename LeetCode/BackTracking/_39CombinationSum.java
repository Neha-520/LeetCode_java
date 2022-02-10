public class _39CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> l = new ArrayList<>();
            helper(0, target, l, candidates, new ArrayList<>());
            return l;
        }

        void helper(int index, int target, List<List<Integer>> l, int[] arr, ArrayList<Integer> ds) {
            if (index == arr.length) {
                if (target == 0)
                    l.add(new ArrayList<>(ds));
                return;
            }
            if (arr[index] <= target) {
                ds.add(arr[index]);
                helper(index, target - arr[index], l, arr, ds);
                ds.remove(ds.size() - 1);
            }
            helper(index + 1, target, l, arr, ds);
        }
    }
}
