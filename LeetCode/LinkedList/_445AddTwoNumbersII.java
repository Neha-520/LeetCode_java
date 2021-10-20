package LinkedList;

public class _445AddTwoNumbersII {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            l1 = rev(l1);
            l2 = rev(l2);
            ListNode l3 = new ListNode(0);
            ListNode temp = l3;
            int x = 0, y = 0, sum = 0, carry = 0;
            while (l1 != null || l2 != null) {
                x = l1 == null ? 0 : l1.val;
                y = l2 == null ? 0 : l2.val;
                sum = carry + x + y;
                carry = sum / 10;
                temp.next = new ListNode(sum % 10);
                temp = temp.next;
                if (l1 != null)
                    l1 = l1.next;
                if (l2 != null)
                    l2 = l2.next;
            }
            if (carry > 0)
                temp.next = new ListNode(carry);
            return rev(l3.next);

        }

        public ListNode rev(ListNode curr) {
            ListNode prev = null, next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

}
