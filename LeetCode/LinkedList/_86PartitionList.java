public class _86PartitionList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode partition(ListNode head, int x) {
            if (head == null)
                return head;
            ListNode first = new ListNode(0), second = new ListNode(0);
            ListNode f = first;
            ListNode s = second;
            while (head != null) {
                if (head.val < x) {
                    f.next = head;
                    f = f.next;
                } else {
                    s.next = head;
                    s = s.next;
                }
                head = head.next;
            }
            s.next = null;
            f.next = second.next;
            return first.next;
        }
    }
}
