public class _1305AllElementsInTwoBinarySearchTrees {
    class Solution {
        ArrayList<Integer> l = new ArrayList<>();

        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            helper(root1);
            helper(root2);
            Collections.sort(l);
            return l;
        }

        public void helper(TreeNode root) {
            if (root == null)
                return;
            helper(root.left);
            l.add(root.val);
            helper(root.right);
        }
    }
}
