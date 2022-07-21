public class _92ReverseLinkedListII {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            Stack<Integer> l = new Stack<>();
            ListNode temp = head;
            int i = 1;
            while (temp != null) {
                if (i >= left && i <= right)
                    l.push(temp.val);
                i++;
                temp = temp.next;
            }
            temp = head;
            i = 1;
            while (temp != null) {
                if (i >= left && i <= right)
                    temp.val = l.pop();
                i++;
                temp = temp.next;
            }
            return head;
        }
    }
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return head;
        ListNode curr = head,prev = null;
        while(left > 1){
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }
        ListNode con = prev,tail = curr,third = null;
        while(right > 0){
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            right--;
        }
        if(con != null) con.next = prev;
        else head = prev;
        tail.next = curr;
        return head;
    }
}
}
