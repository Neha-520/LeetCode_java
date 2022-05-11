public class _950RevealCardsInIncreasingOrder {
    class Solution {
        public int[] deckRevealedIncreasing(int[] deck) {
            Arrays.sort(deck);
            if (deck.length == 2)
                return deck;
            Queue<Integer> p = new LinkedList();
            for (int i = 0; i < deck.length; i++) {
                p.offer(i);
            }
            int[] ans = new int[deck.length];
            for (int n : deck) {
                ans[p.remove()] = n;
                if (!p.isEmpty())
                    p.offer(p.remove());
            }
            return ans;
        }
    }
}
