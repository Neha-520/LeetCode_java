public class _129SumRoottoLeafNumbers {
    class Solution {

        public int sumNumbers(TreeNode root) {
            if (root == null)
                return 0;
            return helper(root, 0);
        }

        public int helper(TreeNode root, int currSum) {
            if (root == null)
                return 0;
            currSum = currSum * 10 + root.val;
            if (root.left == null && root.right == null)
                return currSum;
            return helper(root.left, currSum) + helper(root.right, currSum);
        }
    }
}
