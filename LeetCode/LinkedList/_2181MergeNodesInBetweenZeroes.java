public class _2181MergeNodesInBetweenZeroes {
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
        public ListNode mergeNodes(ListNode head) {
            ListNode res = new ListNode(0), x = res;
            int sum = 0;
            while (head != null) {
                if (head.val != 0)
                    sum += head.val;
                else if (sum != 0) {
                    res.next = new ListNode(sum);
                    res = res.next;
                    sum = 0;
                }
                head = head.next;
            }
            return x.next;
        }
    }
}
