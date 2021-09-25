package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class _94BinaryTreeInorderTraversal {
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> a = new ArrayList<>();
            helper(a, root);
            return a;
        }

        public void helper(List<Integer> l, TreeNode r) {
            if (r != null) {
                helper(l, r.left);
                l.add(r.val);
                helper(l, r.right);
            }
        }
    }
}
