class SizeSumMaxHeight {
    static int sum = 0, max = Integer.MIN_VALUE;

    static class Node {
        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }

    static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    static int sum(Node root) {
        if (root == null)
            return 0;
        sum += root.data;
        sum(root.left);
        sum(root.right);
        return sum;
    }

    static int max(Node root) {
        if (root == null)
            return 0;
        max = Math.max(max, root.data);
        max(root.left);
        max(root.right);
        return max;
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        System.out.println(height(root));
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
    }

}
