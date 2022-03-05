public class _103BinaryTreeZigzagLevelOrderTraversal {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null)
                return res;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int level = 1;
            while (!q.isEmpty()) {
                int s = q.size();
                List<Integer> temp = new ArrayList<>();
                while (s-- > 0) {
                    TreeNode x = q.poll();
                    temp.add(x.val);
                    if (x.left != null)
                        q.add(x.left);
                    if (x.right != null)
                        q.add(x.right);
                }
                if (level % 2 == 0)
                    Collections.reverse(temp);
                res.add(temp);
                level++;
            }
            return res;
        }
    }
}
