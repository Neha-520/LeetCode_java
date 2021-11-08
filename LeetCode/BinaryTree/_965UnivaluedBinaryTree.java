public class _965UnivaluedBinaryTree {
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isUnivalTree(TreeNode root) {
            int x = root.val;
            return helper(root, x);
        }

        boolean helper(TreeNode root, int x) {
            if (root == null)
                return true;
            if (root.val != x)
                return false;
            return helper(root.left, x) && helper(root.right, x);
        }
    }
}
