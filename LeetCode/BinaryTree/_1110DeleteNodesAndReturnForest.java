public class _1110DeleteNodesAndReturnForest {
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
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<TreeNode> l = new ArrayList<>();

        public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
            for (int i : to_delete) {
                hs.add(i);
            }
            helper(root);
            if (!hs.contains(root.val))
                l.add(root);
            return l;
        }

        TreeNode helper(TreeNode root) {
            if (root == null)
                return root;
            root.left = helper(root.left);
            root.right = helper(root.right);
            if (hs.contains(root.val)) {
                if (root.left != null)
                    l.add(root.left);
                if (root.right != null)
                    l.add(root.right);
                return null;
            }
            return root;
        }
    }
}
