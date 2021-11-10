public class _1161MaximumLevelSumofBinaryTree {
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
        public int maxLevelSum(TreeNode root) {
            if (root == null)
                return 0;
            int temp = Integer.MIN_VALUE;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int l = 1, res = 0;
            while (!q.isEmpty()) {
                int c = q.size();
                int sum = 0;
                while (c-- > 0) {
                    TreeNode x = q.remove();
                    sum += x.val;
                    if (x.left != null)
                        q.add(x.left);
                    if (x.right != null)
                        q.add(x.right);
                }
                if (sum > temp) {
                    temp = sum;
                    res = l;
                }
                l++;
            }
            return res;
        }
    }
}
