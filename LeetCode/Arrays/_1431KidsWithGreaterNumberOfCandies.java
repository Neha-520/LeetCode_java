public class _1431KidsWithGreaterNumberOfCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int k) {
            int min = Integer.MIN_VALUE;
            for (int c : candies) {
                min = Math.max(min, c);
            }
            List<Boolean> l = new ArrayList<>();
            for (int c : candies) {
                if (c + k >= min)
                    l.add(true);
                else
                    l.add(false);
            }
            return l;
        }
    }
}
