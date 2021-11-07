public class _1315SumofNodesWithEnenValuedGrandParent {

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
        int sum = 0;

        public int sumEvenGrandparent(TreeNode root) {
            if (root == null)
                return 0;
            if (root.val % 2 == 0) {
                if (root.left != null) {
                    if (root.left.left != null)
                        sum += root.left.left.val;
                    if (root.left.right != null)
                        sum += root.left.right.val;
                }
                if (root.right != null) {
                    if (root.right.right != null)
                        sum += root.right.right.val;
                    if (root.right.left != null)
                        sum += root.right.left.val;
                }
            }
            sumEvenGrandparent(root.left);
            sumEvenGrandparent(root.right);
            return sum;
        }
    }
}
