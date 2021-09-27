
public class _112PathSum {

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
        boolean flag = false;

        public boolean hasPathSum(TreeNode root, int targetSum) {
            helper(root, targetSum, 0);
            return flag;
        }

        TreeNode helper(TreeNode root, int targetSum, int sum) {
            if (root == null)
                return root;
            sum += root.val;
            TreeNode l = helper(root.left, targetSum, sum);
            TreeNode r = helper(root.right, targetSum, sum);
            if (sum == targetSum && l == null && r == null)
                flag = true;
            return root;
        }
    }
}
