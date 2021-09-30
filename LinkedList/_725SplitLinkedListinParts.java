public class _725SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        ListNode[] l = new ListNode[k];
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        temp = head;
        if (c < k) {
            for (int i = 0; temp != null; i++) {
                l[i] = temp;
                temp = temp.next;
                l[i].next = null;
            }
        } else {
            int x = c / k;
            int y = c % k;
            for (int i = 0; i < k; i++) {
                ListNode curr = temp;
                for (int j = 0; j < x + (i < y ? 1 : 0) - 1 && temp.next != null; j++) {
                    temp = temp.next;
                }
                ListNode a = temp.next;
                temp.next = null;
                temp = a;
                l[i] = curr;
            }
        }
        return l;
    }
}
