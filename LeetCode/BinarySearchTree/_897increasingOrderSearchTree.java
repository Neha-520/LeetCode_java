public class _897IncreasingOrderSearchTree {
    class Solution {
        TreeNode curr;

        public TreeNode increasingBST(TreeNode root) {
            TreeNode t = new TreeNode(0);
            curr = t;
            inorder(root);
            return t.right;
        }

        public void inorder(TreeNode root) {
            if (root == null)
                return;
            inorder(root.left);
            root.left = null;
            curr.right = root;
            curr = root;
            inorder(root.right);
        }
    }
}