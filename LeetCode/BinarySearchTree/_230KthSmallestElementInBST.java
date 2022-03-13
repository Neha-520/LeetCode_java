public class _230KthSmallestElementInBST {
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
        public int kthSmallest(TreeNode root, int k) {
            if (root == null)
                return 0;
            ArrayList<Integer> res = new ArrayList<Integer>();
            helper(root, res);
            return res.get(k - 1);
        }

        void helper(TreeNode root, ArrayList<Integer> res) {
            if (root == null)
                return;
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
            return;
        }
    }
}
