public class _382LinkedListRandomNode {
    class Solution {
        ArrayList<Integer> a = new ArrayList<>();

        public Solution(ListNode head) {
            while (head != null) {
                a.add(head.val);
                head = head.next;
            }
        }

        public int getRandom() {
            return a.get((int) (Math.random() * a.size()));
        }
    }
}
