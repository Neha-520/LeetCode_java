public class _2236RootEqualSumOfChildren {
    class Solution {
        public boolean checkTree(TreeNode root) {
            int sum = root.left.val + root.right.val;
            return sum == root.val;
        }
    }
}
