public class _138CopyListWithRandomPointer {
    class Solution {
        public Node copyRandomList(Node head) {
            HashMap<Node, Node> hm = new HashMap<Node, Node>();

            Node temp = head;
            while (temp != null) {
                hm.put(temp, new Node(temp.val));
                temp = temp.next;
            }
            temp = head;
            while (temp != null) {
                hm.get(temp).next = hm.get(temp.next);
                hm.get(temp).random = hm.get(temp.random);
                temp = temp.next;
            }
            return hm.get(head);
        }
    }
}
