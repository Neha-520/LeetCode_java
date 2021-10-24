public class _222CountCompleteTreeNodes {
    class Solution {
        int c = 0;

        public int countNodes(TreeNode root) {
            helper(root);
            return c;
        }

        void helper(TreeNode root) {
            if (root == null)
                return;
            c++;
            helper(root.left);
            helper(root.right);
        }
    }
}
