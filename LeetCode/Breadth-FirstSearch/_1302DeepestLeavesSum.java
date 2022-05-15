public class _1302DeepestLeavesSum {
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
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int sum = 0;
            while (!q.isEmpty()) {
                int c = q.size();
                sum = 0;
                while (c-- > 0) {
                    TreeNode x = q.poll();
                    if (x.left != null)
                        q.offer(x.left);
                    if (x.right != null)
                        q.offer(x.right);
                    if (x.left == null && x.right == null)
                        sum += x.val;
                }
            }
            return sum;
        }
    }
}
