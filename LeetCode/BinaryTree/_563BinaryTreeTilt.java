public class _563BinaryTreeTilt {
    class Solution {
        int res = 0;

        public int findTilt(TreeNode root) {
            tilt(root);
            return res;
        }

        int tilt(TreeNode node) {
            if (node == null)
                return 0;
            int l = tilt(node.left);
            int r = tilt(node.right);
            res += Math.abs(r - l);
            return node.val + l + r;
        }
    }
}
