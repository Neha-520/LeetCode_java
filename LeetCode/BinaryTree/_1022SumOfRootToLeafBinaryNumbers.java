public class _1022SumOfRootToLeafBinaryNumbers {
    class Solution {
        public int sumRootToLeaf(TreeNode root) {
            if (root == null)
                return 0;
            return helper(root, 0);
        }

        int helper(TreeNode root, int sum) {
            if (root == null)
                return 0;
            sum = sum * 2 + root.val;
            if (root.left == null && root.right == null)
                return sum;
            return helper(root.left, sum) + helper(root.right, sum);
        }
    }
}
