public class _216CombinationSumIII {
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            Set<List<Integer>> hs = new HashSet<>();
            helper(hs, k, n, new HashSet<>());
            return new ArrayList<>(hs);
        }

        public void helper(Set<List<Integer>> hs, int remElements, int remSum, Set<Integer> curr) {
            if (remElements == 0) {
                if (remSum == 0) {
                    hs.add(new ArrayList<>(curr));
                    return;
                } else {
                    return;
                }
            }
            if (remSum < 0)
                return;
            for (int i = 1; i <= 9; i++) {
                if (!curr.contains(i)) {
                    curr.add(i);
                    helper(hs, remElements - 1, remSum - i, curr);
                    curr.remove(i);
                }
            }
        }
    }
}
