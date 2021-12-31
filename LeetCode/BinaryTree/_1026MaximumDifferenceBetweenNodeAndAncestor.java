public class _1026MaximumDifferenceBetweenNodeAndAncestor {
    class Solution {
        public int maxAncestorDiff(TreeNode root) {
            if (root == null)
                return 0;
            return helper(root, root.val, root.val);
        }

        public int helper(TreeNode root, int min, int max) {
            if (root == null)
                return max - min;
            min = Math.min(root.val, min);
            max = Math.max(root.val, max);
            int r = helper(root.right, min, max);
            int l = helper(root.left, min, max);
            return Math.max(r, l);
        }
    }
}
