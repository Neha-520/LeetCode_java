public class _99RecoverBinarySearchTree {
    class Solution {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        public void recoverTree(TreeNode root) {
            inorder(root);
            Collections.sort(list);
            insertinorder(root);

        }

        public void inorder(TreeNode root) {
            if (root == null)
                return;
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }

        public void insertinorder(TreeNode root) {
            if (root == null)
                return;

            insertinorder(root.left);
            root.val = list.get(count);
            count++;
            insertinorder(root.right);
        }
    }
}
