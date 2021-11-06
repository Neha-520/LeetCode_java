public class _872LeafSimilarTrees {

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
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            helper(root1, l1);
            helper(root2, l2);
            return l1.equals(l2);
        }

        void helper(TreeNode root, ArrayList<Integer> l) {
            if (root == null)
                return;
            if (root.left == null && root.right == null)
                l.add(root.val);
            helper(root.left, l);
            helper(root.right, l);
        }
    }
}
