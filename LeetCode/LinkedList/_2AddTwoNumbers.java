public class _2AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp = new ListNode(0);
            ListNode curr = temp;
            int c = 0, x = 0, y = 0, sum = 0;
            while (l1 != null || l2 != null) {
                x = l1 == null ? 0 : l1.val;
                y = l2 == null ? 0 : l2.val;
                sum = c + x + y;
                c = sum / 10;
                curr.next = new ListNode(sum % 10);
                if (l1 != null)
                    l1 = l1.next;
                if (l2 != null)
                    l2 = l2.next;
                curr = curr.next;
            }
            if (c > 0)
                curr.next = new ListNode(c);
            return temp.next;
        }
    }
}
