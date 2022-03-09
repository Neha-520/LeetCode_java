public class _82RemoveDuplicatesFromSortedListII {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null)
                return head;

            ListNode temp = new ListNode(0, head);
            ListNode curr = temp;
            while (head != null) {
                if (head.next != null && head.next.val == head.val) {
                    while (head.next != null && head.next.val == head.val) {
                        head = head.next;
                    }
                    curr.next = head.next;
                } else {
                    curr = curr.next;
                }
                head = head.next;
            }
            return temp.next;
        }
    }
}
