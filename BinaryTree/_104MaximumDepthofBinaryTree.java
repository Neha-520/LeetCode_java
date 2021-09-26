package BinaryTree;

public class _104MaximumDepthofBinaryTree {
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
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            else {
                int l = maxDepth(root.left);
                int r = maxDepth(root.right);
                return l > r ? l + 1 : r + 1;
            }
        }
    }
}
