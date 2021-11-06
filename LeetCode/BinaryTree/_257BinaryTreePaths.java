public class _257BinaryTreePaths {
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
        List<String> l = new ArrayList<>();

        public List<String> binaryTreePaths(TreeNode root) {
            helper(root, "");
            return l;
        }

        void helper(TreeNode root, String path) {
            if (root == null)
                return;
            if (root.left == null && root.right == null)
                l.add(path + root.val);
            helper(root.left, path + root.val + "->");
            helper(root.right, path + root.val + "->");
        }
    }
}
