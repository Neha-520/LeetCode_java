public class _1721SwappingNodesInLinkedList {
    class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode fast = head, slow = head, first = head, second = head;
            for (int i = 0; i < k - 1; i++)
                fast = fast.next;
            first = fast;
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            second = slow;
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
            return head;
        }
    }
    class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return head;
      ListNode temp = head,s=head,f = head;
        int c = 0;
      while(temp != null){
          c++;
          if(c == k){
              s = temp;
          }
          temp=temp.next;
      } 
        int r = 0;
        while(r < c-k){
            f = f.next;
            r++;
        }
        int t = s.val;
        s.val = f.val;
        f.val = t;
        return head;
    }
}
}
