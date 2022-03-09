public class _901OnlineStockSpan {
    // better
    class StockSpanner {
        List<Integer> l;
        Stack<Integer> s;
        int index = -1;

        public StockSpanner() {
            l = new ArrayList<>();
            s = new Stack<>();
        }

        public int next(int price) {
            l.add(price);
            int c = 1;
            index++;

            while (s.size() > 0 && (l.get(s.peek()) <= price)) {
                s.pop();
            }

            if (s.size() == 0)
                c = index + 1;
            else
                c = index - s.peek();
            s.push(index);
            return c;
        }
    }

    /**
     * Your StockSpanner object will be instantiated and called as such:
     * StockSpanner obj = new StockSpanner();
     * int param_1 = obj.next(price);
     */

    class StockSpanner2 {
        ArrayList<Integer> l;

        public StockSpanner() {
            l = new ArrayList<>();
        }

        public int next(int price) {
            l.add(price);
            int c = 0;
            for (int i = l.size() - 1; i >= 0; i--) {
                if (price < l.get(i))
                    break;
                c++;
            }
            return c;
        }
    }
}
