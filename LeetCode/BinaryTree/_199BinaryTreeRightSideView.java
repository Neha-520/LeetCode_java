public class _199BinaryTreeRightSideView {
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
        public List<Integer> rightSideView(TreeNode root) {
            if (root == null)
                return new ArrayList<>();
            List<Integer> l = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int n = q.size();

                for (int i = 1; i <= n; i++) {
                    TreeNode temp = q.poll();

                    if (i == 1)
                        l.add(temp.val);
                    if (temp.right != null)
                        q.add(temp.right);
                    if (temp.left != null)
                        q.add(temp.left);
                }
            }
            return l;
        }
    }
}
