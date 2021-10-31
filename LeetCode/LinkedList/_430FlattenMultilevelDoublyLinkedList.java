public class _430FlattenMultilevelDoublyLinkedList {
    class Solution {
        class Node {
            public int val;
            public Node prev;
            public Node next;
            public Node child;
        };

        public Node flatten(Node head) {
            if (head == null)
                return head;
            Stack<Node> s = new Stack<>();
            s.push(head);
            Node prev = null;

            while (!s.empty()) {
                Node curr = s.pop();
                if (curr.next != null)
                    s.push(curr.next);
                if (curr.child != null) {
                    s.push(curr.child);
                    curr.child = null;
                }
                curr.next = s.empty() ? null : s.peek();
                curr.prev = prev;
                prev = curr;
            }
            return head;
        }
    }
}
