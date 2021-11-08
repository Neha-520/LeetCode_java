public class _637AverageofLevelsinBinaryTree {
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
        ArrayList<Double> l = new ArrayList<>();

        public List<Double> averageOfLevels(TreeNode root) {
            if (root != null) {
                Queue<TreeNode> q = new LinkedList<>();
                q.add(root);
                while (!q.isEmpty()) {
                    double sum = 0, c = 0;
                    int count = q.size();
                    while (count-- > 0) {
                        TreeNode x = q.peek();
                        sum += q.remove().val;
                        c++;
                        if (x.left != null)
                            q.add(x.left);
                        if (x.right != null)
                            q.add(x.right);
                    }
                    double avg = sum / c;
                    l.add(avg);
                }
            }
            return l;
        }
    }
}
