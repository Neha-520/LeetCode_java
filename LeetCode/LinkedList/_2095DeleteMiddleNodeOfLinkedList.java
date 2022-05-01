public class _2095DeleteMiddleNodeOfLinkedList {
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
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null)
                return null;
            ListNode s = head, f = head, prev = null;
            while (f != null && f.next != null) {
                prev = s;
                s = s.next;
                f = f.next.next;
            }
            prev.next = s.next;
            return head;
        }
    }
}
