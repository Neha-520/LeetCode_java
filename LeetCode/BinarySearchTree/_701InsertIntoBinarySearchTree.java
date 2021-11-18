public class _701InsertIntoBinarySearchTree {
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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null)
                return new TreeNode(val);
            TreeNode curr = root, prev = null;
            while (curr != null) {
                prev = curr;
                if (val > curr.val) {
                    curr = curr.right;
                    continue;
                } else {
                    curr = curr.left;
                    continue;
                }
            }
            if (val > prev.val)
                prev.right = new TreeNode(val);
            else
                prev.left = new TreeNode(val);
            return root;
        }
    }

    // ---------------------------------
    class Solution2 {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null)
                return new TreeNode(val);
            TreeNode curr = root;
            while (curr != null) {
                if (val >= curr.val) {
                    if (curr.right != null)
                        curr = curr.right;
                    else {
                        curr.right = new TreeNode(val);
                        break;
                    }
                } else {
                    if (curr.left != null)
                        curr = curr.left;
                    else {
                        curr.left = new TreeNode(val);
                        break;
                    }
                }
            }
            return root;
        }
    }

    // --------------------------------------
    class Solution3 {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null)
                return new TreeNode(val);
            else if (root.val > val)
                root.left = insertIntoBST(root.left, val);
            else
                root.right = insertIntoBST(root.right, val);
            return root;
        }
    }
}
