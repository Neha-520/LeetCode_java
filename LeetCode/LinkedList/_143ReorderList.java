public class _143ReorderList {
    class Solution {
        public void reorderList(ListNode head) {
            ListNode[] left = new ListNode[1];// it will create in heap
            left[0] = head;
            reorder(left, head);

        }

        // left pointer will be created in heap and right pointer will be created in
        // stack
        public void reorder(ListNode left[], ListNode right) {
            if (right == null) {
                return;
            }
            reorder(left, right.next);

            // in post area of recursion right pointer coming back(because of function
            // remove from recursion stack)
            // and we move left pointer forward
            if (left[0].next != null) {
                ListNode leftNext = left[0].next;
                left[0].next = right;
                right.next = leftNext;
                left[0] = leftNext;
            }

            // as we need to merge till left pointer behind the right pointer
            if (left[0].next == right) {
                left[0].next = null;
            }
        }
    }
}
