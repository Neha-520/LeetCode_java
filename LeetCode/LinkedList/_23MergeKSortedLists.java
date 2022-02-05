public class _23MergeKSortedLists {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> minHeap = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);
            for (ListNode node : lists) {
                if (node != null)
                    minHeap.add(node);
            }
            ListNode head = new ListNode(0), tail = head;
            while (!minHeap.isEmpty()) {
                tail.next = minHeap.poll();
                tail = tail.next;
                if (tail.next != null)
                    minHeap.add(tail.next);
            }
            return head.next;
        }
    }

    class Solution2 {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (ListNode head : lists) {
                while (head != null) {
                    minHeap.add(head.val);
                    head = head.next;
                }
            }
            if (minHeap.size() == 0)
                return null;
            ListNode head = new ListNode();
            ListNode temp = head;
            int length = minHeap.size();
            for (int i = 0; i < length; i++) {
                temp.next = new ListNode(minHeap.poll());
                temp = temp.next;
            }
            temp.next = null;
            return head.next;
        }
    }
}
