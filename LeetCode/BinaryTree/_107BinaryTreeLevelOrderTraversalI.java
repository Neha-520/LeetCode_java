public class _107BinaryTreeLevelOrderTraversalI {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null)
                return res;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int s = q.size();
                List<Integer> l = new ArrayList<>();
                while (s-- > 0) {
                    TreeNode x = q.poll();
                    l.add(x.val);
                    if (x.left != null)
                        q.add(x.left);
                    if (x.right != null)
                        q.add(x.right);
                }
                res.add(l);
            }
            Collections.reverse(res);
            return res;
        }
    }
}
