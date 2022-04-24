public class _1475FinalPricesWithSpecialDiscountInShop {
    class Solution {
        public int[] finalPrices(int[] prices) {
            int n = prices.length;
            int[] arr = new int[n];
            ArrayDeque<Integer> stack = new ArrayDeque<>();
            stack.push(prices[n - 1]);
            arr[n - 1] = prices[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() > prices[i])
                    stack.pop();
                if (stack.isEmpty())
                    arr[i] = prices[i];
                else
                    arr[i] = prices[i] - stack.peek();
                stack.push(prices[i]);
            }
            return arr;
        }
    }

    class Solution2 {
        public int[] finalPrices(int[] prices) {
            for (int i = 0; i < prices.length - 1; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] <= prices[i]) {
                        prices[i] -= prices[j];
                        break;
                    }
                }
            }
            return prices;
        }
    }
}
