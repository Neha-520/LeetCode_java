public class _530MinimumAbsoluteDifferneceinBST {
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
        Integer prev;
        int min = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            if (root == null)
                return 0;
            getMinimumDifference(root.left);
            if (prev != null)
                min = Math.min(min, Math.abs(root.val - prev));
            prev = root.val;
            getMinimumDifference(root.right);
            return min;
        }
    }
}
