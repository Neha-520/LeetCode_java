public class _1894findStudentThatWillReplaceChalk {
    class Solution {
        public int chalkReplacer(int[] chalk, int k) {
            long sum = 0, c = 0;
            for (int x : chalk)
                sum += x;
            if (sum < k) {
                c = k % sum;
                if (c == 0)
                    return (int) c;
                k = (int) c;
            }
            for (int i = 0; i < chalk.length; i++) {
                if (chalk[i] > k)
                    return i;
                k -= chalk[i];
            }
            return 0;
        }
    }
}
