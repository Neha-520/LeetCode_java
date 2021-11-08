public class _671SecondMinimumNodeinBinaryTree {
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
        ArrayList<Integer> l = new ArrayList<>();

        public int findSecondMinimumValue(TreeNode root) {
            preorder(root);
            if (l.size() < 2)
                return -1;
            Collections.sort(l);
            return l.get(1);
        }

        void preorder(TreeNode root) {
            if (root == null)
                return;
            if (!l.contains(root.val))
                l.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }

    class Solution2 {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        boolean found = false;

        public int findSecondMinimumValue(TreeNode root) {
            if (root == null)
                return 0;

            if (root.val < min) {
                min = root.val;
            }

            if (root.val > min && root.val <= secondMin) {
                found = true;
                secondMin = root.val;
            }

            findSecondMinimumValue(root.left);
            findSecondMinimumValue(root.right);

            return !found ? -1 : secondMin;

        }
    }
}
