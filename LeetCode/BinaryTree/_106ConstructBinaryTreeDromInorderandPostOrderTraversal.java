public class _106ConstructBinaryTreeDromInorderandPostOrderTraversal {
    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
        }

        TreeNode build(int in[], int post[], int is, int ie, int ps, int pe) {
            if (is > ie)
                return null;
            TreeNode t = new TreeNode(post[pe]);
            int i = 0;
            for (i = is; i <= ie; i++) {
                if (in[i] == t.val)
                    break;
            }
            t.left = build(in, post, is, i - 1, ps, ps - is + i - 1);
            t.right = build(in, post, i + 1, ie, pe - ie + i, pe - 1);
            return t;
        }
    }
}
