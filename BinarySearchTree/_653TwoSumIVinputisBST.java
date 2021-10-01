import java.util.ArrayList;

class _653TwoSumIVInputisBST {
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
        public boolean findTarget(TreeNode root, int k) {
            ArrayList<Integer> a = new ArrayList<>();
            helper(root, a);
            int l = 0, r = a.size() - 1;
            while (l < r) {
                if (a.get(l) + a.get(r) == k)
                    return true;
                else if (a.get(l) + a.get(r) < k)
                    l++;
                else
                    r--;
            }
            return false;
        }

        void helper(TreeNode root, ArrayList<Integer> a) {
            if (root == null)
                return;
            helper(root.left, a);
            a.add(root.val);
            helper(root.right, a);
        }
    }
}


