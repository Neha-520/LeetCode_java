public class _2042CheckifNumbersAreAscendingInSentence {
    class Solution {
        public boolean areNumbersAscending(String s) {
            String[] r = s.split(" ");
            int i = 0, j = 0;
            for (String x : r) {
                try {
                    j = Integer.parseInt(x);
                    if (j > i) {
                        i = j;
                        continue;
                    }
                    return false;
                } catch (Exception e) {
                    continue;
                }
            }
            return true;
        }
    }
}
