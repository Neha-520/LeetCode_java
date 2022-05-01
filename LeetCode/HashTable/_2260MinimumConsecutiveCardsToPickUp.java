public class _2260MinimumConsecutiveCardsToPickUp {
    class Solution {
        public int minimumCardPickup(int[] cards) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            boolean f = false;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < cards.length; i++) {
                if (hm.containsKey(cards[i])) {
                    f = true;
                    min = Math.min(min, (i - hm.get(cards[i])));
                    hm.put(cards[i], i);
                } else
                    hm.put(cards[i], i);
            }
            if (!f)
                return -1;
            return min + 1;
        }
    }
}
