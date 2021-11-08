public class _606ConstructStringFromBinaryTree {
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
        StringBuilder sb = new StringBuilder();

        public String tree2str(TreeNode root) {
            if (root == null)
                return "";
            helper(root);
            return sb.toString();
        }

        void helper(TreeNode root) {
            if (root == null)
                return;
            sb.append(root.val);
            if (root.left == null && root.right == null)
                return;
            sb.append("(");
            helper(root.left);
            sb.append(")");
            if (root.right != null) {
                sb.append("(");
                helper(root.right);
                sb.append(")");
            }
        }
    }
}
