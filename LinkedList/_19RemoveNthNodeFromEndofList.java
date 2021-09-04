package LinkedList;

public class _19RemoveNthNodeFromEndofList {

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

        public ListNode removeNthFromEnd(ListNode head, int n) {
            int c = 0;
            ListNode temp = head;
            while (temp != null) {
                c++;
                temp = temp.next;
            }
            temp = head;
            for (int i = 0; i < c - n - 1; i++) {
                temp = temp.next;
            }
            if (c - n == 0)
                head = head.next;
            else
                temp.next = temp.next.next;

            return head;

        }
    }
}
