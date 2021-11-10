public class _889ConstructBinaryTreeFromPreorderandPostorderTraversal {
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
        int preindex;

        public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
            preindex = 0;
            return helper(preorder, postorder, 0, preorder.length - 1, preorder.length);
        }

        TreeNode helper(int pre[], int post[], int l, int h, int n) {
            if (l > h || preindex >= n)
                return null;
            TreeNode root = new TreeNode(pre[preindex++]);
            if (l == h || preindex >= n)
                return root;

            int i;
            for (i = l; i <= h; i++) {
                if (post[i] == pre[preindex])
                    break;
            }
            if (i <= h) {
                root.left = helper(pre, post, l, i, n);
                root.right = helper(pre, post, i + 1, h - 1, n);
            }
            return root;
        }
    }
}
