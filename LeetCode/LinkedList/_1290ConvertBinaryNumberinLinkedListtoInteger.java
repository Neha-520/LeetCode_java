package LinkedList;

public class _1290ConvertBinaryNumberinLinkedListtoInteger {
    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
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

        public int getDecimalValue(ListNode head) {
            ListNode temp = rev(head);
            int i = 0, sum = 0;
            while (temp != null) {
                sum += temp.val * 1 << i;
                i++;
                temp = temp.next;
            }
            return sum;
        }

        public ListNode rev(ListNode l) {
            ListNode next = null, curr = l, prev = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    //////// 2nd soln
    class Solution2 {
        public int getDecimalValue(ListNode head) {
            int num = head.val;
            while (head.next != null) {
                num = num * 2 + head.next.val;
                head = head.next;
            }
            return num;
        }
    }
}
