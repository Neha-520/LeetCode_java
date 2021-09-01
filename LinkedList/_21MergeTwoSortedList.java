package LinkedList;

public class _21MergeTwoSortedList {
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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode l3 = new ListNode(0);
            ListNode t1 = l1, t2 = l2, t3 = l3;
            while (t1 != null && t2 != null) {
                if (t1.val < t2.val) {
                    l3.next = t1;
                    t1 = t1.next;
                } else {
                    l3.next = t2;
                    t2 = t2.next;
                }
                l3 = l3.next;
            }
            if (t1 != null)
                l3.next = t1;
            else
                l3.next = t2;
            return t3.next;
        }
    }
}
