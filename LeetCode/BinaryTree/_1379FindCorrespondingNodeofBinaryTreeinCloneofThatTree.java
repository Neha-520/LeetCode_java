public class _1379FindCorrespondingNodeofBinaryTreeinCloneofThatTree {
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
        TreeNode ans;

        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (cloned == null)
                return original;
            if (target == original)
                ans = cloned;
            getTargetCopy(original.left, cloned.left, target);
            getTargetCopy(original.right, cloned.right, target);
            return ans;
        }
    }
}
