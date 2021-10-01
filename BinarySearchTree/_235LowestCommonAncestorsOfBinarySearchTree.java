public class _235LowestCommonAncestorsOfBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q)
                return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left == null)
                return right;
            if (right == null)
                return left;
            return root;
        }
    }

    // method 2
    class Solution2 {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root.val > p.val && root.val > q.val)
                return lowestCommonAncestor(root.left, p, q);
            if (root.val < p.val && root.val < q.val)
                return lowestCommonAncestor(root.right, p, q);
            return root;
        }
    }
}
