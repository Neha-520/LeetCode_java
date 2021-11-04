public class _367ValidPerfectSquare {
    class Solution {
        public boolean isPerfectSquare(int num) {
            for (long i = 1; i * i <= num; i++) {
                if ((num % i == 0) && (num / i == i))
                    return true;
            }
            // System.out.println(Integer.MAX_VALUE);
            return false;
        }
    }

}
