public class _508MostFrequentSubtreeSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        HashMap<Integer, Integer> hm = new HashMap<>();

        public int[] findFrequentTreeSum(TreeNode root) {
            helper(root);
            List<Integer> l = new ArrayList<>();
            int min = Integer.MIN_VALUE;
            for (int i : hm.keySet()) {
                if (hm.get(i) > min) {
                    l.clear();
                    min = hm.get(i);
                    l.add(i);
                } else if (hm.get(i) == min) {
                    l.add(i);
                }
            }
            int[] ans = new int[l.size()];
            int k = 0;
            for (int i : l) {
                ans[k++] = i;
            }
            return ans;
        }

        public int helper(TreeNode root) {
            if (root == null)
                return 0;
            int l = 0, r = 0, sum = 0;
            l = helper(root.left);
            r = helper(root.right);
            sum = root.val + l + r;
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
            return sum;
        }
    }
}
