public class _2011FinalValueOfVariableAfterPerformingOperations {
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int x = 0;
            for (String t : operations) {
                if (t.charAt(0) == '+' || t.charAt(2) == '+')
                    x++;
                if (t.charAt(0) == '-' || t.charAt(2) == '-')
                    x--;
            }
            return x;
        }
    }
}
