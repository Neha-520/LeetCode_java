package DynamicProgramming;

public class _70ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            if (n <= 0)
                return 0;
            if (n <= 2)
                return n;

            int last = 2;
            int secondLast = 1;
            for (int i = 3; i <= n; i++) {
                int sum = last + secondLast;
                secondLast = last;
                last = sum;
            }
            return last;
        }
    }
}
