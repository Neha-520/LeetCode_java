public class _979DistributeCoinsInBinaryTree {
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
        int ans = 0;

        public int distributeCoins(TreeNode root) {
            helper(root);
            return ans;
        }

        int helper(TreeNode node) {
            if (node == null)
                return 0;
            int l = helper(node.left);
            int r = helper(node.right);
            ans += Math.abs(l) + Math.abs(r);
            return node.val + l + r - 1;
        }
    }
}
