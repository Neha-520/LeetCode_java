public class _513FindBottomLeftTreeValue {
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
        public int findBottomLeftValue(TreeNode root) {
            if (root == null)
                return 0;
            int res = 0;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int n = q.size();
                for (int i = 1; i <= n; i++) {
                    TreeNode temp = q.poll();
                    if (i == 1)
                        res = temp.val;
                    if (temp.left != null)
                        q.add(temp.left);
                    if (temp.right != null)
                        q.add(temp.right);
                }
            }
            return res;
        }
    }
}
