public class _61RotateList {
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null)
                return head;
            ListNode temp = new ListNode(0);
            ListNode slow = temp, fast = temp;
            temp.next = head;
            int i = 0;
            for (i = 0; fast.next != null; i++)
                fast = fast.next;
            for (int j = i - k % i; j > 0; j--)
                slow = slow.next;
            fast.next = temp.next;
            temp.next = slow.next;
            slow.next = null;
            return temp.next;
        }
    }
}
