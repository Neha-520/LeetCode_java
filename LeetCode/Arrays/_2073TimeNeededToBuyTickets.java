public class _2073TimeNeededToBuyTickets {
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int t = 0;
            while (tickets[k] > 0) {
                for (int i = 0; i < tickets.length; i++) {
                    if (tickets[i] > 0) {
                        tickets[i]--;
                        t++;
                    }
                    if (tickets[k] == 0)
                        break;
                }
            }
            return t;
        }
    }
}
