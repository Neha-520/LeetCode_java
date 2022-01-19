public class _142LinkedListCycleII {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode s = head, f = head;
            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
                if (s == f)
                    break;
            }
            if (f == null || f.next == null)
                return null;
            // To return the 1st node from which cycle origionate
            while (head != f) {
                head = head.next;
                f = f.next;
            }
            return head;
        }
    }
}
