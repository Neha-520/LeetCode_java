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

    class Solution2 {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null)
                return head;
            ListNode temp = head;
            int c = 1;
            while (temp.next != null) {
                c++;
                temp = temp.next;
            }
            temp.next = head;
            ListNode curr = head;
            int y = k % c;
            int i = 1;
            while (i < c - y) {
                curr = curr.next;
                i++;
            }
            head = curr.next;
            curr.next = null;
            return head;
        }
    }
}
