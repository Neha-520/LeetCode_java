package LinkedList;

public class _234PalindromeLinkedList {
    class Solution {
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

        public boolean isPalindrome(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow = rev(slow);
            fast = head;
            while (slow != null) {
                if (fast.val != slow.val)
                    return false;
                fast = fast.next;
                slow = slow.next;
            }
            return true;
        }

        public ListNode rev(ListNode h) {
            ListNode prev = null, curr = h, next = null;
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
